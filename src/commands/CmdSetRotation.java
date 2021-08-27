package commands;

import com.falyrion.aa.AdvancedArmorStandsMain;
import com.falyrion.aa.AdvancedArmorStandsMain.CommandInterface;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;


public class CmdSetRotation implements CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player player = (Player) sender;

        if (player.hasPermission("aa.edit")) {

            if (args.length == 4) {

                Float distance = Float.parseFloat(args[3]);

                if (distance <= 100) {

                    Integer i4 = Integer.parseInt(args[2]);
                    if (i4 == 45 || i4 == 90 || i4 == 135 || i4 == 180 || i4 == 225 || i4 == 270 || i4 == 315 || i4 == 360) {

                        if (args[1].equalsIgnoreCase("right")) {
                            for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                                if(entity instanceof ArmorStand) {
                                    ArmorStand armorstand = (ArmorStand) entity;
                                    Location loc = armorstand.getLocation();
                                    Float ayaw = armorstand.getLocation().getYaw();
                                    loc.setYaw(ayaw + i4);
                                    armorstand.teleport(loc);
                                }
                            }

                            String message = AdvancedArmorStandsMain.getInstance().getMessageString("modification", player.getLocale()).replace("%s", distance.toString());
                            player.sendMessage(ChatColor.GOLD + message);

                            AdvancedArmorStandsMain.getInstance().playSoundTeleport(player);
                        }
                        if (args[1].equalsIgnoreCase("left")) {
                            for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                                if(entity instanceof ArmorStand) {
                                    ArmorStand armorstand = (ArmorStand) entity;
                                    Location loc = armorstand.getLocation();
                                    Float ayaw = armorstand.getLocation().getYaw();
                                    loc.setYaw(ayaw - i4);
                                    armorstand.teleport(loc);
                                }
                            }

                            String message = AdvancedArmorStandsMain.getInstance().getMessageString("modification", player.getLocale()).replace("%s", distance.toString());
                            player.sendMessage(ChatColor.GOLD + message);

                            AdvancedArmorStandsMain.getInstance().playSoundTeleport(player);
                        }
                        if (!args[1].equalsIgnoreCase("right") && !args[1].equalsIgnoreCase("left")) {

                            String message_01 = AdvancedArmorStandsMain.getInstance().getMessageString("wrong_command_usage", player.getLocale());
                            player.sendMessage(ChatColor.RED + message_01 + ChatColor.AQUA + " /aa rotate <on/off> <range>");

                        }


                    }
                    else {

                        String message_01 = AdvancedArmorStandsMain.getInstance().getMessageString("wrong_command_usage", player.getLocale());
                        String message_02 = AdvancedArmorStandsMain.getInstance().getMessageString("rotation_error_01", player.getLocale());
                        player.sendMessage(ChatColor.RED + message_01 + ChatColor.AQUA + " /aa rotate <on/off> <range>");
                        player.sendMessage(ChatColor.RED + message_02);

                    }

                }

                if (distance > 100) {

                    String message = AdvancedArmorStandsMain.getInstance().getMessageString("range_error", player.getLocale());
                    player.sendMessage(ChatColor.RED + message);

                }

            }

            else {

                String message_01 = AdvancedArmorStandsMain.getInstance().getMessageString("wrong_command_usage", player.getLocale());
                String message_02 = AdvancedArmorStandsMain.getInstance().getMessageString("rotation_error_01", player.getLocale());
                player.sendMessage(ChatColor.RED + message_01 + ChatColor.AQUA + " /aa rotate <on/off> <range>");
                player.sendMessage(ChatColor.RED + message_02);

            }

        }
        else {

            String message = AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale());
            player.sendMessage(ChatColor.RED + message);

        }

        return true;
    }

}
