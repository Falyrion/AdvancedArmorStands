package commands;

import com.falyrion.aa.AdvancedArmorStandsMain;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class CmdGlow implements AdvancedArmorStandsMain.CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player player = (Player) sender;

        if (player.hasPermission("aa.edit")) {
            if (args.length == 3) {

                Float f = Float.parseFloat(args[2]);

                if (!args[1].equalsIgnoreCase("on") && !args[1].equalsIgnoreCase("off")) {
                    player.sendMessage(ChatColor.RED + "[AA] This command was not used correctly! Please use " + ChatColor.AQUA + "/aa glow <on/off> <range>");
                } else {

                    if (f <= 100) {

                        for (Entity entity : player.getNearbyEntities(f, f, f)) {
                            if (entity instanceof ArmorStand) {
                                ArmorStand armorstand = (ArmorStand) entity;

                                switch (args[1]) {
                                    case "on":
                                        if (armorstand.isGlowing()) {
                                            player.sendMessage(ChatColor.RED + "[AA] A nearby armor stand is already glowing!");
                                        } else {
                                            armorstand.setGlowing(true);
                                            player.sendMessage(ChatColor.GOLD + "[AA] Added glow effect to a nearby armor stand!");
                                        }
                                        break;

                                    case "off":
                                        if (armorstand.isGlowing()) {
                                            armorstand.setGlowing(false);
                                            player.sendMessage(ChatColor.GOLD + "[AA] Removed glow effect from a nearby armor stand!");
                                        } else {
                                            player.sendMessage(ChatColor.RED + "[AA] A nearby armor stand has already no glow effect!");
                                        }
                                        break;
                                }
                            }
                        }

                    } if (f > 100) {
                        player.sendMessage(ChatColor.RED + "[AA] Please do not use higher values than 100 for the range!");
                    }

                }



            } else {
                player.sendMessage(ChatColor.RED + "[AA] This command was not used correctly! Please use " + ChatColor.AQUA + "/aa glow <on/off> <range>");
            }
        } else {
            player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to use this command!");
        }

        return true;

    }

}
