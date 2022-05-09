package com.falyrion.aa;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.ArmorStand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPlaceEvent;
import org.bukkit.persistence.PersistentDataType;

public class PlacedHandler implements Listener {

    @EventHandler
    public void onArmorStandPlace(EntityPlaceEvent event) {
        if (event.getEntity() instanceof  ArmorStand) {
            ArmorStand armorstand = (ArmorStand) event.getEntity();
            armorstand.setArms(true);
            if (!AdvancedArmorStandsMain.getInstance().isOwnershipOfPlacedArmorStand()) {
                return;
            }
            armorstand.getPersistentDataContainer().set(new NamespacedKey(AdvancedArmorStandsMain.getInstance(),
                    AdvancedArmorStandsMain.ARMOR_STAND_OWNER_KEY), PersistentDataType.STRING,
                    event.getPlayer().getUniqueId().toString());
            String uuidOfPlayer = armorstand.getPersistentDataContainer().get(
                    new NamespacedKey(AdvancedArmorStandsMain.getInstance(),
                            AdvancedArmorStandsMain.ARMOR_STAND_OWNER_KEY),
                    PersistentDataType.STRING);
            Bukkit.getLogger().info(uuidOfPlayer);
        }
    }

}
