package com.falyrion.aa;

import com.falyrion.aa.AdvancedArmorStandsMain.CommandInterface;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class CommandHandler implements CommandExecutor {

    private static HashMap<String, CommandInterface> commandsMap = new HashMap<String, CommandInterface>();

    public void registerCommand(String name, CommandInterface cmd) {
        commandsMap.put(name, cmd);
    }

    public boolean doesCommandExist(String name) {
        return commandsMap.containsKey(name);
    }

    public CommandInterface getCommandExecutor(String name) {
        return commandsMap.get(name);
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String commandLabel, String[] arguments) {

        if (commandSender instanceof Player) {
            if (arguments.length > 0) {
                if (doesCommandExist(arguments[0])) {
                    getCommandExecutor(arguments[0]).onCommand(commandSender, command, commandLabel, arguments);
                } else {
                    Player player = (Player) commandSender;
                    String message = AdvancedArmorStandsMain.getInstance().getMessageString("command_not_exist", player.getLocale());
                    player.sendMessage(org.bukkit.ChatColor.RED + message);
                }

            } else {
                getCommandExecutor("aa").onCommand(commandSender, command, commandLabel, arguments);
            }

        } else {
            commandSender.sendMessage("[AdvancedArmorStands] Commands can only be issued as a player in game");
        }
        return true;
    }
}
