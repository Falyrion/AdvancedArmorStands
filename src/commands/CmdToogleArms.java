package commands;

import com.falyrion.aa.AdvancedArmorStandsMain.CommandInterface;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;


//ArgsCmd also implements CommandInterface
public class CmdToogleArms implements CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player player = (Player) sender;

        if (player.hasPermission("aa.edit")) {

            if (args.length == 3) {

                Float distance = Float.parseFloat(args[2]);

                if (distance <= 100) {

                    if (args[1].equalsIgnoreCase("on")) {
                        for(Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                            if (entity instanceof ArmorStand) {
                                ArmorStand armorstand = (ArmorStand) entity;
                                armorstand.setArms(true);
                            }
                        }
                        player.sendMessage(ChatColor.GOLD + "[AA] Modified all armor stands in " + distance + " blocks range!");
                    }

                    if (args[1].equalsIgnoreCase("off")) {
                        for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                            if (entity instanceof ArmorStand) {
                                ArmorStand armorstand = (ArmorStand) entity;
                                armorstand.setArms(false);
                            }
                        }
                        player.sendMessage("ChatColor.GOLD +[AA] Modified all armor stands in " + distance + " blocks range!");
                    }
                    if (!args[1].equalsIgnoreCase("on") && !args[1].equalsIgnoreCase("off")) {
                        player.sendMessage(ChatColor.RED +"[AA] This command was not used correctly! Please use §b/aa arms <on/off> <range>");
                    }

                }

                if (distance > 100) {
                    player.sendMessage(ChatColor.RED +"[AA] Please do not use higher values than 100 as range!");
                }

            }

            else {
                player.sendMessage(ChatColor.RED + "[AA] This command was not used correctly! Please use §b/aa arms <on/off> <range>");
            }

        }
        else {
            player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to use this command!");
        }

        return true;
    }

}