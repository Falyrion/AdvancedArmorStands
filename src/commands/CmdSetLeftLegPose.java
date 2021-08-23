package commands;

import com.falyrion.aa.AdvancedArmorStandsMain.CommandInterface;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.EulerAngle;


public class CmdSetLeftLegPose implements CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player p = (Player) sender;

        if (p.hasPermission("aa.edit")) {

            if (args.length == 5) {

                Float f = Float.parseFloat(args[4]);

                if (f <= 100) {

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

                    EulerAngle ea = new EulerAngle(a,b,c);

                    for (Entity entity : p.getNearbyEntities(f, f, f)) {
                        if (entity instanceof ArmorStand) {
                            ArmorStand armorstand = (ArmorStand) entity;
                            armorstand.setLeftLegPose(ea);
                        }
                    }
                }
                if (f > 100) {
                    p.sendMessage("§c[AA] Please do not use higher values than 100 for the range!");
                }

            }

            else {
                p.sendMessage(ChatColor.RED + "[AA] This command was not used correctly! Please use " + ChatColor.AQUA + "/aa llp <roll> <yaw> <pitch> <range>");
                p.sendMessage(ChatColor.RED + "[AA] Note: <roll> <yaw> and <pitch> are degrees from 0 to 360!");
            }

        }
        else {
            p.sendMessage("§c[AA] Sorry, but you have no permission to use this command!");
        }

        return true;
    }

}