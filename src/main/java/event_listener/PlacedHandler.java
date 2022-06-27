package event_listener;

import com.falyrion.aa.AdvancedArmorStandsMain;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.ArmorStand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPlaceEvent;
import org.bukkit.persistence.PersistentDataType;

public class PlacedHandler implements Listener {

    /**
     * Detects if an armor stand has spawned in the world, checks if it was spawned by a player and set its data container.
     * This event will be enabled in the onEnable-Method in the main class.
     *
     * @param event: EntityPlaceEvent
     */

    @EventHandler
    public void onArmorStandPlace(EntityPlaceEvent event) {
        if (event.getEntity() instanceof ArmorStand armorstand) {

            // Set arms
            if (AdvancedArmorStandsMain.getInstance().getSettings().spawnWithArms() == 2) {
                armorstand.setArms(true);
            }

            // Check if ownership is enabled
            if (!AdvancedArmorStandsMain.getInstance().getSettings().ownershipOfPlacedArmorStand()) {
                return;
            }

            // Check if was placed by a player
            if (event.getPlayer() != null) {
                if(AdvancedArmorStandsMain.getInstance().getSettings().ownershipOfPlacedArmorStand()) {
                    // Only if the config `ownershipOfPlacedArmorStand` is true
                    armorstand.getPersistentDataContainer().set(
                            new NamespacedKey(AdvancedArmorStandsMain.getInstance(),
                            AdvancedArmorStandsMain.ARMOR_STAND_OWNER_KEY),
                            PersistentDataType.STRING,
                            event.getPlayer().getUniqueId().toString()
                    );
                }

            }

        }
    }

}
