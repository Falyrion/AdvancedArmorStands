package commands;

import com.falyrion.aa.AdvancedArmorStandsMain.CommandInterface;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;


public class CmdRemoveCustomName implements CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player player = (Player) sender;

        if (player.hasPermission("aa.names")) {

            if (args.length == 2) {

                Float f = Float.parseFloat(args[1]);

                if (f <= 100) {

                    for (Entity entity : player.getNearbyEntities(f, f, f)) {
                        if (entity instanceof ArmorStand) {
                            ArmorStand armorstand = (ArmorStand) entity;
                            if (armorstand.isCustomNameVisible() == true) {
                                armorstand.setCustomNameVisible(false);
                            }
                        }
                    }
                }
                else {
                    player.sendMessage("ยง6[AA] Please do not use higher values than 100 for the range!");
                }
            }
            else {
                player.sendMessage(ChatColor.RED + "[AA] This command was not used correctly! Please use /aa hidenames <range>");
            }
        }
        else {
            player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to use this command!");
        }

        return true;
    }

}