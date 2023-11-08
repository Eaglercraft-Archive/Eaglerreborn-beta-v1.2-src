
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  2  @  2 : 3

> INSERT  1 : 4  @  1

+ 
+ import com.google.common.collect.Lists;
+ 

> DELETE  1  @  1 : 3

> INSERT  4 : 6  @  4

+ import net.zxmushroom63.plugins.BaseData;
+ import net.zxmushroom63.plugins.PluginData;

> CHANGE  1 : 21  @  1 : 2

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
~ public class InventoryBasic extends PluginData implements IInventory {

> INSERT  6 : 42  @  6

+ 	public void loadPluginData(BaseData data) {
+ 		BaseData[] parItemStacks = data.getBaseDataArr("inventoryContents");
+ 		for (int i = 0; i < parItemStacks.length && i < inventoryContents.length; i++) {
+ 			if (inventoryContents[i] != null) {
+ 				inventoryContents[i].loadPluginData(parItemStacks[i]);
+ 			} else if (parItemStacks[i] != null && parItemStacks[i].getRef() instanceof ItemStack) {
+ 				inventoryContents[i] = (ItemStack) parItemStacks[i].getRef();
+ 			}
+ 		}
+ 
+ 		inventoryTitle = data.getString("inventoryTitle");
+ 		slotsCount = data.getInt("slotsCount");
+ 		hasCustomName = data.getBoolean("hasCustomName");
+ 	}
+ 
+ 	public PluginData makePluginData() {
+ 		PluginData data = new PluginData();
+ 		PluginData[] parBaseDatas = new PluginData[inventoryContents.length];
+ 		for (int i = 0; i < inventoryContents.length; i++) {
+ 			if (inventoryContents[i] != null) {
+ 				parBaseDatas[i] = inventoryContents[i].makePluginData();
+ 			}
+ 		}
+ 		data.set("inventoryContents", parBaseDatas);
+ 		data.set("inventoryTitle", inventoryTitle);
+ 		data.set("slotsCount", slotsCount);
+ 		data.set("hasCustomName", hasCustomName);
+ 		data.setCallbackVoid("reload", () -> {
+ 			loadPluginData(data);
+ 		});
+ 		data.setCallbackObject("getRef", () -> {
+ 			return this;
+ 		});
+ 		return data;
+ 	}
+ 

> INSERT  23 : 26  @  23

+ 	/**
+ 	 * + Returns the stack in the given slot.
+ 	 */

> INSERT  4 : 8  @  4

+ 	/**
+ 	 * + Removes up to a specified number of items from an inventory slot and
+ 	 * returns them in a new stack.
+ 	 */

> INSERT  53 : 56  @  53

+ 	/**
+ 	 * + Removes a stack from the given slot and returns it.
+ 	 */

> INSERT  10 : 14  @  10

+ 	/**
+ 	 * + Sets the given item stack to the specified slot in the inventory (can be
+ 	 * crafting or armor sections).
+ 	 */

> INSERT  9 : 12  @  9

+ 	/**
+ 	 * + Returns the number of slots in the inventory.
+ 	 */

> INSERT  4 : 8  @  4

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
+ 	 * + Sets the name of this inventory. This is displayed to the client on
+ 	 * opening.
+ 	 */

> INSERT  5 : 9  @  5

+ 	/**
+ 	 * + Get the formatted ChatComponent that will be used for the sender's username
+ 	 * in chat
+ 	 */

> INSERT  5 : 9  @  5

+ 	/**
+ 	 * + Returns the maximum stack size for a inventory slot. Seems to always be 64,
+ 	 * possibly will be extended.
+ 	 */

> INSERT  4 : 8  @  4

+ 	/**
+ 	 * + For tile entities, ensures the chunk containing the tile entity is saved to
+ 	 * disk later - the game won't think it hasn't changed and skip it.
+ 	 */

> INSERT  9 : 13  @  9

+ 	/**
+ 	 * + Do not make give this method the name canInteractWith because it clashes
+ 	 * with Container
+ 	 */

> INSERT  10 : 14  @  10

+ 	/**
+ 	 * + Returns true if automation is allowed to insert the given stack (ignoring
+ 	 * stack size) into the given slot.
+ 	 */

> EOF
