package commands;

import com.falyrion.aa.AdvancedArmorStandsMain;
import com.falyrion.aa.AdvancedArmorStandsMain.CommandInterface;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


public class CmdGiveArmorstand implements CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player player = (Player) sender;

        if (player.getGameMode() == GameMode.CREATIVE) {

            if (args.length == 2) {

                Integer itemAmount = Integer.parseInt(args[1]);

                if (itemAmount > 16) {
                    itemAmount = 16;
                }

                ItemStack itemstack = new ItemStack(Material.ARMOR_STAND, itemAmount);
                player.getInventory().addItem(itemstack);
                player.sendMessage(ChatColor.GOLD + "[AA] Added " + itemAmount + " armor stands to your inventory!");

            }

            else {

                String message = AdvancedArmorStandsMain.getInstance().getMessageString("wrong_command_usage", player.getLocale());
                player.sendMessage(ChatColor.RED + message + ChatColor.AQUA + " /aa head <amount>");

            }

        }
        else {
            player.sendMessage(ChatColor.RED + "[AA] Sorry, but you need to be in creative mode to use this command!");
        }

        return true;
    }

}