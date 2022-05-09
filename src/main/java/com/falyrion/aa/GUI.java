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
import org.bukkit.util.ChatPaginator;

import java.util.ArrayList;

public class GUI {

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // Create Menus

    /**
     * Function to create the main menu inventory and fill it with items to click on
     *
     * @param player: Player, The player to open the inventory to
     */
    private Inventory createMainMenu(Player player) {
        // Create Inventory

        Inventory GUIMain = Bukkit.createInventory(null, 9, ChatColor.DARK_GRAY + "Advanced ArmorStands");


        // Create ItemStacks

        // Item basic settings

        ItemStack basicSettingsItem = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta basicSettingsMeta = basicSettingsItem.getItemMeta();
        basicSettingsMeta.setDisplayName("§e§lBasic Settings");
        ArrayList<String> basicSettingsLore = new ArrayList<String>();
        basicSettingsLore.add(" ");
        String menuMainBasicSettings = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.main.basic_settings", player.getLocale());
        String[] basicSettingsLoreArray = ChatPaginator.wordWrap(menuMainBasicSettings, 20);
        for (String s : basicSettingsLoreArray) {
            basicSettingsLore.add(s);
        }
        basicSettingsLore.add(" ");
        basicSettingsLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.show_more", player.getLocale()));
        basicSettingsMeta.setLore(basicSettingsLore);
        basicSettingsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        basicSettingsItem.setItemMeta(basicSettingsMeta);

        // Item body settings

        ItemStack bodyPartSettingsItem = new ItemStack(Material.STONE_SLAB, 1);
        ItemMeta bodyPartSettingsMeta = bodyPartSettingsItem.getItemMeta();
        bodyPartSettingsMeta.setDisplayName("§e§lBody Settings");
        ArrayList<String> bodyPartSettingsLore = new ArrayList<String>();
        bodyPartSettingsLore.add("  ");
        String menuMainBodySettings = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.main.body_settings", player.getLocale());
        String[] bodySettingsLoreArray = ChatPaginator.wordWrap(menuMainBodySettings, 20);
        for (String s : bodySettingsLoreArray) {
            bodyPartSettingsLore.add(s);
        }
        bodyPartSettingsLore.add("  ");
        bodyPartSettingsLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.show_more", player.getLocale()));
        bodyPartSettingsMeta.setLore(bodyPartSettingsLore);
        bodyPartSettingsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        bodyPartSettingsItem.setItemMeta(bodyPartSettingsMeta);

        // Item movement and rotation

        ItemStack movementItem = new ItemStack(Material.GLOWSTONE_DUST, 1);
        ItemMeta movementMeta = movementItem.getItemMeta();
        movementMeta.setDisplayName("§e§lMovement and Rotation");
        ArrayList<String> movementLore = new ArrayList<String>();
        movementLore.add("  ");
        String menuMainMovement = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.main.movement", player.getLocale());
        String[] movementSettingsLoreArray = ChatPaginator.wordWrap(menuMainMovement, 20);
        for (String s : movementSettingsLoreArray) {
            movementLore.add(s);
        }
        movementLore.add("  ");
        movementLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.show_more", player.getLocale()));
        movementMeta.setLore(movementLore);
        movementMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        movementItem.setItemMeta(movementMeta);

        // Item preset poses

        ItemStack presetPoses = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta presetPosesMeta = presetPoses.getItemMeta();
        presetPosesMeta.setDisplayName("§e§lPreset Poses");
        ArrayList<String> presetPosesLore = new ArrayList<String>();
        presetPosesLore.add("  ");
        String menuMainPreset = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.main.preset", player.getLocale());
        String[] presetLoreArray = ChatPaginator.wordWrap(menuMainPreset, 20);
        for (String s : presetLoreArray) {
            presetPosesLore.add(s);
        }
        presetPosesLore.add("  ");
        presetPosesLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.show_more", player.getLocale()));
        presetPosesMeta.setLore(presetPosesLore);
        presetPosesMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        presetPoses.setItemMeta(presetPosesMeta);

        // Item heads

        ItemStack headsItem = new ItemStack(Material.PUMPKIN, 1);
        headsItem.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        ItemMeta headsMeta = headsItem.getItemMeta();
        headsMeta.setDisplayName("§e§lHeads");
        ArrayList<String> headsLore = new ArrayList<String>();
        headsLore.add("  ");
        String menuMainHeads = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.main.heads", player.getLocale());
        String[] headsLoreArray = ChatPaginator.wordWrap(menuMainHeads, 20);
        for (String s : headsLoreArray) {
            headsLore.add(s);
        }
        headsLore.add("  ");
        headsLore.add(ChatColor.AQUA + "/aa head <player-name>");
        headsLore.add(ChatColor.AQUA + " <amount>");
        headsMeta.setLore(headsLore);
        headsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        headsItem.setItemMeta(headsMeta);

        // Item documentation

        ItemStack documentationItem = new ItemStack(Material.BOOK, 1);
        documentationItem.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        ItemMeta documentationMeta = documentationItem.getItemMeta();
        documentationMeta.setDisplayName("§e§lDocumentation");
        ArrayList<String> documentationLore = new ArrayList<String>();
        documentationLore.add("  ");
        String docMainHeads = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.main.doc", player.getLocale());
        String[] docLoreArray = ChatPaginator.wordWrap(docMainHeads, 20);
        for (String s : docLoreArray) {
            documentationLore.add(s);
        }
        documentationLore.add("  ");
        documentationLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        documentationMeta.setLore(documentationLore);
        documentationMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        documentationItem.setItemMeta(documentationMeta);

        // Item close

        ItemStack closeMenuItem = new ItemStack(Material.BARRIER, 1);
        ItemMeta closeMenuMeta = closeMenuItem.getItemMeta();
        closeMenuMeta.setDisplayName("§e§lClose");
        ArrayList<String> closeMenuLore = new ArrayList<String>();
        String menuMainClose = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.main.close", player.getLocale());
        String[] closeLoreArray = ChatPaginator.wordWrap(menuMainClose, 20);
        for (String s : closeLoreArray) {
            closeMenuLore.add(s);
        }
        closeMenuLore.add(" ");
        closeMenuLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        closeMenuMeta.setLore(closeMenuLore);
        closeMenuMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        closeMenuItem.setItemMeta(closeMenuMeta);


        // Add ItemStacks to Inventory

        GUIMain.setItem(0, basicSettingsItem);
        GUIMain.setItem(1, bodyPartSettingsItem);
        GUIMain.setItem(2, movementItem);
        GUIMain.setItem(3, presetPoses);
        if (player.hasPermission("aa.head")) {
            GUIMain.setItem(5, headsItem);
        }
        GUIMain.setItem(7, documentationItem);
        GUIMain.setItem(8, closeMenuItem);


        // Return Inventory

        return GUIMain;
    }

    private Inventory createBasicSettingsMenu(Player player) {

        // Create Inventory

        Inventory GUIBasicSettings = Bukkit.createInventory(null, 36, ChatColor.DARK_GRAY + "Advanced ArmorStands §rBasics");

        // Create ItemStacks

        ItemStack toggleArmsItem = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta toggleArmsMeta = toggleArmsItem.getItemMeta();
        toggleArmsMeta.setDisplayName("§e§lArms");
        ArrayList<String> toggleArmLore = new ArrayList<String>();
        toggleArmLore.add(" ");
        String menuBasicArmsString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.arms", player.getLocale());
        String[] menuBasicArmsArray = ChatPaginator.wordWrap(menuBasicArmsString, 20);
        for (String s : menuBasicArmsArray) {
            toggleArmLore.add(s);
        }
        toggleArmLore.add(" ");
        toggleArmLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        toggleArmsMeta.setLore(toggleArmLore);
        toggleArmsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        toggleArmsItem.setItemMeta(toggleArmsMeta);

        ItemStack baseplateInvisibleItem = new ItemStack(Material.STONE_SLAB, 1);
        ItemMeta baseplateInvisibleMeta = baseplateInvisibleItem.getItemMeta();
        baseplateInvisibleMeta.setDisplayName("§e§lBaseplate invisible");
        ArrayList<String> baseplateInvisibleLore = new ArrayList<String>();
        baseplateInvisibleLore.add("  ");
        String menuBasicBaseInvString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.base_inv", player.getLocale());
        String[] menuBasicBaseInvArray = ChatPaginator.wordWrap(menuBasicBaseInvString, 20);
        for (String s : menuBasicBaseInvArray) {
            baseplateInvisibleLore.add(s);
        }
        baseplateInvisibleLore.add("  ");
        baseplateInvisibleLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        baseplateInvisibleMeta.setLore(baseplateInvisibleLore);
        baseplateInvisibleMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        baseplateInvisibleItem.setItemMeta(baseplateInvisibleMeta);

        ItemStack baseplateVisibleItem = new ItemStack(Material.STONE_SLAB, 1);
        ItemMeta baseplateVisibleMeta = baseplateVisibleItem.getItemMeta();
        baseplateVisibleMeta.setDisplayName("§e§lBaseplate visible");
        ArrayList<String> baseplateVisibleLore = new ArrayList<String>();
        baseplateVisibleLore.add("  ");
        String menuBasicBaseVisString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.base_vis", player.getLocale());
        String[] menuBasicBaseVisArray = ChatPaginator.wordWrap(menuBasicBaseVisString, 20);
        for (String s : menuBasicBaseVisArray) {
            baseplateVisibleLore.add(s);
        }
        baseplateVisibleLore.add("  ");
        baseplateVisibleLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        baseplateVisibleMeta.setLore(baseplateVisibleLore);
        baseplateVisibleMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        baseplateVisibleItem.setItemMeta(baseplateVisibleMeta);

        ItemStack gravityOffItem = new ItemStack(Material.FEATHER, 1);
        ItemMeta gravityOffMeta = gravityOffItem.getItemMeta();
        gravityOffMeta.setDisplayName("§e§lGravity off");
        ArrayList<String> gravityOffLore = new ArrayList<String>();
        gravityOffLore.add("  ");
        String menuBasicGravityOffString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.gravity_off", player.getLocale());
        String[] menuBasicGravityOffArray = ChatPaginator.wordWrap(menuBasicGravityOffString, 20);
        for (String s : menuBasicGravityOffArray) {
            gravityOffLore.add(s);
        }
        gravityOffLore.add("  ");
        gravityOffLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        gravityOffMeta.setLore(gravityOffLore);
        gravityOffMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        gravityOffItem.setItemMeta(gravityOffMeta);

        ItemStack gravityOnItem = new ItemStack(Material.FEATHER, 1);
        ItemMeta gravityOnMeta = gravityOnItem.getItemMeta();
        gravityOnMeta.setDisplayName("§e§lGravity on");
        ArrayList<String> gravityOnLore = new ArrayList<String>();
        gravityOnLore.add("  ");
        String menuBasicGravityOnString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.gravity_on", player.getLocale());
        String[] menuBasicGravityOnArray = ChatPaginator.wordWrap(menuBasicGravityOnString, 20);
        for (String s : menuBasicGravityOnArray) {
            gravityOnLore.add(s);
        }
        gravityOnLore.add("  ");
        gravityOnLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        gravityOnMeta.setLore(gravityOnLore);
        gravityOnMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        gravityOnItem.setItemMeta(gravityOnMeta);

        ItemStack asInvisibleItem = new ItemStack(Material.GLASS, 1);
        ItemMeta asInvisibleMeta = asInvisibleItem.getItemMeta();
        asInvisibleMeta.setDisplayName("§e§lInvisible");
        ArrayList<String> asInvisibleLore = new ArrayList<String>();
        asInvisibleLore.add("  ");
        String menuBasicInvString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.invisible", player.getLocale());
        String[] menuBasicInvArray = ChatPaginator.wordWrap(menuBasicInvString, 20);
        for (String s : menuBasicInvArray) {
            asInvisibleLore.add(s);
        }
        asInvisibleLore.add("  ");
        asInvisibleLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        asInvisibleMeta.setLore(asInvisibleLore);
        asInvisibleMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        asInvisibleItem.setItemMeta(asInvisibleMeta);

        ItemStack asVisibleItem = new ItemStack(Material.BLACK_STAINED_GLASS, 1);
        ItemMeta asVisibleMeta = asVisibleItem.getItemMeta();
        asVisibleMeta.setDisplayName("§e§lVisible");
        ArrayList<String> asVisibleLore = new ArrayList<String>();
        asVisibleLore.add("  ");
        String menuBasicVisString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.visible", player.getLocale());
        String[] menuBasicVisArray = ChatPaginator.wordWrap(menuBasicVisString, 20);
        for (String s : menuBasicVisArray) {
            asVisibleLore.add(s);
        }
        asVisibleLore.add("  ");
        asVisibleLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        asVisibleMeta.setLore(asVisibleLore);
        asVisibleMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        asVisibleItem.setItemMeta(asVisibleMeta);

        ItemStack makeSmallItem = new ItemStack(Material.OAK_SLAB, 1);
        ItemMeta makeSmallMeta = makeSmallItem.getItemMeta();
        makeSmallMeta.setDisplayName("§e§lSmall");
        ArrayList<String> makeSmallLore = new ArrayList<String>();
        makeSmallLore.add("  ");
        String menuBasicSmallString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.size_small", player.getLocale());
        String[] menuBasicSmallArray = ChatPaginator.wordWrap(menuBasicSmallString, 20);
        for (String s : menuBasicSmallArray) {
            makeSmallLore.add(s);
        }
        makeSmallLore.add("  ");
        makeSmallLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        makeSmallMeta.setLore(makeSmallLore);
        makeSmallMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        makeSmallItem.setItemMeta(makeSmallMeta);

        ItemStack makeNormalSizeItem = new ItemStack(Material.OAK_PLANKS, 1);
        ItemMeta makeNormalSizeMeta = makeNormalSizeItem.getItemMeta();
        makeNormalSizeMeta.setDisplayName("§e§lNormal Size");
        ArrayList<String> makeNormalSizeLore = new ArrayList<String>();
        makeNormalSizeLore.add("  ");
        String menuBasicNormalString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.size_normal", player.getLocale());
        String[] menuBasicNormalArray = ChatPaginator.wordWrap(menuBasicNormalString, 20);
        for (String s : menuBasicNormalArray) {
            makeNormalSizeLore.add(s);
        }
        makeNormalSizeLore.add("  ");
        makeNormalSizeLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        makeNormalSizeMeta.setLore(makeNormalSizeLore);
        makeNormalSizeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        makeNormalSizeItem.setItemMeta(makeNormalSizeMeta);

        ItemStack customNameItem = new ItemStack(Material.NAME_TAG, 1);
        ItemMeta customNameMeta = customNameItem.getItemMeta();
        customNameMeta.setDisplayName("§e§lCustom Name");
        ArrayList<String> customNameLore = new ArrayList<String>();
        customNameLore.add("  ");
        String menuBasicNameString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.name", player.getLocale());
        String[] menuBasicNameArray = ChatPaginator.wordWrap(menuBasicNameString, 20);
        for (String s : menuBasicNameArray) {
            customNameLore.add(s);
        }
        customNameLore.add("  ");
        customNameLore.add(ChatColor.AQUA + "/aa name <name>");
        customNameMeta.setLore(customNameLore);
        customNameMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        customNameItem.setItemMeta(customNameMeta);

        ItemStack nameHelpItem = new ItemStack(Material.NAME_TAG, 1);
        ItemMeta nameHelpMeta = nameHelpItem.getItemMeta();
        nameHelpMeta.setDisplayName("§e§lName Help");
        ArrayList<String> nameHelpLore = new ArrayList<String>();
        nameHelpLore.add(" ");
        String menuBasicNameHelpString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.name_help", player.getLocale());
        String[] menuBasicNameHelpArray = ChatPaginator.wordWrap(menuBasicNameHelpString, 20);
        for (String s : menuBasicNameHelpArray) {
            nameHelpLore.add(s);
        }
        nameHelpLore.add(" ");
        nameHelpLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        nameHelpMeta.setLore(nameHelpLore);
        nameHelpMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        nameHelpItem.setItemMeta(nameHelpMeta);

        ItemStack hideNameItem = new ItemStack(Material.NAME_TAG, 1);
        ItemMeta hideNameMeta = hideNameItem.getItemMeta();
        hideNameMeta.setDisplayName("§e§lHide Name");
        ArrayList<String> hideNameLore = new ArrayList<String>();
        hideNameLore.add("  ");
        String menuBasicNameHideString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.name_hide", player.getLocale());
        String[] menuBasicNameHideArray = ChatPaginator.wordWrap(menuBasicNameHideString, 20);
        for (String s : menuBasicNameHideArray) {
            hideNameLore.add(s);
        }
        hideNameLore.add("  ");
        hideNameLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        hideNameMeta.setLore(hideNameLore);
        hideNameMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        hideNameItem.setItemMeta(hideNameMeta);

        ItemStack glowItem = new ItemStack(Material.GLOWSTONE, 1);
        ItemMeta glowMeta = glowItem.getItemMeta();
        glowMeta.setDisplayName("§e§lMake glowing");
        ArrayList<String> glowLore = new ArrayList<String>();
        glowLore.add("  ");
        String menuBasicGlowAddString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.glow_add", player.getLocale());
        String[] menuBasicGlowAddArray = ChatPaginator.wordWrap(menuBasicGlowAddString, 20);
        for (String s : menuBasicGlowAddArray) {
            glowLore.add(s);
        }
        glowLore.add("  ");
        glowLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        glowMeta.setLore(glowLore);
        glowMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        glowItem.setItemMeta(glowMeta);

        ItemStack glowRemoveItem = new ItemStack(Material.GLOWSTONE, 1);
        ItemMeta glowRemoveMeta = glowRemoveItem.getItemMeta();
        glowRemoveMeta.setDisplayName("§e§lRemove glow");
        ArrayList<String> glowRemoveLore = new ArrayList<String>();
        glowRemoveLore.add("  ");
        String menuBasicGlowRemoveString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.glow_remove", player.getLocale());
        String[] menuBasicGlowRemoveArray = ChatPaginator.wordWrap(menuBasicGlowRemoveString, 20);
        for (String s : menuBasicGlowRemoveArray) {
            glowRemoveLore.add(s);
        }
        glowRemoveLore.add("  ");
        glowRemoveLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        glowRemoveMeta.setLore(glowRemoveLore);
        glowRemoveMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        glowRemoveItem.setItemMeta(glowRemoveMeta);

        ItemStack invulnerableItem = new ItemStack(Material.OBSIDIAN, 1);
        ItemMeta invulnerableMeta = invulnerableItem.getItemMeta();
        invulnerableMeta.setDisplayName("§e§lInvulnerable");
        ArrayList<String> invulnerableLore = new ArrayList<String>();
        invulnerableLore.add("  ");
        String menuBasicInvulnerableString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.invulnerable", player.getLocale());
        String[] menuBasicInvulnerbleArray = ChatPaginator.wordWrap(menuBasicInvulnerableString, 20);
        for (String s : menuBasicInvulnerbleArray) {
            invulnerableLore.add(s);
        }
        invulnerableLore.add("  ");
        invulnerableLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        invulnerableMeta.setLore(invulnerableLore);
        invulnerableMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        invulnerableItem.setItemMeta(invulnerableMeta);


        // Item help

        ItemStack helpItem = new ItemStack(Material.BOOK, 1);
        helpItem.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        ItemMeta helpMeta = helpItem.getItemMeta();
        helpMeta.setDisplayName("§e§lHow to?");
        ArrayList<String> helpLore = new ArrayList<String>();
        helpLore.add("  ");
        String menuBasicHelpString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.help", player.getLocale());
        String[] menuBasicHelpArray = ChatPaginator.wordWrap(menuBasicHelpString, 20);
        for (String s : menuBasicHelpArray) {
            helpLore.add(s);
        }
        helpMeta.setLore(helpLore);
        helpMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        helpItem.setItemMeta(helpMeta);


        // Item back

        ItemStack backItem = new ItemStack(Material.PAPER, 1);
        ItemMeta backMeta = backItem.getItemMeta();
        backMeta.setDisplayName("§e§lBack");
        ArrayList<String> backLore = new ArrayList<String>();
        backLore.add("  ");
        String menuBasicBackString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.back", player.getLocale());
        String[] menuBasicBackArray = ChatPaginator.wordWrap(menuBasicBackString, 20);
        for (String s : menuBasicBackArray) {
            backLore.add(s);
        }
        backLore.add("  ");
        backLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
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
        GUIBasicSettings.setItem(12, glowItem);
        GUIBasicSettings.setItem(13, glowRemoveItem);
        GUIBasicSettings.setItem(17, invulnerableItem);
        GUIBasicSettings.setItem(27, helpItem);
        GUIBasicSettings.setItem(35, backItem);


        // Return inventory

        return GUIBasicSettings;
    }

    private Inventory createBodyPartsMenu(Player player) {

        // Create Inventory

        Inventory GUIBodyParts = Bukkit.createInventory(null, 27, ChatColor.DARK_GRAY + "Advanced ArmorStands §rBody");
        
        
        // Create ItemStacks

        ItemStack headPose = new ItemStack(Material.GOLDEN_HELMET, 1);
        ItemMeta headPoseItemMeta = headPose.getItemMeta();
        headPoseItemMeta.setDisplayName("§e§lHead Pose");
        ArrayList<String> headPoseLore = new ArrayList<String>();
        headPoseLore.add("  ");
        String menuBodyStringHP = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.body.head", player.getLocale());
        String[] menuBodyStringArrayHP = ChatPaginator.wordWrap(menuBodyStringHP, 20);
        for (String s : menuBodyStringArrayHP) {
            headPoseLore.add(s);
        }
        headPoseLore.add("  ");
        headPoseLore.add(ChatColor.AQUA + "/aa hp <roll> <yaw>");
        headPoseLore.add(ChatColor.AQUA + " <pitch> <range>");

        headPoseItemMeta.setLore(headPoseLore);
        headPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        headPose.setItemMeta(headPoseItemMeta);

        ItemStack bodyPose = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
        ItemMeta bodyPoseMeta = bodyPose.getItemMeta();
        bodyPoseMeta.setDisplayName("§e§lBody Pose");
        ArrayList<String> bodyPoseLore = new ArrayList<String>();
        bodyPoseLore.add("  ");
        String menuBodyStringBP = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.body.body", player.getLocale());
        String[] menuBodyStringArrayBP = ChatPaginator.wordWrap(menuBodyStringBP, 20);
        for (String s : menuBodyStringArrayBP) {
            bodyPoseLore.add(s);
        }
        bodyPoseLore.add("  ");
        bodyPoseLore.add(ChatColor.AQUA + "/aa bp <roll> <yaw>");
        bodyPoseLore.add(ChatColor.AQUA + " <pitch> <range>");
        bodyPoseMeta.setLore(bodyPoseLore);
        bodyPoseMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        bodyPose.setItemMeta(bodyPoseMeta);

        ItemStack rightArm = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
        ItemMeta rightArmMeta = rightArm.getItemMeta();
        rightArmMeta.setDisplayName("§e§lRight Arm Pose");
        ArrayList<String> rightArmLore = new ArrayList<String>();
        rightArmLore.add("  ");
        String menuBodyStringRAP = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.body.rap", player.getLocale());
        String[] menuBodyStringArrayRAP = ChatPaginator.wordWrap(menuBodyStringRAP, 20);
        for (String s : menuBodyStringArrayRAP) {
            rightArmLore.add(s);
        }
        rightArmLore.add("  ");
        rightArmLore.add(ChatColor.AQUA + "/aa rap <roll> <yaw>");
        rightArmLore.add(ChatColor.AQUA + " <pitch> <range>");
        rightArmMeta.setLore(rightArmLore);
        rightArmMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        rightArm.setItemMeta(rightArmMeta);

        ItemStack leftArm = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
        ItemMeta leftArmMeta = leftArm.getItemMeta();
        leftArmMeta.setDisplayName("§e§lLeft Arm Pose");
        ArrayList<String> leftArmLore = new ArrayList<String>();
        leftArmLore.add("  ");
        String menuBodyStringLAP = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.body.lap", player.getLocale());
        String[] menuBodyStringArrayLAP = ChatPaginator.wordWrap(menuBodyStringLAP, 20);
        for (String s : menuBodyStringArrayLAP) {
            leftArmLore.add(s);
        }
        leftArmLore.add("  ");
        leftArmLore.add(ChatColor.AQUA + "/aa lap <roll> <yaw>");
        leftArmLore.add(ChatColor.AQUA + " <pitch> <range>");
        leftArmMeta.setLore(leftArmLore);
        leftArmMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        leftArm.setItemMeta(leftArmMeta);

        ItemStack rightLeg = new ItemStack(Material.GOLDEN_LEGGINGS, 1);
        ItemMeta rightLegMeta = rightLeg.getItemMeta();
        rightLegMeta.setDisplayName("§e§lRight Leg Pose");
        ArrayList<String> rightLegLore = new ArrayList<String>();
        rightLegLore.add("  ");
        String menuBodyStringRLP = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.body.rlp", player.getLocale());
        String[] menuBodyStringArrayRLP = ChatPaginator.wordWrap(menuBodyStringRLP, 20);
        for (String s : menuBodyStringArrayRLP) {
            rightLegLore.add(s);
        }
        rightLegLore.add("  ");
        rightLegLore.add(ChatColor.AQUA + "/aa rlp <roll> <yaw>");
        rightLegLore.add(ChatColor.AQUA + " <pitch> <range>");
        rightLegMeta.setLore(rightLegLore);
        rightLegMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        rightLeg.setItemMeta(rightLegMeta);

        ItemStack leftLeg = new ItemStack(Material.GOLDEN_LEGGINGS, 1);
        ItemMeta leftLegMeta = leftLeg.getItemMeta();
        leftLegMeta.setDisplayName("§e§lLeft Leg Pose");
        ArrayList<String> leftLegLore = new ArrayList<String>();
        leftLegLore.add("  ");
        String menuBodyStringLLP = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.body.llp", player.getLocale());
        String[] menuBodyStringArrayLLP = ChatPaginator.wordWrap(menuBodyStringLLP, 20);
        for (String s : menuBodyStringArrayLLP) {
            leftLegLore.add(s);
        }
        leftLegLore.add("  ");
        leftLegLore.add(net.md_5.bungee.api.ChatColor.AQUA + "/aa llp <roll> <yaw>");
        leftLegLore.add(net.md_5.bungee.api.ChatColor.AQUA + " <pitch> <range>");
        leftLegMeta.setLore(leftLegLore);
        leftLegMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        leftLeg.setItemMeta(leftLegMeta);

        ItemStack helpItem = new ItemStack(Material.BOOK, 1);
        helpItem.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        ItemMeta helpMeta = helpItem.getItemMeta();
        helpMeta.setDisplayName("§e§lHow to?");
        ArrayList<String> helpLore = new ArrayList<String>();
        helpLore.add("  ");
        String menuBodyHelpString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.help", player.getLocale());
        String[] menuBodyHelpArray = ChatPaginator.wordWrap(menuBodyHelpString, 20);
        for (String s : menuBodyHelpArray) {
            helpLore.add(s);
        }
        helpMeta.setLore(helpLore);
        helpMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        helpItem.setItemMeta(helpMeta);

        ItemStack backItem = new ItemStack(Material.PAPER, 1);
        ItemMeta backMeta = backItem.getItemMeta();
        backMeta.setDisplayName("§e§lBack to Main Menu");
        ArrayList<String> backLore = new ArrayList<String>();
        backLore.add("  ");
        String menuBodyStringBack = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.back", player.getLocale());
        String[] menuBodyArrayBack = ChatPaginator.wordWrap(menuBodyStringBack, 20);
        for (String s : menuBodyArrayBack) {
            backLore.add(s);
        }
        backLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
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

    private Inventory createMovementMenu(Player player, int Size) {

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
        String menuMoveStringDist01 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.distance_01", player.getLocale());
        String[] menuMoveArrayDist01 = ChatPaginator.wordWrap(menuMoveStringDist01, 20);
        for (String s : menuMoveArrayDist01) {
            blockSettingsLargeLore.add(s);
        }
        blockSettingsLargeLore.add("  ");
        blockSettingsLargeLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        blockSettingsLargeItemItemMeta.setLore(blockSettingsLargeLore);
        blockSettingsLargeItemItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        blockSettingsLargeItem.setItemMeta(blockSettingsLargeItemItemMeta);

        ItemStack blockSettingsMediumItem = new ItemStack(blockMediumMaterial, 1);
        ItemMeta blockSettingsMediumItemItemMeta = blockSettingsMediumItem.getItemMeta();
        blockSettingsMediumItemItemMeta.setDisplayName(blockMediumName);
        ArrayList<String> blockSettingsMediumLore = new ArrayList<String>();
        blockSettingsMediumLore.add("  ");
        String menuMoveStringDist02 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.distance_02", player.getLocale());
        String[] menuMoveArrayDist02 = ChatPaginator.wordWrap(menuMoveStringDist02, 20);
        for (String s : menuMoveArrayDist02) {
            blockSettingsMediumLore.add(s);
        }
        blockSettingsMediumLore.add("  ");
        blockSettingsMediumLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        blockSettingsMediumItemItemMeta.setLore(blockSettingsMediumLore);
        blockSettingsMediumItemItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        blockSettingsMediumItem.setItemMeta(blockSettingsMediumItemItemMeta);

        ItemStack blockSettingsSmallItem = new ItemStack(blockSmallMaterial, 1);
        ItemMeta blockSettingsSmallItemItemMeta = blockSettingsSmallItem.getItemMeta();
        blockSettingsSmallItemItemMeta.setDisplayName(blockSmallName);
        ArrayList<String> blockSettingsSmallLore = new ArrayList<String>();
        blockSettingsSmallLore.add("  ");
        String menuMoveStringDist03 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.distance_03", player.getLocale());
        String[] menuMoveArrayDist03 = ChatPaginator.wordWrap(menuMoveStringDist03, 20);
        for (String s : menuMoveArrayDist03) {
            blockSettingsSmallLore.add(s);
        }
        blockSettingsSmallLore.add("  ");
        blockSettingsSmallLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        blockSettingsSmallItemItemMeta.setLore(blockSettingsSmallLore);
        blockSettingsSmallItemItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        blockSettingsSmallItem.setItemMeta(blockSettingsSmallItemItemMeta);


        ItemStack moveForward = new ItemStack(Material.GLOWSTONE_DUST, 1);
        ItemMeta moveForwardItemMeta = moveForward.getItemMeta();
        moveForwardItemMeta.setDisplayName("§e§lForward");
        ArrayList<String> moveForwardLore = new ArrayList<String>();
        moveForwardLore.add("  ");
        String menuMoveStringForward = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.forward", player.getLocale());
        String[] menuMoveArrayForward = ChatPaginator.wordWrap(menuMoveStringForward, 20);
        for (String s : menuMoveArrayForward) {
            moveForwardLore.add(s);
        }
        moveForwardLore.add("  ");
        moveForwardLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        moveForwardItemMeta.setLore(moveForwardLore);
        moveForwardItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        moveForward.setItemMeta(moveForwardItemMeta);

        ItemStack moveBackwards = new ItemStack(Material.GLOWSTONE_DUST, 1);
        ItemMeta moveBackwardsItemMeta = moveBackwards.getItemMeta();
        moveBackwardsItemMeta.setDisplayName("§e§lBackwards");
        ArrayList<String> moveBackwardsLore = new ArrayList<String>();
        moveBackwardsLore.add("  ");
        String menuMoveStringBackward = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.backward", player.getLocale());
        String[] menuMoveArrayBackward = ChatPaginator.wordWrap(menuMoveStringBackward, 20);
        for (String s : menuMoveArrayBackward) {
            moveBackwardsLore.add(s);
        }
        moveBackwardsLore.add("  ");
        moveBackwardsLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        moveBackwardsItemMeta.setLore(moveBackwardsLore);
        moveBackwardsItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        moveBackwards.setItemMeta(moveBackwardsItemMeta);

        ItemStack moveRight = new ItemStack(Material.GLOWSTONE_DUST, 1);
        ItemMeta moveRightItemMeta = moveRight.getItemMeta();
        moveRightItemMeta.setDisplayName("§e§lRight");
        ArrayList<String> moveRightLore = new ArrayList<String>();
        moveRightLore.add("  ");
        String menuMoveStringRight = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.right", player.getLocale());
        String[] menuMoveArrayRight = ChatPaginator.wordWrap(menuMoveStringRight, 20);
        for (String s : menuMoveArrayRight) {
            moveRightLore.add(s);
        }
        moveRightLore.add("  ");
        moveRightLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        moveRightItemMeta.setLore(moveRightLore);
        moveRightItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        moveRight.setItemMeta(moveRightItemMeta);

        ItemStack moveLeft = new ItemStack(Material.GLOWSTONE_DUST, 1);
        ItemMeta moveLeftItemMeta = moveLeft.getItemMeta();
        moveLeftItemMeta.setDisplayName("§e§lLeft");
        ArrayList<String> moveLeftLore = new ArrayList<String>();
        moveLeftLore.add("  ");
        String menuMoveStringLeft = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.left", player.getLocale());
        String[] menuMoveArrayLeft = ChatPaginator.wordWrap(menuMoveStringLeft, 20);
        for (String s : menuMoveArrayLeft) {
            moveLeftLore.add(s);
        }
        moveLeftLore.add("  ");
        moveLeftLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        moveLeftItemMeta.setLore(moveLeftLore);
        moveLeftItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        moveLeft.setItemMeta(moveLeftItemMeta);
        
        ItemStack moveUp = new ItemStack(Material.FEATHER, 1);
        ItemMeta moveUpItemMeta = moveUp.getItemMeta();
        moveUpItemMeta.setDisplayName("§e§lUp");
        ArrayList<String> moveUpLore = new ArrayList<String>();
        moveUpLore.add("  ");
        String menuMoveStringUp = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.up", player.getLocale());
        String[] menuMoveArrayUp = ChatPaginator.wordWrap(menuMoveStringUp, 20);
        for (String s : menuMoveArrayUp) {
            moveUpLore.add(s);
        }
        moveUpLore.add("  ");
        moveUpLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        moveUpItemMeta.setLore(moveUpLore);
        moveUpItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        moveUp.setItemMeta(moveUpItemMeta);

        ItemStack moveDown = new ItemStack(Material.ANVIL, 1);
        ItemMeta moveDownItemMeta = moveDown.getItemMeta();
        moveDownItemMeta.setDisplayName("§e§lDown");
        ArrayList<String> moveDownLore = new ArrayList<String>();
        moveDownLore.add("  ");
        String menuMoveStringDown = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.down", player.getLocale());
        String[] menuMoveArrayDown = ChatPaginator.wordWrap(menuMoveStringDown, 20);
        for (String s : menuMoveArrayDown) {
            moveDownLore.add(s);
        }
        moveDownLore.add("  ");
        moveDownLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        moveDownItemMeta.setLore(moveDownLore);
        moveDownItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        moveDown.setItemMeta(moveDownItemMeta);

        ItemStack duplicateAS = new ItemStack(Material.MAGMA_CREAM, 1);
        ItemMeta duplicateASItemMeta = duplicateAS.getItemMeta();
        duplicateASItemMeta.setDisplayName("§e§lDuplicate");
        ArrayList<String> duplicateASLore = new ArrayList<String>();
        duplicateASLore.add("  ");
        String menuMoveStringDuplicate = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.duplicate", player.getLocale());
        String[] menuMoveArrayDuplicate = ChatPaginator.wordWrap(menuMoveStringDuplicate, 20);
        for (String s : menuMoveArrayDuplicate) {
            duplicateASLore.add(s);
        }
        duplicateASLore.add("  ");
        duplicateASLore.add(ChatColor.AQUA + "/aa clone <x> <y> <z>");
        duplicateASItemMeta.setLore(duplicateASLore);
        duplicateASItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        duplicateAS.setItemMeta(duplicateASItemMeta);

        ItemStack teleportAS = new ItemStack(Material.ENDER_EYE, 1);
        ItemMeta teleportASItemMeta = teleportAS.getItemMeta();
        teleportASItemMeta.setDisplayName("§e§lTeleport");
        ArrayList<String> teleportASLore = new ArrayList<String>();
        teleportASLore.add("  ");
        String menuMoveStringTeleport = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.teleport", player.getLocale());
        String[] menuMoveArrayTeleport = ChatPaginator.wordWrap(menuMoveStringTeleport, 20);
        for (String s : menuMoveArrayTeleport) {
            teleportASLore.add(s);
        }
        teleportASLore.add("  ");
        teleportASLore.add(ChatColor.AQUA + "/aa tp <x> <y> <z>");
        teleportASItemMeta.setLore(teleportASLore);
        teleportASItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        teleportAS.setItemMeta(teleportASItemMeta);

        ItemStack rotateLeft = new ItemStack(Material.GLOWSTONE_DUST, 1);
        ItemMeta rotateLeftItemMeta = rotateLeft.getItemMeta();
        rotateLeftItemMeta.setDisplayName("§e§lRotate left");
        ArrayList<String> rotateLeftLore = new ArrayList<String>();
        rotateLeftLore.add("  ");
        String menuMoveStringRotateLeft = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.rotate_left", player.getLocale());
        String[] menuMoveArrayRotateLeft = ChatPaginator.wordWrap(menuMoveStringRotateLeft, 20);
        for (String s : menuMoveArrayRotateLeft) {
            rotateLeftLore.add(s);
        }
        rotateLeftLore.add("  ");
        rotateLeftLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        rotateLeftItemMeta.setLore(rotateLeftLore);
        rotateLeftItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        rotateLeft.setItemMeta(rotateLeftItemMeta);

        ItemStack rotateRight = new ItemStack(Material.GLOWSTONE_DUST, 1);
        ItemMeta rotateRightItemMeta = rotateRight.getItemMeta();
        rotateRightItemMeta.setDisplayName("§e§lRotate right");
        ArrayList<String> rotateRightLore = new ArrayList<String>();
        rotateRightLore.add("  ");
        String menuMoveStringRotateRight = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.rotate_right", player.getLocale());
        String[] menuMoveArrayRotateRight = ChatPaginator.wordWrap(menuMoveStringRotateRight, 20);
        for (String s : menuMoveArrayRotateRight) {
            rotateRightLore.add(s);
        }
        rotateRightLore.add("  ");
        rotateRightLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        rotateRightItemMeta.setLore(rotateRightLore);
        rotateRightItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        rotateRight.setItemMeta(rotateRightItemMeta);

        ItemStack helpItem = new ItemStack(Material.BOOK, 1);
        helpItem.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        ItemMeta helpMeta = helpItem.getItemMeta();
        helpMeta.setDisplayName("§e§lHow to?");
        ArrayList<String> helpLore = new ArrayList<String>();
        helpLore.add("  ");
        String menuMoveStringHelp = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.help", player.getLocale());
        String[] menuMoveArrayHelp = ChatPaginator.wordWrap(menuMoveStringHelp, 20);
        for (String s : menuMoveArrayHelp) {
            helpLore.add(s);
        }
        helpMeta.setLore(helpLore);
        helpMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        helpItem.setItemMeta(helpMeta);

        ItemStack backItem = new ItemStack(Material.PAPER, 1);
        ItemMeta backMeta = backItem.getItemMeta();
        backMeta.setDisplayName("§e§lBack to Main Menu");
        ArrayList<String> backLore = new ArrayList<String>();
        backLore.add(" ");
        String menuMoveBack = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.back", player.getLocale());
        String[] menuMoveArrayBack = ChatPaginator.wordWrap(menuMoveBack, 20);
        for (String s : menuMoveArrayBack) {
            backLore.add(s);
        }
        backLore.add(" ");
        backLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
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

    private Inventory createPresetPosesMenu(Player player) {

        // Create Inventory

        Inventory GUIPresetPoses = Bukkit.createInventory(null, 45, ChatColor.DARK_GRAY + "Advanced ArmorStands §rPoses");


        // Create ItemStacks

        ItemStack defaultPose = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta defaultPoseMeta = defaultPose.getItemMeta();
        defaultPoseMeta.setDisplayName("§e§lDefault 1");
        ArrayList<String> defaultPoseLore = new ArrayList<String>();
        defaultPoseLore.add("  ");
        String menuPresetString01 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_01", player.getLocale());
        String[] menuPresetArray01 = ChatPaginator.wordWrap(menuPresetString01, 20);
        for (String s : menuPresetArray01) {
            defaultPoseLore.add(s);
        }
        defaultPoseLore.add("  ");
        defaultPoseLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        defaultPoseMeta.setLore(defaultPoseLore);
        defaultPoseMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        defaultPose.setItemMeta(defaultPoseMeta);

        ItemStack defaultPose2 = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta defaultPose2Meta = defaultPose2.getItemMeta();
        defaultPose2Meta.setDisplayName("§e§lDefault 2");
        ArrayList<String> defaultPose2Lore = new ArrayList<String>();
        defaultPose2Lore.add("  ");
        String menuPresetString02 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_02", player.getLocale());
        String[] menuPresetArray02 = ChatPaginator.wordWrap(menuPresetString02, 20);
        for (String s : menuPresetArray02) {
            defaultPose2Lore.add(s);
        }
        defaultPose2Lore.add("  ");
        defaultPose2Lore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        defaultPose2Meta.setLore(defaultPose2Lore);
        defaultPose2Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        defaultPose2.setItemMeta(defaultPose2Meta);

        ItemStack walkingPose1 = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta walkingPose1ItemMeta = walkingPose1.getItemMeta();
        walkingPose1ItemMeta.setDisplayName("§e§lWalking 1");
        ArrayList<String> walkingPose1Lore = new ArrayList<String>();
        walkingPose1Lore.add("  ");
        String menuPresetString03 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_03", player.getLocale());
        String[] menuPresetArray03 = ChatPaginator.wordWrap(menuPresetString03, 20);
        for (String s : menuPresetArray03) {
            walkingPose1Lore.add(s);
        }
        walkingPose1Lore.add("  ");
        walkingPose1Lore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        walkingPose1ItemMeta.setLore(walkingPose1Lore);
        walkingPose1ItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        walkingPose1.setItemMeta(walkingPose1ItemMeta);

        ItemStack walkingPose2 = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta walkingPose2ItemMeta = walkingPose2.getItemMeta();
        walkingPose2ItemMeta.setDisplayName("§e§lWalking 2");
        ArrayList<String> walkingPose2Lore = new ArrayList<String>();
        walkingPose2Lore.add("  ");
        String menuPresetString04 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_04", player.getLocale());
        String[] menuPresetArray04 = ChatPaginator.wordWrap(menuPresetString04, 20);
        for (String s : menuPresetArray04) {
            walkingPose2Lore.add(s);
        }
        walkingPose2Lore.add("  ");
        walkingPose2Lore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        walkingPose2ItemMeta.setLore(walkingPose2Lore);
        walkingPose2ItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        walkingPose2.setItemMeta(walkingPose2ItemMeta);

        ItemStack sittingPose = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta sittingPoseItemMeta = sittingPose.getItemMeta();
        sittingPoseItemMeta.setDisplayName("§e§lSitting");
        ArrayList<String> sittingPoseLore = new ArrayList<String>();
        sittingPoseLore.add("  ");
        String menuPresetString05 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_05", player.getLocale());
        String[] menuPresetArray05 = ChatPaginator.wordWrap(menuPresetString05, 20);
        for (String s : menuPresetArray05) {
            sittingPoseLore.add(s);
        }
        sittingPoseLore.add("  ");
        sittingPoseLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        sittingPoseItemMeta.setLore(sittingPoseLore);
        sittingPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        sittingPose.setItemMeta(sittingPoseItemMeta);

        ItemStack wavingPose = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta wavingPoseItemMeta = wavingPose.getItemMeta();
        wavingPoseItemMeta.setDisplayName("§e§lWaving");
        ArrayList<String> wavingPoseMeta = new ArrayList<String>();
        wavingPoseMeta.add("  ");
        String menuPresetString06 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_06", player.getLocale());
        String[] menuPresetArray06 = ChatPaginator.wordWrap(menuPresetString06, 20);
        for (String s : menuPresetArray06) {
            wavingPoseMeta.add(s);
        }
        wavingPoseMeta.add("  ");
        wavingPoseMeta.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        wavingPoseItemMeta.setLore(wavingPoseMeta);
        wavingPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wavingPose.setItemMeta(wavingPoseItemMeta);

        ItemStack greetingPose = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta greetingPoseItemMeta = greetingPose.getItemMeta();
        greetingPoseItemMeta.setDisplayName("§e§lGreeting 1");
        ArrayList<String> greetingPoseLore = new ArrayList<String>();
        greetingPoseLore.add("  ");
        String menuPresetString07 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_07", player.getLocale());
        String[] menuPresetArray07 = ChatPaginator.wordWrap(menuPresetString07, 20);
        for (String s : menuPresetArray07) {
            greetingPoseLore.add(s);
        }
        greetingPoseLore.add("  ");
        greetingPoseLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        greetingPoseItemMeta.setLore(greetingPoseLore);
        greetingPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        greetingPose.setItemMeta(greetingPoseItemMeta);

        ItemStack greetingPose2 = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta greetingPose2ItemMeta = greetingPose2.getItemMeta();
        greetingPose2ItemMeta.setDisplayName("§e§lGreeting 2");
        ArrayList<String> greetingPose2Lore = new ArrayList<String>();
        greetingPose2Lore.add("  ");
        String menuPresetString08 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_08", player.getLocale());
        String[] menuPresetArray08 = ChatPaginator.wordWrap(menuPresetString08, 20);
        for (String s : menuPresetArray08) {
            greetingPose2Lore.add(s);
        }
        greetingPose2Lore.add("  ");
        greetingPose2Lore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        greetingPose2ItemMeta.setLore(greetingPose2Lore);
        greetingPose2ItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        greetingPose2.setItemMeta(greetingPose2ItemMeta);

        ItemStack greetingPose3 = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta greetingPose3ItemMeta = greetingPose3.getItemMeta();
        greetingPose3ItemMeta.setDisplayName("§e§lGreeting 3");
        ArrayList<String> greetingPose3Lore = new ArrayList<String>();
        greetingPose3Lore.add("  ");
        String menuPresetString09 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_09", player.getLocale());
        String[] menuPresetArray09 = ChatPaginator.wordWrap(menuPresetString09, 20);
        for (String s : menuPresetArray09) {
            greetingPose3Lore.add(s);
        }
        greetingPose3Lore.add("  ");
        greetingPose3Lore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        greetingPose3ItemMeta.setLore(greetingPose3Lore);
        greetingPose3ItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        greetingPose3.setItemMeta(greetingPose3ItemMeta);

        ItemStack cheeringPose = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta cheeringPoseItemMeta = cheeringPose.getItemMeta();
        cheeringPoseItemMeta.setDisplayName("§e§lCheering 1");
        ArrayList<String> cheeringPoseLore = new ArrayList<String>();
        cheeringPoseLore.add("  ");
        String menuPresetString10 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_10", player.getLocale());
        String[] menuPresetArray10 = ChatPaginator.wordWrap(menuPresetString10, 20);
        for (String s : menuPresetArray10) {
            cheeringPoseLore.add(s);
        }
        cheeringPoseLore.add("  ");
        cheeringPoseLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        cheeringPoseItemMeta.setLore(cheeringPoseLore);
        cheeringPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        cheeringPose.setItemMeta(cheeringPoseItemMeta);

        ItemStack cheeringPose2 = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta cheeringPose2ItemMeta = cheeringPose2.getItemMeta();
        cheeringPose2ItemMeta.setDisplayName("§e§lCheering 2");
        ArrayList<String> cheeringPose2Lore = new ArrayList<String>();
        cheeringPose2Lore.add("  ");
        String menuPresetString11 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_11", player.getLocale());
        String[] menuPresetArray11 = ChatPaginator.wordWrap(menuPresetString11, 20);
        for (String s : menuPresetArray11) {
            cheeringPose2Lore.add(s);
        }
        cheeringPose2Lore.add("  ");
        cheeringPose2Lore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        cheeringPose2ItemMeta.setLore(cheeringPose2Lore);
        cheeringPose2ItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        cheeringPose2.setItemMeta(cheeringPose2ItemMeta);

        ItemStack builderPose = new ItemStack(Material.CLAY, 1);
        ItemMeta builderPoseItemMeta = builderPose.getItemMeta();
        builderPoseItemMeta.setDisplayName("§e§lBuilder");
        ArrayList<String> builderPoseLore = new ArrayList<String>();
        builderPoseLore.add("  ");
        String menuPresetString12 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_12", player.getLocale());
        String[] menuPresetArray12 = ChatPaginator.wordWrap(menuPresetString12, 20);
        for (String s : menuPresetArray12) {
            builderPoseLore.add(s);
        }
        builderPoseLore.add("  ");
        builderPoseLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        builderPoseItemMeta.setLore(builderPoseLore);
        builderPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        builderPose.setItemMeta(builderPoseItemMeta);

        ItemStack swordFighterPose = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta swordFighterPoseItemMeta = swordFighterPose.getItemMeta();
        swordFighterPoseItemMeta.setDisplayName("§e§lSword Fighter");
        ArrayList<String> swordFighterPoseLore = new ArrayList<String>();
        swordFighterPoseLore.add("  ");
        String menuPresetString13 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_13", player.getLocale());
        String[] menuPresetArray13 = ChatPaginator.wordWrap(menuPresetString13, 20);
        for (String s : menuPresetArray13) {
            swordFighterPoseLore.add(s);
        }
        swordFighterPoseLore.add("  ");
        swordFighterPoseLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        swordFighterPoseItemMeta.setLore(swordFighterPoseLore);
        swordFighterPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        swordFighterPose.setItemMeta(swordFighterPoseItemMeta);

        ItemStack fencingPose = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta fencingPoseItemMeta = fencingPose.getItemMeta();
        fencingPoseItemMeta.setDisplayName("§e§lFencing");
        ArrayList<String> fencingPoseLore = new ArrayList<String>();
        fencingPoseLore.add("  ");
        String menuPresetString14 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_14", player.getLocale());
        String[] menuPresetArray14 = ChatPaginator.wordWrap(menuPresetString14, 20);
        for (String s : menuPresetArray14) {
            fencingPoseLore.add(s);
        }
        fencingPoseLore.add("  ");
        fencingPoseLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        fencingPoseItemMeta.setLore(fencingPoseLore);
        fencingPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        fencingPose.setItemMeta(fencingPoseItemMeta);

        ItemStack archerPose = new ItemStack(Material.BOW, 1);
        ItemMeta archerPoseItemMeta = archerPose.getItemMeta();
        archerPoseItemMeta.setDisplayName("§e§lArcher");
        ArrayList<String> archerPoseLore = new ArrayList<String>();
        archerPoseLore.add("  ");
        String menuPresetString15 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_15", player.getLocale());
        String[] menuPresetArray15 = ChatPaginator.wordWrap(menuPresetString15, 20);
        for (String s : menuPresetArray15) {
            archerPoseLore.add(s);
        }
        archerPoseLore.add("  ");
        archerPoseLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        archerPoseItemMeta.setLore(archerPoseLore);
        archerPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        archerPose.setItemMeta(archerPoseItemMeta);

        ItemStack presentingPose = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemMeta presentingPoseItemMeta = presentingPose.getItemMeta();
        presentingPoseItemMeta.setDisplayName("§e§lPresenting Item");
        ArrayList<String> presentingPoseLore = new ArrayList<String>();
        presentingPoseLore.add("  ");
        String menuPresetString16 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_16", player.getLocale());
        String[] menuPresetArray16 = ChatPaginator.wordWrap(menuPresetString16, 20);
        for (String s : menuPresetArray16) {
            presentingPoseLore.add(s);
        }
        presentingPoseLore.add("  ");
        presentingPoseLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        presentingPoseItemMeta.setLore(presentingPoseLore);
        presentingPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        presentingPose.setItemMeta(presentingPoseItemMeta);

        ItemStack holdingItemPose = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemMeta holdingItemPoseItemMeta = holdingItemPose.getItemMeta();
        holdingItemPoseItemMeta.setDisplayName("§e§lHolding Item above Head");
        ArrayList<String> holdingItemPoseLore = new ArrayList<String>();
        holdingItemPoseLore.add("  ");
        String menuPresetString21 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_21", player.getLocale());
        String[] menuPresetArray21 = ChatPaginator.wordWrap(menuPresetString21, 20);
        for (String s : menuPresetArray21) {
            holdingItemPoseLore.add(s);
        }
        holdingItemPoseLore.add("  ");
        holdingItemPoseLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        holdingItemPoseItemMeta.setLore(holdingItemPoseLore);
        holdingItemPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        holdingItemPose.setItemMeta(holdingItemPoseItemMeta);

        ItemStack pointUpPose = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemMeta pointUpPoseItemMeta = pointUpPose.getItemMeta();
        pointUpPoseItemMeta.setDisplayName("§e§lPointing right up");
        ArrayList<String> pointUpPoseLore = new ArrayList<String>();
        pointUpPoseLore.add("  ");
        String menuPresetString17 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_17", player.getLocale());
        String[] menuPresetArray17 = ChatPaginator.wordWrap(menuPresetString17, 20);
        for (String s : menuPresetArray17) {
            pointUpPoseLore.add(s);
        }
        pointUpPoseLore.add("  ");
        pointUpPoseLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        pointUpPoseItemMeta.setLore(pointUpPoseLore);
        pointUpPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        pointUpPose.setItemMeta(pointUpPoseItemMeta);

        ItemStack fishermanPose = new ItemStack(Material.FISHING_ROD, 1);
        ItemMeta fishermanPoseItemMeta = fishermanPose.getItemMeta();
        fishermanPoseItemMeta.setDisplayName("§e§lFisherman");
        ArrayList<String> fishermanPoseLore = new ArrayList<String>();
        fishermanPoseLore.add("  ");
        String menuPresetString18 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_18", player.getLocale());
        String[] menuPresetArray18 = ChatPaginator.wordWrap(menuPresetString18, 20);
        for (String s : menuPresetArray18) {
            fishermanPoseLore.add(s);
        }
        fishermanPoseLore.add("  ");
        fishermanPoseLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        fishermanPoseItemMeta.setLore(fishermanPoseLore);
        fishermanPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        fishermanPose.setItemMeta(fishermanPoseItemMeta);

        ItemStack dancingPose = new ItemStack(Material.FEATHER, 1);
        ItemMeta dancingPoseItemMeta = dancingPose.getItemMeta();
        dancingPoseItemMeta.setDisplayName("§e§lDancing 1");
        ArrayList<String> dancingPoseLore = new ArrayList<String>();
        dancingPoseLore.add("  ");
        String menuPresetString19 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_19", player.getLocale());
        String[] menuPresetArray19 = ChatPaginator.wordWrap(menuPresetString19, 20);
        for (String s : menuPresetArray19) {
            dancingPoseLore.add(s);
        }
        dancingPoseLore.add("  ");
        dancingPoseLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        dancingPoseItemMeta.setLore(dancingPoseLore);
        dancingPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        dancingPose.setItemMeta(dancingPoseItemMeta);

        ItemStack dancingPose2 = new ItemStack(Material.FEATHER, 1);
        ItemMeta dancingPose2ItemMeta = dancingPose2.getItemMeta();
        dancingPose2ItemMeta.setDisplayName("§e§lDancing 2");
        ArrayList<String> dancingPose2Lore = new ArrayList<String>();
        dancingPose2Lore.add("  ");
        String menuPresetString20 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_20", player.getLocale());
        String[] menuPresetArray20 = ChatPaginator.wordWrap(menuPresetString20, 20);
        for (String s : menuPresetArray20) {
            dancingPose2Lore.add(s);
        }
        dancingPose2Lore.add("  ");
        dancingPose2Lore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
        dancingPose2ItemMeta.setLore(dancingPose2Lore);
        dancingPose2ItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        dancingPose2.setItemMeta(dancingPose2ItemMeta);

        ItemStack helpItem = new ItemStack(Material.BOOK, 1);
        helpItem.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        ItemMeta helpItemItemMeta = helpItem.getItemMeta();
        helpItemItemMeta.setDisplayName("§e§lHow to?");
        ArrayList<String> helpItemLore = new ArrayList<String>();
        helpItemLore.add("  ");
        String menuPresetStringHelp = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.help", player.getLocale());
        String[] menuPresetArrayHelp = ChatPaginator.wordWrap(menuPresetStringHelp, 20);
        for (String s : menuPresetArrayHelp) {
            helpItemLore.add(s);
        }
        helpItemItemMeta.setLore(helpItemLore);
        helpItemItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        helpItem.setItemMeta(helpItemItemMeta);

        ItemStack backItem = new ItemStack(Material.PAPER, 1);
        ItemMeta backItemItemMeta = backItem.getItemMeta();
        backItemItemMeta.setDisplayName("§e§lBack to Main Menu");
        ArrayList<String> backItemLore = new ArrayList<String>();
        backItemLore.add("  ");
        String menuPresetStringBack = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.back", player.getLocale());
        String[] menuPresetArrayBack = ChatPaginator.wordWrap(menuPresetStringBack, 20);
        for (String s : menuPresetArrayBack) {
            backItemLore.add(s);
        }
        backItemLore.add(ChatColor.AQUA + AdvancedArmorStandsMain.getInstance().getMessageString("menu.click_to_use", player.getLocale()));
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

    /**
     * Creates and opens a menu to a player, based on a given menu ID.
     *
     * Available menu IDs:
     * 1 = Main Menu
     * 2 = Basic Settings
     * 3 = Body Parts Menu
     * 4 = Movement Menu (Distance 0.1 Blocks)
     * 5 = Movement Menu (Distance 0.5 Blocks)
     * 6 = Movement Menu (Distance 1 Block)
     * 7 = Preset Poses
     *
     * @param player: Player, The player to open the menu for
     * @param menuID: int, Menu ID
     */
    public void openMenu(Player player, int menuID){

        switch(menuID) {
            case 1:
                Inventory mainMenu = createMainMenu(player);
                player.openInventory(mainMenu);
                break;

            case 2:
                Inventory basicSettingsMenu = createBasicSettingsMenu(player);
                player.openInventory(basicSettingsMenu);
                break;

            case 3:
                Inventory bodyPartsMenu = createBodyPartsMenu(player);
                player.openInventory(bodyPartsMenu);
                break;

            case 4:
                Inventory movementMenuSmall = createMovementMenu(player, 1);
                player.openInventory(movementMenuSmall);
                break;

            case 5:
                Inventory movementMenuMedium = createMovementMenu(player, 2);
                player.openInventory(movementMenuMedium);
                break;

            case 6:
                Inventory movementMenuLarge = createMovementMenu(player, 3);
                player.openInventory(movementMenuLarge);
                break;

            case 7:
                Inventory presetPoseMenu = createPresetPosesMenu(player);
                player.openInventory(presetPoseMenu);
                break;
        }



    }



}
