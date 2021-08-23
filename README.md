# Advanced Armor Stands
 
This is a Plugin for CraftBukkit/ Spigot. Download from [https://www.spigotmc.org/resources/advanced-armor-stands.38513/](https://www.spigotmc.org/resources/advanced-armor-stands.38513/)


# Overview

Access all the hidden vanilla armor stands options with an easy menu. Perfect for decoration on survival servers and builders!

### Features

- Enable arms, invisible baseplates, no gravity and much more for your armorstand.
- Arange all body parts in a fancy pose you want. Or choose one of the various preset poses!
- Colorable Names! 
- Invisible Armor Stands! Perfect for floating letters or items!
- Player Heads! Get the head of every player you want and place it on your Armor Stand (this feature can be fully disabled!)!
- Invulnerable Armor Stands! Save from accidental punches!

### How to use?

Just stand next to the armor stand you want to modify and type the command `/aa` in chat! A menu will pop up with all available options!

# Depencies

This Plugin was made for Spigot v.1.17.x

# Commands and Permissions

Overview over all Commands available in this plugin. All Permissions are set to `true` by default.

| Command                                      | Permission | Description                      |
| -------------------------------------------- |:----------:|:--------------------------------:|
| /aa                                          | aa.edit    | Opens the Menu. Some functions inside the menu depend on other permission nodes.|
| /aa help <page-number>                       |  aa.edit   | Shows the help page |
| /aa info                                     |  NONE      | Shows general info about this plugin (version number, etc). |
| /aa arms <on/off> <range>                    |  aa.edit   | Use "on" to give all armor stands arms. Use "off" to remove arms of all armor stands. <range> defines the range around the player in which armor stands are affected. |
| /aa base <on/off> <range>                    |  aa.edit   | Use "on" to give all armor stands a baseplate. Use "off" to remove the baseplate of all armor stands. <range> defines the range around the player in which armor stands are affected. |
| /aa gravity <on/off> <range>                 |  aa.edit   | Use "on" to give all armor stands gravity. Use "off" to remove gravity from all armor stands. <range> defines the range around the player in which armor stands are affected. |
| /aa visible <on/off> <range>                 |  aa.edit   | Use "on" to make all armor stands visible. Use "off" to make all armor stands invisible. <range> defines the range around the player in which armor stands are affected. |
| /aa size <normal/small> <range>              |  aa.edit   | Use "normal" to make all armor stands normal sized. Use "small" to make all armor stands smalls. <range> defines the range around the player in which armor stands are affected. |  
| /aa hp <pitch> <jaw> <roll> <range>           |  aa.edit   | Adjusts the head pose of all armor stands in a radius of <range> blocks around the player. |
| /aa bp <pitch> <jaw> <roll> <range>           |  aa.edit   | Adjusts the body pose of all armor stands in a radius of <range> blocks around the player. |
| /aa rap <pitch> <jaw> <roll> <range>          |  aa.edit   | Adjusts the right arm pose of all armor stands in a radius of <range> blocks around the player. |
| /aa lap <pitch> <jaw> <roll> <range>          |  aa.edit   | Adjusts the left arm pose of all armor stands in a radius of <range> blocks around the player. | 
| /aa rlp <pitch> <jaw> <roll> <range>          |  aa.edit   | Adjusts the right leg pose of all armor stands in a radius of <range> blocks around the player. |
| /aa llp <pitch> <jaw> <roll> <range>          |  aa.edit   | Adjusts the left leg pose of all armor stands in a radius of <range> blocks around the player. |
| /aa rap <pitch> <jaw> <roll> <range>          |  aa.edit   | Adjusts the right arm pose of all armor stands in a radius of <range> blocks around the player. |
| /aa lap <pitch> <jaw> <roll> <range>          |  aa.edit   | Adjusts the left arm pose of all armor stands in a radius of <range> blocks around the player. | 
| /aa stats                                     |  aa.edit   | Shows all angles of a nearby armor stand |
| /aa name <name>                               |  aa.names  | Gives all armor stands in 1 block range a colorable name. |
| /aa hidenames <range>                         |  aa.names  | Removes names from all armor stands in a radius of <range> blocks around the player. |
| /aa lap <pitch> <jaw> <roll> <range>          |  aa.edit   | Adjusts the left arm pose of all armor stands in a radius of <range> blocks around the player. | 
| /aa tp <x> <y> <z>                            |  aa.tp     |  Teleports a nearby armor stand to the coords <x> <y> <z>. The coords are the exact coords. To teleport a armor stand in the middle of a block use x.5 and z.5. | 
| /aa clone <x> <y> <z>                         |  aa.clone  | Duplicates a nearby armor stand to the coords <x> <y> <z>. It copies all settings but names, visibility or equipment. In creative mode equipment will be copied. |
| /aa name <name>                               |  aa.names  | Gives all armor stands in 1 block range a colorable name. |
| /aa hidenames <range>                         |  aa.names  | Removes names from all armor stands in a radius of <range> blocks around the player. |
| /aa lap <pitch> <jaw> <roll> <range>          |  aa.edit   | Adjusts the left arm pose of all armor stands in a radius of <range> blocks around the player. |
| /aa head <player-name> <amount>               |  aa.head   | Gives the head of a player. Use <player-name> for the player name and <amount> for the amount of heads you want.|
| /aa give                                      |  NONE      | Adds an armor stand to your inventory. Player needs creative mode to use this. | 

