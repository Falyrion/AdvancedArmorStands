package commands;

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
                int i = Integer.parseInt(args[2]);

                if (i > 64) {

                    player.sendMessage(ChatColor.RED +"[AA] You can not get more than 64 heads at once!");

                } else {

                    player.sendMessage(ChatColor.GOLD + "[AA] Generating head... This may take some moments!");

                    // Get texture value
                    String textureValue = getTexture(playerName);

                    // Create Itemstack Playerhead
                    final ItemStack myHead = new ItemStack(Material.PLAYER_HEAD, i);

                    // Get Item Meta
                    SkullMeta headMeta = (SkullMeta) myHead.getItemMeta();

                    assert headMeta != null;

                    // Set Game Profile
                    GameProfile profile = new GameProfile(UUID.randomUUID(), null);
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

                    player.sendMessage(ChatColor.GOLD + "[AA] Added head of " + ChatColor.GOLD + playerName + " * " + i + ChatColor.GOLD + " to your inventory!");

                    for(Player onlinePlayers : Bukkit.getOnlinePlayers()){
                        if(onlinePlayers.hasPermission("aa.adminbroadcast")){
                            onlinePlayers.sendMessage("§7§o[Advanced ArmorStands: Given head of " + playerName + " * " + i + " to " + player.getName() + "]");
                        }
                    }
                }

            } else {
                player.sendMessage(ChatColor.RED + "[AA] This command was not used correctly! Please use " + ChatColor.AQUA + "/aa head <player_name> <amount>");
            }

        } else {
            player.sendMessage(ChatColor.RED + "[AA] Sorry, but you have no permission to use this command!");
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