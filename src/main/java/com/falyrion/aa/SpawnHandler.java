package com.falyrion.aa;

import org.bukkit.entity.ArmorStand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class SpawnHandler implements Listener {

    @EventHandler
    public void onArmorStandSpawn(EntitySpawnEvent event) {
        if (event.getEntity() instanceof  ArmorStand armorstand) {
            armorstand.setArms(true);
        }
    }

}
