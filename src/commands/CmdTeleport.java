package commands;

import com.falyrion.aa.AdvancedArmorStandsMain;
import com.falyrion.aa.AdvancedArmorStandsMain.CommandInterface;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;


public class CmdTeleport implements CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player p = (Player) sender;

        if (p.hasPermission("aa.tp")) {

            if (args.length == 4) {

                Float i = Float.parseFloat(args[1]);
                Float i2 = Float.parseFloat(args[2]);
                Float i3 = Float.parseFloat(args[3]);

                for (Entity entity : p.getNearbyEntities(0.5, 0.5, 0.5)) {
                    if (entity instanceof ArmorStand) {

                        ArmorStand armorstand = (ArmorStand) entity;
                        Location loc = new Location(p.getWorld(), i, i2, i3);
                        Float ayaw = armorstand.getLocation().getYaw();
                        loc.setYaw(ayaw);
                        armorstand.teleport(loc);
                        p.sendMessage("§6[AA] You teleported an armor stand to " + i + " " + i2 + " " + i3 + "!");
                        AdvancedArmorStandsMain.getInstance().playSoundTeleport(p);
                    }
                }
            }
            if (args.length == 5) {

                Float i = Float.parseFloat(args[1]);
                Float i2 = Float.parseFloat(args[2]);
                Float i3 = Float.parseFloat(args[3]);
                Integer i4 = Integer.parseInt(args[4]);

                if (i4 == 45 || i4 == 90 || i4 == 135 || i4 == 180 || i4 == 225 || i4 == 270 || i4 == 315 || i4 == 360) {
                    for (Entity entity : p.getNearbyEntities(0.5, 0.5, 0.5)) {
                        if (entity instanceof ArmorStand) {

                            ArmorStand armorstand = (ArmorStand) entity;
                            Location loc = new Location(p.getWorld(), i, i2, i3);
                            Float ayaw = armorstand.getLocation().getYaw();
                            loc.setYaw(ayaw + i4);
                            armorstand.teleport(loc);
                            p.sendMessage("§6[AA] You teleported an armor stand to " + i + " " + i2 + " " + i3 + "!");
                            AdvancedArmorStandsMain.getInstance().playSoundTeleport(p);
                        }
                    }
                }
                else {
                    p.sendMessage("§c[AA] This command was not used correctly! Please use §b/aa tp <x-coord> <y-coord> <z-coord> [rotation]");
                }

            }

            if (!(args.length == 4) && !(args.length == 5)) {
                p.sendMessage("§c[AA] This command was not used correctly! Please use §b/aa tp <x-coord> <y-coord> <z-coord> [rotation]");
            }
        }
        else {
            p.sendMessage("§c[AA] Sorry, but you have no permission to use this command!");
        }

        return true;
    }

}