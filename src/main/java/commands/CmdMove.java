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


public class CmdMove implements CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player player = (Player) sender;

        if (player.hasPermission("aa.move")) {

            if (args.length == 3) {

                String directions = "xyz";
                String i = args[1].substring(0, 1);
                float i2 = Float.parseFloat(args[2]);

                float x = 0.0f;
                float y = 0.0f;
                float z = 0.0f;

                if ( (i2 > 1.0f) || (i2 < -1.0f) || !(directions.contains(i)) ) {
                    String message = AdvancedArmorStandsMain.getInstance().getMessageString("wrong_command_usage", player.getLocale());
                    player.sendMessage(ChatColor.RED + message + ChatColor.AQUA + " /aa move <x/y/z> <distance>");
                } else {

                    if (i.equals("x")) {x = i2;}
                    if (i.equals("y")) {y = i2;}
                    if (i.equals("z")) {z = i2;}


                    for (Entity entity : player.getNearbyEntities(0.5, 0.5, 0.5)) {
                        if (entity instanceof ArmorStand armorstand) {

                            if (!AdvancedArmorStandsMain.getInstance().canChange(armorstand, player)) {
                                continue;
                            }
                            Location newLocation = new Location(
                                    armorstand.getWorld(), armorstand.getLocation().getX() + x,
                                    armorstand.getLocation().getY() + y, armorstand.getLocation().getZ() + z
                            );

                            float armorStandYaw = armorstand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw);
                            armorstand.teleport(newLocation);
                            String message = AdvancedArmorStandsMain.getInstance().getMessageString("tp_success", player.getLocale());
                            player.sendMessage(ChatColor.GOLD + message + " " + i + " " + i2);
                            AdvancedArmorStandsMain.getInstance().playSoundTeleport(player);
                        }
                    }
                }
            }
            else {

                String message = AdvancedArmorStandsMain.getInstance().getMessageString("wrong_command_usage", player.getLocale());
                player.sendMessage(ChatColor.RED + message + ChatColor.AQUA + " /aa move <x/y/z> <distance>");

            }

        }
        else {

            String message = AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale());
            player.sendMessage(ChatColor.RED + message);

        }

        return true;
    }

}
