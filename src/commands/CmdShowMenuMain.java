package commands;

import com.falyrion.aa.AdvancedArmorStandsMain;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdShowMenuMain implements AdvancedArmorStandsMain.CommandInterface {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String commandLabel, String[] arguments) {
        Player player = (Player) commandSender;

        if (player.hasPermission("aa.edit")) {
            AdvancedArmorStandsMain.getInstance().showMenu(player, 1);
        } else {

            String message = AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale());
            player.sendMessage(ChatColor.RED + message);

        }

        return true;
    }

}
