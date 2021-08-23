package commands;

import com.falyrion.aa.AdvancedArmorStandsMain;
import com.falyrion.aa.AdvancedArmorStandsMain.CommandInterface;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.EulerAngle;


public class CmdClone implements CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player p = (Player) sender;

        if(p.hasPermission("aa.clone")){

            if(args.length == 4){

                Float i = Float.parseFloat(args[1]);
                Float i2 = Float.parseFloat(args[2]);
                Float i3 = Float.parseFloat(args[3]);

                for(Entity entity : p.getNearbyEntities(0.5, 0.5, 0.5)){
                    if(entity instanceof ArmorStand){
                        ArmorStand armorstand = (ArmorStand) entity;

                        Boolean arms = armorstand.hasArms();
                        Boolean base = armorstand.hasBasePlate();
                        Boolean gravity = armorstand.hasGravity();
                        Boolean size = armorstand.isSmall();
                        EulerAngle ea = armorstand.getBodyPose();
                        EulerAngle ea2 = armorstand.getHeadPose();
                        EulerAngle ea3 = armorstand.getRightArmPose();
                        EulerAngle ea4 = armorstand.getLeftArmPose();
                        EulerAngle ea5 = armorstand.getRightLegPose();
                        EulerAngle ea6 = armorstand.getLeftLegPose();

                        Location loc = new Location(p.getWorld(), i + 0.5, i2, i3 + 0.5);
                        Float ayaw = armorstand.getLocation().getYaw();
                        loc.setYaw(ayaw);

                        // Check for gamemode of the player

                        if(p.getGameMode() == GameMode.SURVIVAL){
                            if(p.getInventory().containsAtLeast(new ItemStack(Material.ARMOR_STAND), 1)){
                                p.getInventory().removeItem(new ItemStack(Material.ARMOR_STAND, 1));

                                ArmorStand armorstand2 = (ArmorStand) p.getWorld().spawnEntity(loc, EntityType.ARMOR_STAND);

                                armorstand2.setArms(arms);
                                armorstand2.setBasePlate(base);
                                armorstand2.setGravity(gravity);
                                armorstand2.setSmall(size);
                                armorstand2.setBodyPose(ea);
                                armorstand2.setHeadPose(ea2);
                                armorstand2.setRightArmPose(ea3);
                                armorstand2.setLeftArmPose(ea4);
                                armorstand2.setRightLegPose(ea5);
                                armorstand2.setLeftLegPose(ea6);

                                p.sendMessage("§6[AA] You duplicated a nearby armor stand to the location: §b" + i + " " + i2 + " " + i3 + "§6. Removed 1 armor stand from your inventory.");

                                AdvancedArmorStandsMain.getInstance().playSoundTeleport(p);
                            }
                            else p.sendMessage("§c[AA] You need at least 1 armor stand in your inventory to duplicate a existing one!");
                        }

                        if(p.getGameMode() == GameMode.CREATIVE){
                            ArmorStand armorstand2 = (ArmorStand) p.getWorld().spawnEntity(loc, EntityType.ARMOR_STAND);

                            armorstand2.setArms(arms);
                            armorstand2.setBasePlate(base);
                            armorstand2.setGravity(gravity);
                            armorstand2.setSmall(size);
                            armorstand2.setBodyPose(ea);
                            armorstand2.setHeadPose(ea2);
                            armorstand2.setRightArmPose(ea3);
                            armorstand2.setLeftArmPose(ea4);
                            armorstand2.setRightLegPose(ea5);
                            armorstand2.setLeftLegPose(ea6);

                            armorstand2.setHelmet(armorstand.getHelmet());
                            armorstand2.setChestplate(armorstand.getChestplate());
                            armorstand2.setLeggings(armorstand.getLeggings());
                            armorstand2.setBoots(armorstand.getBoots());
                            armorstand2.setItemInHand(armorstand.getItemInHand());

                            p.sendMessage("§6[AA] You duplicated a nearby armor stand to the location: §b" + i + " " + i2 + " " + i3 + "§6!");

                            AdvancedArmorStandsMain.getInstance().playSoundTeleport(p);
                        }
                        if(!(p.getGameMode() == GameMode.SURVIVAL) && !(p.getGameMode() == GameMode.CREATIVE)){
                            p.sendMessage("§c[AA] You need to be in survival or creative mode to duplicate an armor stand!");
                        }
                    }
                }


            }

            else{
                p.sendMessage("§c[AA] This command was not used correctly! Please use §b/aa clone <x> <y> <z>");
            }

        }
        else{
            p.sendMessage("§c[AA] Sorry, but you have no permission to use this command!");
        }

        return true;
    }

}
