package com.falyrion.aa;

import org.bukkit.entity.ArmorStand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class SpawnHandler implements Listener {

    /**
     * Detects if an armor stand has spawned in the world (for example placed by a player) and set its arms to true
     *
     * @param event: CreatureSpawnEvent
     */
    @EventHandler
    public void onArmorStandSpawn (CreatureSpawnEvent event) {
        if (event.getEntity() instanceof ArmorStand) {

            ArmorStand armorstand = (ArmorStand) event.getEntity();

            armorstand.setArms(true);

        }

    }

}
