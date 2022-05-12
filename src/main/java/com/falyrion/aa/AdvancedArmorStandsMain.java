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

    public static final String ARMOR_STAND_OWNER_KEY = "aa-owner";

    private GUI gui;

    public String aaVersion = "v.1.18.0.0";
    public String apiVersion = "1.17+";

    private Settings settings;

    private final Logger log = Bukkit.getLogger();

    public Settings getSettings() {
        return settings;
    }

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

        // Create GUI class
        gui = new GUI();

        instance = this;

        // Call function to register commands
        this.registerCommands();

        // load config file
        this.loadConfig();

        // Initiate language files
        createLanguageConfig();

        // Enable Event-Listener
        Bukkit.getServer().getPluginManager().registerEvents(new InventoryClickHandler(), this);

        if (settings.spawnWithArms()) {
            // Enable only when config-boolean set to true
            Bukkit.getServer().getPluginManager().registerEvents(new SpawnHandler(), this);
        }
        if (settings.placeWithArms() || settings.ownershipOfPlacedArmorStand()) {
            Bukkit.getServer().getPluginManager().registerEvents(new PlacedHandler(), this);
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
     * Load and rewrite the config file on server start
     */
    private void loadConfig() {
        // read configuration settings (note defaults)
        this.getDataFolder().mkdirs();
        File configFile = new File(this.getDataFolder().getPath() + File.separatorChar + "config.yml");
        FileConfiguration config = YamlConfiguration.loadConfiguration(configFile);
        FileConfiguration outConfig = new YamlConfiguration();

        // Get current values
        Boolean spawnArmors = config.contains("spawnWithArms") ? config.getBoolean("spawnWithArms") : true;
        Boolean placeWithArms = config.contains("placeWithArms") ? config.getBoolean("placeWithArms") : true;
        Boolean ownershipOfPlacedArmorStand =  config.contains("ownershipOfPlacedArmorStand") ?
                config.getBoolean("ownershipOfPlacedArmorStand") : false;
        Float commandEditRange = config.contains("commandEditRange") ? config.getInt("commandEditRange") : 100f;

        outConfig.options().header(
                "######################################################################################################################" +
                "\n AdvancedArmorStands Config" +
                "\n Please do not delete anything in this file!" +
                "\n For help please visit: https://github.com/Falyrion/AdvancedArmorStands" +
                "\n######################################################################################################################" +
                "\n \nspawnWithArms: " +
                "\n# If true, armor stands will spawn with arms. If this config is set to `true`, then the value of the next config `placeWithArms`  will be ignored" +
                "\n# default spawnWithArms is true" +
                "\n \nplaceWithArms:" +
                "\n# If true, armor stands will be placed (by players) with arms." +
                "\n# default  placeWithArms is true" +
                "\n \nownershipOfPlacedArmorStand:" +
                "\n# If true, only the player who placed the armor stands can modify them. It applies only on armor stands that are placed by a player while the ownershipOfPlacedArms is true" +
                "\n# default ownershipOfPlacedArmorStand is false" +
                "\n \ncommandEditRange" +
                "\n# The max range (blocks) in which armor stands can get effected by the plugins commands" +
                "\n# default commandEditRange is 100" +
                "\n");
        outConfig.set("spawnWithArms", spawnArmors);
        outConfig.set("placeWithArms", placeWithArms);
        outConfig.set("ownershipOfPlacedArmorStand", ownershipOfPlacedArmorStand);
        outConfig.set("commandEditRange", commandEditRange);

        settings = new Settings(
                spawnArmors,
                placeWithArms,
                ownershipOfPlacedArmorStand,
                commandEditRange
        );

        try {
            outConfig.save(configFile);
        } catch(IOException  e) {
            log.warning("[AdvancedArmorStands] Could not load config file");
            log.warning("[AdvancedArmorStands] Please delete the folder AdvancedArmorStands inside your plugins folder and restart or reload the server.");
            e.printStackTrace();
        }
    }

    /**
     * It checks if the player can change the armor Stand. It checks if the ownership configuration is enabled, then
     * if the armor stand has `armor-stand-owner` key, and last if the uuid of the player (sender) is equal
     * to the uuid of the player who placed the armor stand.
     *
     * @param armorStand the armor stand to change
     * @param player     the player who triggered the action
     * @return true if the player is the owner or the armor stand has no owner. otherwise false
     */
    public boolean canChange(ArmorStand armorStand, Player player) {
        if (getSettings().ownershipOfPlacedArmorStand()) {
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
