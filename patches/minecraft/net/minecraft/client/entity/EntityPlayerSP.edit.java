
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> INSERT  2 : 4  @  2

+ import java.util.HashMap;
+ 

> DELETE  3  @  3 : 4

> INSERT  40 : 41  @  40

+ import net.minecraft.util.ChatComponentText;

> INSERT  8 : 11  @  8

+ import net.zxmushroom63.plugins.BaseData;
+ import net.zxmushroom63.plugins.PluginAPI;
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

> DELETE  2  @  2 : 3

> CHANGE  12 : 13  @  12 : 13

~ 	private int sprintToggleTimer;

> INSERT  9 : 10  @  9

+ 	private StatFileWriter statWriter;

> CHANGE  1 : 2  @  1 : 2

~ 	public EntityPlayerSP(Minecraft mcIn, World worldIn, NetHandlerPlayClient netHandler, StatFileWriter statWriter) {

> DELETE  2  @  2 : 3

> INSERT  2 : 3  @  2

+ 		this.statWriter = statWriter;

> INSERT  2 : 144  @  2

+ 	@Override
+ 	public PluginData makePluginData() {
+ 		PluginData data = super.makePluginData();
+ 		data.setCallbackVoid("reload", () -> {
+ 			loadPluginData(data);
+ 		});
+ 		data.setCallbackObject("getRef", () -> {
+ 			return this;
+ 		});
+ 		data.set("lastReportedPosX", lastReportedPosX);
+ 		data.set("lastReportedPosY", lastReportedPosY);
+ 		data.set("lastReportedPosZ", lastReportedPosZ);
+ 		data.set("lastReportedYaw", lastReportedYaw);
+ 		data.set("lastReportedPitch", lastReportedPitch);
+ 		data.set("serverSneakState", serverSneakState);
+ 		data.set("serverSprintState", serverSprintState);
+ 		data.set("positionUpdateTicks", positionUpdateTicks);
+ 		data.set("hasValidHealth", hasValidHealth);
+ 		data.set("clientBrand", clientBrand);
+ 		data.set("sprintToggleTimer", sprintToggleTimer);
+ 		data.set("sprintingTicksLeft", sprintingTicksLeft);
+ 
+ 		data.set("renderArmYaw", renderArmYaw);
+ 		data.set("renderArmPitch", renderArmPitch);
+ 		data.set("prevRenderArmYaw", prevRenderArmYaw);
+ 		data.set("prevRenderArmPitch", prevRenderArmPitch);
+ 		data.set("horseJumpPower", horseJumpPower);
+ 		data.set("horseJumpPowerCounter", horseJumpPowerCounter);
+ 
+ 		data.setCallbackVoidWithDataArg("mountEntity", (BaseData params) -> {
+ 			if (params.getBaseData("entityIn") instanceof Entity) {
+ 				mountEntity((Entity) params.getBaseData("entityIn"));
+ 			}
+ 		});
+ 		data.setCallbackObjectWithDataArg("dropOneItem", (BaseData params) -> {
+ 			EntityItem itemEntity = dropOneItem(params.getBoolean("dropAll"));
+ 			if (itemEntity != null) {
+ 				return itemEntity.makePluginData();
+ 			} else {
+ 				return null;
+ 			}
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendChatMessage", (BaseData params) -> {
+ 			sendChatMessage(params.getString("message"));
+ 		});
+ 		data.setCallbackVoid("respawnPlayer", () -> {
+ 			respawnPlayer();
+ 		});
+ 		data.setCallbackVoid("closeScreen", () -> {
+ 			closeScreen();
+ 		});
+ 		data.setCallbackVoid("closeScreenAndDropStack", () -> {
+ 			closeScreenAndDropStack();
+ 		});
+ 		data.setCallbackVoidWithDataArg("setPlayerSPHealth", (BaseData params) -> {
+ 			setPlayerSPHealth(params.getFloat("health"));
+ 		});
+ 		data.setCallbackVoid("sendPlayerAbilities", () -> {
+ 			sendPlayerAbilities();
+ 		});
+ 		data.setCallbackBoolean("isUser", () -> {
+ 			/**
+ 			 * + returns true if this is an EntityPlayerSP, or the logged in player.
+ 			 */
+ 			return isUser();
+ 		});
+ 		data.setCallbackVoid("sendHorseInventory", () -> {
+ 			sendHorseInventory();
+ 		});
+ 		data.setCallbackVoid("sendHorseJump", () -> {
+ 			sendHorseJump();
+ 		});
+ 		data.setCallbackVoidWithDataArg("setClientBrand", (BaseData params) -> {
+ 			setClientBrand(params.getString("brand"));
+ 		});
+ 		data.setCallbackString("getClientBrand", () -> {
+ 			return getClientBrand();
+ 		});
+ 		data.setCallbackBooleanWithDataArg("pushOutOfBlocks", (BaseData params) -> {
+ 			return pushOutOfBlocks(params.getDouble("x"), params.getDouble("y"), params.getDouble("z"));
+ 		});
+ 		data.setCallbackBooleanWithDataArg("isOpenBlockSpace", (BaseData bp) -> {
+ 			/**
+ 			 * + Returns true if the block at the given BlockPos and the block above it are
+ 			 * NOT full cubes.
+ 			 */
+ 			return isOpenBlockSpace(BlockPos.fromPluginData(bp));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setXPStats", (BaseData params) -> {
+ 			setXPStats(params.getFloat("currentXP"), params.getInt("maxXP"), params.getInt("level"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("playSound", (BaseData params) -> {
+ 			playSound(params.getString("name"), params.getFloat("volume"), params.getFloat("pitch"));
+ 		});
+ 		data.setCallbackBoolean("isServerWorld", () -> {
+ 			/**
+ 			 * + Returns whether the entity is in a server world
+ 			 */
+ 			return isServerWorld();
+ 		});
+ 		data.setCallbackBoolean("isRidingHorse", () -> {
+ 			return isRidingHorse();
+ 		});
+ 		data.setCallbackFloat("getHorseJumpPower", () -> {
+ 			return getHorseJumpPower();
+ 		});
+ 		data.setCallbackBoolean("isCurrentViewEntity", () -> {
+ 			return isCurrentViewEntity();
+ 		});
+ 		data.setCallbackBoolean("isSpectator", () -> {
+ 			return isSpectator();
+ 		});
+ 		return data;
+ 	}
+ 
+ 	@Override
+ 	public void loadPluginData(BaseData data) {
+ 		super.loadPluginData(data);
+ 		lastReportedPosX = data.getDouble("lastReportedPosX");
+ 		lastReportedPosY = data.getDouble("lastReportedPosY");
+ 		lastReportedPosZ = data.getDouble("lastReportedPosZ");
+ 		lastReportedYaw = data.getFloat("lastReportedYaw");
+ 		lastReportedPitch = data.getFloat("lastReportedPitch");
+ 		serverSneakState = data.getBoolean("serverSneakState");
+ 		serverSprintState = data.getBoolean("serverSprintState");
+ 		positionUpdateTicks = data.getInt("positionUpdateTicks");
+ 		hasValidHealth = data.getBoolean("hasValidHealth");
+ 		clientBrand = data.getString("clientBrand");
+ 		sprintToggleTimer = data.getInt("sprintToggleTimer");
+ 		sprintingTicksLeft = data.getInt("sprintingTicksLeft");
+ 
+ 		renderArmYaw = data.getFloat("renderArmYaw");
+ 		renderArmPitch = data.getFloat("renderArmPitch");
+ 		prevRenderArmYaw = data.getFloat("prevRenderArmYaw");
+ 		prevRenderArmPitch = data.getFloat("prevRenderArmPitch");
+ 		horseJumpPower = data.getFloat("horseJumpPower");
+ 		horseJumpPowerCounter = data.getInt("horseJumpPowerCounter");
+ 	}
+ 
+ 	/**
+ 	 * + Called when the entity is attacked.
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Heal living entity (param: amount of half-hearts)
+ 	 */

> INSERT  3 : 6  @  3

+ 	/**
+ 	 * + Called when a player mounts an entity. e.g. mounts a pig, mounts a boat.
+ 	 */

> DELETE  5  @  5 : 6

> INSERT  2 : 5  @  2

+ 	/**
+ 	 * + Called to update the entity's position/logic.
+ 	 */

> INSERT  2 : 3  @  2

+ 			mc.pluginApi.onUpdate();

> INSERT  8 : 9  @  8

+ 				PluginAPI.callEvent("postmotionupdate", new PluginData());

> DELETE  1  @  1 : 2

> INSERT  3 : 7  @  3

+ 	/**
+ 	 * + called every tick when the player is on foot. Performs all the things that
+ 	 * normally happen during movement.
+ 	 */

> INSERT  1 : 6  @  1

+ 		PluginData event = new PluginData();
+ 		event.set("yaw", this.rotationYaw);
+ 		event.set("pitch", this.rotationPitch);
+ 		event.set("onground", this.onGround);
+ 		PluginAPI.callEvent("premotionupdate", event);

> CHANGE  34 : 41  @  34 : 35

~ 			PluginData eventData = new PluginData();
~ 			eventData.set("preventDefault", false);
~ 			BaseData newEvent = PluginAPI.callEvent("motionupdate", eventData);
~ 			if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 				// *sneeze*
~ 			} else if (this.ridingEntity == null) {
~ 

> INSERT  35 : 38  @  35

+ 	/**
+ 	 * + Called when player presses the drop item key
+ 	 */

> INSERT  9 : 12  @  9

+ 	/**
+ 	 * + Joins the passed in entity item with the world. Args: entityItem
+ 	 */

> INSERT  3 : 6  @  3

+ 	/**
+ 	 * + Sends a chat message from the player. Args: chatMessage
+ 	 */

> INSERT  1 : 16  @  1

+ 		if (message.equalsIgnoreCase(".pluginapi")) {
+ 			mc.ingameGUI.getChatGUI().printChatMessage(new ChatComponentText("---------"));
+ 			mc.ingameGUI.getChatGUI()
+ 					.printChatMessage(new ChatComponentText("You are using PluginAPI " + PluginAPI.version));
+ 			mc.ingameGUI.getChatGUI().printChatMessage(new ChatComponentText("---------"));
+ 			return;
+ 		}
+ 		PluginData event = new PluginData();
+ 		event.set("message", message);
+ 		event.set("preventDefault", false);
+ 		BaseData newEvent = mc.pluginApi.callEvent("sendchatmessage", event);
+ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault")) {
+ 			return;
+ 		}
+ 		message = newEvent.has("message") ? newEvent.getString("message") : message;

> INSERT  3 : 6  @  3

+ 	/**
+ 	 * + Swings the item the player is holding.
+ 	 */

> INSERT  9 : 14  @  9

+ 	/**
+ 	 * + Deals damage to the entity. If its a EntityPlayer then will take damage
+ 	 * from the armor first and then health second with the reduced value. Args:
+ 	 * damageAmount
+ 	 */

> INSERT  6 : 9  @  6

+ 	/**
+ 	 * + set current crafting inventory back to the 2x2 square
+ 	 */

> INSERT  11 : 14  @  11

+ 	/**
+ 	 * + Updates health locally.
+ 	 */

> INSERT  22 : 25  @  22

+ 	/**
+ 	 * + Adds a value to a statistic field.
+ 	 */

> INSERT  9 : 12  @  9

+ 	/**
+ 	 * + Sends the player's abilities to the server (if there is one).
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + returns true if this is an EntityPlayerSP, or the logged in player.
+ 	 */

> INSERT  81 : 85  @  81

+ 	/**
+ 	 * + Returns true if the block at the given BlockPos and the block above it are
+ 	 * NOT full cubes.
+ 	 */

> INSERT  5 : 8  @  5

+ 	/**
+ 	 * + Set sprinting switch for Entity.
+ 	 */

> INSERT  5 : 8  @  5

+ 	/**
+ 	 * + Sets the current XP, total XP, and level number.
+ 	 */

> INSERT  6 : 9  @  6

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

> INSERT  8 : 11  @  8

+ 	/**
+ 	 * + Returns whether the entity is in a server world
+ 	 */

> INSERT  21 : 24  @  21

+ 	/**
+ 	 * + Displays the GUI for interacting with a book.
+ 	 */

> DELETE  5  @  5 : 6

> INSERT  2 : 6  @  2

+ 	/**
+ 	 * + Displays the GUI for interacting with a chest inventory. Args:
+ 	 * chestInventory
+ 	 */

> INSERT  41 : 45  @  41

+ 	/**
+ 	 * + Called when the player performs a critical hit on the Entity. Args: entity
+ 	 * that was hit critically
+ 	 */

> INSERT  8 : 11  @  8

+ 	/**
+ 	 * + Returns if this entity is sneaking.
+ 	 */

> CHANGE  21 : 22  @  21 : 22

~ 	public boolean isCurrentViewEntity() {

> INSERT  3 : 8  @  3

+ 	/**
+ 	 * + Called frequently so the entity can update its state every tick as
+ 	 * required. For example, zombies and skeletons use this to react to sunlight
+ 	 * and start to burn.
+ 	 */

> EOF
