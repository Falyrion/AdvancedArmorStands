package commands;

import com.falyrion.aa.AdvancedArmorStandsMain;
import com.falyrion.aa.AdvancedArmorStandsMain.CommandInterface;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.EulerAngle;


public class CmdSetRightLegPose implements CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player player = (Player) sender;

        if (player.hasPermission("aa.edit")) {

            if (args.length == 5) {

                Float distance = Float.parseFloat(args[4]);

                    if (distance <= AdvancedArmorStandsMain.getInstance().editRange) {

                        double arg_roll = 0;
                        double arg_yaw = 0;
                        double arg_pitch = 0;
                        try {
                            arg_roll = Integer.parseInt(args[1]);
                            arg_yaw = Integer.parseInt(args[2]);
                            arg_pitch = Integer.parseInt(args[3]);
                        } catch (NumberFormatException ex) {}

                        arg_roll = Math.toRadians(arg_roll);
                        arg_yaw = Math.toRadians(arg_yaw);
                        arg_pitch = Math.toRadians(arg_pitch);

                        EulerAngle newPoseEulerAngle = new EulerAngle(arg_roll, arg_yaw, arg_pitch);

                        for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                            if (entity instanceof ArmorStand) {
                                ArmorStand armorstand = (ArmorStand) entity;
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorstand, player)) {
                                    continue;
                                }
                                armorstand.setRightLegPose(newPoseEulerAngle);
                            }
                        }

                        String message = AdvancedArmorStandsMain.getInstance().getMessageString("modification", player.getLocale()).replace("%s", distance.toString());
                        player.sendMessage(ChatColor.GOLD + message);

                    } else {

                        String message = AdvancedArmorStandsMain.getInstance().getMessageString("range_error", player.getLocale());
                        message = String.format(message, AdvancedArmorStandsMain.getInstance().editRange);
                        player.sendMessage(ChatColor.RED + message);

                    }

            } else {

                String message_01 = AdvancedArmorStandsMain.getInstance().getMessageString("wrong_command_usage", player.getLocale());
                String message_02 = AdvancedArmorStandsMain.getInstance().getMessageString("pose_error_01", player.getLocale());
                player.sendMessage(ChatColor.RED + message_01 + ChatColor.AQUA + " /aa rlp <roll> <yaw> <pitch> <range>");
                player.sendMessage(ChatColor.RED + message_02);

            }

        } else {

            String message = AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale());
            player.sendMessage(ChatColor.RED + message);

        }

        return true;

    }

}
