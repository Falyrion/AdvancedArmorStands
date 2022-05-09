package com.falyrion.aa;

import commands.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

public class AdvancedArmorStandsMain extends JavaPlugin implements Listener {

    private static AdvancedArmorStandsMain instance;

    public static AdvancedArmorStandsMain getInstance() {
        return instance;
    }

    public float editRange = 100f;
    private boolean ownershipOfPlacedArmorStand = false;
    public static final String ARMOR_STAND_OWNER_KEY = "aa-owner";

    private GUI gui;

    public String aaVersion = "v.1.18.0.0";
    public String apiVersion = "1.18+";

    FileConfiguration config = getConfig();

    private final Logger log = Bukkit.getLogger();

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
        commandHandler.registerCommand("help", new CmdInfo());
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

    public boolean isOwnershipOfPlacedArmorStand() {
        return ownershipOfPlacedArmorStand;
    }

    public void setOwnershipOfPlacedArmorStand(boolean ownershipOfPlacedArmorStand) {
        this.ownershipOfPlacedArmorStand = ownershipOfPlacedArmorStand;
    }

    public interface CommandInterface {
        boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args);
    }

    public void showMenu(Player player, int menuID) {
        gui.openMenu(player, menuID);
    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // Language file

    private File languageConfigFile;
    private FileConfiguration languageConfig;

    /**
     * Reads language config file on server start
     */
    private void createLanguageConfig() {

        // Check if file exists
        File file = new File("plugins\\AdvancedArmorStands\\lang.yml");
        if (!file.exists()) {

            // Create file if it does not exist
            log.info("[AdvancedArmorStands] Creating language file");

            saveResource("lang.yml", false);
        }

        languageConfigFile = new File(getDataFolder(), "lang.yml");
        languageConfig = new YamlConfiguration();
        try {
            languageConfig.load(languageConfigFile);
        } catch (IOException | InvalidConfigurationException e) {
            log.warning("[AdvancedArmorStands] Could not load language file");
            log.warning("[AdvancedArmorStands] Please delete the folder AdvancedArmorStands inside your plugins folder and restart or reload the server.");
            e.printStackTrace();
        }
    }

    public FileConfiguration getLanguageConfig() {
        return this.languageConfig;
    }

    /**
     * Reads individual message string from lang.yml-file and returns it
     *
     * @param messagePath: String, Path to message in the lang.yml-file
     * @param language:    String, Language to look up
     * @return: String, Message
     */
    public String getMessageString(String messagePath, String language) {

        // Check if language path exist
        if (getLanguageConfig().getString(language) != null) {

            // If language path points to another language, use that instead
            if (getLanguageConfig().getString(language).length() == 5) {
                language = getLanguageConfig().getString(language);
            }

            // Get message translated to wanted language
            String message = getLanguageConfig().getString(language + "." + messagePath);

            // Check if message was translated successfully, else get default path (english)

            if (message == null) {
                message = getLanguageConfig().getString("en_us." + messagePath);

                // TODO: If message still null, languages.file might have been deleted for any reason. Recreate it.
            }

            return message;

        } else {
            // If language path does not exist, use default language (english)
            String message = getLanguageConfig().getString("en_us." + messagePath);
            return message;
        }

    }


    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // Sounds

    public void playSoundClick(Player player) {
        try {
            player.playSound(player.getLocation(), Sound.BLOCK_COMPARATOR_CLICK, 1, 1);
        } catch (NoSuchFieldError exc) {
        }

    }

    public void playSoundBass(Player player) {
        try {
            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 1, 1);
        } catch (NoSuchFieldError exc) {
        }

    }

    public void playSoundTeleport(Player player) {
        try {
            player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1, 1);
        } catch (NoSuchFieldError exc) {
        }

    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // Enable, Disable

    @Override
    public void onEnable() {

        // Create GUI class
        gui = new GUI();

        instance = this;

        // Call function to register commands
        this.registerCommands();

        // Initiate config file
        this.saveDefaultConfig();

        // Initiate language files
        createLanguageConfig();

        // Enable Event-Listener
        Bukkit.getServer().getPluginManager().registerEvents(new InventoryClickHandler(), this);

        if (config.getBoolean("spawnWithArms")) {
            // Enable only when config-boolean set to true
            Bukkit.getServer().getPluginManager().registerEvents(new SpawnHandler(), this);
        }

        if (config.contains("ownershipOfPlacedArmorStand")) {
            // Enable only when config-boolean set to true
            setOwnershipOfPlacedArmorStand(config.getBoolean("ownershipOfPlacedArmorStand"));
        } else {
            config.set("ownershipOfPlacedArmorStand", false);
        }

        if (config.contains("placeWithArms")) {
            if (config.getBoolean("placeWithArms")) {
                // Enable only when config-boolean set to true
                Bukkit.getServer().getPluginManager().registerEvents(new PlacedHandler(), this);
            }
        } else {
            config.set("placeWithArms", true);
        }

        if (config.contains("commandEditRange")) {
            editRange = (float) config.getDouble("commandEditRange");
        } else {
            config.set("commandEditRange", 100);
        }

        // Enable metrics
        Metrics metrics = new Metrics(this, 13743);

        // Debug
        log.info("[AdvancedArmorStands] Version " + aaVersion + " (for bukkit " + apiVersion + ") enabled");
    }

    @Override
    public void onDisable() {
        log.info("[AdvancedArmorStands] disabled");
    }


    /**
     * Check if the player can change the armor Stand. It checks if the ownership config is enabled and then
     * if the armor stand has `armor-stand-owner` key and then if the uuid of the player (sender) is equal to the uuid of
     * the player who placed the armor stand
     *
     * @param armorStand the armor stand to change
     * @param player     the player who triggered the action
     * @return true if the player can change the armor Stand. otherwise false
     */
    public boolean canChange(ArmorStand armorStand, Player player) {
        if (AdvancedArmorStandsMain.getInstance().isOwnershipOfPlacedArmorStand()) {
            if (hasOwnershipPersistentData(armorStand)) {
                String extractedUUIDOfOwner = getOwnershipUUIDFromPersistentData(armorStand);
                if (!extractedUUIDOfOwner.equals(player.getUniqueId().toString())) {
                    String message = AdvancedArmorStandsMain.getInstance().getMessageString("ownership_error",
                            player.getLocale());
                    player.sendMessage(ChatColor.RED + message);
                    return false;
                }
            }
        }
        return true;
    }

    private boolean hasOwnershipPersistentData(ArmorStand armorStand) {
        return armorStand.getPersistentDataContainer()
                .has(new NamespacedKey(AdvancedArmorStandsMain.getInstance(), ARMOR_STAND_OWNER_KEY),
                        PersistentDataType.STRING);
    }

    private String getOwnershipUUIDFromPersistentData(ArmorStand armorStand) {
        return armorStand.getPersistentDataContainer()
                .get(new NamespacedKey(AdvancedArmorStandsMain.getInstance(), ARMOR_STAND_OWNER_KEY),
                        PersistentDataType.STRING);
    }

}
