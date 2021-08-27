package commands;

import com.falyrion.aa.AdvancedArmorStandsMain;
import com.falyrion.aa.AdvancedArmorStandsMain.CommandInterface;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;


public class CmdSetCustomName implements CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player player = (Player) sender;

        if (player.hasPermission("aa.edit")) {

            if (args.length <= 20) {

                String customName = ChatColor.translateAlternateColorCodes('&', String.join(" ", args).replaceFirst("name ", ""));

                for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                    if (entity instanceof ArmorStand) {
                        ArmorStand armorstand = (ArmorStand) entity;
                        armorstand.setCustomName(customName);
                        armorstand.setCustomNameVisible(true);
                    }
                }

                String message = AdvancedArmorStandsMain.getInstance().getMessageString("modification", player.getLocale()).replace("%s", "1");
                player.sendMessage(org.bukkit.ChatColor.GOLD + message);

            } else {

                String message = AdvancedArmorStandsMain.getInstance().getMessageString("name_error_01", player.getLocale());
                player.sendMessage(org.bukkit.ChatColor.RED + message);

            }

        } else {

            String message = AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale());
            player.sendMessage(org.bukkit.ChatColor.RED + message);

        }

        return true;

    }

}