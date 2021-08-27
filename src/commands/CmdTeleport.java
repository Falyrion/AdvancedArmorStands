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


public class CmdTeleport implements CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player player = (Player) sender;

        if (player.hasPermission("aa.tp")) {

            if (args.length == 4) {

                Float i = Float.parseFloat(args[1]);
                Float i2 = Float.parseFloat(args[2]);
                Float i3 = Float.parseFloat(args[3]);

                for (Entity entity : player.getNearbyEntities(0.5, 0.5, 0.5)) {
                    if (entity instanceof ArmorStand) {

                        ArmorStand armorstand = (ArmorStand) entity;
                        Location loc = new Location(player.getWorld(), i, i2, i3);
                        Float armorStandYaw = armorstand.getLocation().getYaw();
                        loc.setYaw(armorStandYaw);
                        armorstand.teleport(loc);
                        String message = AdvancedArmorStandsMain.getInstance().getMessageString("tp_success", player.getLocale());
                        player.sendMessage(ChatColor.GOLD + message + " " + i + " " + i2 + " " + i3);
                        AdvancedArmorStandsMain.getInstance().playSoundTeleport(player);
                    }
                }
            }
            if (args.length == 5) {

                Float i = Float.parseFloat(args[1]);
                Float i2 = Float.parseFloat(args[2]);
                Float i3 = Float.parseFloat(args[3]);
                Integer i4 = Integer.parseInt(args[4]);

                if (i4 == 45 || i4 == 90 || i4 == 135 || i4 == 180 || i4 == 225 || i4 == 270 || i4 == 315 || i4 == 360) {
                    for (Entity entity : player.getNearbyEntities(0.5, 0.5, 0.5)) {
                        if (entity instanceof ArmorStand) {

                            ArmorStand armorstand = (ArmorStand) entity;
                            Location loc = new Location(player.getWorld(), i, i2, i3);
                            Float ayaw = armorstand.getLocation().getYaw();
                            loc.setYaw(ayaw + i4);
                            armorstand.teleport(loc);
                            String message = AdvancedArmorStandsMain.getInstance().getMessageString("tp_success", player.getLocale());
                            player.sendMessage(ChatColor.GOLD + message + " " + i + " " + i2 + " " + i3);
                            AdvancedArmorStandsMain.getInstance().playSoundTeleport(player);
                        }
                    }
                }
                else {

                    String message = AdvancedArmorStandsMain.getInstance().getMessageString("wrong_command_usage", player.getLocale());
                    player.sendMessage(ChatColor.RED + message + ChatColor.AQUA + " /aa tp <x-coord> <y-coord> <z-coord> [rotation]");

                }

            }

            if (!(args.length == 4) && !(args.length == 5)) {

                String message = AdvancedArmorStandsMain.getInstance().getMessageString("wrong_command_usage", player.getLocale());
                player.sendMessage(ChatColor.RED + message + ChatColor.AQUA + " /aa tp <x-coord> <y-coord> <z-coord> [rotation]");

            }
        }
        else {

            String message = AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale());
            player.sendMessage(ChatColor.RED + message);

        }

        return true;
    }

}
