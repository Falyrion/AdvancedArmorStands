package commands;

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

        Player p = (Player) sender;

        if (p.hasPermission("aa.names")) {

            if (args.length <= 20) {

                String customname = ChatColor.translateAlternateColorCodes('&', String.join(" ", args).replaceFirst("name ", ""));

                for (Entity entity : p.getNearbyEntities(1, 1, 1)) {
                    if (entity instanceof ArmorStand) {
                        ArmorStand armorstand = (ArmorStand) entity;
                        armorstand.setCustomName(customname);
                        armorstand.setCustomNameVisible(true);
                    }
                }

            }

            else {
                p.sendMessage("§c[AA] Your name is too long!");
            }

        }
        else {
            p.sendMessage("§c[AA] Sorry, but you have no permission to use this command!");
        }

        return true;
    }

}