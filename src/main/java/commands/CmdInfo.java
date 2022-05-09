package commands;

import com.falyrion.aa.AdvancedArmorStandsMain;
import com.falyrion.aa.AdvancedArmorStandsMain.CommandInterface;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class CmdInfo implements CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player player = (Player) sender;

        if (args.length == 1) {

            String aaVersion = AdvancedArmorStandsMain.getInstance().aaVersion;
            String apiVersion = AdvancedArmorStandsMain.getInstance().apiVersion;

            player.sendMessage(ChatColor.GOLD + "---------------------------------------------");
            player.sendMessage(ChatColor.GOLD + "[Advanced ArmorStands]");
            player.sendMessage(" ");
            player.sendMessage(ChatColor.AQUA + "Plugin Version: " + aaVersion);
            player.sendMessage(ChatColor.AQUA + "Made for Minecraft Version: " + apiVersion);
            player.sendMessage(ChatColor.AQUA + "This plugin was made by Falyrion");
            player.sendMessage(" ");

            TextComponent textComponentGithub = new TextComponent(">> Github (click here)");
            textComponentGithub.setColor(net.md_5.bungee.api.ChatColor.YELLOW);
            textComponentGithub.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://github.com/Falyrion/AdvancedArmorStands/blob/main/README.md"));
            player.spigot().sendMessage(textComponentGithub);

            TextComponent textComponentWebsite = new TextComponent(">> Spigot website (click here)");
            textComponentWebsite.setColor(net.md_5.bungee.api.ChatColor.YELLOW);
            textComponentWebsite.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.spigotmc.org/resources/advanced-armor-stands.38513/"));
            player.spigot().sendMessage(textComponentWebsite);

            player.sendMessage(ChatColor.GOLD + "---------------------------------------------");

        }
        else {
            String message = AdvancedArmorStandsMain.getInstance().getMessageString("wrong_command_usage", player.getLocale());
            player.sendMessage(ChatColor.RED + message + ChatColor.AQUA + " /aa info , /aa help");
        }

        return true;
    }

}