package commands;

import com.falyrion.aa.AdvancedArmorStandsMain.CommandInterface;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


public class CmdGiveArmorstand implements CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player p = (Player) sender;

        if (p.getGameMode() == GameMode.CREATIVE) {

            if (args.length == 2) {

                Integer i = Integer.parseInt(args[1]);

                if (i <= 64) {
                    ItemStack itemstack = new ItemStack(Material.ARMOR_STAND, i);
                    p.getInventory().addItem(itemstack);
                    p.sendMessage(ChatColor.GOLD + "[AA] Added " + i + " armor stands to your inventory!");
                }
                else {
                    p.sendMessage(ChatColor.RED + "[AA] You can not get more than 64 armor stands at once!");
                }
            }

            else {
                p.sendMessage(ChatColor.RED + "[AA] This command was not used correctly! Please use " + ChatColor.AQUA + "/aa give <amount>");
            }

        }
        else {
            p.sendMessage(ChatColor.RED + "[AA] Sorry, but you need to be in creative mode to use this command!");
        }

        return true;
    }

}