package commands;

import com.falyrion.aa.AdvancedArmorStandsMain;
import com.falyrion.aa.AdvancedArmorStandsMain.CommandInterface;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;


public class CmdSetRotation implements CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player p = (Player) sender;

        if (p.hasPermission("aa.edit")) {

            if (args.length == 4) {

                Float f = Float.parseFloat(args[3]);

                if (f <= 100) {

                    Integer i4 = Integer.parseInt(args[2]);
                    if (i4 == 45 || i4 == 90 || i4 == 135 || i4 == 180 || i4 == 225 || i4 == 270 || i4 == 315 || i4 == 360) {

                        if (args[1].equalsIgnoreCase("right")) {
                            for (Entity entity : p.getNearbyEntities(f, f, f)) {
                                if(entity instanceof ArmorStand) {
                                    ArmorStand armorstand = (ArmorStand) entity;
                                    Location loc = armorstand.getLocation();
                                    Float ayaw = armorstand.getLocation().getYaw();
                                    loc.setYaw(ayaw + i4);
                                    armorstand.teleport(loc);
                                }
                            }

                            p.sendMessage("§6[AA] Modified all armor stands in " + f + " blocks range!");

                            AdvancedArmorStandsMain.getInstance().playSoundTeleport(p);
                        }
                        if (args[1].equalsIgnoreCase("left")) {
                            for (Entity entity : p.getNearbyEntities(f, f, f)) {
                                if(entity instanceof ArmorStand) {
                                    ArmorStand armorstand = (ArmorStand) entity;
                                    Location loc = armorstand.getLocation();
                                    Float ayaw = armorstand.getLocation().getYaw();
                                    loc.setYaw(ayaw - i4);
                                    armorstand.teleport(loc);
                                }
                            }
                            p.sendMessage("§6[AA] Modified all armor stands in " + f + " blocks range!");

                            AdvancedArmorStandsMain.getInstance().playSoundTeleport(p);
                        }
                        if (!args[1].equalsIgnoreCase("right") && !args[1].equalsIgnoreCase("left")) {
                            p.sendMessage("§c[AA] This command was not used correctly! Please use §b/aa rotate <right/left> <rotation> <range>§c!");
                        }


                    }
                    else {
                        p.sendMessage("§c[AA] This command was not used correctly! Please use §b/aa rotate <right/left> <rotation> <range>§c! ");
                        p.sendMessage("§c[AA] Note: Available degrees for the rotation are 45; 90; 135; 180; 225; 270; 315 and 360!");
                    }

                }

                if (f > 100) {
                    p.sendMessage("§c[AA] Please do not use higher values than 100 for the range!");
                }

            }

            else {
                p.sendMessage("§c[AA] This command was not used correctly! Please use §b/aa rotate <right/left> <rotation> <range>§c!");
                p.sendMessage("§c[AA] Note: Available degrees for the rotation are 45; 90; 135; 180; 225; 270; 315 and 360!");
            }

        }
        else {
            p.sendMessage("§c[AA] Sorry, but you have no permission to use this command!");
        }

        return true;
    }

}