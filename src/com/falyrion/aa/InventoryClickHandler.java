package com.falyrion.aa;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.util.EulerAngle;


public class InventoryClickHandler implements Listener {

    @EventHandler
    public void onInventoryClick (InventoryClickEvent clickEvent) {

        if (clickEvent.getClickedInventory() != null) {
            if (clickEvent.getCurrentItem() != null) {
                if (clickEvent.getCurrentItem().getType() != Material.AIR) {

                    String inventoryTitle = clickEvent.getView().getTitle();

                    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    // Handle Click Events for Main Menu

                    if (inventoryTitle.equalsIgnoreCase(ChatColor.DARK_GRAY + "Advanced ArmorStands")) {

                        clickEvent.setCancelled(true);
                        Player player = (Player) clickEvent.getWhoClicked();

                        if (clickEvent.getClick().isKeyboardClick()) {
                            player.updateInventory();
                        }

                        if (clickEvent.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
                            player.updateInventory();
                        }

                        if (clickEvent.getClickedInventory() == clickEvent.getView().getTopInventory()) {

                            String itemName = clickEvent.getCurrentItem().getItemMeta().getDisplayName();

                            handleEventMainMenu(itemName, player);
                        }
                    }

                    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    // Handle Click Events for Basic Settings Menu

                    else if (inventoryTitle.equalsIgnoreCase(ChatColor.DARK_GRAY + "Advanced ArmorStands §rBasics")) {

                        clickEvent.setCancelled(true);
                        Player player = (Player) clickEvent.getWhoClicked();

                        if (clickEvent.getClick().isKeyboardClick()) {
                            player.updateInventory();
                        }

                        if (clickEvent.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
                            player.updateInventory();
                        }

                        if (clickEvent.getClickedInventory() == clickEvent.getView().getTopInventory()) {

                            String itemName = clickEvent.getCurrentItem().getItemMeta().getDisplayName();

                            handleEventBasicMenu(itemName, player);
                        }
                    }

                    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    // Handle Click Events for Body Parts Settings Menu

                    else if (inventoryTitle.equalsIgnoreCase(ChatColor.DARK_GRAY + "Advanced ArmorStands §rBody")) {

                        clickEvent.setCancelled(true);
                        Player player = (Player) clickEvent.getWhoClicked();

                        if (clickEvent.getClick().isKeyboardClick()) {
                            player.updateInventory();
                        }

                        if (clickEvent.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
                            player.updateInventory();
                        }

                        if (clickEvent.getClickedInventory() == clickEvent.getView().getTopInventory()) {

                            String itemName = clickEvent.getCurrentItem().getItemMeta().getDisplayName();

                            handleEventBodyPartMenu(itemName, player);
                        }
                    }

                    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    // Handle Click Events for Movement and Rotation Menus

                    else if (inventoryTitle.equalsIgnoreCase(ChatColor.DARK_GRAY + "Advanced ArmorStands §rMove: 0.1")) {

                        clickEvent.setCancelled(true);
                        Player player = (Player) clickEvent.getWhoClicked();

                        if (clickEvent.getClick().isKeyboardClick()) {
                            player.updateInventory();
                        }

                        if (clickEvent.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
                            player.updateInventory();
                        }

                        if (clickEvent.getClickedInventory() == clickEvent.getView().getTopInventory()) {

                            String itemName = clickEvent.getCurrentItem().getItemMeta().getDisplayName();

                            handleEventMovementMenu(itemName, player, (float) 0.1);
                        }
                    }

                    else if (inventoryTitle.equalsIgnoreCase(ChatColor.DARK_GRAY + "Advanced ArmorStands §rMove: 0.5")) {

                        clickEvent.setCancelled(true);
                        Player player = (Player) clickEvent.getWhoClicked();

                        if (clickEvent.getClick().isKeyboardClick()) {
                            player.updateInventory();
                        }

                        if (clickEvent.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
                            player.updateInventory();
                        }

                        if (clickEvent.getClickedInventory() == clickEvent.getView().getTopInventory()) {

                            String itemName = clickEvent.getCurrentItem().getItemMeta().getDisplayName();

                            handleEventMovementMenu(itemName, player, (float) 0.5);
                        }
                    }

                    else if (inventoryTitle.equalsIgnoreCase(ChatColor.DARK_GRAY + "Advanced ArmorStands §rMove: 1")) {

                        clickEvent.setCancelled(true);
                        Player player = (Player) clickEvent.getWhoClicked();

                        if (clickEvent.getClick().isKeyboardClick()) {
                            player.updateInventory();
                        }

                        if (clickEvent.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
                            player.updateInventory();
                        }

                        if (clickEvent.getClickedInventory() == clickEvent.getView().getTopInventory()) {

                            String itemName = clickEvent.getCurrentItem().getItemMeta().getDisplayName();

                            handleEventMovementMenu(itemName, player, (float) 1);
                        }
                    }

                    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    // Handle Click Events for Preset Pose Menu

                    else if (inventoryTitle.equalsIgnoreCase(ChatColor.DARK_GRAY + "Advanced ArmorStands §rPoses")) {

                        clickEvent.setCancelled(true);
                        Player player = (Player) clickEvent.getWhoClicked();

                        if (clickEvent.getClick().isKeyboardClick()) {
                            player.updateInventory();
                        }

                        if (clickEvent.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
                            player.updateInventory();
                        }

                        if (clickEvent.getClickedInventory() == clickEvent.getView().getTopInventory()) {

                            String itemName = clickEvent.getCurrentItem().getItemMeta().getDisplayName();

                            handleEventPresetPoseMenu(itemName, player);
                        }
                    }



                }
            }
        }
    }


    private void handleEventMainMenu(String itemName, Player player) {

        /**
         * Runs an action based on a clicked item. Called by InventoryClickEvent-EventHandler.
         */

        switch(itemName) {
            case "§e§lBasic Settings":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 2);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lBody Settings":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 3);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lMovement and Rotation":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 5);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lPreset Poses":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 7);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lHeads":

            case "§e§lHelp and Info":
                AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                break;

            case "§e§lDocumentation":
                player.closeInventory();
                TextComponent message10 = new TextComponent(">> [Advanced ArmorStands] Click on this message to open a link to the spigot website for a full documentation of this plugin!");
                message10.setColor(net.md_5.bungee.api.ChatColor.YELLOW);
                message10.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.spigotmc.org/resources/advanced-armor-stands.38513/"));
                player.spigot().sendMessage(message10);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lClose":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;
        }
    }


    private void handleEventBasicMenu(String itemName, Player player) {

        /**
         * Runs an action based on a clicked item. Called by InventoryClickEvent-EventHandler.
         */

        switch(itemName) {
            case "§e§lArms":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand) {
                            ArmorStand armorstand = (ArmorStand) entity;
                            if(armorstand.hasArms()) {
                                player.sendMessage(ChatColor.RED + "[AA] A nearby armor stand has already arms!");
                            }
                            else {
                                armorstand.setArms(true);
                                player.sendMessage(ChatColor.GOLD + "[AA] You gave a nearby armor stand arms!");
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lBaseplate invisible":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand) {
                            ArmorStand armorstand = (ArmorStand) entity;
                            if(armorstand.hasBasePlate()) {
                                armorstand.setBasePlate(false);
                                player.sendMessage(ChatColor.GOLD + "[AA] You made the baseplate of a nearby armor stand invisible!");
                            }
                            else {
                                player.sendMessage(ChatColor.RED + "[AA] The baseplate of a nearby armor stand is already invisible!");
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lBaseplate visible":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand) {
                            ArmorStand armorstand = (ArmorStand) entity;
                            if(armorstand.hasBasePlate()) {
                                player.sendMessage(ChatColor.RED + "[AA] The baseplate of a nearby armor stand is already visible!");
                            }
                            else {
                                armorstand.setBasePlate(true);
                                player.sendMessage(ChatColor.GOLD + "[AA] You made the baseplate of a nearby armor stand visible!");
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lGravity off":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand) {
                            ArmorStand armorstand = (ArmorStand) entity;
                            if(armorstand.hasGravity()) {
                                armorstand.setGravity(false);
                                player.sendMessage(ChatColor.GOLD + "[AA] Nearby armor stands are not longer affected by gravity");
                            }
                            else {
                                player.sendMessage(ChatColor.RED + "[AA] A nearby armor stand has already no gravity!");
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lGravity on":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand) {
                            ArmorStand armorstand = (ArmorStand) entity;
                            if(armorstand.hasGravity()) {
                                player.sendMessage(ChatColor.RED + "[AA] A nearby armor stand is already affected by gravity!");
                            }
                            else {
                                armorstand.setGravity(true);
                                player.sendMessage(ChatColor.GOLD + "[AA] Nearby armor stands are now not longer affected by gravity!");
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lInvisible":
                if (player.hasPermission("aa.visible")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand) {
                            ArmorStand armorstand = (ArmorStand) entity;
                            if(armorstand.isVisible()) {
                                armorstand.setVisible(false);
                                player.sendMessage(ChatColor.GOLD + "[AA] A nearby armor stand is now invisible");
                            }
                            else {
                                player.sendMessage(ChatColor.RED + "[AA] A nearby armor stand is already invisible!");
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lVisible":
                if (player.hasPermission("aa.visible")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand) {
                            ArmorStand armorstand = (ArmorStand) entity;
                            if(armorstand.isVisible()) {
                                player.sendMessage(ChatColor.RED + "[AA] A nearby armor stand is already visible!");
                            }
                            else {
                                armorstand.setVisible(true);
                                player.sendMessage(ChatColor.GOLD + "[AA] A nearby armor stand is now visible!");
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lSmall":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand) {
                            ArmorStand armorstand = (ArmorStand) entity;
                            if(armorstand.isSmall()) {
                                player.sendMessage(ChatColor.RED + "[AA] A nearby armor stand is already small!");
                            }
                            else {
                                armorstand.setSmall(true);
                                player.sendMessage(ChatColor.GOLD + "[AA] A nearby armor stand is now small!");
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lNormal Size":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand) {
                            ArmorStand armorstand = (ArmorStand) entity;
                            if(armorstand.isSmall()) {
                                armorstand.setSmall(false);
                                player.sendMessage(ChatColor.GOLD + "[AA] A nearby armor stand is now normal size!");
                            }
                            else {
                                player.sendMessage(ChatColor.RED + "[AA] A nearby armor stand is already normal size!");
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lHide Name":
                if(player.hasPermission("aa.names")) {
                    for(Entity entity : player.getNearbyEntities(0.5, 0.5, 0.5)){
                        if(entity instanceof ArmorStand){
                            if(entity.isCustomNameVisible()){
                                ArmorStand armorstand = (ArmorStand) entity;
                                armorstand.setCustomNameVisible(false);
                                player.sendMessage(ChatColor.GOLD + "[AA] The names of nearby armor stands are now invisble!");
                            }
                            else{
                                player.sendMessage(ChatColor.RED + "[AA] A nearby armor stand has no name to remove!");
                            }
                        }
                    }
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else{
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                        AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lName Help":
                if (player.hasPermission("aa.names")) {
                    player.sendMessage(ChatColor.GOLD + "==============[AA] Name-Help==============");
                    player.sendMessage("§fUse §b/aa name <text> §fto give your armor stand a custom name! This command affects every armor stand in 1 block range around you!");
                    player.sendMessage("§fWrite '&' and a number in front of your text to give it a specific color.");
                    player.sendMessage("  ");
                    player.sendMessage("§fAvailable colors: §00 §11 §22 §33 §44 §55 §66 §77 §88 §99 §aa §bb §cc §dd §ee §ff");
                    player.sendMessage("l §lBold");
                    player.sendMessage("m §mStrikethrough");
                    player.sendMessage("n §nUnderline");
                    player.sendMessage("o §oItalic");
                    player.sendMessage("k Obfuscated §kObfuscated");
                    player.sendMessage("    ");
                    player.sendMessage("Example: '/aa name &3Cool &6&llooking &fNames' will create '§3Cool §6§llooking §fNames' ");
                    player.sendMessage(ChatColor.GOLD + "==========================================");

                    player.closeInventory();
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                }
                break;

            case  "§e§lMake glowing":
                if (player.hasPermission("aa.edit")) {
                    for(Entity entity : player.getNearbyEntities(0.5, 0.5, 0.5)) {
                        if(entity instanceof ArmorStand) {
                            if(entity.isGlowing()) {
                                player.sendMessage(ChatColor.RED + "[AA] A nearby armor stand is already glowing!");
                            } else {
                                ArmorStand armorstand = (ArmorStand) entity;
                                armorstand.setGlowing(true);
                                player.sendMessage(ChatColor.GOLD + "[AA] Added glow effect to a nearby armor stand!");
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else{
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case  "§e§lRemove glow":
                if (player.hasPermission("aa.edit")) {
                    for(Entity entity : player.getNearbyEntities(0.5, 0.5, 0.5)) {
                        if(entity instanceof ArmorStand) {
                            if(entity.isGlowing()) {
                                ArmorStand armorstand = (ArmorStand) entity;
                                armorstand.setGlowing(false);
                                player.sendMessage(ChatColor.GOLD + "[AA] Removed glow effect from a nearby armor stand!");
                            } else {
                                player.sendMessage(ChatColor.RED + "[AA] A nearby armor stand has no glow effect to remove!");
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else{
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lInvulnerable":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(2, 2, 2)) {
                        if (entity instanceof ArmorStand) {
                            ArmorStand armorstand = (ArmorStand) entity;
                            if (armorstand.isInvulnerable()) {
                                armorstand.setInvulnerable(false);
                                player.sendMessage(ChatColor.GOLD + "[AA] A nearby armor stand is not longer invulnerable!");
                            }
                            else{
                                armorstand.setInvulnerable(true);
                                player.sendMessage(ChatColor.GOLD + "[AA] You made nearby armor stands invulnerable!");
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lCustom Name":

            case "§e§lHow to?":
                AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                break;

            case "§e§lBack to Main Menu":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 1);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;
        }
    }


    private void handleEventBodyPartMenu(String itemName, Player player) {

        /**
         * Runs an action based on a clicked item. Called by InventoryClickEvent-EventHandler.
         */

        switch (itemName) {
            case "§e§lHead Pose":

            case "§e§lBody Pose":

            case "§e§lRight Arm Pose":

            case "§e§lLeft Arm Pose":

            case "§e§lRight Leg Pose":

            case "§e§lLeft Leg Pose":

            case "§e§lHow to?":
                AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                break;

            case "§e§lBack to Main Menu":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 1);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;
        }
    }


    private void handleEventMovementMenu(String itemName, Player player, float distance) {

        /**
         * Runs an action based on a clicked item. Called by InventoryClickEvent-EventHandler.
         */

        switch (itemName) {

            case "§e§lBack to Main Menu":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 1);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lDuplicate":
            case "§e§lTeleport":
            case "§e§lHow to?":
            case "§e§lDistance: 0.1 Blocks (Active)":
            case "§e§lDistance: 0.5 Blocks (Active)":
            case "§e§lDistance: 1 Block (Active)":
                AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                break;

            case "§e§lDistance: 1 Block":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 6);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lDistance: 0.5 Blocks":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 5);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lDistance: 0.1 Blocks":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 4);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;


            // Nav Cross

            case "§e§lForward":
                if(player.hasPermission("aa.tp")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand) {
                            ArmorStand armorStand = (ArmorStand) entity;

                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX() + distance,
                                    armorStand.getLocation().getY(), armorStand.getLocation().getZ()
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw);

                            armorStand.teleport(newLocation);

                            player.sendMessage(ChatColor.GOLD + "[AA] You moved a nearby armor stand forward!");
                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                }
                break;

            case "§e§lBackwards":
                if(player.hasPermission("aa.tp")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand) {
                            ArmorStand armorStand = (ArmorStand) entity;

                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX() - distance,
                                    armorStand.getLocation().getY(), armorStand.getLocation().getZ()
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw);

                            armorStand.teleport(newLocation);

                            player.sendMessage(ChatColor.GOLD + "[AA] You moved a nearby armor stand backwards!");
                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                }
                break;

            case "§e§lRight":
                if(player.hasPermission("aa.tp")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand) {
                            ArmorStand armorStand = (ArmorStand) entity;

                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX(),
                                    armorStand.getLocation().getY(), armorStand.getLocation().getZ() + distance
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw);

                            armorStand.teleport(newLocation);

                            player.sendMessage(ChatColor.GOLD + "[AA] You moved a nearby armor stand to the right!");
                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                }
                break;

            case "§e§lLeft":
                if(player.hasPermission("aa.tp")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand) {
                            ArmorStand armorStand = (ArmorStand) entity;

                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX(),
                                    armorStand.getLocation().getY(), armorStand.getLocation().getZ() - distance
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw);

                            armorStand.teleport(newLocation);

                            player.sendMessage(ChatColor.GOLD + "[AA] You moved a nearby armor stand to the left!");
                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                }
                break;


            // Move up and down

            case "§e§lUp":
                if(player.hasPermission("aa.tp")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand) {
                            ArmorStand armorStand = (ArmorStand) entity;

                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX(),
                                    armorStand.getLocation().getY() + distance, armorStand.getLocation().getZ()
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw);

                            armorStand.teleport(newLocation);

                            player.sendMessage(ChatColor.GOLD + "[AA] You moved a nearby armor stand up!");
                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                }
                break;

            case "§e§lDown":
                if(player.hasPermission("aa.tp")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand) {
                            ArmorStand armorStand = (ArmorStand) entity;

                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX(),
                                    armorStand.getLocation().getY() - distance, armorStand.getLocation().getZ()
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw);

                            armorStand.teleport(newLocation);

                            player.sendMessage(ChatColor.GOLD + "[AA] You moved a nearby armor stand down!");
                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                }
                break;


            // Rotate

            case "§e§lRotate left":
                if(player.hasPermission("aa.tp")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand) {
                            ArmorStand armorStand = (ArmorStand) entity;

                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX(),
                                    armorStand.getLocation().getY(), armorStand.getLocation().getZ()
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw + 45);

                            armorStand.teleport(newLocation);

                            player.sendMessage(ChatColor.GOLD + "[AA] You rotated a nearby armor stand to the left!");
                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                }
                break;

            case "§e§lRotate right":
                if(player.hasPermission("aa.tp")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand) {
                            ArmorStand armorStand = (ArmorStand) entity;

                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX(),
                                    armorStand.getLocation().getY(), armorStand.getLocation().getZ()
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw - 45);

                            armorStand.teleport(newLocation);

                            player.sendMessage(ChatColor.GOLD + "[AA] You rotated a nearby armor stand to the right!");
                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to perform this command!");
                }
                break;


        }
    }


    private void setArmorStandPose(Player player, double rightArmRoll, double rightArmYaw, double rightArmPitch,
                                   double leftArmRoll, double leftArmYaw, double leftArmPitch,
                                   double rightLegRoll, double rightLegYaw, double rightLegPitch,
                                   double leftLegRoll, double LeftLegYaw, double llp_yaw,
                                   double headRoll, double headYaw, double headPitch,
                                   double bodyRoll, double bodyYaw, double bodyPitch) {

        /**
         * Helper function for handleEventPresetPoseMenu()
         */

        for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
            if (entity instanceof ArmorStand) {

                ArmorStand armorStand = (ArmorStand) entity;

                // Set general settings
                armorStand.setArms(true);
                armorStand.setBasePlate(false);
                armorStand.setGravity(false);

                // Calculate and set right arm settings
                rightArmRoll = Math.toRadians(rightArmRoll);
                rightArmYaw = Math.toRadians(rightArmYaw);
                rightArmPitch = Math.toRadians(rightArmPitch);
                EulerAngle rightArmEulerAngle = new EulerAngle(rightArmRoll, rightArmYaw, rightArmPitch);
                armorStand.setRightArmPose(rightArmEulerAngle);

                // Calculate and set left arm settings
                leftArmRoll = Math.toRadians(leftArmRoll);
                leftArmYaw = Math.toRadians(leftArmYaw);
                leftArmPitch = Math.toRadians(leftArmPitch);
                EulerAngle leftArmEulerAngle = new EulerAngle(leftArmRoll, leftArmYaw, leftArmPitch);
                armorStand.setLeftArmPose(leftArmEulerAngle);

                // Calculate and set right leg settings
                rightLegRoll = Math.toRadians(rightLegRoll);
                rightLegYaw = Math.toRadians(rightLegYaw);
                rightLegPitch = Math.toRadians(rightLegPitch);
                EulerAngle rightLegEulerAngle = new EulerAngle(rightLegRoll, rightLegYaw, rightLegPitch);
                armorStand.setRightLegPose(rightLegEulerAngle);

                // Calculate and set left leg settings
                leftLegRoll = Math.toRadians(leftLegRoll);
                LeftLegYaw = Math.toRadians(LeftLegYaw);
                llp_yaw = Math.toRadians(llp_yaw);
                EulerAngle leftLegEulerAngle = new EulerAngle(leftLegRoll, LeftLegYaw, llp_yaw);
                armorStand.setLeftLegPose(leftLegEulerAngle);

                // Calculate and set body settings
                bodyRoll = Math.toRadians(bodyRoll);
                bodyYaw = Math.toRadians(bodyYaw);
                bodyPitch = Math.toRadians(bodyPitch);
                EulerAngle bodyEulerAngle = new EulerAngle(bodyRoll, bodyYaw, bodyPitch);
                armorStand.setBodyPose(bodyEulerAngle);

                // Calculate and set head settings
                headRoll = Math.toRadians(headRoll);
                headYaw = Math.toRadians(headYaw);
                headPitch = Math.toRadians(headPitch);
                EulerAngle headEulerAngle = new EulerAngle(headRoll, headYaw, headPitch);
                armorStand.setHeadPose(headEulerAngle);

                // Send success message to player
                player.sendMessage(ChatColor.GOLD + "[AA] Modified a nearby armor stand!");
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
        }
    }



    private void handleEventPresetPoseMenu(String itemName, Player player) {

        /**
         * Runs an action based on a clicked item. Called by InventoryClickEvent-EventHandler.
         */

        switch (itemName) {
            case "§e§lDefault 1":
                setArmorStandPose(player, 345, 0, 10, 350, 0, 350, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lDefault 2":
                setArmorStandPose(player, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lWalking 1":
                setArmorStandPose(player, 345, 0, 10, 350, 0, 350, 340, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lWalking 2":
                setArmorStandPose(player, 300, 40, 350, 20, 0, 350, 10, 0, 0, 350, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lSitting":
                setArmorStandPose(player, 345, 0, 10, 350, 0, 350, 280, 20, 0, 280, 340, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lWaving":
                setArmorStandPose(player, 220, 20, 0, 350, 0, 350, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lGreeting 1":
                setArmorStandPose(player, 260, 20, 0, 260, 340, 0, 340, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lGreeting 2":
                setArmorStandPose(player, 240, 50, 0, 240, 320, 0, 10, 0, 0, 350, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lGreeting 3":
                setArmorStandPose(player, 260, 10, 0, 260, 350, 0, 320, 0, 0, 10, 0, 0, 340, 0, 350, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lCheering 1":
                setArmorStandPose(player, 220, 20, 0, 220, 340, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lCheering 2":
                setArmorStandPose(player, 250, 60, 0, 20, 10, 0, 10, 0, 0, 350, 0, 0, 340, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lBuilder":
                setArmorStandPose(player, 340, 320, 0, 320, 40, 0, 340, 0, 0, 20, 0, 0, 20, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lSword Fighter":
                setArmorStandPose(player, 300, 320, 0, 300, 40, 0, 0, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lFencing":
                setArmorStandPose(player, 290, 0, 270, 20, 0, 230, 0, 30, 0, 340, 0, 340, 20, 30, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lArcher":
                setArmorStandPose(player, 270, 350, 0, 280, 50, 0, 340, 0, 10, 20, 0, 350, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lPresenting Item":
                setArmorStandPose(player, 280, 330, 0, 10, 0, 350, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lHolding Item above Head":
                setArmorStandPose(player, 250, 320, 0, 250, 35, 0, 10, 0, 0, 350, 0, 0, 340, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lPointing right up":
                setArmorStandPose(player, 260, 60, 0, 20, 20, 0, 10, 340, 0, 10, 30, 0, 0, 70, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lFisherman":
                setArmorStandPose(player, 300, 320, 0, 300, 40, 0, 280, 20, 0, 280, 340, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lDancing 1":
                setArmorStandPose(player, 14, 0, 110, 20, 0, 250, 15, 30, 0, 330, 0, 110, 350, 20, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lDancing 2":
                setArmorStandPose(player, 14, 0, 110, 20, 0, 250, 250, 330, 0, 15, 330, 0, 350, 350, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lHow to?":
                AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                break;

            case "§e§lBack to Main Menu":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 1);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;
        }
    }


}
