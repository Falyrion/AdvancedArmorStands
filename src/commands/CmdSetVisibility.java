package commands;

import com.falyrion.aa.AdvancedArmorStandsMain.CommandInterface;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;


public class CmdSetVisibility implements CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player p = (Player) sender;

        if (p.hasPermission("aa.visible")) {

            if (args.length == 3) {

                Float f = Float.parseFloat(args[2]);

                if (f <= 100) {

                    if (args[1].equalsIgnoreCase("on")) {
                        for (Entity entity : p.getNearbyEntities(f, f, f)) {
                            if (entity instanceof ArmorStand){
                                ArmorStand armorstand = (ArmorStand) entity;
                                armorstand.setVisible(true);
                            }
                        }
                        p.sendMessage("§6[AA] Modified all armor stands in " + f + " blocks range!");
                    }

                    if (args[1].equalsIgnoreCase("off")) {
                        for (Entity entity : p.getNearbyEntities(f, f, f)) {
                            if (entity instanceof ArmorStand) {
                                ArmorStand armorstand = (ArmorStand) entity;
                                armorstand.setVisible(false);
                            }
                        }
                        p.sendMessage("§6[AA] Modified all armor stands in " + f + " blocks range!");
                    }
                    if (!args[1].equalsIgnoreCase("on") && !args[1].equalsIgnoreCase("off")) {
                        p.sendMessage("§c[AA]§f This command was not used correctly! Please use §b/aa visible <on/off> <range>");
                    }

                }

                if (f > 100) {
                    p.sendMessage("§c[AA] Please do not use higher values than 100 for the range!");
                }

            }

            else {
                p.sendMessage("§c[AA] This command was not used correctly! Please use §b/aa visible <on/off> <range>");
            }

        }
        else {
            p.sendMessage("§c[AA] Sorry, but you have no permission to use this command!");
        }

        return true;
    }

}