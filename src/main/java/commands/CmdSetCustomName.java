package commands;

import com.falyrion.aa.AdvancedArmorStandsMain;
import com.falyrion.aa.AdvancedArmorStandsMain.CommandInterface;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;


public class CmdSetCustomName implements CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player player = (Player) sender;

        if (player.hasPermission("aa.names")) {

            if (args.length <= 20) {

                String customName = ChatColor.translateAlternateColorCodes('&', String.join(" ", args).replaceFirst("name ", ""));

                for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                    if (entity instanceof ArmorStand armorstand) {
                        if (!AdvancedArmorStandsMain.getInstance().canChange(armorstand, player)) {
                            continue;
                        }
                        armorstand.setCustomName(customName);
                        armorstand.setCustomNameVisible(true);
                    }
                }

                String message = AdvancedArmorStandsMain.getInstance().getMessageString("modification", player.getLocale()).replace("%s", "1");
                player.sendMessage(ChatColor.GOLD + message);

            } else {

                String message = AdvancedArmorStandsMain.getInstance().getMessageString("name_error_01", player.getLocale());
                player.sendMessage(ChatColor.RED + message);

            }

        } else {

            String message = AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale());
            player.sendMessage(ChatColor.RED + message);

        }

        return true;

    }

}