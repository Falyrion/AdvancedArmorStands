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
        if (event.getEntity() instanceof ArmorStand armorstand) {
            armorstand.setArms(true);
            if (!AdvancedArmorStandsMain.getInstance().isOwnershipOfPlacedArmorStand()) {
                return;
            }
            // only if the config `ownershipOfPlacedArmorStand` is true
            armorstand.getPersistentDataContainer().set(new NamespacedKey(AdvancedArmorStandsMain.getInstance(),
                    AdvancedArmorStandsMain.ARMOR_STAND_OWNER_KEY), PersistentDataType.STRING,
                    event.getPlayer().getUniqueId().toString());
        }
    }

}
