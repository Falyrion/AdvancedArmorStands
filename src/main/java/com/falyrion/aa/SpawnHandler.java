package com.falyrion.aa;

import org.bukkit.entity.ArmorStand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class SpawnHandler implements Listener {
    
    /**
     * Detects if an armor stand has spawned in the world (for example placed by a player) and set its arms to true
     * This event will be enabled in the onEnable-Method in the main class.
     *
     * @param event: CreatureSpawnEvent
     */

    @EventHandler
    public void onArmorStandSpawn(EntitySpawnEvent event) {
        if (event.getEntity() instanceof ArmorStand armorstand) {
            armorstand.setArms(true);
        }
    }

}
