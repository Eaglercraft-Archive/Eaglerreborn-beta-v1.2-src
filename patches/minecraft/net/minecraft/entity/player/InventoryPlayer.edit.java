
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> INSERT  3 : 4  @  3

+ 

> DELETE  3  @  3 : 4

> INSERT  11 : 13  @  11

+ import net.zxmushroom63.plugins.BaseData;
+ import net.zxmushroom63.plugins.PluginData;

> CHANGE  1 : 25  @  1 : 2

~ /**
~  * + This portion of EaglercraftX contains deobfuscated Minecraft 1.8 source
~  * code.
~  * 
~  * Minecraft 1.8.8 bytecode is (c) 2015 Mojang AB. "Do not distribute!" Mod
~  * Coder Pack v9.18 deobfuscation configs are (c) Copyright by the MCP Team
~  * 
~  * EaglercraftX 1.8 patch files are (c) 2022-2023 LAX1DUDE. All Rights Reserved.
~  * 
~  * WITH THE EXCEPTION OF PATCH FILES, MINIFIED JAVASCRIPT, AND ALL FILES
~  * NORMALLY FOUND IN AN UNMODIFIED MINECRAFT RESOURCE PACK, YOU ARE NOT ALLOWED
~  * TO SHARE, DISTRIBUTE, OR REPURPOSE ANY FILE USED BY OR PRODUCED BY THE
~  * SOFTWARE IN THIS REPOSITORY WITHOUT PRIOR PERMISSION FROM THE PROJECT AUTHOR.
~  * 
~  * NOT FOR COMMERCIAL OR MALICIOUS USE
~  * 
~  * (please read the 'LICENSE' file this repo's root directory for more info)
~  * 
~  */
~ public class InventoryPlayer extends PluginData implements IInventory {
~ 	/**
~ 	 * + An array of 36 item stacks indicating the main player inventory (including
~ 	 * the visible bar).
~ 	 */

> INSERT  1 : 4  @  1

+ 	/**
+ 	 * + An array of 4 item stacks containing the currently worn armor pieces.
+ 	 */

> INSERT  10 : 64  @  10

+ 	public void loadPluginData(BaseData data) {
+ 		BaseData[] parItemStacks = data.getBaseDataArr("mainInventory");
+ 		for (int i = 0; i < parItemStacks.length && i < mainInventory.length; i++) {
+ 			if (mainInventory[i] != null) {
+ 				mainInventory[i].loadPluginData(parItemStacks[i]);
+ 			} else if (parItemStacks[i] != null && parItemStacks[i].getRef() instanceof ItemStack) {
+ 				mainInventory[i] = (ItemStack) parItemStacks[i].getRef();
+ 			}
+ 		}
+ 
+ 		BaseData[] parArmorStacks = data.getBaseDataArr("armorInventory");
+ 		for (int i = 0; i < parArmorStacks.length && i < armorInventory.length; i++) {
+ 			if (armorInventory[i] != null) {
+ 				armorInventory[i].loadPluginData(parArmorStacks[i]);
+ 			} else if (parItemStacks[i] != null && parItemStacks[i].getRef() instanceof ItemStack) {
+ 				armorInventory[i] = (ItemStack) parItemStacks[i].getRef();
+ 			}
+ 		}
+ 		currentItem = data.getInt("currentItem");
+ 		inventoryChanged = data.getBoolean("inventoryChanged");
+ 	}
+ 
+ 	public PluginData makePluginData() {
+ 		PluginData data = new PluginData();
+ 		data.setCallbackObject("getRef", () -> {
+ 			return this;
+ 		});
+ 		PluginData[] parBaseDatas = new PluginData[mainInventory.length];
+ 		for (int i = 0; i < mainInventory.length; i++) {
+ 			if (mainInventory[i] != null) {
+ 				parBaseDatas[i] = mainInventory[i].makePluginData();
+ 			}
+ 		}
+ 		data.set("mainInventory", parBaseDatas);
+ 
+ 		PluginData[] parBaseDatasArmor = new PluginData[armorInventory.length];
+ 		for (int i = 0; i < armorInventory.length; i++) {
+ 			if (armorInventory[i] != null) {
+ 				parBaseDatasArmor[i] = armorInventory[i].makePluginData();
+ 			}
+ 		}
+ 		data.set("armorInventory", parBaseDatasArmor);
+ 
+ 		data.set("currentItem", currentItem);
+ 		data.set("inventoryChanged", inventoryChanged);
+ 		data.setCallbackVoid("reload", () -> {
+ 			loadPluginData(data);
+ 		});
+ 		return data;
+ 	}
+ 
+ 	/**
+ 	 * + Returns the item stack currently held by the player.
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Get the size of the player hotbar inventory
+ 	 */

> INSERT  25 : 28  @  25

+ 	/**
+ 	 * + stores an itemstack in the users inventory
+ 	 */

> INSERT  16 : 19  @  16

+ 	/**
+ 	 * + Returns the first item stack that is empty.
+ 	 */

> INSERT  40 : 43  @  40

+ 	/**
+ 	 * + Switch the current item to the next one or the previous one
+ 	 */

> INSERT  19 : 26  @  19

+ 	/**
+ 	 * + Removes matching items from the inventory.\n@param itemIn The item to
+ 	 * match, null ignores.\n@param metadataIn The metadata to match, -1
+ 	 * ignores.\n@param removeCount The number of items to remove. If less than 1,
+ 	 * removes all matching items.\n@param itemNBT The NBT data to match, null
+ 	 * ignores.\n@return The number of items removed from the inventory.
+ 	 */

> INSERT  73 : 77  @  73

+ 	/**
+ 	 * + This function stores as many items of an ItemStack as possible in a
+ 	 * matching slot and returns the quantity of left over items.
+ 	 */

> INSERT  38 : 42  @  38

+ 	/**
+ 	 * + Decrement the number of animations remaining. Only called on client side.
+ 	 * This is used to handle the animation of receiving a block.
+ 	 */

> INSERT  9 : 13  @  9

+ 	/**
+ 	 * + removed one item of specified Item from inventory (if it is in a stack, the
+ 	 * stack size will reduce with 1)
+ 	 */

> INSERT  13 : 16  @  13

+ 	/**
+ 	 * + Checks if a specified Item is inside the inventory
+ 	 */

> INSERT  5 : 8  @  5

+ 	/**
+ 	 * + Adds the item stack to the inventory, returns false if it is impossible.
+ 	 */

> INSERT  51 : 55  @  51

+ 	/**
+ 	 * + Removes up to a specified number of items from an inventory slot and
+ 	 * returns them in a new stack.
+ 	 */

> INSERT  25 : 28  @  25

+ 	/**
+ 	 * + Removes a stack from the given slot and returns it.
+ 	 */

> INSERT  16 : 20  @  16

+ 	/**
+ 	 * + Sets the given item stack to the specified slot in the inventory (can be
+ 	 * crafting or armor sections).
+ 	 */

> INSERT  19 : 23  @  19

+ 	/**
+ 	 * + Writes the inventory out as a list of compound tags. This is where the slot
+ 	 * indices are used (+100 for armor, +80 for crafting).
+ 	 */

> INSERT  22 : 26  @  22

+ 	/**
+ 	 * + Reads from the given tag list and fills the slots in the inventory with the
+ 	 * correct items.
+ 	 */

> INSERT  21 : 24  @  21

+ 	/**
+ 	 * + Returns the number of slots in the inventory.
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Returns the stack in the given slot.
+ 	 */

> INSERT  10 : 14  @  10

+ 	/**
+ 	 * + Gets the name of this command sender (usually username, but possibly
+ 	 * "Rcon")
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Returns true if this thing is named
+ 	 */

> INSERT  4 : 8  @  4

+ 	/**
+ 	 * + Get the formatted ChatComponent that will be used for the sender's username
+ 	 * in chat
+ 	 */

> INSERT  5 : 9  @  5

+ 	/**
+ 	 * + Returns the maximum stack size for a inventory slot. Seems to always be 64,
+ 	 * possibly will be extended.
+ 	 */

> INSERT  13 : 17  @  13

+ 	/**
+ 	 * + returns a player armor item (as itemstack) contained in specified armor
+ 	 * slot.
+ 	 */

> INSERT  4 : 8  @  4

+ 	/**
+ 	 * + Based on the damage values and maximum damage values of each armor item,
+ 	 * returns the current armor value.
+ 	 */

> INSERT  13 : 16  @  13

+ 	/**
+ 	 * + Damages armor in each slot by the specified amount.
+ 	 */

> INSERT  17 : 20  @  17

+ 	/**
+ 	 * + Drop all armor and main inventory items.
+ 	 */

> INSERT  17 : 21  @  17

+ 	/**
+ 	 * + For tile entities, ensures the chunk containing the tile entity is saved to
+ 	 * disk later - the game won't think it hasn't changed and skip it.
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Set the stack helds by mouse, used in GUI/Container
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Stack helds by mouse, used in GUI and Containers
+ 	 */

> INSERT  4 : 8  @  4

+ 	/**
+ 	 * + Do not make give this method the name canInteractWith because it clashes
+ 	 * with Container
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Returns true if the specified ItemStack exists in the inventory.
+ 	 */

> INSERT  22 : 26  @  22

+ 	/**
+ 	 * + Returns true if automation is allowed to insert the given stack (ignoring
+ 	 * stack size) into the given slot.
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Copy the ItemStack contents from another InventoryPlayer instance
+ 	 */

> EOF
