package commands;

import com.falyrion.aa.AdvancedArmorStandsMain.CommandInterface;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.EulerAngle;


public class CmdSetBodyPose implements CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player p = (Player) sender;

        if (p.hasPermission("aa.edit")) {

            if (args.length == 5) {

                Float distance = Float.parseFloat(args[4]);

                if (distance <= 100) {

                    double a = 0;
                    double b = 0;
                    double c = 0;
                    try {
                        a = Integer.parseInt(args[1]);
                        b = Integer.parseInt(args[2]);
                        c = Integer.parseInt(args[3]);
                    } catch(NumberFormatException ex) {}

                    a = Math.toRadians(a);
                    b = Math.toRadians(b);
                    c = Math.toRadians(c);

                    EulerAngle ea = new EulerAngle(a, b, c);

                    for (Entity entity : p.getNearbyEntities(distance, distance, distance)) {
                        if(entity instanceof ArmorStand) {
                            ArmorStand armorstand = (ArmorStand) entity;
                            armorstand.setBodyPose(ea);
                        }
                    }

                }

                if (distance > 100) {
                    p.sendMessage("§c[AA] Please do not use higher values than 100 for the range!");
                }

            }

            else {
                p.sendMessage("§c[AA] This command was not used correctly! Please use §b/aa bp <pitch> <roll> <yaw> <range>§c!");
                p.sendMessage("§c[AA] Note: §b<pitch> <roll> §cand §b<yaw> §care degrees from 0 to 360!");
            }

        }
        else {
            p.sendMessage("§c[AA] Sorry, but you have no permission to use this command!");
        }

        return true;
    }

}