package com.falyrion.aa;

import commands.*;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class AdvancedArmorStandsMain extends JavaPlugin implements Listener {

    private static AdvancedArmorStandsMain instance;
    public static AdvancedArmorStandsMain getInstance() {
        return instance;
    }

    private GUI gui;

    public String aaVersion = "v.1.17.1.0";
    public String apiVersion = "1.17+";

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // Handling commands

    private void registerCommands() {
        CommandHandler commandHandler = new CommandHandler();

        commandHandler.registerCommand("aa", new CmdShowMenuMain());
        commandHandler.registerCommand("menu", new CmdShowMenuMain());
        commandHandler.registerCommand("arms", new CmdToogleArms());
        commandHandler.registerCommand("base", new CmdToogleBaseplate());
        commandHandler.registerCommand("size", new CmdSetSize());
        commandHandler.registerCommand("gravity", new CmdSetGravity());
        commandHandler.registerCommand("invulnerable", new CmdSetInvulnerable());
        commandHandler.registerCommand("visible", new CmdSetVisibility());
        commandHandler.registerCommand("glow", new CmdGlow());
        commandHandler.registerCommand("hp", new CmdSetHeadPose());
        commandHandler.registerCommand("bp", new CmdSetBodyPose());
        commandHandler.registerCommand("rap", new CmdSetRightArmPose());
        commandHandler.registerCommand("lap", new CmdSetLeftArmPose());
        commandHandler.registerCommand("rlp", new CmdSetRightLegPose());
        commandHandler.registerCommand("llp", new CmdSetLeftLegPose());
        commandHandler.registerCommand("help", new CmdHelp());
        commandHandler.registerCommand("info", new CmdInfo());
        commandHandler.registerCommand("name", new CmdSetCustomName());
        commandHandler.registerCommand("hidenames", new CmdRemoveCustomName());
        commandHandler.registerCommand("head", new CmdReciveCustomHead());
        commandHandler.registerCommand("rotate", new CmdSetRotation());
        commandHandler.registerCommand("stats", new CmdGetArmorstandData());
        commandHandler.registerCommand("tp", new CmdTeleport());
        commandHandler.registerCommand("clone", new CmdClone());
        commandHandler.registerCommand("give", new CmdGiveArmorstand());

        getCommand("aa").setExecutor(commandHandler);
    }

    public interface CommandInterface {
        boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args);
    }

    public void showMenu(Player player, int menuID) {
        gui.openMenu(player, menuID);
    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // Sounds

    public void playSoundClick(Player player) {
        try {
            player.playSound(player.getLocation(), Sound.BLOCK_COMPARATOR_CLICK, 1, 1);
        } catch (NoSuchFieldError exc) { }

    }

    public void playSoundBass(Player player) {
        try {
            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 1, 1);
        } catch (NoSuchFieldError exc) { }

    }

    public void playSoundTeleport(Player player) {
        try {
            player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1, 1);
        } catch (NoSuchFieldError exc) { }

    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // Enable, Disable

    @Override
    public void onEnable() {

        gui = new GUI();

        instance = this;

        this.registerCommands();

        Bukkit.getServer().getPluginManager().registerEvents(new InventoryClickHandler(), this);

        System.out.println("++++++++++++++++++++++ [Advanced ArmorStands] ++++++++++++++++++++++");
        System.out.println("[AdvancedArmorStands] Version " + aaVersion + " enabled");
        System.out.println("[Advanced ArmorStands] Attention: This version supports bukkit " + apiVersion + " only.");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    @Override
    public void onDisable() {
        System.out.println("[AdvancedArmorStands] disabled");
    }

}
