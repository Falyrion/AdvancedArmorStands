package commands;

import com.falyrion.aa.AdvancedArmorStandsMain;
import com.falyrion.aa.AdvancedArmorStandsMain.CommandInterface;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.UUID;


public class CmdReciveCustomHead implements CommandInterface {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player player = (Player) sender;

        if (player.hasPermission("aa.head")) {

            if (args.length == 3) {

                String playerName = (args[1]);
                int headAmount = Integer.parseInt(args[2]);

                if (headAmount > 64) {
                    headAmount = 64;
                }

                String message = AdvancedArmorStandsMain.getInstance().getMessageString("head_loading", player.getLocale());
                player.sendMessage(ChatColor.GOLD + message);

                // Get texture value
                String textureValue = getTexture(playerName);

                // Check for success
                if (textureValue == null) {
                    String errorMessage = AdvancedArmorStandsMain.getInstance().getMessageString("head_error_01", player.getLocale());
                    player.sendMessage(ChatColor.RED + errorMessage);
                }

                // Create Itemstack Playerhead
                final ItemStack myHead = new ItemStack(Material.PLAYER_HEAD, headAmount);

                // Get Item Meta
                SkullMeta headMeta = (SkullMeta) myHead.getItemMeta();

                assert headMeta != null;

                // Set Game Profile
                GameProfile profile = new GameProfile(UUID.randomUUID(), "Head_" + playerName);
                profile.getProperties().put("textures", new Property("textures", textureValue));

                try {
                    Field profileField = headMeta.getClass().getDeclaredField("profile");
                    profileField.setAccessible(true);
                    profileField.set(headMeta, profile);
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                }

                // Set Display Name
                headMeta.setDisplayName(playerName);

                // Set Itemmeta to head
                myHead.setItemMeta(headMeta);

                // Add head to inventory
                player.getInventory().addItem(myHead);

                String sucessMessage = AdvancedArmorStandsMain.getInstance().getMessageString("head_success", player.getLocale()).replace("%s", playerName + " * " + headAmount);
                player.sendMessage(ChatColor.GOLD + sucessMessage);

                for (Player onlinePlayers : Bukkit.getOnlinePlayers()) {
                    if (onlinePlayers.hasPermission("aa.adminbroadcast")) {
                        onlinePlayers.sendMessage("§7§o[Advanced ArmorStands: Given head of " + playerName + " * " + headAmount + " to " + player.getName() + "]");
                    }
                }


            } else {

                String message = AdvancedArmorStandsMain.getInstance().getMessageString("wrong_command_usage", player.getLocale());
                player.sendMessage(ChatColor.RED + message + ChatColor.AQUA + " /aa head <playername> <amount>");

            }

        } else {

            String message = AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale());
            player.sendMessage(ChatColor.RED + message);

        }

        return true;

    }


    public String getTexture (String name) {
        try {
            //Get UUID from playername from mojang website
            URL url_0 = new URL("https://api.mojang.com/users/profiles/minecraft/" + name);
            InputStreamReader reader_0 = new InputStreamReader(url_0.openStream());
            String uuid = new JsonParser().parse(reader_0).getAsJsonObject().get("id").getAsString();

            //Get skin of player from UUID from mojang website
            URL url_1 = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + uuid + "?unsigned=false");
            InputStreamReader reader_1 = new InputStreamReader(url_1.openStream());
            JsonObject textureProperty = new JsonParser().parse(reader_1).getAsJsonObject().get("properties").getAsJsonArray().get(0).getAsJsonObject();
            String texture = textureProperty.get("value").getAsString();

            return texture;

        } catch (IOException | IllegalStateException e) {

            /*
            System.err.println("[Advanced Armorstands] Error report");
            e.printStackTrace();
            System.err.println("[Advanced Armorstands] Could not get skin data for player head from session servers! Try later again or check if the players name was spelled correctly.");
            */

            return null;
        }
    }



}