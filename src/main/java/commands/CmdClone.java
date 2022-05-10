package commands;

import com.falyrion.aa.AdvancedArmorStandsMain;
import com.falyrion.aa.AdvancedArmorStandsMain.CommandInterface;
import org.bukkit.ChatColor;
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

        Player player = (Player) sender;

        if(player.hasPermission("aa.clone")){

            if(args.length == 4){

                Float coordsX = Float.parseFloat(args[1]);
                Float coordsY = Float.parseFloat(args[2]);
                Float coordsZ = Float.parseFloat(args[3]);

                for(Entity entity : player.getNearbyEntities(0.5, 0.5, 0.5)){
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

                        Location loc = new Location(player.getWorld(), coordsX + 0.5, coordsY, coordsZ + 0.5);
                        Float ayaw = armorstand.getLocation().getYaw();
                        loc.setYaw(ayaw);

                        // Check for gamemode of the player

                        if(player.getGameMode() == GameMode.SURVIVAL){
                            if(player.getInventory().containsAtLeast(new ItemStack(Material.ARMOR_STAND), 1)){
                                player.getInventory().removeItem(new ItemStack(Material.ARMOR_STAND, 1));

                                ArmorStand armorstand2 = (ArmorStand) player.getWorld().spawnEntity(loc, EntityType.ARMOR_STAND);

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

                                String message = AdvancedArmorStandsMain.getInstance().getMessageString("duplicate_success_survival", player.getLocale());
                                player.sendMessage(ChatColor.GOLD + message + ChatColor.AQUA + " " + coordsX + " " + coordsY + " " + coordsZ);

                                AdvancedArmorStandsMain.getInstance().playSoundTeleport(player);

                            } else {

                                String message = AdvancedArmorStandsMain.getInstance().getMessageString("duplicate_error_01", player.getLocale());
                                player.sendMessage(ChatColor.RED + message);

                            }
                        }

                        if(player.getGameMode() == GameMode.CREATIVE){
                            ArmorStand armorstand2 = (ArmorStand) player.getWorld().spawnEntity(loc, EntityType.ARMOR_STAND);

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

                            String message = AdvancedArmorStandsMain.getInstance().getMessageString("duplicate_success_creative", player.getLocale());
                            player.sendMessage(ChatColor.GOLD + message + ChatColor.AQUA + " " + coordsX + " " + coordsY + " " + coordsZ);

                            AdvancedArmorStandsMain.getInstance().playSoundTeleport(player);
                        }
                        if(!(player.getGameMode() == GameMode.SURVIVAL) && !(player.getGameMode() == GameMode.CREATIVE)){
                            player.sendMessage( ChatColor.RED + "[AA] You need to be in survival or creative mode to duplicate an armor stand!");
                        }
                    }
                }


            }

            else{

                String message = AdvancedArmorStandsMain.getInstance().getMessageString("wrong_command_usage", player.getLocale());
                player.sendMessage(ChatColor.RED + message + ChatColor.AQUA + " /aa clone <x> <y> <z>");

            }

        }
        else{

            String message = AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale());
            player.sendMessage(ChatColor.RED + message);

        }

        return true;
    }

}
