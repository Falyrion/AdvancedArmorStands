package commands;

import com.falyrion.aa.AdvancedArmorStandsMain;
import com.falyrion.aa.AdvancedArmorStandsMain.CommandInterface;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;


public class CmdSetVisibility implements CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player player = (Player) sender;

        if (player.hasPermission("aa.visible")) {

            if (args.length == 3) {

                Float distance = Float.parseFloat(args[2]);

                if (!args[1].equalsIgnoreCase("on") && !args[1].equalsIgnoreCase("off")) {

                    String message = AdvancedArmorStandsMain.getInstance().getMessageString("wrong_command_usage", player.getLocale());
                    player.sendMessage(ChatColor.RED + message + ChatColor.AQUA + " /aa visible <on/off> <range>");

                } else {

                    if (distance <= AdvancedArmorStandsMain.getInstance().getSettings().commandEditRange()) {

                        for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                            if (entity instanceof ArmorStand armorstand) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorstand, player)) {
                                    continue;
                                }

                                switch (args[1]) {
                                    case "on":
                                        if (!armorstand.isVisible()) {
                                            armorstand.setVisible(true);
                                        }
                                        break;

                                    case "off":
                                        if (armorstand.isVisible()) {
                                            armorstand.setVisible(false);
                                        }
                                        break;
                                }

                                String message = AdvancedArmorStandsMain.getInstance().getMessageString("modification", player.getLocale()).replace("%s", distance.toString());
                                player.sendMessage(ChatColor.GOLD + message);

                            }
                        }

                    } else {

                        String message = AdvancedArmorStandsMain.getInstance().getMessageString("range_error", player.getLocale());
                        message = String.format(message, AdvancedArmorStandsMain.getInstance().getSettings().commandEditRange());
                        player.sendMessage(ChatColor.RED + message);

                    }

                }

            } else {

                String message = AdvancedArmorStandsMain.getInstance().getMessageString("wrong_command_usage", player.getLocale());
                player.sendMessage(ChatColor.RED + message + ChatColor.AQUA + " /aa glow <on/off> <range>");

            }

        } else {

            String message = AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale());
            player.sendMessage(ChatColor.RED + message);

        }

        return true;

    }

}
