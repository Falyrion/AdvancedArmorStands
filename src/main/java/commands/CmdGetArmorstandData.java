package commands;

import com.falyrion.aa.AdvancedArmorStandsMain;
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

                        double roll_hp = armorstand.getHeadPose().getX(); roll_hp = Math.toDegrees(roll_hp); roll_hp = Math.rint(roll_hp);
                        double yaw_hp = armorstand.getHeadPose().getY(); yaw_hp = Math.toDegrees(yaw_hp); yaw_hp = Math.rint(yaw_hp);
                        double pitch_hp = armorstand.getHeadPose().getZ(); pitch_hp = Math.toDegrees(pitch_hp); pitch_hp = Math.rint(pitch_hp);

                        double roll_bp = armorstand.getBodyPose().getX(); roll_bp = Math.toDegrees(roll_bp); roll_bp = Math.rint(roll_bp);
                        double yaw_bp = armorstand.getBodyPose().getY(); yaw_bp = Math.toDegrees(yaw_bp); yaw_bp = Math.rint(yaw_bp);
                        double pitch_bp = armorstand.getBodyPose().getZ(); pitch_bp = Math.toDegrees(pitch_bp); pitch_bp = Math.rint(pitch_bp);

                        double roll_rap = armorstand.getRightArmPose().getX(); roll_rap = Math.toDegrees(roll_rap); roll_rap = Math.rint(roll_rap);
                        double yaw_rap = armorstand.getRightArmPose().getY(); yaw_rap = Math.toDegrees(yaw_rap); yaw_rap = Math.rint(yaw_rap);
                        double pitch_rap = armorstand.getRightArmPose().getZ(); pitch_rap = Math.toDegrees(pitch_rap); pitch_rap = Math.rint(pitch_rap);

                        double roll_lap = armorstand.getLeftArmPose().getX(); roll_lap = Math.toDegrees(roll_lap); roll_lap = Math.rint(roll_lap);
                        double yaw_lap = armorstand.getLeftArmPose().getY(); yaw_lap = Math.toDegrees(yaw_lap); yaw_lap = Math.rint(yaw_lap);
                        double pitch_lap = armorstand.getLeftArmPose().getZ(); pitch_lap = Math.toDegrees(pitch_lap); pitch_lap = Math.rint(pitch_lap);

                        double roll_rlp = armorstand.getRightLegPose().getX(); roll_rlp = Math.toDegrees(roll_rlp); roll_rlp = Math.rint(roll_rlp);
                        double yaw_rlp = armorstand.getRightLegPose().getY(); yaw_rlp = Math.toDegrees(yaw_rlp); yaw_rlp = Math.rint(yaw_rlp);
                        double pitch_rlp = armorstand.getRightLegPose().getZ(); pitch_rlp = Math.toDegrees(pitch_rlp); pitch_rlp = Math.rint(pitch_rlp);

                        double roll_llp = armorstand.getLeftLegPose().getX(); roll_llp = Math.toDegrees(roll_llp); roll_llp = Math.rint(roll_llp);
                        double yaw_llp = armorstand.getLeftLegPose().getY(); yaw_llp = Math.toDegrees(yaw_llp); yaw_llp = Math.rint(yaw_llp);
                        double pitch_llp = armorstand.getLeftLegPose().getZ(); pitch_llp = Math.toDegrees(pitch_llp); pitch_llp = Math.rint(pitch_llp);

                        float locationX = (float) armorstand.getLocation().getX();
                        float locationY = (float) armorstand.getLocation().getY();
                        float locationZ = (float) armorstand.getLocation().getZ();

                        player.sendMessage(ChatColor.GOLD + "---------------------------------------------");
                        String messageData = AdvancedArmorStandsMain.getInstance().getMessageString("data_cmd", player.getLocale());
                        player.sendMessage(ChatColor.GOLD + messageData);
                        player.sendMessage(ChatColor.GOLD + "Head: " + ChatColor.AQUA + roll_hp + " / " + yaw_hp + " / " + pitch_hp);
                        player.sendMessage(ChatColor.GOLD + "Body: " + ChatColor.AQUA + roll_bp + " / " + yaw_bp + " / " + pitch_bp);
                        player.sendMessage(ChatColor.GOLD + "RAP: " + ChatColor.AQUA + roll_rap + " / " + yaw_rap + " / " + pitch_rap);
                        player.sendMessage(ChatColor.GOLD + "LAP: " + ChatColor.AQUA + roll_lap + " / " + yaw_lap + " / " + pitch_lap);
                        player.sendMessage(ChatColor.GOLD + "RLP: " + ChatColor.AQUA + roll_rlp + " / " + yaw_rlp + " / " + pitch_rlp);
                        player.sendMessage(ChatColor.GOLD + "LLP: " + ChatColor.AQUA + roll_llp + " / " + yaw_llp + " / " + pitch_llp);
                        player.sendMessage(ChatColor.GOLD + "Coordinates: " + ChatColor.AQUA + " x: " + locationX + " / y: " + locationY + " / z: " + locationZ);
                        player.sendMessage(ChatColor.GOLD + "---------------------------------------------");
                    }
                }

            } else {

                String message = AdvancedArmorStandsMain.getInstance().getMessageString("wrong_command_usage", player.getLocale());
                player.sendMessage(ChatColor.RED + message + ChatColor.AQUA + " /aa stats");

            }

        } else {

            String message = AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale());
            player.sendMessage(ChatColor.RED + message);

        }

        return true;

    }

}
