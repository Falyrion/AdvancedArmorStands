package commands;

import com.falyrion.aa.AdvancedArmorStandsMain.CommandInterface;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;


public class CmdGetArmorstandData implements CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player player = (Player) sender;

        if (player.hasPermission("aa.edit")) {

            if (args.length == 1) {

                for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                    if (entity instanceof ArmorStand) {
                        ArmorStand armorstand = (ArmorStand) entity;

                        double x5 = armorstand.getHeadPose().getX(); x5 = Math.toDegrees(x5); x5 = Math.rint(x5);
                        double y5 = armorstand.getHeadPose().getY(); y5 = Math.toDegrees(y5); y5 = Math.rint(y5);
                        double z5 = armorstand.getHeadPose().getZ(); z5 = Math.toDegrees(z5); z5 = Math.rint(z5);

                        double x6 = armorstand.getBodyPose().getX(); x6 = Math.toDegrees(x6); x6 = Math.rint(x6);
                        double y6 = armorstand.getBodyPose().getY(); y6 = Math.toDegrees(y6); y6 = Math.rint(y6);
                        double z6 = armorstand.getBodyPose().getZ(); z6 = Math.toDegrees(z6); z6 = Math.rint(z6);

                        double x = armorstand.getRightArmPose().getX(); x = Math.toDegrees(x); x = Math.rint(x);
                        double y = armorstand.getRightArmPose().getY(); y = Math.toDegrees(y); y = Math.rint(y);
                        double z = armorstand.getRightArmPose().getZ(); z = Math.toDegrees(z); z = Math.rint(z);

                        double x2 = armorstand.getLeftArmPose().getX(); x2 = Math.toDegrees(x2); x2 = Math.rint(x2);
                        double y2 = armorstand.getLeftArmPose().getY(); y2 = Math.toDegrees(y2); y2 = Math.rint(y2);
                        double z2 = armorstand.getLeftArmPose().getZ(); z2 = Math.toDegrees(z2); z2 = Math.rint(z2);

                        double x3 = armorstand.getRightLegPose().getX(); x3 = Math.toDegrees(x3); x3 = Math.rint(x3);
                        double y3 = armorstand.getRightLegPose().getY(); y3 = Math.toDegrees(y3); y3 = Math.rint(y3);
                        double z3 = armorstand.getRightLegPose().getZ(); z3 = Math.toDegrees(z3); z3 = Math.rint(z3);

                        double x4 = armorstand.getLeftLegPose().getX(); x4 = Math.toDegrees(x4); x4 = Math.rint(x4);
                        double y4 = armorstand.getLeftLegPose().getY(); y4 = Math.toDegrees(y4); y4 = Math.rint(y4);
                        double z4 = armorstand.getLeftLegPose().getZ(); z4 = Math.toDegrees(z4); z4 = Math.rint(z4);

                        float f = (float) armorstand.getLocation().getX();
                        float f2 = (float) armorstand.getLocation().getY();
                        float f3 = (float) armorstand.getLocation().getZ();

                        player.sendMessage(ChatColor.GOLD + "---------------------------------------------");
                        player.sendMessage(ChatColor.GOLD + "[AA] A nearby armor stand has the following stats:");
                        player.sendMessage(ChatColor.GOLD + "Head: " + ChatColor.AQUA + x5 + "/" + y5 + "/" + z5 + ChatColor.GOLD + "; Body: " + ChatColor.AQUA + x6 + "/" + y6 + "/" + z6);
                        player.sendMessage(ChatColor.GOLD + "RightArm: " + ChatColor.AQUA + x + "/" + y + "/" + z + ChatColor.GOLD + "; LeftArm: " + ChatColor.AQUA + x2 + "/" + y2 + "/" + z2);
                        player.sendMessage(ChatColor.GOLD + "RightLeg: " + ChatColor.AQUA + x3 + "/" + y3 + "/" + z3 + ChatColor.GOLD + "; LeftLeg: " + ChatColor.AQUA + x4 + "/" + y4 + "/" + z4);
                        player.sendMessage(ChatColor.GOLD + "Coordinates: " + ChatColor.AQUA + " x: " + f + "/ y: " + f2 + "/ z: " + f3);
                        player.sendMessage(ChatColor.GOLD + "---------------------------------------------");
                    }
                }

            }

            else {
                player.sendMessage(ChatColor.RED + "[AA] This command was not used correctly! Please use §b/aa stats§c!");
            }

        }
        else {
            player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to use this command!");
        }

        return true;
    }

}