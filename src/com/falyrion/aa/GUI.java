package com.falyrion.aa;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GUI {

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // Create Menus

    private Inventory createMainMenu(boolean hasHeadPermission) {

        // Create Inventory

        Inventory GUIMain = Bukkit.createInventory(null, 9, ChatColor.DARK_GRAY + "Advanced ArmorStands");


        // Create ItemStacks

        ItemStack basicSettingsItem = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta basicSettingsMeta = basicSettingsItem.getItemMeta();
        basicSettingsMeta.setDisplayName("§e§lBasic Settings");
        ArrayList<String> basicSettingsLore = new ArrayList<String>();
        basicSettingsLore.add(" ");
        basicSettingsLore.add(ChatColor.GRAY + "Simple modifications for");
        basicSettingsLore.add(ChatColor.GRAY + "your armor stand!");
        basicSettingsLore.add(" ");
        basicSettingsLore.add(ChatColor.AQUA + "Click to show more!");
        basicSettingsMeta.setLore(basicSettingsLore);
        basicSettingsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        basicSettingsItem.setItemMeta(basicSettingsMeta);

        ItemStack bodyPartSettingsItem = new ItemStack(Material.STONE_SLAB, 1);
        ItemMeta bodyPartSettingsMeta = bodyPartSettingsItem.getItemMeta();
        bodyPartSettingsMeta.setDisplayName("§e§lBody Settings");
        ArrayList<String> bodyPartSettingsLore = new ArrayList<String>();
        bodyPartSettingsLore.add("  ");
        bodyPartSettingsLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Simple adjustments for the");
        bodyPartSettingsLore.add(net.md_5.bungee.api.ChatColor.GRAY + "armor stands body parts!");
        bodyPartSettingsLore.add("  ");
        bodyPartSettingsLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to show more!");
        bodyPartSettingsMeta.setLore(bodyPartSettingsLore);
        bodyPartSettingsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        bodyPartSettingsItem.setItemMeta(bodyPartSettingsMeta);

        ItemStack movementItem = new ItemStack(Material.GLOWSTONE_DUST, 1);
        ItemMeta movementMeta = movementItem.getItemMeta();
        movementMeta.setDisplayName("§e§lMovement and Rotation");
        ArrayList<String> movementLore = new ArrayList<String>();
        movementLore.add("  ");
        movementLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Wrong position? Simply move and");
        movementLore.add(net.md_5.bungee.api.ChatColor.GRAY + "move and rotate");
        movementLore.add(net.md_5.bungee.api.ChatColor.GRAY + "your armor stand!");
        movementLore.add("  ");
        movementLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to show more!");
        movementMeta.setLore(movementLore);
        movementMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        movementItem.setItemMeta(movementMeta);

        ItemStack presetPoses = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta presetPosesMeta = presetPoses.getItemMeta();
        presetPosesMeta.setDisplayName("§e§lPreset Poses");
        ArrayList<String> presetPosesLore = new ArrayList<String>();
        presetPosesLore.add("  ");
        presetPosesLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Just want some good");
        presetPosesLore.add(net.md_5.bungee.api.ChatColor.GRAY + "looking stuff");
        presetPosesLore.add(net.md_5.bungee.api.ChatColor.GRAY + "without thinking");
        presetPosesLore.add(net.md_5.bungee.api.ChatColor.GRAY + "too much?");
        presetPosesLore.add("  ");
        presetPosesLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to show more!");
        presetPosesMeta.setLore(presetPosesLore);
        presetPosesMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        presetPoses.setItemMeta(presetPosesMeta);

        ItemStack headsItem = new ItemStack(Material.PUMPKIN, 1);
        headsItem.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        ItemMeta headsMeta = headsItem.getItemMeta();
        headsMeta.setDisplayName("§e§lHeads");
        ArrayList<String> headsLore = new ArrayList<String>();
        headsLore.add("  ");
        headsLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Want some Player or");
        headsLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Decoration Heads");
        headsLore.add(net.md_5.bungee.api.ChatColor.GRAY + "for your armor stand");
        headsLore.add(net.md_5.bungee.api.ChatColor.GRAY + "or your face?");
        headsLore.add("  ");
        headsLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Use /aa head");
        headsLore.add(net.md_5.bungee.api.ChatColor.AQUA + " <player-name> <amount>");
        headsLore.add("  ");
        headsLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        headsMeta.setLore(headsLore);
        headsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        headsItem.setItemMeta(headsMeta);

        ItemStack documentationItem = new ItemStack(Material.BOOK, 1);
        documentationItem.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        ItemMeta documentationMeta = documentationItem.getItemMeta();
        documentationMeta.setDisplayName("§e§lDocumentation");
        ArrayList<String> documentationLore = new ArrayList<String>();
        documentationLore.add("  ");
        documentationLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Shows a link to see the");
        documentationLore.add(net.md_5.bungee.api.ChatColor.GRAY + "documentation for this plugin");
        documentationLore.add(net.md_5.bungee.api.ChatColor.GRAY + "in your web-browser!");
        documentationLore.add("  ");
        documentationLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        documentationMeta.setLore(documentationLore);
        documentationMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        documentationItem.setItemMeta(documentationMeta);

        ItemStack closeMenuItem = new ItemStack(Material.BARRIER, 1);
        ItemMeta closeMenuMeta = closeMenuItem.getItemMeta();
        closeMenuMeta.setDisplayName("§e§lClose");
        ArrayList<String> closeMenuLore = new ArrayList<String>();
        closeMenuMeta.setLore(closeMenuLore);
        closeMenuMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        closeMenuItem.setItemMeta(closeMenuMeta);


        // Add ItemStacks to Inventory

        GUIMain.setItem(0, basicSettingsItem);
        GUIMain.setItem(1, bodyPartSettingsItem);
        GUIMain.setItem(2, movementItem);
        GUIMain.setItem(3, presetPoses);
        if (hasHeadPermission) {
            GUIMain.setItem(5, headsItem);
        }
        GUIMain.setItem(7, documentationItem);
        GUIMain.setItem(8, closeMenuItem);


        // Return Inventory

        return GUIMain;
    }

    private Inventory createBasicSettingsMenu() {

        // Create Inventory

        Inventory GUIBasicSettings = Bukkit.createInventory(null, 36, ChatColor.DARK_GRAY + "Advanced ArmorStands §rBasics");

        // Create ItemStacks

        ItemStack toggleArmsItem = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta toggleArmsMeta = toggleArmsItem.getItemMeta();
        toggleArmsMeta.setDisplayName("§e§lArms");
        ArrayList<String> toggleArmLore = new ArrayList<String>();
        toggleArmLore.add(" ");
        toggleArmLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Gives nearby armor");
        toggleArmLore.add(net.md_5.bungee.api.ChatColor.GRAY + "stands arms.");
        toggleArmLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Modifies all armor stands");
        toggleArmLore.add(net.md_5.bungee.api.ChatColor.GRAY + "1 Block around you");
        toggleArmLore.add(" ");
        toggleArmLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        toggleArmsMeta.setLore(toggleArmLore);
        toggleArmsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        toggleArmsItem.setItemMeta(toggleArmsMeta);

        ItemStack baseplateInvisibleItem = new ItemStack(Material.STONE_SLAB, 1);
        ItemMeta baseplateInvisibleMeta = baseplateInvisibleItem.getItemMeta();
        baseplateInvisibleMeta.setDisplayName("§e§lBaseplate invisible");
        ArrayList<String> baseplateInvisibleLore = new ArrayList<String>();
        baseplateInvisibleLore.add("  ");
        baseplateInvisibleLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Makes the baseplate of nearby");
        baseplateInvisibleLore.add(net.md_5.bungee.api.ChatColor.GRAY + "armor stands invisible.");
        baseplateInvisibleLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Modifies all armor stands");
        baseplateInvisibleLore.add(net.md_5.bungee.api.ChatColor.GRAY + "1 Block around you");
        baseplateInvisibleLore.add("  ");
        baseplateInvisibleLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        baseplateInvisibleMeta.setLore(baseplateInvisibleLore);
        baseplateInvisibleMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        baseplateInvisibleItem.setItemMeta(baseplateInvisibleMeta);

        ItemStack baseplateVisibleItem = new ItemStack(Material.STONE_SLAB, 1);
        ItemMeta baseplateVisibleMeta = baseplateVisibleItem.getItemMeta();
        baseplateVisibleMeta.setDisplayName("§e§lBaseplate visible");
        ArrayList<String> baseplateVisibleLore = new ArrayList<String>();
        baseplateVisibleLore.add("  ");
        baseplateVisibleLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Makes the baseplate of nearby");
        baseplateVisibleLore.add(net.md_5.bungee.api.ChatColor.GRAY + "armor stands visible.");
        baseplateVisibleLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Modifies all armor stands");
        baseplateVisibleLore.add(net.md_5.bungee.api.ChatColor.GRAY + "1 Block around you");
        baseplateVisibleLore.add("  ");
        baseplateVisibleLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        baseplateVisibleMeta.setLore(baseplateVisibleLore);
        baseplateVisibleMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        baseplateVisibleItem.setItemMeta(baseplateVisibleMeta);

        ItemStack gravityOffItem = new ItemStack(Material.FEATHER, 1);
        ItemMeta gravityOffMeta = gravityOffItem.getItemMeta();
        gravityOffMeta.setDisplayName("§e§lGravity off");
        ArrayList<String> gravityOffLore = new ArrayList<String>();
        gravityOffLore.add("  ");
        gravityOffLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Nearby armor stands");
        gravityOffLore.add(net.md_5.bungee.api.ChatColor.GRAY + "are not longer");
        gravityOffLore.add(net.md_5.bungee.api.ChatColor.GRAY + "effected by gravity.");
        gravityOffLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Modifies all armor stands");
        gravityOffLore.add(net.md_5.bungee.api.ChatColor.GRAY + "1 Block around you");
        gravityOffLore.add("  ");
        gravityOffLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        gravityOffMeta.setLore(gravityOffLore);
        gravityOffMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        gravityOffItem.setItemMeta(gravityOffMeta);

        ItemStack gravityOnItem = new ItemStack(Material.FEATHER, 1);
        ItemMeta gravityOnMeta = gravityOnItem.getItemMeta();
        gravityOnMeta.setDisplayName("§e§lGravity on");
        ArrayList<String> gravityOnLore = new ArrayList<String>();
        gravityOnLore.add("  ");
        gravityOnLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Nearby armor stands");
        gravityOnLore.add(net.md_5.bungee.api.ChatColor.GRAY + "are effected by gravity.");
        gravityOnLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Affects all armor stands");
        gravityOnLore.add(net.md_5.bungee.api.ChatColor.GRAY + "1 Block around you");
        gravityOnLore.add("  ");
        gravityOnLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        gravityOnMeta.setLore(gravityOnLore);
        gravityOnMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        gravityOnItem.setItemMeta(gravityOnMeta);

        ItemStack asInvisibleItem = new ItemStack(Material.GLASS, 1);
        ItemMeta asInvisibleMeta = asInvisibleItem.getItemMeta();
        asInvisibleMeta.setDisplayName("§e§lInvisible");
        ArrayList<String> asInvisibleLore = new ArrayList<String>();
        asInvisibleLore.add("  ");
        asInvisibleLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Makes nearby armor");
        asInvisibleLore.add(net.md_5.bungee.api.ChatColor.GRAY + "stands invisible.");
        asInvisibleLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Armor stands are");
        asInvisibleLore.add(net.md_5.bungee.api.ChatColor.GRAY + "invulnerable in this");
        asInvisibleLore.add(net.md_5.bungee.api.ChatColor.GRAY + "mode. To break them ");
        asInvisibleLore.add(net.md_5.bungee.api.ChatColor.GRAY + "make them visible again.");
        asInvisibleLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Modifies all armor stands");
        asInvisibleLore.add(net.md_5.bungee.api.ChatColor.GRAY + "1 Block around you");
        asInvisibleLore.add("  ");
        asInvisibleLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        asInvisibleMeta.setLore(asInvisibleLore);
        asInvisibleMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        asInvisibleItem.setItemMeta(asInvisibleMeta);

        ItemStack asVisibleItem = new ItemStack(Material.BLACK_STAINED_GLASS, 1);
        ItemMeta asVisibleMeta = asVisibleItem.getItemMeta();
        asVisibleMeta.setDisplayName("§e§lVisible");
        ArrayList<String> asVisibleLore = new ArrayList<String>();
        asVisibleLore.add("  ");
        asVisibleLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Makes nearby armor");
        asVisibleLore.add(net.md_5.bungee.api.ChatColor.GRAY + "stands visible.");
        asVisibleLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Modifies all armor stands");
        asVisibleLore.add(net.md_5.bungee.api.ChatColor.GRAY + "4 Blocks around you");
        asVisibleLore.add("  ");
        asVisibleLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        asVisibleMeta.setLore(asVisibleLore);
        asVisibleMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        asVisibleItem.setItemMeta(asVisibleMeta);

        ItemStack makeSmallItem = new ItemStack(Material.OAK_SLAB, 1);
        ItemMeta makeSmallMeta = makeSmallItem.getItemMeta();
        makeSmallMeta.setDisplayName("§e§lSmall");
        ArrayList<String> makeSmallLore = new ArrayList<String>();
        makeSmallLore.add("  ");
        makeSmallLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Makes nearby armor");
        makeSmallLore.add(net.md_5.bungee.api.ChatColor.GRAY + "stands small.");
        makeSmallLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Modifies all armor stands");
        makeSmallLore.add(net.md_5.bungee.api.ChatColor.GRAY + "1 Block around you");
        makeSmallLore.add("  ");
        makeSmallLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        makeSmallMeta.setLore(makeSmallLore);
        makeSmallMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        makeSmallItem.setItemMeta(makeSmallMeta);

        ItemStack makeNormalSizeItem = new ItemStack(Material.OAK_PLANKS, 1);
        ItemMeta makeNormalSizeMeta = makeNormalSizeItem.getItemMeta();
        makeNormalSizeMeta.setDisplayName("§e§lNormal Size");
        ArrayList<String> makeNormalSizeLore = new ArrayList<String>();
        makeNormalSizeLore.add("  ");
        makeNormalSizeLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Makes nearby armor");
        makeNormalSizeLore.add(net.md_5.bungee.api.ChatColor.GRAY + "stands normal size.");
        makeNormalSizeLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Modifies all armor stands");
        makeNormalSizeLore.add(net.md_5.bungee.api.ChatColor.GRAY + "1 Block around you");
        makeNormalSizeLore.add("  ");
        makeNormalSizeLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        makeNormalSizeMeta.setLore(makeNormalSizeLore);
        makeNormalSizeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        makeNormalSizeItem.setItemMeta(makeNormalSizeMeta);

        ItemStack customNameItem = new ItemStack(Material.NAME_TAG, 1);
        ItemMeta customNameMeta = customNameItem.getItemMeta();
        customNameMeta.setDisplayName("§e§lCustom Name");
        ArrayList<String> customNameLore = new ArrayList<String>();
        customNameLore.add("  ");
        customNameLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Gives the armor stand");
        customNameLore.add(net.md_5.bungee.api.ChatColor.GRAY + "a custom colorable name.");
        customNameLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Modifies all armor stands");
        customNameLore.add(net.md_5.bungee.api.ChatColor.GRAY + "1 Block around you");
        customNameLore.add("  ");
        customNameLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Use /aa name <name>");
        customNameMeta.setLore(customNameLore);
        customNameMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        customNameItem.setItemMeta(customNameMeta);

        ItemStack nameHelpItem = new ItemStack(Material.NAME_TAG, 1);
        ItemMeta nameHelpMeta = nameHelpItem.getItemMeta();
        nameHelpMeta.setDisplayName("§e§lName Help");
        ArrayList<String> nameHelpLore = new ArrayList<String>();
        nameHelpLore.add(" ");
        nameHelpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Shows help for the name-command");
        nameHelpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "and all colors you can use in");
        nameHelpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "the armor stands name.");
        nameHelpLore.add(" ");
        nameHelpLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        nameHelpMeta.setLore(nameHelpLore);
        nameHelpMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        nameHelpItem.setItemMeta(nameHelpMeta);

        ItemStack hideNameItem = new ItemStack(Material.NAME_TAG, 1);
        ItemMeta hideNameMeta = hideNameItem.getItemMeta();
        hideNameMeta.setDisplayName("§e§lHide Name");
        ArrayList<String> hideNameLore = new ArrayList<String>();
        hideNameLore.add("  ");
        hideNameLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Removes the custom name.");
        hideNameLore.add(net.md_5.bungee.api.ChatColor.GRAY + "of an armor stand.");
        hideNameLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Modifies all armor stands");
        hideNameLore.add(net.md_5.bungee.api.ChatColor.GRAY + "1 Block around you");
        hideNameLore.add("  ");
        hideNameLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        hideNameMeta.setLore(hideNameLore);
        hideNameMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        hideNameItem.setItemMeta(hideNameMeta);

        ItemStack invulnerableItem = new ItemStack(Material.OBSIDIAN, 1);
        ItemMeta invulnerableMeta = invulnerableItem.getItemMeta();
        invulnerableMeta.setDisplayName("§e§lInvulnerable");
        ArrayList<String> invulnerableLore = new ArrayList<String>();
        invulnerableLore.add("  ");
        invulnerableLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Makes the armor stand");
        invulnerableLore.add(net.md_5.bungee.api.ChatColor.GRAY + "invulnerable.");
        invulnerableLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Click again to reverse.");
        invulnerableLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Modifies all armor stands");
        invulnerableLore.add(net.md_5.bungee.api.ChatColor.GRAY + "1 Block around you");
        invulnerableLore.add("  ");
        invulnerableLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        invulnerableMeta.setLore(invulnerableLore);
        invulnerableMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        invulnerableItem.setItemMeta(invulnerableMeta);

        ItemStack helpItem = new ItemStack(Material.BOOK, 1);
        helpItem.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        ItemMeta helpMeta = helpItem.getItemMeta();
        helpMeta.setDisplayName("§e§lHow to?");
        ArrayList<String> helpLore = new ArrayList<String>();
        helpLore.add("  ");
        helpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "To apply settings");
        helpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "to an armor stand");
        helpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "simply place your armor");
        helpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "stand on the ground");
        helpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "and press a button!");
        helpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "It will affect all armor");
        helpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "stands in a radius of 1");
        helpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "blocks around you!");
        helpLore.add("  ");
        helpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "The only thing you need");
        helpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "to do is to equip your");
        helpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "armor stand!");
        helpMeta.setLore(helpLore);
        helpMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        helpItem.setItemMeta(helpMeta);

        ItemStack backItem = new ItemStack(Material.PAPER, 1);
        ItemMeta backMeta = backItem.getItemMeta();
        backMeta.setDisplayName("§e§lBack to Main Menu");
        ArrayList<String> backLore = new ArrayList<String>();
        backLore.add("  ");
        backLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        backMeta.setLore(backLore);
        backMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        backItem.setItemMeta(backMeta);


        // Add ItemStacks to Inventory

        GUIBasicSettings.setItem(0, toggleArmsItem);
        GUIBasicSettings.setItem(1, baseplateInvisibleItem);
        GUIBasicSettings.setItem(2, baseplateVisibleItem);
        GUIBasicSettings.setItem(3, gravityOffItem);
        GUIBasicSettings.setItem(4, gravityOnItem);
        GUIBasicSettings.setItem(5, asInvisibleItem);
        GUIBasicSettings.setItem(6, asVisibleItem);
        GUIBasicSettings.setItem(7, makeSmallItem);
        GUIBasicSettings.setItem(8, makeNormalSizeItem);
        GUIBasicSettings.setItem(9, customNameItem);
        GUIBasicSettings.setItem(10, nameHelpItem);
        GUIBasicSettings.setItem(11, hideNameItem);
        GUIBasicSettings.setItem(17, invulnerableItem);
        GUIBasicSettings.setItem(27, helpItem);
        GUIBasicSettings.setItem(35, backItem);


        // Return inventory

        return GUIBasicSettings;
    }

    private Inventory createBodyPartsMenu() {

        // Create Inventory

        Inventory GUIBodyParts = Bukkit.createInventory(null, 27, ChatColor.DARK_GRAY + "Advanced ArmorStands §rBody");
        
        
        // Create ItemStacks

        ItemStack headPose = new ItemStack(Material.GOLDEN_HELMET, 1);
        ItemMeta headPoseItemMeta = headPose.getItemMeta();
        headPoseItemMeta.setDisplayName("§e§lHead Pose");
        ArrayList<String> headPoseLore = new ArrayList<String>();
        headPoseLore.add("  ");
        headPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Adjusts the head pose of nearby");
        headPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "armor stands as you want it.");
        headPoseLore.add("  ");
        headPoseLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Use /aa hp <pitch> <roll>");
        headPoseLore.add(net.md_5.bungee.api.ChatColor.AQUA + " <yaw> <range>");
        headPoseLore.add("  ");
        headPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Note: The values <pitch> <roll>");
        headPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "<yaw> are degrees");
        headPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "from 0 to 360.");
        headPoseItemMeta.setLore(headPoseLore);
        headPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        headPose.setItemMeta(headPoseItemMeta);

        ItemStack bodyPose = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
        ItemMeta bodyPoseMeta = bodyPose.getItemMeta();
        bodyPoseMeta.setDisplayName("§e§lBody Pose");
        ArrayList<String> bodyPoseLore = new ArrayList<String>();
        bodyPoseLore.add("  ");
        bodyPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Adjusts the body pose of nearby");
        bodyPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "armor stands as you want it.");
        bodyPoseLore.add("  ");
        bodyPoseLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Use /aa bp <pitch> <roll>");
        bodyPoseLore.add(net.md_5.bungee.api.ChatColor.AQUA + " <yaw> <range>");
        bodyPoseLore.add("  ");
        bodyPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Note: The values <pitch> <roll>");
        bodyPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "<yaw> are degrees");
        bodyPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "from 0 to 360.");
        bodyPoseMeta.setLore(bodyPoseLore);
        bodyPoseMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        bodyPose.setItemMeta(bodyPoseMeta);

        ItemStack rightArm = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
        ItemMeta rightArmMeta = rightArm.getItemMeta();
        rightArmMeta.setDisplayName("§e§lRight Arm Pose");
        ArrayList<String> rightArmLore = new ArrayList<String>();
        rightArmLore.add("  ");
        rightArmLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Adjusts the right arm of nearby");
        rightArmLore.add(net.md_5.bungee.api.ChatColor.GRAY + "armor stands as you want it.");
        rightArmLore.add("  ");
        rightArmLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Use /aa rap <pitch> <roll>");
        rightArmLore.add(net.md_5.bungee.api.ChatColor.AQUA + " <yaw> <range>");
        rightArmLore.add("  ");
        rightArmLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Note: The values <pitch> <roll>");
        rightArmLore.add(net.md_5.bungee.api.ChatColor.GRAY + "<yaw> are degrees");
        rightArmLore.add(net.md_5.bungee.api.ChatColor.GRAY + "from 0 to 360.");
        rightArmMeta.setLore(rightArmLore);
        rightArmMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        rightArm.setItemMeta(rightArmMeta);

        ItemStack leftArm = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
        ItemMeta leftArmMeta = leftArm.getItemMeta();
        leftArmMeta.setDisplayName("§e§lLeft Arm Pose");
        ArrayList<String> leftArmLore = new ArrayList<String>();
        leftArmLore.add("  ");
        leftArmLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Adjusts the left arm of nearby");
        leftArmLore.add(net.md_5.bungee.api.ChatColor.GRAY + "armor stands as you want it.");
        leftArmLore.add("  ");
        leftArmLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Use /aa lap <pitch> <roll>");
        leftArmLore.add(net.md_5.bungee.api.ChatColor.AQUA + " <yaw> <range>");
        leftArmLore.add("  ");
        leftArmLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Note: The values <pitch> <roll>");
        leftArmLore.add(net.md_5.bungee.api.ChatColor.GRAY + "<yaw> are degrees");
        leftArmLore.add(net.md_5.bungee.api.ChatColor.GRAY + "from 0 to 360.");
        leftArmMeta.setLore(leftArmLore);
        leftArmMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        leftArm.setItemMeta(leftArmMeta);

        ItemStack rightLeg = new ItemStack(Material.GOLDEN_LEGGINGS, 1);
        ItemMeta rightLegMeta = rightLeg.getItemMeta();
        rightLegMeta.setDisplayName("§e§lRight Leg Pose");
        ArrayList<String> rightLegLore = new ArrayList<String>();
        rightLegLore.add("  ");
        rightLegLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Adjusts the right leg of nearby");
        rightLegLore.add(net.md_5.bungee.api.ChatColor.GRAY + "armor stands as you want it.");
        rightLegLore.add("  ");
        rightLegLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Use /aa rlp <pitch> <roll>");
        rightLegLore.add(net.md_5.bungee.api.ChatColor.AQUA + " <yaw> <range>");
        rightLegLore.add("  ");
        rightLegLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Note: The values <pitch> <roll>");
        rightLegLore.add(net.md_5.bungee.api.ChatColor.GRAY + "<yaw> are degrees");
        rightLegLore.add(net.md_5.bungee.api.ChatColor.GRAY + "from 0 to 360.");
        rightLegMeta.setLore(rightLegLore);
        rightLegMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        rightLeg.setItemMeta(rightLegMeta);

        ItemStack leftLeg = new ItemStack(Material.GOLDEN_LEGGINGS, 1);
        ItemMeta leftLegMeta = leftLeg.getItemMeta();
        leftLegMeta.setDisplayName("§e§lLeft Leg Pose");
        ArrayList<String> leftLegLore = new ArrayList<String>();
        leftLegLore.add("  ");
        leftLegLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Adjusts the left leg of nearby");
        leftLegLore.add(net.md_5.bungee.api.ChatColor.GRAY + "armor stands as you want it.");
        leftLegLore.add("  ");
        leftLegLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Use /aa llp <pitch> <roll>");
        leftLegLore.add(net.md_5.bungee.api.ChatColor.AQUA + " <yaw> <range>");
        leftLegLore.add("  ");
        leftLegLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Note: The values <pitch> <roll>");
        leftLegLore.add(net.md_5.bungee.api.ChatColor.GRAY + "<yaw> are degrees");
        leftLegLore.add(net.md_5.bungee.api.ChatColor.GRAY + "from 0 to 360.");
        leftLegMeta.setLore(leftLegLore);
        leftLegMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        leftLeg.setItemMeta(leftLegMeta);

        ItemStack helpItem = new ItemStack(Material.BOOK, 1);
        helpItem.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        ItemMeta helpMeta = helpItem.getItemMeta();
        helpMeta.setDisplayName("§e§lHow to?");
        ArrayList<String> helpLore = new ArrayList<String>();
        helpLore.add("  ");
        helpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "To apply settings to an armor stand");
        helpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "simply place your armor stand on the ground");
        helpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "and type one of the commands into the chat!");
        helpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "It will affect all armor stands in a radius");
        helpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "of 1 blocks around you!");
        helpLore.add("  ");
        helpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "The only thing you need to do is to equip your");
        helpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "armor stand!");
        helpMeta.setLore(helpLore);
        helpMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        helpItem.setItemMeta(helpMeta);

        ItemStack backItem = new ItemStack(Material.PAPER, 1);
        ItemMeta backMeta = backItem.getItemMeta();
        backMeta.setDisplayName("§e§lBack to Main Menu");
        ArrayList<String> backLore = new ArrayList<String>();
        backLore.add("  ");
        backLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        backMeta.setLore(backLore);
        backMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        backItem.setItemMeta(backMeta);


        // Set ItemStacks in Inventory

        GUIBodyParts.setItem(0, headPose);
        GUIBodyParts.setItem(1, bodyPose);
        GUIBodyParts.setItem(2, rightArm);
        GUIBodyParts.setItem(3, leftArm);
        GUIBodyParts.setItem(4, rightLeg);
        GUIBodyParts.setItem(5, leftLeg);
        GUIBodyParts.setItem(18, helpItem);
        GUIBodyParts.setItem(26, backItem);


        // Create ItemStacks

        return GUIBodyParts;
    }

    private Inventory createMovementMenu(int Size) {

        // Create Inventory
        String inventoryName = "";

        String blockSmallName = "§e§lDistance: 0.1 Blocks";
        String blockMediumName = "§e§lDistance: 0.5 Blocks";
        String blockLargeName = "§e§lDistance: 1 Block";

        Material blockSmallMaterial = Material.ORANGE_TERRACOTTA;
        Material blockMediumMaterial = Material.ORANGE_TERRACOTTA;
        Material blockLargeMaterial = Material.ORANGE_TERRACOTTA;

        switch (Size) {
            case 1:
                inventoryName = ChatColor.DARK_GRAY + "Advanced ArmorStands §rMove: 0.1";
                blockSmallMaterial = Material.BLUE_TERRACOTTA;
                blockSmallName = "§e§lDistance: 0.1 Blocks (Active)";
                break;

            case 2:
                inventoryName = ChatColor.DARK_GRAY + "Advanced ArmorStands §rMove: 0.5";
                blockMediumMaterial = Material.BLUE_TERRACOTTA;
                blockMediumName = "§e§lDistance: 0.5 Blocks (Active)";
                break;

            case 3:
                inventoryName = ChatColor.DARK_GRAY + "Advanced ArmorStands §rMove: 1";
                blockLargeMaterial = Material.BLUE_TERRACOTTA;
                blockLargeName = "§e§lDistance: 1 Block (Active)";
                break;
        }

        Inventory GUIMovement = Bukkit.getServer().createInventory(null, 45, inventoryName);


        // Create ItemStacks

        ItemStack blockSettingsLargeItem = new ItemStack(blockLargeMaterial, 1);
        ItemMeta blockSettingsLargeItemItemMeta = blockSettingsLargeItem.getItemMeta();
        blockSettingsLargeItemItemMeta.setDisplayName(blockLargeName);
        ArrayList<String> blockSettingsLargeLore = new ArrayList<String>();
        blockSettingsLargeLore.add("  ");
        blockSettingsLargeLore.add(ChatColor.GRAY + "Set the distance");
        blockSettingsLargeLore.add(ChatColor.GRAY + "to move your armor");
        blockSettingsLargeLore.add(ChatColor.GRAY + "stand to 1 block!");
        blockSettingsLargeLore.add("  ");
        blockSettingsLargeLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        blockSettingsLargeItemItemMeta.setLore(blockSettingsLargeLore);
        blockSettingsLargeItemItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        blockSettingsLargeItem.setItemMeta(blockSettingsLargeItemItemMeta);

        ItemStack blockSettingsMediumItem = new ItemStack(blockMediumMaterial, 1);
        ItemMeta blockSettingsMediumItemItemMeta = blockSettingsMediumItem.getItemMeta();
        blockSettingsMediumItemItemMeta.setDisplayName(blockMediumName);
        ArrayList<String> blockSettingsMediumLore = new ArrayList<String>();
        blockSettingsMediumLore.add("  ");
        blockSettingsMediumLore.add(ChatColor.GRAY + "Set the distance");
        blockSettingsMediumLore.add(ChatColor.GRAY + "to move your armor");
        blockSettingsMediumLore.add(ChatColor.GRAY + "to 0.5 blocks!");
        blockSettingsMediumLore.add("  ");
        blockSettingsMediumLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to show more!");
        blockSettingsMediumItemItemMeta.setLore(blockSettingsMediumLore);
        blockSettingsMediumItemItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        blockSettingsMediumItem.setItemMeta(blockSettingsMediumItemItemMeta);

        ItemStack blockSettingsSmallItem = new ItemStack(blockSmallMaterial, 1);
        ItemMeta blockSettingsSmallItemItemMeta = blockSettingsSmallItem.getItemMeta();
        blockSettingsSmallItemItemMeta.setDisplayName(blockSmallName);
        ArrayList<String> blockSettingsSmallLore = new ArrayList<String>();
        blockSettingsSmallLore.add("  ");
        blockSettingsSmallLore.add(ChatColor.GRAY + "Set the distance");
        blockSettingsSmallLore.add(ChatColor.GRAY + "to move your armor");
        blockSettingsSmallLore.add(ChatColor.GRAY + "stand to 0.1 blocks!");
        blockSettingsSmallLore.add("  ");
        blockSettingsSmallLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        blockSettingsSmallItemItemMeta.setLore(blockSettingsSmallLore);
        blockSettingsSmallItemItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        blockSettingsSmallItem.setItemMeta(blockSettingsSmallItemItemMeta);


        ItemStack moveForward = new ItemStack(Material.GLOWSTONE_DUST, 1);
        ItemMeta moveForwardItemMeta = moveForward.getItemMeta();
        moveForwardItemMeta.setDisplayName("§e§lForward");
        ArrayList<String> moveForwardLore = new ArrayList<String>();
        moveForwardLore.add("  ");
        moveForwardLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Move your armor");
        moveForwardLore.add(net.md_5.bungee.api.ChatColor.GRAY + "stand forward");
        moveForwardLore.add(net.md_5.bungee.api.ChatColor.GRAY + "(along the x axis).");
        moveForwardLore.add("  ");
        moveForwardLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        moveForwardItemMeta.setLore(moveForwardLore);
        moveForwardItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        moveForward.setItemMeta(moveForwardItemMeta);

        ItemStack moveBackwards = new ItemStack(Material.GLOWSTONE_DUST, 1);
        ItemMeta moveBackwardsItemMeta = moveBackwards.getItemMeta();
        moveBackwardsItemMeta.setDisplayName("§e§lBackwards");
        ArrayList<String> moveBackwardsLore = new ArrayList<String>();
        moveBackwardsLore.add("  ");
        moveBackwardsLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Move your armor");
        moveBackwardsLore.add(net.md_5.bungee.api.ChatColor.GRAY + "stand backwards");
        moveBackwardsLore.add(net.md_5.bungee.api.ChatColor.GRAY + "(along the x axis).");
        moveBackwardsLore.add("  ");
        moveBackwardsLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        moveBackwardsItemMeta.setLore(moveBackwardsLore);
        moveBackwardsItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        moveBackwards.setItemMeta(moveBackwardsItemMeta);

        ItemStack moveRight = new ItemStack(Material.GLOWSTONE_DUST, 1);
        ItemMeta moveRightItemMeta = moveRight.getItemMeta();
        moveRightItemMeta.setDisplayName("§e§lRight");
        ArrayList<String> moveRightLore = new ArrayList<String>();
        moveRightLore.add("  ");
        moveRightLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Move your armor stand to the");
        moveRightLore.add(net.md_5.bungee.api.ChatColor.GRAY + "right (along the z axis).");
        moveRightLore.add("  ");
        moveRightLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        moveRightItemMeta.setLore(moveRightLore);
        moveRightItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        moveRight.setItemMeta(moveRightItemMeta);

        ItemStack moveLeft = new ItemStack(Material.GLOWSTONE_DUST, 1);
        ItemMeta moveLeftItemMeta = moveLeft.getItemMeta();
        moveLeftItemMeta.setDisplayName("§e§lLeft");
        ArrayList<String> moveLeftLore = new ArrayList<String>();
        moveLeftLore.add("  ");
        moveLeftLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Move your armor stand to the");
        moveLeftLore.add(net.md_5.bungee.api.ChatColor.GRAY + "left (along the z axis).");
        moveLeftLore.add("  ");
        moveLeftLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        moveLeftItemMeta.setLore(moveLeftLore);
        moveLeftItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        moveLeft.setItemMeta(moveLeftItemMeta);
        
        ItemStack moveUp = new ItemStack(Material.FEATHER, 1);
        ItemMeta moveUpItemMeta = moveUp.getItemMeta();
        moveUpItemMeta.setDisplayName("§e§lUp");
        ArrayList<String> moveUpLore = new ArrayList<String>();
        moveUpLore.add("  ");
        moveUpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Move your armor stand up");
        moveUpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "(along the z axis).");
        moveUpLore.add("  ");
        moveUpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Tipp: Turn gravity off first");
        moveUpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "(Basic Settings Menu).");
        moveUpLore.add("  ");
        moveUpLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        moveUpItemMeta.setLore(moveUpLore);
        moveUpItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        moveUp.setItemMeta(moveUpItemMeta);

        ItemStack moveDown = new ItemStack(Material.ANVIL, 1);
        ItemMeta moveDownItemMeta = moveDown.getItemMeta();
        moveDownItemMeta.setDisplayName("§e§lDown");
        ArrayList<String> moveDownLore = new ArrayList<String>();
        moveDownLore.add("  ");
        moveDownLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Move your armor stand down");
        moveDownLore.add(net.md_5.bungee.api.ChatColor.GRAY + "(along the z axis).");
        moveDownLore.add("  ");
        moveDownLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        moveDownItemMeta.setLore(moveDownLore);
        moveDownItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        moveDown.setItemMeta(moveDownItemMeta);

        ItemStack duplicateAS = new ItemStack(Material.MAGMA_CREAM, 1);
        ItemMeta duplicateASItemMeta = duplicateAS.getItemMeta();
        duplicateASItemMeta.setDisplayName("§e§lDuplicate");
        ArrayList<String> duplicateASLore = new ArrayList<String>();
        duplicateASLore.add("  ");
        duplicateASLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Duplicate an armor stand");
        duplicateASLore.add(net.md_5.bungee.api.ChatColor.GRAY + "with all his settings");
        duplicateASLore.add("  ");
        duplicateASLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Use /aa clone <x> <y> <z>");
        duplicateASLore.add("  ");
        duplicateASLore.add(net.md_5.bungee.api.ChatColor.GRAY + "You will clone all armor stands in");
        duplicateASLore.add(net.md_5.bungee.api.ChatColor.GRAY + "0.5 blocks range around you.");
        duplicateASLore.add(net.md_5.bungee.api.ChatColor.GRAY + "The values <x> <y> <z> are the coords for");
        duplicateASLore.add(net.md_5.bungee.api.ChatColor.GRAY + "the new armor stand to be.");
        duplicateASLore.add("  ");
        duplicateASLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Note: To center an armor stand on a block");
        duplicateASLore.add(net.md_5.bungee.api.ChatColor.GRAY + "you need to use x.5 and z.5!");
        duplicateASLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Does not copy names or visibility. If you are");
        duplicateASLore.add(net.md_5.bungee.api.ChatColor.GRAY + "in creative mode, equipment will be copyed.");
        duplicateASItemMeta.setLore(duplicateASLore);
        duplicateASItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        duplicateAS.setItemMeta(duplicateASItemMeta);

        ItemStack teleportAS = new ItemStack(Material.ENDER_EYE, 1);
        ItemMeta teleportASItemMeta = teleportAS.getItemMeta();
        teleportASItemMeta.setDisplayName("§e§lTeleport");
        ArrayList<String> teleportASLore = new ArrayList<String>();
        teleportASLore.add("  ");
        teleportASLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Teleport an armor stand");
        teleportASLore.add("  ");
        teleportASLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Use /aatp <x> <y> <z>");
        teleportASLore.add(net.md_5.bungee.api.ChatColor.AQUA + "or /aatp <x> <y> <z> <Rotation>");
        teleportASLore.add("  ");
        teleportASLore.add(net.md_5.bungee.api.ChatColor.GRAY + "You will teleport all armor");
        teleportASLore.add(net.md_5.bungee.api.ChatColor.GRAY + "stands in 0.5 blocks range");
        teleportASLore.add(net.md_5.bungee.api.ChatColor.GRAY + "around you to the coords");
        teleportASLore.add(net.md_5.bungee.api.ChatColor.GRAY + "<x> <y> <z>!");
        teleportASLore.add("  ");
        teleportASLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Note: To center an armor");
        teleportASLore.add(net.md_5.bungee.api.ChatColor.GRAY + "stand on a block you need");
        teleportASLore.add(net.md_5.bungee.api.ChatColor.GRAY + "to use x.5 and z.5! You can");
        teleportASLore.add(net.md_5.bungee.api.ChatColor.GRAY + "teleport armor stands into");
        teleportASLore.add(net.md_5.bungee.api.ChatColor.GRAY + "other blocks.");
        teleportASItemMeta.setLore(teleportASLore);
        teleportASItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        teleportAS.setItemMeta(teleportASItemMeta);

        ItemStack rotateLeft = new ItemStack(Material.GLOWSTONE_DUST, 1);
        ItemMeta rotateLeftItemMeta = rotateLeft.getItemMeta();
        rotateLeftItemMeta.setDisplayName("§e§lRotate left");
        ArrayList<String> rotateLeftLore = new ArrayList<String>();
        rotateLeftLore.add("  ");
        rotateLeftLore.add(ChatColor.GRAY + "Rotates an armor");
        rotateLeftLore.add(ChatColor.GRAY + "stand 45 degrees.");
        rotateLeftLore.add(ChatColor.GRAY + "Affects all armor");
        rotateLeftLore.add(ChatColor.GRAY + "stands 1 Block");
        rotateLeftLore.add(ChatColor.GRAY + "around you");
        rotateLeftLore.add("  ");
        rotateLeftLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        rotateLeftItemMeta.setLore(rotateLeftLore);
        rotateLeftItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        rotateLeft.setItemMeta(rotateLeftItemMeta);

        ItemStack rotateRight = new ItemStack(Material.GLOWSTONE_DUST, 1);
        ItemMeta rotateRightItemMeta = rotateRight.getItemMeta();
        rotateRightItemMeta.setDisplayName("§e§lRotate right");
        ArrayList<String> rotateRightLore = new ArrayList<String>();
        rotateRightLore.add("  ");
        rotateRightLore.add(ChatColor.GRAY + "Rotates an armor");
        rotateRightLore.add(ChatColor.GRAY + "stand 45 degrees.");
        rotateRightLore.add(ChatColor.GRAY + "Affects all armor");
        rotateRightLore.add(ChatColor.GRAY + "stands 1 Block");
        rotateRightLore.add(ChatColor.GRAY + "around you");
        rotateRightLore.add("  ");
        rotateRightLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        rotateRightItemMeta.setLore(rotateRightLore);
        rotateRightItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        rotateRight.setItemMeta(rotateRightItemMeta);

        ItemStack helpItem = new ItemStack(Material.BOOK, 1);
        helpItem.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        ItemMeta helpMeta = helpItem.getItemMeta();
        helpMeta.setDisplayName("§e§lHow to?");
        ArrayList<String> helpLore = new ArrayList<String>();
        helpLore.add("  ");
        helpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "To move an armor stand simply");
        helpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "stand next to it and press a");
        helpLore.add(net.md_5.bungee.api.ChatColor.GRAY + "button!");
        helpMeta.setLore(helpLore);
        helpMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        helpItem.setItemMeta(helpMeta);

        ItemStack backItem = new ItemStack(Material.PAPER, 1);
        ItemMeta backMeta = backItem.getItemMeta();
        backMeta.setDisplayName("§e§lBack to Main Menu");
        ArrayList<String> backLore = new ArrayList<String>();
        backLore.add("  ");
        backLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        backMeta.setLore(backLore);
        backMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        backItem.setItemMeta(backMeta);


        // Set ItemStacks in Inventory

        // Size Buttons
        GUIMovement.setItem(1, blockSettingsLargeItem);
        GUIMovement.setItem(10, blockSettingsMediumItem);
        GUIMovement.setItem(19, blockSettingsSmallItem);
        // Navigation Cross
        GUIMovement.setItem(4, moveForward);
        GUIMovement.setItem(22, moveBackwards);
        GUIMovement.setItem(14, moveRight);
        GUIMovement.setItem(12, moveLeft);
        // Right side of the GUI: Buttons for up and Down
        GUIMovement.setItem(7, moveUp);
        GUIMovement.setItem(25, moveDown);
        // Other Buttons
        GUIMovement.setItem(39, duplicateAS);
        GUIMovement.setItem(38, teleportAS);
        GUIMovement.setItem(41, rotateLeft);
        GUIMovement.setItem(42, rotateRight);
        GUIMovement.setItem(36, helpItem);
        GUIMovement.setItem(44, backItem);


        // Return
        return GUIMovement;
    }

    private Inventory createPresetPosesMenu() {

        // Create Inventory

        Inventory GUIPresetPoses = Bukkit.createInventory(null, 45, ChatColor.DARK_GRAY + "Advanced ArmorStands §rPoses");


        // Create ItemStacks

        ItemStack defaultPose = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta defaultPoseMeta = defaultPose.getItemMeta();
        defaultPoseMeta.setDisplayName("§e§lDefault 1");
        ArrayList<String> defaultPoseLore = new ArrayList<String>();
        defaultPoseLore.add("  ");
        defaultPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "A simple standing");
        defaultPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "armor stand.");
        defaultPoseLore.add("  ");
        defaultPoseLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        defaultPoseMeta.setLore(defaultPoseLore);
        defaultPoseMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        defaultPose.setItemMeta(defaultPoseMeta);

        ItemStack defaultPose2 = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta defaultPose2Meta = defaultPose2.getItemMeta();
        defaultPose2Meta.setDisplayName("§e§lDefault 2");
        ArrayList<String> defaultPose2Lore = new ArrayList<String>();
        defaultPose2Lore.add("  ");
        defaultPose2Lore.add(net.md_5.bungee.api.ChatColor.GRAY + "A simple standing armor");
        defaultPose2Lore.add(net.md_5.bungee.api.ChatColor.GRAY + "stand with hanging arms.");
        defaultPose2Lore.add("  ");
        defaultPose2Lore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        defaultPose2Meta.setLore(defaultPose2Lore);
        defaultPose2Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        defaultPose2.setItemMeta(defaultPose2Meta);

        ItemStack walkingPose1 = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta walkingPose1ItemMeta = walkingPose1.getItemMeta();
        walkingPose1ItemMeta.setDisplayName("§e§lWalking 1");
        ArrayList<String> walkingPose1Lore = new ArrayList<String>();
        walkingPose1Lore.add("  ");
        walkingPose1Lore.add(net.md_5.bungee.api.ChatColor.GRAY + "A simple walking");
        walkingPose1Lore.add(net.md_5.bungee.api.ChatColor.GRAY + "armor stand.");
        walkingPose1Lore.add("  ");
        walkingPose1Lore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        walkingPose1ItemMeta.setLore(walkingPose1Lore);
        walkingPose1ItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        walkingPose1.setItemMeta(walkingPose1ItemMeta);

        ItemStack walkingPose2 = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta walkingPose2ItemMeta = walkingPose2.getItemMeta();
        walkingPose2ItemMeta.setDisplayName("§e§lWalking 2");
        ArrayList<String> walkingPose2Lore = new ArrayList<String>();
        walkingPose2Lore.add("  ");
        walkingPose2Lore.add(net.md_5.bungee.api.ChatColor.GRAY + "A simple walking");
        walkingPose2Lore.add(net.md_5.bungee.api.ChatColor.GRAY + "armor stand.");
        walkingPose2Lore.add("  ");
        walkingPose2Lore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        walkingPose2ItemMeta.setLore(walkingPose2Lore);
        walkingPose2ItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        walkingPose2.setItemMeta(walkingPose2ItemMeta);

        ItemStack sittingPose = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta sittingPoseItemMeta = sittingPose.getItemMeta();
        sittingPoseItemMeta.setDisplayName("§e§lSitting");
        ArrayList<String> sittingPoseLore = new ArrayList<String>();
        sittingPoseLore.add("  ");
        sittingPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Creates a sitting armor stand.");
        sittingPoseLore.add("  ");
        sittingPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Tip: Teleport the sitting armor");
        sittingPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "stand a bit downwards into the block,");
        sittingPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "so it looks like he is sitting on it.");
        sittingPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Use the command " + ChatColor.GOLD + "/aa tp" + ChatColor.GRAY + "! You can also");
        sittingPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "use decimal values for the y-coord!");
        sittingPoseLore.add("  ");
        sittingPoseLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        sittingPoseItemMeta.setLore(sittingPoseLore);
        sittingPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        sittingPose.setItemMeta(sittingPoseItemMeta);

        ItemStack wavingPose = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta wavingPoseItemMeta = wavingPose.getItemMeta();
        wavingPoseItemMeta.setDisplayName("§e§lWaving");
        ArrayList<String> wavingPoseMeta = new ArrayList<String>();
        wavingPoseMeta.add("  ");
        wavingPoseMeta.add(net.md_5.bungee.api.ChatColor.GRAY + "Creates a waving armor stand.");
        wavingPoseMeta.add("  ");
        wavingPoseMeta.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        wavingPoseItemMeta.setLore(wavingPoseMeta);
        wavingPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wavingPose.setItemMeta(wavingPoseItemMeta);

        ItemStack greetingPose = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta greetingPoseItemMeta = greetingPose.getItemMeta();
        greetingPoseItemMeta.setDisplayName("§e§lGreeting 1");
        ArrayList<String> greetingPoseLore = new ArrayList<String>();
        greetingPoseLore.add("  ");
        greetingPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Creates a greeting armor stand.");
        greetingPoseLore.add("  ");
        greetingPoseLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        greetingPoseItemMeta.setLore(greetingPoseLore);
        greetingPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        greetingPose.setItemMeta(greetingPoseItemMeta);

        ItemStack greetingPose2 = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta greetingPose2ItemMeta = greetingPose2.getItemMeta();
        greetingPose2ItemMeta.setDisplayName("§e§lGreeting 2");
        ArrayList<String> greetingPose2Lore = new ArrayList<String>();
        greetingPose2Lore.add("  ");
        greetingPose2Lore.add(net.md_5.bungee.api.ChatColor.GRAY + "Creates a greeting armor stand.");
        greetingPose2Lore.add("  ");
        greetingPose2Lore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        greetingPose2ItemMeta.setLore(greetingPose2Lore);
        greetingPose2ItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        greetingPose2.setItemMeta(greetingPose2ItemMeta);

        ItemStack greetingPose3 = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta greetingPose3ItemMeta = greetingPose3.getItemMeta();
        greetingPose3ItemMeta.setDisplayName("§e§lGreeting 3");
        ArrayList<String> greetingPose3Lore = new ArrayList<String>();
        greetingPose3Lore.add("  ");
        greetingPose3Lore.add(net.md_5.bungee.api.ChatColor.GRAY + "Creates a greeting armor stand.");
        greetingPose3Lore.add("  ");
        greetingPose3Lore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        greetingPose3ItemMeta.setLore(greetingPose3Lore);
        greetingPose3ItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        greetingPose3.setItemMeta(greetingPose3ItemMeta);

        ItemStack cheeringPose = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta cheeringPoseItemMeta = cheeringPose.getItemMeta();
        cheeringPoseItemMeta.setDisplayName("§e§lCheering 1");
        ArrayList<String> cheeringPoseLore = new ArrayList<String>();
        cheeringPoseLore.add("  ");
        cheeringPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Creates a cheering armor stand");
        cheeringPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "with both arms above the head.");
        cheeringPoseLore.add("  ");
        cheeringPoseLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        cheeringPoseItemMeta.setLore(cheeringPoseLore);
        cheeringPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        cheeringPose.setItemMeta(cheeringPoseItemMeta);

        ItemStack cheeringPose2 = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta cheeringPose2ItemMeta = cheeringPose2.getItemMeta();
        cheeringPose2ItemMeta.setDisplayName("§e§lCheering 2");
        ArrayList<String> cheeringPose2Lore = new ArrayList<String>();
        cheeringPose2Lore.add("  ");
        cheeringPose2Lore.add(net.md_5.bungee.api.ChatColor.GRAY + "Creates a cheering armor stand");
        cheeringPose2Lore.add(net.md_5.bungee.api.ChatColor.GRAY + "with one arm above the head.");
        cheeringPose2Lore.add(net.md_5.bungee.api.ChatColor.GRAY + "Combines well with a sword in its hand.");
        cheeringPose2Lore.add("  ");
        cheeringPose2Lore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        cheeringPose2ItemMeta.setLore(cheeringPose2Lore);
        cheeringPose2ItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        cheeringPose2.setItemMeta(cheeringPose2ItemMeta);

        ItemStack builderPose = new ItemStack(Material.CLAY, 1);
        ItemMeta builderPoseItemMeta = builderPose.getItemMeta();
        builderPoseItemMeta.setDisplayName("§e§lBuilder");
        ArrayList<String> builderPoseLore = new ArrayList<String>();
        builderPoseLore.add("  ");
        builderPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Creates a armor stands who is");
        builderPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "carrying a block.");
        builderPoseLore.add("  ");
        builderPoseLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        builderPoseItemMeta.setLore(builderPoseLore);
        builderPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        builderPose.setItemMeta(builderPoseItemMeta);

        ItemStack swordFighterPose = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta swordFighterPoseItemMeta = swordFighterPose.getItemMeta();
        swordFighterPoseItemMeta.setDisplayName("§e§lSword Fighter");
        ArrayList<String> swordFighterPoseLore = new ArrayList<String>();
        swordFighterPoseLore.add("  ");
        swordFighterPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Creates a armor stands who is");
        swordFighterPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "ready to fight. Just place a");
        swordFighterPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "sword in its hand!");
        swordFighterPoseLore.add("  ");
        swordFighterPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "This pose is also good to present");
        swordFighterPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "other items.");
        swordFighterPoseLore.add("  ");
        swordFighterPoseLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        swordFighterPoseItemMeta.setLore(swordFighterPoseLore);
        swordFighterPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        swordFighterPose.setItemMeta(swordFighterPoseItemMeta);

        ItemStack fencingPose = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta fencingPoseItemMeta = fencingPose.getItemMeta();
        fencingPoseItemMeta.setDisplayName("§e§lFencing");
        ArrayList<String> fencingPoseLore = new ArrayList<String>();
        fencingPoseLore.add("  ");
        fencingPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Creates a fencing armor stand.");
        fencingPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Just place a sword in its hand!");
        fencingPoseLore.add("  ");
        fencingPoseLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        fencingPoseItemMeta.setLore(fencingPoseLore);
        fencingPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        fencingPose.setItemMeta(fencingPoseItemMeta);

        ItemStack archerPose = new ItemStack(Material.BOW, 1);
        ItemMeta archerPoseItemMeta = archerPose.getItemMeta();
        archerPoseItemMeta.setDisplayName("§e§lArcher");
        ArrayList<String> archerPoseLore = new ArrayList<String>();
        archerPoseLore.add("  ");
        archerPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Creates a archer armor stand.");
        archerPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Just place a bow in its hand!");
        archerPoseLore.add("  ");
        archerPoseLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        archerPoseItemMeta.setLore(archerPoseLore);
        archerPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        archerPose.setItemMeta(archerPoseItemMeta);

        ItemStack presentingPose = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemMeta presentingPoseItemMeta = presentingPose.getItemMeta();
        presentingPoseItemMeta.setDisplayName("§e§lPresenting Item");
        ArrayList<String> presentingPoseLore = new ArrayList<String>();
        presentingPoseLore.add("  ");
        presentingPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Creates a armor stand who is");
        presentingPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "presenting a item with its right hand.");
        presentingPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Just place any item in its hand!");
        presentingPoseLore.add("  ");
        presentingPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "This pose is also good to hold");
        presentingPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "a sword.");
        presentingPoseLore.add("  ");
        presentingPoseLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        presentingPoseItemMeta.setLore(presentingPoseLore);
        presentingPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        presentingPose.setItemMeta(presentingPoseItemMeta);

        ItemStack holdingItemPose = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemMeta holdingItemPoseItemMeta = holdingItemPose.getItemMeta();
        holdingItemPoseItemMeta.setDisplayName("§e§lHolding Item above Head");
        ArrayList<String> holdingItemPoseLore = new ArrayList<String>();
        holdingItemPoseLore.add("  ");
        holdingItemPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Creates a armor stand who is");
        holdingItemPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "holding an item with its right hand.");
        holdingItemPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Just place any item in its hand!");
        holdingItemPoseLore.add("  ");
        holdingItemPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "This pose is also good to hold");
        holdingItemPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "a sword.");
        holdingItemPoseLore.add("  ");
        holdingItemPoseLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        holdingItemPoseItemMeta.setLore(holdingItemPoseLore);
        holdingItemPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        holdingItemPose.setItemMeta(holdingItemPoseItemMeta);

        ItemStack pointUpPose = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemMeta pointUpPoseItemMeta = pointUpPose.getItemMeta();
        pointUpPoseItemMeta.setDisplayName("§e§lPointing right up");
        ArrayList<String> pointUpPoseLore = new ArrayList<String>();
        pointUpPoseLore.add("  ");
        pointUpPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Creates a armor stand who is");
        pointUpPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "pointing to the right.");
        pointUpPoseLore.add("  ");
        pointUpPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "This pose is also good to hold");
        pointUpPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "a sword.");
        pointUpPoseLore.add("  ");
        pointUpPoseLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        pointUpPoseItemMeta.setLore(pointUpPoseLore);
        pointUpPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        pointUpPose.setItemMeta(pointUpPoseItemMeta);

        ItemStack fishermanPose = new ItemStack(Material.FISHING_ROD, 1);
        ItemMeta fishermanPoseItemMeta = fishermanPose.getItemMeta();
        fishermanPoseItemMeta.setDisplayName("§e§lFisherman");
        ArrayList<String> fishermanPoseLore = new ArrayList<String>();
        fishermanPoseLore.add("  ");
        fishermanPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Creates a sitting fisherman.");
        fishermanPoseLore.add("  ");
        fishermanPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Just place a fishing-rod ");
        fishermanPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "in the armor stands hand!");
        fishermanPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Tip: Teleport the sitting");
        fishermanPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "armor stand a bit downwards");
        fishermanPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "into the block, so it looks");
        fishermanPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "like he is sitting on it!");
        fishermanPoseLore.add("  ");
        fishermanPoseLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use");
        fishermanPoseItemMeta.setLore(fishermanPoseLore);
        fishermanPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        fishermanPose.setItemMeta(fishermanPoseItemMeta);

        ItemStack dancingPose = new ItemStack(Material.FEATHER, 1);
        ItemMeta dancingPoseItemMeta = dancingPose.getItemMeta();
        dancingPoseItemMeta.setDisplayName("§e§lDancing 1");
        ArrayList<String> dancingPoseLore = new ArrayList<String>();
        dancingPoseLore.add("  ");
        dancingPoseLore.add(net.md_5.bungee.api.ChatColor.GRAY + "Creates a dancing armorstand.");
        dancingPoseLore.add("  ");
        dancingPoseLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use");
        dancingPoseItemMeta.setLore(dancingPoseLore);
        dancingPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        dancingPose.setItemMeta(dancingPoseItemMeta);

        ItemStack dancingPose2 = new ItemStack(Material.FEATHER, 1);
        ItemMeta dancingPose2ItemMeta = dancingPose2.getItemMeta();
        dancingPose2ItemMeta.setDisplayName("§e§lDancing 2");
        ArrayList<String> dancingPose2Lore = new ArrayList<String>();
        dancingPose2Lore.add("  ");
        dancingPose2Lore.add(net.md_5.bungee.api.ChatColor.GRAY + "Creates a dancing armorstand.");
        dancingPose2Lore.add("  ");
        dancingPose2Lore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use");
        dancingPose2ItemMeta.setLore(dancingPose2Lore);
        dancingPose2ItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        dancingPose2.setItemMeta(dancingPose2ItemMeta);

        ItemStack helpItem = new ItemStack(Material.BOOK, 1);
        helpItem.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        ItemMeta helpItemItemMeta = helpItem.getItemMeta();
        helpItemItemMeta.setDisplayName("§e§lHow to?");
        ArrayList<String> helpItemLore = new ArrayList<String>();
        helpItemLore.add("  ");
        helpItemLore.add(net.md_5.bungee.api.ChatColor.GRAY + "To apply a preset-pose to an armor stand");
        helpItemLore.add(net.md_5.bungee.api.ChatColor.GRAY + "simply place your armor stand on the ground");
        helpItemLore.add(net.md_5.bungee.api.ChatColor.GRAY + "and press a button! It will affect all armor");
        helpItemLore.add(net.md_5.bungee.api.ChatColor.GRAY + "stands in a radius of 1 blocks around you!");
        helpItemLore.add("  ");
        helpItemLore.add(net.md_5.bungee.api.ChatColor.GRAY + "The only thing you need to do is to equip your");
        helpItemLore.add(net.md_5.bungee.api.ChatColor.GRAY + "armor stand!");
        helpItemLore.add("  ");
        helpItemLore.add(net.md_5.bungee.api.ChatColor.GRAY + "It also applies these setting to the armor stand:");
        helpItemLore.add(net.md_5.bungee.api.ChatColor.GRAY + "arms, no baseplate, no gravity.");
        helpItemItemMeta.setLore(helpItemLore);
        helpItemItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        helpItem.setItemMeta(helpItemItemMeta);

        ItemStack backItem = new ItemStack(Material.PAPER, 1);
        ItemMeta backItemItemMeta = backItem.getItemMeta();
        backItemItemMeta.setDisplayName("§e§lBack to Main Menu");
        ArrayList<String> backItemLore = new ArrayList<String>();
        backItemLore.add("  ");
        backItemLore.add(net.md_5.bungee.api.ChatColor.AQUA + "Click to use!");
        backItemItemMeta.setLore(backItemLore);
        backItemItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        backItem.setItemMeta(backItemItemMeta);


        // Set ItemStacks in Inventory

        GUIPresetPoses.setItem(0, defaultPose);
        GUIPresetPoses.setItem(1, defaultPose2);
        GUIPresetPoses.setItem(2, walkingPose1);
        GUIPresetPoses.setItem(3, walkingPose2);
        GUIPresetPoses.setItem(4, sittingPose);
        GUIPresetPoses.setItem(5, wavingPose);
        GUIPresetPoses.setItem(6, greetingPose);
        GUIPresetPoses.setItem(7, greetingPose2);
        GUIPresetPoses.setItem(8, greetingPose3);
        GUIPresetPoses.setItem(9, cheeringPose);
        GUIPresetPoses.setItem(10, cheeringPose2);
        GUIPresetPoses.setItem(11, builderPose);
        GUIPresetPoses.setItem(12, swordFighterPose);
        GUIPresetPoses.setItem(13, fencingPose);
        GUIPresetPoses.setItem(14, archerPose);
        GUIPresetPoses.setItem(15, presentingPose);
        GUIPresetPoses.setItem(16, holdingItemPose);
        GUIPresetPoses.setItem(17, pointUpPose);
        GUIPresetPoses.setItem(18, fishermanPose);
        GUIPresetPoses.setItem(19, dancingPose);
        GUIPresetPoses.setItem(20, dancingPose2);

        GUIPresetPoses.setItem(36, helpItem);
        GUIPresetPoses.setItem(44, backItem);


        // Return Inventory

        return GUIPresetPoses;
    }


        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // Open Menus

    public void openMenu(Player player, int menuID){
        /**
         * Opens a menu, based on a given menu ID:
         * 1 = Main Menu
         * 2 = Basic Settings
         * 3 = Body Parts Menu
         * 4 = Movement Menu (Distance 0.1 Blocks)
         * 5 = Movement Menu (Distance 0.5 Blocks)
         * 6 = Movement Menu (Distance 1 Block)
         * 7 = Preset Poses
         *
         * @param Player: Player, The player to open the menu for
         * @param menuID: int, Menu ID
         */

        switch(menuID) {
            case 1:
                Inventory mainMenu = createMainMenu(player.hasPermission("aa.head"));
                player.openInventory(mainMenu);
                break;

            case 2:
                Inventory basicSettingsMenu = createBasicSettingsMenu();
                player.openInventory(basicSettingsMenu);
                break;

            case 3:
                Inventory bodyPartsMenu = createBodyPartsMenu();
                player.openInventory(bodyPartsMenu);
                break;

            case 4:
                Inventory movementMenuSmall = createMovementMenu(1);
                player.openInventory(movementMenuSmall);
                break;

            case 5:
                Inventory movementMenuMedium = createMovementMenu(2);
                player.openInventory(movementMenuMedium);
                break;

            case 6:
                Inventory movementMenuLarge = createMovementMenu(3);
                player.openInventory(movementMenuLarge);
                break;

            case 7:
                Inventory presetPoseMenu = createPresetPosesMenu();
                player.openInventory(presetPoseMenu);
                break;
        }



    }



}
