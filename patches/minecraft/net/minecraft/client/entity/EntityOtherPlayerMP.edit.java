
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  2 : 3  @  2 : 3

~ import net.lax1dude.eaglercraft.v1_8.mojang.authlib.GameProfile;

> DELETE  1  @  1 : 2

> INSERT  1 : 3  @  1

+ import net.minecraft.nbt.JsonToNBT;
+ import net.minecraft.nbt.NBTTagCompound;

> INSERT  5 : 7  @  5

+ import net.zxmushroom63.plugins.BaseData;
+ import net.zxmushroom63.plugins.PluginData;

> INSERT  1 : 20  @  1

+ /**
+  * + This portion of EaglercraftX contains deobfuscated Minecraft 1.8 source
+  * code.
+  * 
+  * Minecraft 1.8.8 bytecode is (c) 2015 Mojang AB. "Do not distribute!" Mod
+  * Coder Pack v9.18 deobfuscation configs are (c) Copyright by the MCP Team
+  * 
+  * EaglercraftX 1.8 patch files are (c) 2022-2023 LAX1DUDE. All Rights Reserved.
+  * 
+  * WITH THE EXCEPTION OF PATCH FILES, MINIFIED JAVASCRIPT, AND ALL FILES
+  * NORMALLY FOUND IN AN UNMODIFIED MINECRAFT RESOURCE PACK, YOU ARE NOT ALLOWED
+  * TO SHARE, DISTRIBUTE, OR REPURPOSE ANY FILE USED BY OR PRODUCED BY THE
+  * SOFTWARE IN THIS REPOSITORY WITHOUT PRIOR PERMISSION FROM THE PROJECT AUTHOR.
+  * 
+  * NOT FOR COMMERCIAL OR MALICIOUS USE
+  * 
+  * (please read the 'LICENSE' file this repo's root directory for more info)
+  * 
+  */

> INSERT  17 : 61  @  17

+ 	@Override
+ 	public PluginData makePluginData() {
+ 		PluginData data = super.makePluginData();
+ 		data.setCallbackVoid("reload", () -> {
+ 			loadPluginData(data);
+ 		});
+ 		data.setCallbackObject("getRef", () -> {
+ 			return this;
+ 		});
+ 		data.set("otherPlayerMPPosRotationIncrements", otherPlayerMPPosRotationIncrements);
+ 		data.set("otherPlayerMPX", otherPlayerMPX);
+ 		data.set("otherPlayerMPY", otherPlayerMPY);
+ 		data.set("otherPlayerMPZ", otherPlayerMPZ);
+ 		data.set("otherPlayerMPYaw", otherPlayerMPYaw);
+ 		data.set("otherPlayerMPPitch", otherPlayerMPPitch);
+ 		data.setCallbackVoidWithDataArg("setCurrentItemOrArmor", (BaseData params) -> {
+ 			try {
+ 				NBTTagCompound nbtParsed = JsonToNBT.getTagFromJson(params.getString("itemNbt"));
+ 				ItemStack stack = ItemStack.loadItemStackFromNBT(nbtParsed);
+ 				setCurrentItemOrArmor(params.getInt("slotIn"), stack);
+ 			} catch (Exception e) {
+ 			}
+ 		});
+ 		data.setCallbackBoolean("isSpectator", () -> {
+ 			return isSpectator();
+ 		});
+ 
+ 		return data;
+ 	}
+ 
+ 	@Override
+ 	public void loadPluginData(BaseData data) {
+ 		super.loadPluginData(data);
+ 		otherPlayerMPPosRotationIncrements = data.getInt("otherPlayerMPPosRotationIncrements");
+ 		otherPlayerMPX = data.getDouble("otherPlayerMPX");
+ 		otherPlayerMPY = data.getDouble("otherPlayerMPX");
+ 		otherPlayerMPZ = data.getDouble("otherPlayerMPX");
+ 		otherPlayerMPYaw = data.getDouble("otherPlayerMPX");
+ 		otherPlayerMPPitch = data.getDouble("otherPlayerMPX");
+ 	}
+ 
+ 	/**
+ 	 * + Called when the entity is attacked.
+ 	 */

> INSERT  14 : 17  @  14

+ 	/**
+ 	 * + Called to update the entity's position/logic.
+ 	 */

> INSERT  25 : 30  @  25

+ 	/**
+ 	 * + Called frequently so the entity can update its state every tick as
+ 	 * required. For example, zombies and skeletons use this to react to sunlight
+ 	 * and start to burn.
+ 	 */

> INSERT  48 : 52  @  48

+ 	/**
+ 	 * + Sets the held item, or an armor slot. Slot 0 is held item. Slot 1-4 is
+ 	 * armor. Params: Item, slot
+ 	 */

> INSERT  9 : 12  @  9

+ 	/**
+ 	 * + Send a chat message to the CommandSender
+ 	 */

> INSERT  4 : 8  @  4

+ 	/**
+ 	 * + Returns {@code true} if the CommandSender is allowed to execute the
+ 	 * command, {@code false} if not
+ 	 */

> INSERT  4 : 8  @  4

+ 	/**
+ 	 * + Get the position in the world. <b>{@code null} is not allowed!</b> If you
+ 	 * are not an entity in the world, return the coordinates 0, 0, 0
+ 	 */

> EOF
