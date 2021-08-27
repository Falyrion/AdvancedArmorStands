package commands;

import com.falyrion.aa.AdvancedArmorStandsMain;
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

        if (player.hasPermission("aa.edit")) {

            if (args.length == 2) {

                Float distance = Float.parseFloat(args[1]);

                    if (distance <= 100) {

                        for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                            if (entity instanceof ArmorStand) {
                                ArmorStand armorstand = (ArmorStand) entity;

                                if (armorstand.isCustomNameVisible()) {
                                    armorstand.setCustomNameVisible(false);
                                }

                                String message = AdvancedArmorStandsMain.getInstance().getMessageString("modification", player.getLocale()).replace("%s", distance.toString());
                                player.sendMessage(org.bukkit.ChatColor.GOLD + message);

                            }
                        }

                    } else {

                        String message = AdvancedArmorStandsMain.getInstance().getMessageString("range_error", player.getLocale());
                        player.sendMessage(org.bukkit.ChatColor.RED + message);

                    }


            } else {

                String message = AdvancedArmorStandsMain.getInstance().getMessageString("wrong_command_usage", player.getLocale());
                player.sendMessage(org.bukkit.ChatColor.RED + message + org.bukkit.ChatColor.AQUA + " /aa hidenames <range>");

            }

        } else {

            String message = AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale());
            player.sendMessage(org.bukkit.ChatColor.RED + message);

        }

        return true;

    }

}