package commands;

import com.falyrion.aa.AdvancedArmorStandsMain.CommandInterface;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class CmdHelp implements CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player p = (Player) sender;

        if (p.hasPermission("aa.edit")) {

            if (args.length == 1) {

                p.sendMessage(ChatColor.GOLD + "---------------------------------------------");
                p.sendMessage(ChatColor.GOLD + "[Advanced ArmorStands] All Commands [Page 1/3]");
                p.sendMessage(" ");
                p.sendMessage("§b/aa " + ChatColor.WHITE + "Basic Command; Opens the Quick Menu");
                p.sendMessage("§b/aa info " + ChatColor.WHITE + "Shows plugin infos (version number, author, etc)");
                p.sendMessage(" ");
                p.sendMessage(ChatColor.GOLD + "Basic Commands");
                p.sendMessage("§b/aa base <on/off> <range> " + ChatColor.WHITE + "Modify baseplate");
                p.sendMessage("§b/aa gravity <on/off> <range> " + ChatColor.WHITE + "Modify gravity");
                p.sendMessage("§b/aa visible <on/off> <range> " + ChatColor.WHITE + "Modify visibilty");
                p.sendMessage("§b/aa size <small/normal> <range> " + ChatColor.WHITE + "Modify size");
                p.sendMessage("§b/aa invulnerable <on/off> <range> " + ChatColor.WHITE + "Modify vulnerability");
                p.sendMessage("    ");
                p.sendMessage(ChatColor.GOLD + "See §b/aa help <page-number> §6for more! [Page 1/3]");

                TextComponent msg = new TextComponent(ChatColor.GOLD + "For a full documentation in your browser click §bhere§6!");
                msg.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.spigotmc.org/resources/advanced-armor-stands.38513/"));
                p.spigot().sendMessage(msg);

                p.sendMessage("§6---------------------------------------------");

            }
            if (args.length == 2) {

                if (args[1].equalsIgnoreCase("1")) {
                    p.sendMessage(ChatColor.GOLD + "---------------------------------------------");
                    p.sendMessage(ChatColor.GOLD + "[Advanced ArmorStands] All Commands [Page 1/3]");
                    p.sendMessage("    ");
                    p.sendMessage(ChatColor.AQUA + "/aa " + ChatColor.WHITE + "Basic Command; Opens the Menu");
                    p.sendMessage("    ");
                    p.sendMessage(ChatColor.GOLD + "Basic Commands");
                    p.sendMessage(ChatColor.AQUA + "/aa base <on/off> <range>" + ChatColor.WHITE + "Modify baseplate");
                    p.sendMessage(ChatColor.AQUA + "/aa gravity <on/off> <range> " + ChatColor.WHITE + "Modify gravity");
                    p.sendMessage(ChatColor.AQUA + "/aa visible <on/off> <range> " + ChatColor.WHITE + "Modify visibilty");
                    p.sendMessage(ChatColor.AQUA + "/aa size <small/normal> <range> " + ChatColor.WHITE + "Modify size");
                    p.sendMessage(ChatColor.AQUA + "/aa invulnerable <on/off> <range> " + ChatColor.WHITE + "Modify vulnerability");
                    p.sendMessage("    ");
                    p.sendMessage(ChatColor.GOLD + "See " + ChatColor.AQUA + "/aa help <page-number> §6for more! [Page 1/3]");
                    TextComponent msg = new TextComponent(ChatColor.GOLD + "For a full documentation in your browser click §bhere§6!");
                    msg.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.spigotmc.org/resources/advanced-armor-stands.38513/"));
                    p.spigot().sendMessage(msg);
                    p.sendMessage(ChatColor.GOLD + "---------------------------------------------");
                }

                if (args[1].equalsIgnoreCase("2")) {
                    p.sendMessage(ChatColor.GOLD + "---------------------------------------------");
                    p.sendMessage(ChatColor.GOLD + "[Advanced ArmorStands] All Commands [Page 2/3]");
                    p.sendMessage(" ");
                    p.sendMessage(ChatColor.GOLD + "Poses");
                    p.sendMessage(ChatColor.AQUA + "/aa hp <roll> <yaw> <pitch> <range> " + ChatColor.WHITE + "Modify head-pose");
                    p.sendMessage(ChatColor.AQUA + "/aa bp <roll> <yaw> <pitch> <range> " + ChatColor.WHITE + "Modify body-pose");
                    p.sendMessage(ChatColor.AQUA + "/aa rap <roll> <yaw> <pitch> <range> " + ChatColor.WHITE + "Modify right-arm-pose");
                    p.sendMessage(ChatColor.AQUA + "/aa lap <roll> <yaw> <pitch> <range> " + ChatColor.WHITE + "Modify left-arm-pose");
                    p.sendMessage(ChatColor.AQUA + "/aa rlp <roll> <yaw> <pitch> <range> " + ChatColor.WHITE + "Modify right-leg-pose");
                    p.sendMessage(ChatColor.AQUA + "/aa llp <roll> <yaw> <pitch> <range> "+ ChatColor.WHITE + "Modify left-leg-pose");
                    p.sendMessage(" ");
                    p.sendMessage(ChatColor.GOLD + "See §b/aa help <page-number> §6for more! [Page 2/3]");
                    TextComponent msg = new TextComponent(ChatColor.GOLD + "For a full documentation in your browser click §bhere§6!");
                    msg.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.spigotmc.org/resources/advanced-armor-stands.38513/"));
                    p.spigot().sendMessage(msg);
                    p.sendMessage(ChatColor.GOLD + "---------------------------------------------");
                }

                if (args[1].equalsIgnoreCase("3")) {
                    p.sendMessage(ChatColor.GOLD + "---------------------------------------------");
                    p.sendMessage(ChatColor.GOLD + "[Advanced ArmorStands] All Commands [Page 3/3]");
                    p.sendMessage(" ");
                    p.sendMessage(ChatColor.GOLD + "Misc");
                    p.sendMessage(ChatColor.AQUA + "/aa head <player_name> <amount> " + ChatColor.WHITE + "Get any players head");
                    p.sendMessage(ChatColor.AQUA + "/aa rotate <rotation> <rage> " + ChatColor.WHITE + "Modify rotation");
                    p.sendMessage(ChatColor.AQUA + "/aa name <text> " + ChatColor.WHITE + "Gives the armor stand a custom name");
                    p.sendMessage(ChatColor.AQUA + "/aa hidenames <range> " + ChatColor.WHITE + "Removes the name of an armor stand");
                    p.sendMessage(ChatColor.AQUA + "/aa tp <x> <y> <z> [rotation] " + ChatColor.WHITE + "Teleport an armor stand");
                    p.sendMessage(ChatColor.AQUA + "/aa clone <x> <y> <z> " + ChatColor.WHITE + "Clone an armor stand");
                    p.sendMessage(ChatColor.AQUA + "/aa stats " + ChatColor.WHITE + "Shows stats of a nearby armor stand");
                    p.sendMessage(" ");
                    p.sendMessage(ChatColor.GOLD + "See §b/aa help <page-number> §6for more! [Page 3/3]");
                    TextComponent msg = new TextComponent(ChatColor.GOLD + "For a full documentation in your browser click §bhere§6!");
                    msg.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.spigotmc.org/resources/advanced-armor-stands.38513/"));
                    p.spigot().sendMessage(msg);
                    p.sendMessage(ChatColor.GOLD + "---------------------------------------------");
                }

                if (!args[1].equalsIgnoreCase("1") && !args[1].equalsIgnoreCase("2") && !args[1].equalsIgnoreCase("3")) {
                    p.sendMessage(ChatColor.RED + "[AA] Available pages for help are: §b1§c; §b2§c; §b3§c!");
                }
            }

            if (!(args.length == 1) && !(args.length == 2)) {
                p.sendMessage(ChatColor.RED + "[AA] This command was not used correctly! Please use §b/aa help §6or §b/aa help <page-number>§6!");
            }

        }
        else {
            p.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to use this command! Searching Infos about this plugin instead? Use /aa info");
        }

        return true;
    }

}