
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  2  @  2 : 8

> INSERT  1 : 2  @  1

+ import java.lang.reflect.Field;

> DELETE  3  @  3 : 5

> INSERT  1 : 13  @  1

+ import net.lax1dude.eaglercraft.v1_8.EaglercraftRandom;
+ import net.lax1dude.eaglercraft.v1_8.EaglercraftUUID;
+ 
+ import com.google.common.collect.Maps;
+ 
+ import net.lax1dude.eaglercraft.v1_8.netty.Unpooled;
+ import net.lax1dude.eaglercraft.v1_8.profile.ServerSkinCache;
+ import net.lax1dude.eaglercraft.v1_8.profile.SkinPackets;
+ import net.lax1dude.eaglercraft.v1_8.socket.EaglercraftNetworkManager;
+ import net.lax1dude.eaglercraft.v1_8.log4j.LogManager;
+ import net.lax1dude.eaglercraft.v1_8.log4j.Logger;
+ import net.lax1dude.eaglercraft.v1_8.mojang.authlib.GameProfile;

> INSERT  3 : 5  @  3

+ import net.minecraft.nbt.JsonToNBT;
+ import net.minecraft.nbt.NBTTagCompound;

> DELETE  11  @  11 : 13

> INSERT  5 : 6  @  5

+ import java.nio.charset.Charset;

> DELETE  4  @  4 : 5

> DELETE  5  @  5 : 8

> INSERT  32 : 33  @  32

+ import net.minecraft.entity.player.PlayerCapabilities;

> DELETE  15  @  15 : 16

> DELETE  2  @  2 : 3

> INSERT  2 : 4  @  2

+ import net.minecraft.network.play.client.C01PacketChatMessage;
+ import net.minecraft.network.play.client.C02PacketUseEntity;

> INSERT  1 : 12  @  1

+ import net.minecraft.network.play.client.C03PacketPlayer.C04PacketPlayerPosition;
+ import net.minecraft.network.play.client.C03PacketPlayer.C05PacketPlayerLook;
+ import net.minecraft.network.play.client.C03PacketPlayer.C06PacketPlayerPosLook;
+ import net.minecraft.network.play.client.C07PacketPlayerDigging;
+ import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
+ import net.minecraft.network.play.client.C09PacketHeldItemChange;
+ import net.minecraft.network.play.client.C0APacketAnimation;
+ import net.minecraft.network.play.client.C0BPacketEntityAction;
+ import net.minecraft.network.play.client.C0CPacketInput;
+ import net.minecraft.network.play.client.C0DPacketCloseWindow;
+ import net.minecraft.network.play.client.C0EPacketClickWindow;

> INSERT  1 : 8  @  1

+ import net.minecraft.network.play.client.C10PacketCreativeInventoryAction;
+ import net.minecraft.network.play.client.C11PacketEnchantItem;
+ import net.minecraft.network.play.client.C12PacketUpdateSign;
+ import net.minecraft.network.play.client.C13PacketPlayerAbilities;
+ import net.minecraft.network.play.client.C14PacketTabComplete;
+ import net.minecraft.network.play.client.C15PacketClientSettings;
+ import net.minecraft.network.play.client.C16PacketClientStatus;

> INSERT  1 : 2  @  1

+ import net.minecraft.network.play.client.C18PacketSpectate;

> DELETE  73  @  73 : 74

> INSERT  26 : 27  @  26

+ import net.minecraft.util.Vec3;

> INSERT  4 : 5  @  4

+ import net.minecraft.world.WorldSettings.GameType;

> CHANGE  2 : 5  @  2 : 4

~ import net.zxmushroom63.plugins.BaseData;
~ import net.zxmushroom63.plugins.PluginAPI;
~ import net.zxmushroom63.plugins.PluginData;

> CHANGE  1 : 59  @  1 : 2

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
~ public class NetHandlerPlayClient extends PluginData implements INetHandlerPlayClient {

> CHANGE  1 : 2  @  1 : 2

~ 	private final EaglercraftNetworkManager netManager;

> CHANGE  5 : 6  @  5 : 6

~ 	private final Map<EaglercraftUUID, NetworkPlayerInfo> playerInfoMap = Maps.newHashMap();

> CHANGE  2 : 16  @  2 : 3

~ 	/**
~ 	 * + Just an ordinary random number generator, used to randomize audio pitch of
~ 	 * item/orb pickup and randomize both particlespawn offset and velocity
~ 	 */
~ 	/**
~ 	 * + Just an ordinary random number generator, used to randomize audio pitch of
~ 	 * item/orb pickup and randomize both particlespawn offset and velocity
~ 	 */
~ 	/**
~ 	 * + Just an ordinary random number generator, used to randomize audio pitch of
~ 	 * item/orb pickup and randomize both particlespawn offset and velocity
~ 	 */
~ 	private final EaglercraftRandom avRandomizer = new EaglercraftRandom();
~ 	private final ServerSkinCache skinCache;

> CHANGE  1 : 2  @  1 : 2

~ 	public NetHandlerPlayClient(Minecraft mcIn, GuiScreen parGuiScreen, EaglercraftNetworkManager parNetworkManager,

> INSERT  5 : 6  @  5

+ 		this.skinCache = new ServerSkinCache(parNetworkManager, mcIn.getTextureManager());

> INSERT  2 : 11  @  2

+ 	/**
+ 	 * + Clears the WorldClient instance associated with this NetHandlerPlayClient
+ 	 */
+ 	/**
+ 	 * + Clears the WorldClient instance associated with this NetHandlerPlayClient
+ 	 */
+ 	/**
+ 	 * + Clears the WorldClient instance associated with this NetHandlerPlayClient
+ 	 */

> INSERT  2 : 3  @  2

+ 		this.skinCache.destroy();

> INSERT  2 : 169  @  2

+ 	public ServerSkinCache getSkinCache() {
+ 		return this.skinCache;
+ 	}
+ 
+ 	public void loadPluginData(BaseData data) {
+ 		doneLoadingTerrain = data.getBoolean("doneLoadingTerrain");
+ 		currentServerMaxPlayers = data.getInt("doneLoadingTerrain");
+ 	}
+ 
+ 	public PluginData makePluginData() {
+ 		PluginData data = new PluginData();
+ 		data.set("doneLoadingTerrain", doneLoadingTerrain);
+ 		data.set("currentServerMaxPlayers", currentServerMaxPlayers);
+ 
+ 		data.setCallbackVoid("reload", () -> {
+ 			loadPluginData(data);
+ 		});
+ 
+ 		data.setCallbackObject("getRef", () -> {
+ 			return this;
+ 		});
+ 
+ 		data.setCallbackVoid("sendPacketAnimation", () -> {
+ 			addToSendQueue(new C0APacketAnimation());
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketEntityAction", (BaseData args) -> {
+ 			addToSendQueue(new C0BPacketEntityAction(args.getInt("entityId"),
+ 					C0BPacketEntityAction.Action.valueOf(args.getString("action")), args.getInt("auxData")));
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketInput", (BaseData args) -> {
+ 			addToSendQueue(new C0CPacketInput(args.getFloat("strafeSpeed"), args.getFloat("forwardSpeed"),
+ 					args.getBoolean("jumping"), args.getBoolean("sneaking")));
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketCloseWindow", (BaseData args) -> {
+ 			addToSendQueue(new C0DPacketCloseWindow(args.getInt("windowId")));
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketClickWindow", (BaseData args) -> {
+ 			if (args.getBaseData("clickedItemRef") instanceof ItemStack) {
+ 				addToSendQueue(new C0EPacketClickWindow(args.getInt("windowId"), args.getInt("slotId"),
+ 						args.getInt("usedButton"), args.getInt("mode"), (ItemStack) args.getBaseData("clickedItemRef"),
+ 						args.getShort("actionNumber")));
+ 			} else {
+ 				addToSendQueue(new C0EPacketClickWindow(args.getInt("windowId"), args.getInt("slotId"),
+ 						args.getInt("usedButton"), args.getInt("mode"), null, args.getShort("actionNumber")));
+ 			}
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketConfirmTransaction", (BaseData args) -> {
+ 			addToSendQueue(new C0FPacketConfirmTransaction(args.getInt("windowId"), args.getShort("uid"),
+ 					args.getBoolean("accepted")));
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketKeepAlive", (BaseData args) -> {
+ 			addToSendQueue(new C00PacketKeepAlive(args.getInt("key")));
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketChatMessage", (BaseData args) -> {
+ 			addToSendQueue(new C01PacketChatMessage(args.getString("messageIn")));
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketUseEntity", (BaseData args) -> {
+ 			if (args.has("entityId")) {
+ 				if (args.has("hitVec")) {
+ 					addToSendQueue(new C02PacketUseEntity(args.getInt("entityId"),
+ 							Vec3.fromPluginData(args.getBaseData("hitVec"))));
+ 				} else {
+ 					addToSendQueue(new C02PacketUseEntity(args.getInt("entityId"),
+ 							C02PacketUseEntity.Action.valueOf(args.getString("action"))));
+ 				}
+ 			} else {
+ 				if (args.has("hitVec")) {
+ 					addToSendQueue(new C02PacketUseEntity((Entity) args.getBaseData("entityRef"),
+ 							Vec3.fromPluginData(args.getBaseData("hitVec"))));
+ 				} else {
+ 					addToSendQueue(new C02PacketUseEntity((Entity) args.getBaseData("entityRef"),
+ 							C02PacketUseEntity.Action.valueOf(args.getString("action"))));
+ 				}
+ 			}
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketPlayer", (BaseData args) -> {
+ 			addToSendQueue(new C03PacketPlayer(args.getBoolean("isOnGround")));
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketPlayerPosition", (BaseData args) -> {
+ 			addToSendQueue(new C04PacketPlayerPosition(args.getDouble("posX"), args.getDouble("posY"),
+ 					args.getDouble("posZ"), args.getBoolean("isOnGround")));
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketPlayerLook", (BaseData args) -> {
+ 			addToSendQueue(new C05PacketPlayerLook(args.getFloat("playerYaw"), args.getFloat("playerPitch"),
+ 					args.getBoolean("isOnGround")));
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketPlayerPosLook", (BaseData args) -> {
+ 			addToSendQueue(new C06PacketPlayerPosLook(args.getDouble("playerX"), args.getDouble("playerY"),
+ 					args.getDouble("playerZ"), args.getFloat("playerYaw"), args.getFloat("playerPitch"),
+ 					args.getBoolean("isOnGround")));
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketPlayerDigging", (BaseData args) -> {
+ 			addToSendQueue(new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.valueOf(args.getString("action")),
+ 					BlockPos.fromPluginData(args.getBaseData("pos")), EnumFacing.valueOf(args.getString("facing"))));
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketPlayerBlockPlacement", (BaseData args) -> {
+ 			if (args.has("positionIn")) {
+ 				addToSendQueue(new C08PacketPlayerBlockPlacement((BlockPos) args.getBaseData("posRef"),
+ 						args.getInt("placedBlockDirectionIn"), (ItemStack) args.getBaseData("stackRef"),
+ 						args.getFloat("facingXIn"), args.getFloat("facingYIn"), args.getFloat("facingZIn")));
+ 			} else {
+ 				addToSendQueue(new C08PacketPlayerBlockPlacement((ItemStack) args.getBaseData("stackRef")));
+ 			}
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketHeldItemChange", (BaseData args) -> {
+ 			addToSendQueue(new C09PacketHeldItemChange(args.getInt("slotId")));
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketCreativeInventoryAction", (BaseData args) -> {
+ 			addToSendQueue(new C10PacketCreativeInventoryAction(args.getInt("slotId"),
+ 					(ItemStack) args.getBaseData("stackRef")));
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketEnchantItem", (BaseData args) -> {
+ 			addToSendQueue(new C11PacketEnchantItem(args.getInt("windowId"), args.getInt("button")));
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketUpdateSign", (BaseData args) -> {
+ 			String[] parLineArr = getStringArr("lines");
+ 			ChatComponentText[] lineArr = new ChatComponentText[parLineArr.length];
+ 			for (int i = 0; i < parLineArr.length; i++) {
+ 				lineArr[i] = new ChatComponentText(parLineArr[i]);
+ 			}
+ 			addToSendQueue(new C12PacketUpdateSign(BlockPos.fromPluginData(args.getBaseData("pos")), lineArr));
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketPlayerAbilities", (BaseData args) -> {
+ 			addToSendQueue(new C13PacketPlayerAbilities((PlayerCapabilities) args.getBaseData("capabilitiesRef")));
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketTabComplete", (BaseData args) -> {
+ 			if (args.has("target")) {
+ 				addToSendQueue(new C14PacketTabComplete(args.getString("msg"),
+ 						BlockPos.fromPluginData(args.getBaseData("target"))));
+ 			} else {
+ 				addToSendQueue(new C14PacketTabComplete(args.getString("msg")));
+ 			}
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketClientSettings", (BaseData args) -> {
+ 			addToSendQueue(new C15PacketClientSettings(args.getString("lang"), args.getInt("view"),
+ 					EntityPlayer.EnumChatVisibility.valueOf(args.getString("chatVisibility")),
+ 					args.getBoolean("enableColors"), args.getInt("modelPartFlags")));
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketClientStatus", (BaseData args) -> {
+ 			addToSendQueue(
+ 					new C16PacketClientStatus(C16PacketClientStatus.EnumState.valueOf(args.getString("status"))));
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketSpectate", (BaseData args) -> {
+ 			addToSendQueue(new C18PacketSpectate(new EaglercraftUUID(args.getString("uuid"))));
+ 		});
+ 		data.setCallbackVoidWithDataArg("sendPacketResourcePackStatus", (BaseData args) -> {
+ 			addToSendQueue(new C19PacketResourcePackStatus(args.getString("hash"),
+ 					C19PacketResourcePackStatus.Action.valueOf(args.getString("status"))));
+ 		});
+ 		return data;
+ 	}
+ 
+ 	/**
+ 	 * + Registers some server properties
+ 	 * (gametype,hardcore-mode,terraintype,difficulty,player limit), creates a new
+ 	 * WorldClient and sets the player initial dimension
+ 	 */
+ 	/**
+ 	 * + Registers some server properties
+ 	 * (gametype,hardcore-mode,terraintype,difficulty,player limit), creates a new
+ 	 * WorldClient and sets the player initial dimension
+ 	 */
+ 	/**
+ 	 * + Registers some server properties
+ 	 * (gametype,hardcore-mode,terraintype,difficulty,player limit), creates a new
+ 	 * WorldClient and sets the player initial dimension
+ 	 */

> CHANGE  1 : 20  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("gameType", packetIn.getGameType().name());
~ 		eventData.set("difficulty", packetIn.getDifficulty().name());
~ 		eventData.set("dimension", packetIn.dimension);
~ 		eventData.set("entityId", packetIn.entityId);
~ 		eventData.set("maxPlayers", packetIn.maxPlayers);
~ 		eventData.set("ip", gameController.currentServerData.serverIP);
~ 
~ 		eventData.set("isHardcoreMode", packetIn.hardcoreMode);
~ 		eventData.set("preventDefault", false);
~ 		BaseData newEventData = PluginAPI.callEvent("packetjoingame", eventData);
~ 		if (newEventData.has("preventDefault") && newEventData.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.dimension = newEventData.has("dimension") ? newEventData.getInt("dimension") : packetIn.dimension;
~ 		packetIn.entityId = newEventData.has("entityId") ? newEventData.getInt("entityId") : packetIn.entityId;
~ 		packetIn.maxPlayers = newEventData.has("maxPlayers") ? newEventData.getInt("maxPlayers") : packetIn.maxPlayers;
~ 		packetIn.hardcoreMode = newEventData.has("hardcoreMode") ? newEventData.getBoolean("hardcoreMode")
~ 				: packetIn.hardcoreMode;

> INSERT  18 : 30  @  18

+ 	/**
+ 	 * + Spawns an instance of the objecttype indicated by the packet and sets its
+ 	 * position and momentum
+ 	 */
+ 	/**
+ 	 * + Spawns an instance of the objecttype indicated by the packet and sets its
+ 	 * position and momentum
+ 	 */
+ 	/**
+ 	 * + Spawns an instance of the objecttype indicated by the packet and sets its
+ 	 * position and momentum
+ 	 */

> CHANGE  1 : 28  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("entityId", packetIn.entityId);
~ 		eventData.set("x", packetIn.x);
~ 		eventData.set("y", packetIn.y);
~ 		eventData.set("z", packetIn.z);
~ 		eventData.set("speedX", packetIn.speedX);
~ 		eventData.set("speedY", packetIn.speedY);
~ 		eventData.set("speedZ", packetIn.speedZ);
~ 		eventData.set("pitch", packetIn.pitch);
~ 		eventData.set("yaw", packetIn.yaw);
~ 		eventData.set("type", packetIn.type);
~ 		eventData.set("preventDefault", false);
~ 		BaseData newEventData = PluginAPI.callEvent("packetspawnobject", eventData);
~ 		if (newEventData.has("preventDefault") && newEventData.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.entityId = newEventData.has("entityId") ? newEventData.getInt("entityId") : packetIn.entityId;
~ 		packetIn.x = newEventData.has("x") ? newEventData.getInt("x") : packetIn.x;
~ 		packetIn.y = newEventData.has("y") ? newEventData.getInt("y") : packetIn.y;
~ 		packetIn.z = newEventData.has("z") ? newEventData.getInt("z") : packetIn.z;
~ 		packetIn.speedX = newEventData.has("speedX") ? newEventData.getInt("speedX") : packetIn.speedX;
~ 		packetIn.speedY = newEventData.has("speedY") ? newEventData.getInt("speedY") : packetIn.speedY;
~ 		packetIn.speedZ = newEventData.has("speedZ") ? newEventData.getInt("speedZ") : packetIn.speedZ;
~ 		packetIn.pitch = newEventData.has("pitch") ? newEventData.getInt("pitch") : packetIn.pitch;
~ 		packetIn.yaw = newEventData.has("yaw") ? newEventData.getInt("yaw") : packetIn.yaw;
~ 		packetIn.type = newEventData.has("type") ? newEventData.getInt("type") : packetIn.type;
~ 

> INSERT  104 : 113  @  104

+ 	/**
+ 	 * + Spawns an experience orb and sets its value (amount of XP)
+ 	 */
+ 	/**
+ 	 * + Spawns an experience orb and sets its value (amount of XP)
+ 	 */
+ 	/**
+ 	 * + Spawns an experience orb and sets its value (amount of XP)
+ 	 */

> CHANGE  1 : 18  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("entityId", packetIn.entityID);
~ 		eventData.set("posX", packetIn.posX);
~ 		eventData.set("posY", packetIn.posY);
~ 		eventData.set("posZ", packetIn.posZ);
~ 		eventData.set("xpValue", packetIn.xpValue);
~ 		BaseData newEvent = PluginAPI.callEvent("packetspawnxporb", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.entityID = newEvent.has("entityId") ? newEvent.getInt("entityId") : packetIn.entityID;
~ 		packetIn.posX = newEvent.has("posX") ? newEvent.getInt("posX") : packetIn.posX;
~ 		packetIn.posY = newEvent.has("posY") ? newEvent.getInt("posY") : packetIn.posY;
~ 		packetIn.posZ = newEvent.has("posZ") ? newEvent.getInt("posZ") : packetIn.posZ;
~ 		packetIn.xpValue = newEvent.has("xpValue") ? newEvent.getInt("xpValue") : packetIn.xpValue;
~ 

> INSERT  11 : 20  @  11

+ 	/**
+ 	 * + Handles globally visible entities. Used in vanilla for lightning bolts
+ 	 */
+ 	/**
+ 	 * + Handles globally visible entities. Used in vanilla for lightning bolts
+ 	 */
+ 	/**
+ 	 * + Handles globally visible entities. Used in vanilla for lightning bolts
+ 	 */

> CHANGE  1 : 18  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("entityId", packetIn.entityId);
~ 		eventData.set("x", packetIn.x);
~ 		eventData.set("y", packetIn.y);
~ 		eventData.set("z", packetIn.z);
~ 		eventData.set("type", packetIn.type);
~ 		BaseData newEvent = PluginAPI.callEvent("packetspawnglobalentity", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.entityId = newEvent.has("entityId") ? newEvent.getInt("entityId") : packetIn.entityId;
~ 		packetIn.x = newEvent.has("x") ? newEvent.getInt("x") : packetIn.x;
~ 		packetIn.y = newEvent.has("y") ? newEvent.getInt("y") : packetIn.y;
~ 		packetIn.z = newEvent.has("z") ? newEvent.getInt("z") : packetIn.z;
~ 		packetIn.type = newEvent.has("type") ? newEvent.getInt("type") : packetIn.type;
~ 

> INSERT  20 : 29  @  20

+ 	/**
+ 	 * + Handles the spawning of a painting object
+ 	 */
+ 	/**
+ 	 * + Handles the spawning of a painting object
+ 	 */
+ 	/**
+ 	 * + Handles the spawning of a painting object
+ 	 */

> CHANGE  1 : 16  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("entityId", packetIn.entityID);
~ 		eventData.set("position", packetIn.position.makePluginData());
~ 		eventData.set("title", packetIn.title);
~ 		BaseData newEvent = PluginAPI.callEvent("packetspawnpainting", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.entityID = newEvent.has("entityId") ? newEvent.getInt("entityId") : packetIn.entityID;
~ 		if (newEvent.has("position")) {
~ 			packetIn.position.loadPluginData(newEvent.getBaseData("position"));
~ 		}
~ 		packetIn.title = newEvent.has("title") ? newEvent.getString("title") : packetIn.title;
~ 

> INSERT  5 : 14  @  5

+ 	/**
+ 	 * + Sets the velocity of the specified entity to the specified value
+ 	 */
+ 	/**
+ 	 * + Sets the velocity of the specified entity to the specified value
+ 	 */
+ 	/**
+ 	 * + Sets the velocity of the specified entity to the specified value
+ 	 */

> CHANGE  1 : 16  @  1 : 2

~ 
~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("entityId", packetIn.entityID);
~ 		eventData.set("motionX", packetIn.motionX);
~ 		eventData.set("motionY", packetIn.motionY);
~ 		eventData.set("motionZ", packetIn.motionZ);
~ 		BaseData newEvent = PluginAPI.callEvent("packetentityvelocity", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.entityID = newEvent.has("entityId") ? newEvent.getInt("entityId") : packetIn.entityID;
~ 		packetIn.motionX = newEvent.has("motionX") ? newEvent.getInt("motionX") : packetIn.motionX;
~ 		packetIn.motionY = newEvent.has("motionY") ? newEvent.getInt("motionY") : packetIn.motionY;
~ 		packetIn.motionZ = newEvent.has("motionZ") ? newEvent.getInt("motionZ") : packetIn.motionZ;

> INSERT  7 : 22  @  7

+ 	/**
+ 	 * + Invoked when the server registers new proximate objects in your watchlist
+ 	 * or when objects in your watchlist have changed -> Registers any changes
+ 	 * locally
+ 	 */
+ 	/**
+ 	 * + Invoked when the server registers new proximate objects in your watchlist
+ 	 * or when objects in your watchlist have changed -> Registers any changes
+ 	 * locally
+ 	 */
+ 	/**
+ 	 * + Invoked when the server registers new proximate objects in your watchlist
+ 	 * or when objects in your watchlist have changed -> Registers any changes
+ 	 * locally
+ 	 */

> CHANGE  1 : 10  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("entityId", packetIn.entityId);
~ 		BaseData newEvent = PluginAPI.callEvent("packetentitymetadata", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.entityId = newEvent.has("entityId") ? newEvent.getInt("entityId") : packetIn.entityId;
~ 

> DELETE  4  @  4 : 5

> INSERT  2 : 14  @  2

+ 	/**
+ 	 * + Handles the creation of a nearby player entity, sets the position and held
+ 	 * item
+ 	 */
+ 	/**
+ 	 * + Handles the creation of a nearby player entity, sets the position and held
+ 	 * item
+ 	 */
+ 	/**
+ 	 * + Handles the creation of a nearby player entity, sets the position and held
+ 	 * item
+ 	 */

> CHANGE  1 : 23  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("entityId", packetIn.entityId);
~ 		eventData.set("playerId", packetIn.playerId.toString());
~ 		eventData.set("x", packetIn.x);
~ 		eventData.set("y", packetIn.y);
~ 		eventData.set("z", packetIn.z);
~ 		eventData.set("yaw", packetIn.yaw);
~ 		eventData.set("pitch", packetIn.pitch);
~ 		eventData.set("currentItem", packetIn.currentItem);
~ 		BaseData newEvent = PluginAPI.callEvent("packetspawnplayer", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.entityId = newEvent.has("entityId") ? newEvent.getInt("entityId") : packetIn.entityId;
~ 		packetIn.x = newEvent.has("x") ? newEvent.getInt("x") : packetIn.x;
~ 		packetIn.y = newEvent.has("y") ? newEvent.getInt("y") : packetIn.y;
~ 		packetIn.z = newEvent.has("z") ? newEvent.getInt("z") : packetIn.z;
~ 		packetIn.yaw = newEvent.has("yaw") ? newEvent.getByte("yaw") : packetIn.yaw;
~ 		packetIn.pitch = newEvent.has("pitch") ? newEvent.getByte("pitch") : packetIn.pitch;
~ 		packetIn.currentItem = newEvent.has("currentItem") ? newEvent.getInt("currentItem") : packetIn.currentItem;
~ 

> INSERT  30 : 39  @  30

+ 	/**
+ 	 * + Updates an entity's position and rotation as specified by the packet
+ 	 */
+ 	/**
+ 	 * + Updates an entity's position and rotation as specified by the packet
+ 	 */
+ 	/**
+ 	 * + Updates an entity's position and rotation as specified by the packet
+ 	 */

> CHANGE  1 : 22  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("entityId", packetIn.entityId);
~ 		eventData.set("posX", packetIn.posX);
~ 		eventData.set("posY", packetIn.posY);
~ 		eventData.set("posZ", packetIn.posZ);
~ 		eventData.set("yaw", packetIn.yaw);
~ 		eventData.set("pitch", packetIn.pitch);
~ 		eventData.set("onGround", packetIn.onGround);
~ 		BaseData newEvent = PluginAPI.callEvent("packetentityteleport", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.entityId = newEvent.has("entityId") ? newEvent.getInt("entityId") : packetIn.entityId;
~ 		packetIn.posX = newEvent.has("posX") ? newEvent.getInt("posX") : packetIn.posX;
~ 		packetIn.posY = newEvent.has("posY") ? newEvent.getInt("posY") : packetIn.posY;
~ 		packetIn.posZ = newEvent.has("posZ") ? newEvent.getInt("posZ") : packetIn.posZ;
~ 		packetIn.yaw = newEvent.has("yaw") ? newEvent.getByte("yaw") : packetIn.yaw;
~ 		packetIn.pitch = newEvent.has("pitch") ? newEvent.getByte("pitch") : packetIn.pitch;
~ 		packetIn.onGround = newEvent.has("onGround") ? newEvent.getBoolean("onGround") : packetIn.onGround;
~ 

> INSERT  21 : 30  @  21

+ 	/**
+ 	 * + Updates which hotbar slot of the player is currently selected
+ 	 */
+ 	/**
+ 	 * + Updates which hotbar slot of the player is currently selected
+ 	 */
+ 	/**
+ 	 * + Updates which hotbar slot of the player is currently selected
+ 	 */

> CHANGE  1 : 11  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("heldItemHotbarIndex", packetIn.heldItemHotbarIndex);
~ 		BaseData newEvent = PluginAPI.callEvent("packethelditemchange", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.heldItemHotbarIndex = newEvent.has("heldItemHotbarIndex") ? newEvent.getInt("heldItemHotbarIndex")
~ 				: packetIn.heldItemHotbarIndex;
~ 

> DELETE  4  @  4 : 5

> INSERT  2 : 20  @  2

+ 	/**
+ 	 * + Updates the specified entity's position by the specified relative moment
+ 	 * and absolute rotation. Note that subclassing of the packet allows for the
+ 	 * specification of a subset of this data (e.g. only rel. position, abs.
+ 	 * rotation or both).
+ 	 */
+ 	/**
+ 	 * + Updates the specified entity's position by the specified relative moment
+ 	 * and absolute rotation. Note that subclassing of the packet allows for the
+ 	 * specification of a subset of this data (e.g. only rel. position, abs.
+ 	 * rotation or both).
+ 	 */
+ 	/**
+ 	 * + Updates the specified entity's position by the specified relative moment
+ 	 * and absolute rotation. Note that subclassing of the packet allows for the
+ 	 * specification of a subset of this data (e.g. only rel. position, abs.
+ 	 * rotation or both).
+ 	 */

> CHANGE  1 : 22  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("entityId", packetIn.entityId);
~ 		eventData.set("posX", packetIn.posX);
~ 		eventData.set("posY", packetIn.posY);
~ 		eventData.set("posZ", packetIn.posZ);
~ 		eventData.set("yaw", packetIn.yaw);
~ 		eventData.set("pitch", packetIn.pitch);
~ 		eventData.set("onGround", packetIn.onGround);
~ 		BaseData newEvent = PluginAPI.callEvent("packetentity", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.entityId = newEvent.has("entityId") ? newEvent.getInt("entityId") : packetIn.entityId;
~ 		packetIn.posX = newEvent.has("posX") ? newEvent.getByte("posX") : packetIn.posX;
~ 		packetIn.posY = newEvent.has("posY") ? newEvent.getByte("posY") : packetIn.posY;
~ 		packetIn.posZ = newEvent.has("posZ") ? newEvent.getByte("posZ") : packetIn.posZ;
~ 		packetIn.yaw = newEvent.has("yaw") ? newEvent.getByte("yaw") : packetIn.yaw;
~ 		packetIn.pitch = newEvent.has("pitch") ? newEvent.getByte("pitch") : packetIn.pitch;
~ 		packetIn.onGround = newEvent.has("onGround") ? newEvent.getBoolean("onGround") : packetIn.onGround;
~ 

> INSERT  16 : 28  @  16

+ 	/**
+ 	 * + Updates the direction in which the specified entity is looking, normally
+ 	 * this head rotation is independent of the rotation of the entity itself
+ 	 */
+ 	/**
+ 	 * + Updates the direction in which the specified entity is looking, normally
+ 	 * this head rotation is independent of the rotation of the entity itself
+ 	 */
+ 	/**
+ 	 * + Updates the direction in which the specified entity is looking, normally
+ 	 * this head rotation is independent of the rotation of the entity itself
+ 	 */

> CHANGE  1 : 12  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("entityId", packetIn.entityId);
~ 		eventData.set("yaw", packetIn.yaw);
~ 		BaseData newEvent = PluginAPI.callEvent("packetentityheadlook", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.entityId = newEvent.has("entityId") ? newEvent.getInt("entityId") : packetIn.entityId;
~ 		packetIn.yaw = newEvent.has("yaw") ? newEvent.getByte("yaw") : packetIn.yaw;
~ 

> INSERT  7 : 25  @  7

+ 	/**
+ 	 * + Locally eliminates the entities. Invoked by the server when the items are
+ 	 * in fact destroyed, or the player is no longer registered as required to
+ 	 * monitor them. The latter happens when distance between the player and item
+ 	 * increases beyond a certain treshold (typically the viewing distance)
+ 	 */
+ 	/**
+ 	 * + Locally eliminates the entities. Invoked by the server when the items are
+ 	 * in fact destroyed, or the player is no longer registered as required to
+ 	 * monitor them. The latter happens when distance between the player and item
+ 	 * increases beyond a certain treshold (typically the viewing distance)
+ 	 */
+ 	/**
+ 	 * + Locally eliminates the entities. Invoked by the server when the items are
+ 	 * in fact destroyed, or the player is no longer registered as required to
+ 	 * monitor them. The latter happens when distance between the player and item
+ 	 * increases beyond a certain treshold (typically the viewing distance)
+ 	 */

> CHANGE  1 : 9  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("entityIDs", packetIn.entityIDs);
~ 		BaseData newEvent = PluginAPI.callEvent("packetdestroyentities", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.entityIDs = newEvent.has("entityIDs") ? newEvent.getIntArr("entityIDs") : packetIn.entityIDs;

> INSERT  7 : 25  @  7

+ 	/**
+ 	 * + Handles changes in player positioning and rotation such as when travelling
+ 	 * to a new dimension, (re)spawning, mounting horses etc. Seems to immediately
+ 	 * reply to the server with the clients post-processing perspective on the
+ 	 * player positioning
+ 	 */
+ 	/**
+ 	 * + Handles changes in player positioning and rotation such as when travelling
+ 	 * to a new dimension, (re)spawning, mounting horses etc. Seems to immediately
+ 	 * reply to the server with the clients post-processing perspective on the
+ 	 * player positioning
+ 	 */
+ 	/**
+ 	 * + Handles changes in player positioning and rotation such as when travelling
+ 	 * to a new dimension, (re)spawning, mounting horses etc. Seems to immediately
+ 	 * reply to the server with the clients post-processing perspective on the
+ 	 * player positioning
+ 	 */

> CHANGE  1 : 18  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("x", packetIn.x);
~ 		eventData.set("y", packetIn.y);
~ 		eventData.set("z", packetIn.z);
~ 		eventData.set("yaw", packetIn.yaw);
~ 		eventData.set("pitch", packetIn.pitch);
~ 		BaseData newEvent = PluginAPI.callEvent("packetplayerposlook", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.x = newEvent.has("x") ? newEvent.getDouble("x") : packetIn.x;
~ 		packetIn.y = newEvent.has("y") ? newEvent.getDouble("y") : packetIn.y;
~ 		packetIn.z = newEvent.has("z") ? newEvent.getDouble("z") : packetIn.z;
~ 		packetIn.yaw = newEvent.has("yaw") ? newEvent.getFloat("yaw") : packetIn.yaw;
~ 		packetIn.pitch = newEvent.has("pitch") ? newEvent.getFloat("pitch") : packetIn.pitch;
~ 

> INSERT  46 : 64  @  46

+ 	/**
+ 	 * + Received from the servers PlayerManager if between 1 and 64 blocks in a
+ 	 * chunk are changed. If only one block requires an update, the server sends
+ 	 * S23PacketBlockChange and if 64 or more blocks are changed, the server sends
+ 	 * S21PacketChunkData
+ 	 */
+ 	/**
+ 	 * + Received from the servers PlayerManager if between 1 and 64 blocks in a
+ 	 * chunk are changed. If only one block requires an update, the server sends
+ 	 * S23PacketBlockChange and if 64 or more blocks are changed, the server sends
+ 	 * S21PacketChunkData
+ 	 */
+ 	/**
+ 	 * + Received from the servers PlayerManager if between 1 and 64 blocks in a
+ 	 * chunk are changed. If only one block requires an update, the server sends
+ 	 * S23PacketBlockChange and if 64 or more blocks are changed, the server sends
+ 	 * S21PacketChunkData
+ 	 */

> CHANGE  1 : 7  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		BaseData newEvent = PluginAPI.callEvent("packetmultiblockchange", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}

> INSERT  9 : 21  @  9

+ 	/**
+ 	 * + Updates the specified chunk with the supplied data, marks it for
+ 	 * re-rendering and lighting recalculation
+ 	 */
+ 	/**
+ 	 * + Updates the specified chunk with the supplied data, marks it for
+ 	 * re-rendering and lighting recalculation
+ 	 */
+ 	/**
+ 	 * + Updates the specified chunk with the supplied data, marks it for
+ 	 * re-rendering and lighting recalculation
+ 	 */

> CHANGE  1 : 16  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("chunkX", packetIn.chunkX);
~ 		eventData.set("chunkZ", packetIn.chunkZ);
~ 		eventData.set("extractedData", packetIn.extractedData.makePluginData());
~ 		BaseData newEvent = PluginAPI.callEvent("packetchunkdata", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.chunkX = newEvent.has("chunkX") ? newEvent.getInt("chunkX") : packetIn.chunkX;
~ 		packetIn.chunkZ = newEvent.has("chunkZ") ? newEvent.getInt("chunkZ") : packetIn.chunkZ;
~ 		if (newEvent.has("extractedData")) {
~ 			packetIn.extractedData.loadPluginData(newEvent.getBaseData("extractedData"));
~ 		}
~ 

> INSERT  21 : 33  @  21

+ 	/**
+ 	 * + Updates the block and metadata and generates a blockupdate (and notify the
+ 	 * clients)
+ 	 */
+ 	/**
+ 	 * + Updates the block and metadata and generates a blockupdate (and notify the
+ 	 * clients)
+ 	 */
+ 	/**
+ 	 * + Updates the block and metadata and generates a blockupdate (and notify the
+ 	 * clients)
+ 	 */

> CHANGE  1 : 12  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("blockPosition", packetIn.blockPosition.makePluginData());
~ 		BaseData newEvent = PluginAPI.callEvent("packetblockchange", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		if (newEvent.has("blockPosition")) {
~ 			packetIn.blockPosition.loadPluginData(newEvent.getBaseData("blockPosition"));
~ 		}
~ 

> INSERT  3 : 12  @  3

+ 	/**
+ 	 * + Closes the network channel
+ 	 */
+ 	/**
+ 	 * + Closes the network channel
+ 	 */
+ 	/**
+ 	 * + Closes the network channel
+ 	 */

> INSERT  1 : 13  @  1

+ 		PluginData eventData = new PluginData();
+ 		eventData.set("preventDefault", false);
+ 		eventData.set("reason", packetIn.reason.getFormattedText());
+ 		BaseData newEvent = PluginAPI.callEvent("packetdisconnect", eventData);
+ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
+ 			return;
+ 		}
+ 		if (newEvent.has("reason")
+ 				&& (newEvent.getString("reason").length() != packetIn.reason.getFormattedText().length())) {
+ 			packetIn.reason = new ChatComponentText(newEvent.getString("reason"));
+ 		}
+ 

> INSERT  3 : 15  @  3

+ 	/**
+ 	 * + Invoked when disconnecting, the parameter is a ChatComponent describing the
+ 	 * reason for termination
+ 	 */
+ 	/**
+ 	 * + Invoked when disconnecting, the parameter is a ChatComponent describing the
+ 	 * reason for termination
+ 	 */
+ 	/**
+ 	 * + Invoked when disconnecting, the parameter is a ChatComponent describing the
+ 	 * reason for termination
+ 	 */

> CHANGE  1 : 4  @  1 : 2

~ 		if (this.gameController.theWorld != null) {
~ 			this.gameController.loadWorld((WorldClient) null);
~ 		}

> CHANGE  1 : 3  @  1 : 9

~ 			this.gameController
~ 					.displayGuiScreen(new GuiDisconnected(this.guiScreenServer, "disconnect.lost", ichatcomponent));

> DELETE  4  @  4 : 5

> CHANGE  3 : 18  @  3 : 4

~ 		if (PluginAPI.clientPacketSendEventsEnabled) {
~ 			PluginData eventData = new PluginData();
~ 			eventData.set("preventDefault", false);
~ 			setPropertiesFromPacket(eventData, parPacket);
~ 			// PluginAPI.logger.info("Send packet ev ::
~ 			// "+getEventNameFromPacket(parPacket));
~ 			BaseData newEvent = PluginAPI.callEvent(getEventNameFromPacket(parPacket), eventData);
~ 			if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 				return;
~ 			}
~ 			Packet newPacket = setPropertiesToPacket(newEvent, parPacket);
~ 			this.netManager.sendPacket(newPacket);
~ 		} else {
~ 			this.netManager.sendPacket(parPacket);
~ 		}

> INSERT  2 : 436  @  2

+ 	public String getEventNameFromPacket(Packet packet) {
+ 		if (packet instanceof C0APacketAnimation) {
+ 			return "sendpacketanimation";
+ 		} else if (packet instanceof C0BPacketEntityAction) {
+ 			return "sendpacketentityaction";
+ 		} else if (packet instanceof C0CPacketInput) {
+ 			return "sendpacketinput";
+ 		} else if (packet instanceof C0DPacketCloseWindow) {
+ 			return "sendpacketclosewindow";
+ 		} else if (packet instanceof C0EPacketClickWindow) {
+ 			return "sendpacketclickwindow";
+ 		} else if (packet instanceof C0FPacketConfirmTransaction) {
+ 			return "sendpacketconfirmtransaction";
+ 		} else if (packet instanceof C00PacketKeepAlive) {
+ 			return "sendpacketkeepalive";
+ 		} else if (packet instanceof C01PacketChatMessage) {
+ 			return "sendpacketchatmessage";
+ 		} else if (packet instanceof C02PacketUseEntity) {
+ 			return "sendpacketuseentity";
+ 		} else if (packet instanceof C04PacketPlayerPosition) {
+ 			return "sendpacketplayerposition";
+ 		} else if (packet instanceof C05PacketPlayerLook) {
+ 			return "sendpacketplayerlook";
+ 		} else if (packet instanceof C06PacketPlayerPosLook) {
+ 			return "sendpacketplayerposlook";
+ 		} else if (packet instanceof C03PacketPlayer) {
+ 			return "sendpacketplayer";
+ 		} else if (packet instanceof C07PacketPlayerDigging) {
+ 			return "sendpacketplayerdigging";
+ 		} else if (packet instanceof C08PacketPlayerBlockPlacement) {
+ 			return "sendpacketplayerblockplacement";
+ 		} else if (packet instanceof C09PacketHeldItemChange) {
+ 			return "sendpackethelditemchange";
+ 		} else if (packet instanceof C10PacketCreativeInventoryAction) {
+ 			return "sendpacketcreativeinventoryaction";
+ 		} else if (packet instanceof C11PacketEnchantItem) {
+ 			return "sendpacketenchantitem";
+ 		} else if (packet instanceof C12PacketUpdateSign) {
+ 			return "sendpacketupdatesign";
+ 		} else if (packet instanceof C13PacketPlayerAbilities) {
+ 			return "sendpacketplayerabilities";
+ 		} else if (packet instanceof C14PacketTabComplete) {
+ 			return "sendpackettabcomplete";
+ 		} else if (packet instanceof C15PacketClientSettings) {
+ 			return "sendpacketclientsettings";
+ 		} else if (packet instanceof C16PacketClientStatus) {
+ 			return "sendpacketclientstatus";
+ 		} else if (packet instanceof C17PacketCustomPayload) {
+ 			return "sendpacketcustompayload";
+ 		} else if (packet instanceof C18PacketSpectate) {
+ 			return "sendpacketspectate";
+ 		} else if (packet instanceof C19PacketResourcePackStatus) {
+ 			return "sendpacketresourcepackstatus";
+ 		}
+ 		return "sendpacketunknown";
+ 	}
+ 
+ 	public void setPropertiesFromPacket(BaseData data, Packet packet) {
+ 		if (packet instanceof C0APacketAnimation) {
+ 			C0APacketAnimation newPacket = (C0APacketAnimation) packet;
+ 			// Nothing to do
+ 			return;
+ 		} else if (packet instanceof C0BPacketEntityAction) {
+ 			C0BPacketEntityAction newPacket = (C0BPacketEntityAction) packet;
+ 			data.set("entityID", newPacket.entityID);
+ 			data.set("action", newPacket.action.name());
+ 			data.set("auxData", newPacket.auxData);
+ 			return;
+ 		} else if (packet instanceof C0CPacketInput) {
+ 			C0CPacketInput newPacket = (C0CPacketInput) packet;
+ 			data.set("strafeSpeed", newPacket.strafeSpeed);
+ 			data.set("forwardSpeed", newPacket.forwardSpeed);
+ 			data.set("jumping", newPacket.jumping);
+ 			data.set("sneaking", newPacket.sneaking);
+ 			return;
+ 		} else if (packet instanceof C0DPacketCloseWindow) {
+ 			C0DPacketCloseWindow newPacket = (C0DPacketCloseWindow) packet;
+ 			data.set("windowId", newPacket.windowId);
+ 			return;
+ 		} else if (packet instanceof C0EPacketClickWindow) {
+ 			C0EPacketClickWindow newPacket = (C0EPacketClickWindow) packet;
+ 			data.set("windowId", newPacket.windowId);
+ 			data.set("slotId", newPacket.slotId);
+ 			data.set("usedButton", newPacket.usedButton);
+ 			data.set("actionNumber", newPacket.actionNumber);
+ 			if (newPacket.clickedItem != null) {
+ 				data.set("clickedItem", newPacket.clickedItem.makePluginData());
+ 			}
+ 			data.set("mode", newPacket.mode);
+ 			return;
+ 		} else if (packet instanceof C0FPacketConfirmTransaction) {
+ 			C0FPacketConfirmTransaction newPacket = (C0FPacketConfirmTransaction) packet;
+ 			data.set("windowId", newPacket.windowId);
+ 			data.set("uid", newPacket.uid);
+ 			data.set("accepted", newPacket.accepted);
+ 			return;
+ 		} else if (packet instanceof C00PacketKeepAlive) {
+ 			C00PacketKeepAlive newPacket = (C00PacketKeepAlive) packet;
+ 			data.set("key", newPacket.key);
+ 			return;
+ 		} else if (packet instanceof C01PacketChatMessage) {
+ 			C01PacketChatMessage newPacket = (C01PacketChatMessage) packet;
+ 			data.set("message", newPacket.message);
+ 			return;
+ 		} else if (packet instanceof C02PacketUseEntity) {
+ 			C02PacketUseEntity newPacket = (C02PacketUseEntity) packet;
+ 			data.set("entityId", newPacket.entityId);
+ 			data.set("action", newPacket.action.name());
+ 			if (newPacket.hitVec != null) {
+ 				data.set("hitVec", newPacket.hitVec.makePluginData());
+ 			}
+ 			return;
+ 		} else if (packet instanceof C04PacketPlayerPosition) {
+ 			C04PacketPlayerPosition newPacket = (C04PacketPlayerPosition) packet;
+ 			data.set("x", newPacket.x);
+ 			data.set("y", newPacket.y);
+ 			data.set("z", newPacket.z);
+ 			data.set("yaw", newPacket.yaw);
+ 			data.set("pitch", newPacket.pitch);
+ 			data.set("onGround", newPacket.onGround);
+ 			data.set("moving", newPacket.moving);
+ 			data.set("rotating", newPacket.rotating);
+ 			return;
+ 		} else if (packet instanceof C05PacketPlayerLook) {
+ 			C05PacketPlayerLook newPacket = (C05PacketPlayerLook) packet;
+ 			data.set("x", newPacket.x);
+ 			data.set("y", newPacket.y);
+ 			data.set("z", newPacket.z);
+ 			data.set("yaw", newPacket.yaw);
+ 			data.set("pitch", newPacket.pitch);
+ 			data.set("onGround", newPacket.onGround);
+ 			data.set("moving", newPacket.moving);
+ 			data.set("rotating", newPacket.rotating);
+ 			return;
+ 		} else if (packet instanceof C06PacketPlayerPosLook) {
+ 			C06PacketPlayerPosLook newPacket = (C06PacketPlayerPosLook) packet;
+ 			data.set("x", newPacket.x);
+ 			data.set("y", newPacket.y);
+ 			data.set("z", newPacket.z);
+ 			data.set("yaw", newPacket.yaw);
+ 			data.set("pitch", newPacket.pitch);
+ 			data.set("onGround", newPacket.onGround);
+ 			data.set("moving", newPacket.moving);
+ 			data.set("rotating", newPacket.rotating);
+ 			return;
+ 		} else if (packet instanceof C03PacketPlayer) {
+ 			C03PacketPlayer newPacket = (C03PacketPlayer) packet;
+ 			data.set("x", newPacket.x);
+ 			data.set("y", newPacket.y);
+ 			data.set("z", newPacket.z);
+ 			data.set("yaw", newPacket.yaw);
+ 			data.set("pitch", newPacket.pitch);
+ 			data.set("onGround", newPacket.onGround);
+ 			data.set("moving", newPacket.moving);
+ 			data.set("rotating", newPacket.rotating);
+ 			return;
+ 		} else if (packet instanceof C07PacketPlayerDigging) {
+ 			C07PacketPlayerDigging newPacket = (C07PacketPlayerDigging) packet;
+ 			data.set("position", newPacket.position.makePluginData());
+ 			data.set("facing", newPacket.facing.name());
+ 			data.set("status", newPacket.status.name());
+ 			return;
+ 		} else if (packet instanceof C08PacketPlayerBlockPlacement) {
+ 			C08PacketPlayerBlockPlacement newPacket = (C08PacketPlayerBlockPlacement) packet;
+ 			data.set("placedBlockDirection", newPacket.placedBlockDirection);
+ 			data.set("facingX", newPacket.facingX);
+ 			data.set("facingY", newPacket.facingY);
+ 			data.set("facingZ", newPacket.facingZ);
+ 			data.set("position", newPacket.position.makePluginData());
+ 			if (newPacket.stack != null) {
+ 				data.set("stack", newPacket.stack.makePluginData());
+ 			}
+ 			return;
+ 		} else if (packet instanceof C09PacketHeldItemChange) {
+ 			C09PacketHeldItemChange newPacket = (C09PacketHeldItemChange) packet;
+ 			data.set("slotId", newPacket.slotId);
+ 			return;
+ 		} else if (packet instanceof C10PacketCreativeInventoryAction) {
+ 			C10PacketCreativeInventoryAction newPacket = (C10PacketCreativeInventoryAction) packet;
+ 			data.set("slotId", newPacket.slotId);
+ 			if (newPacket.stack != null) {
+ 				data.set("stack", newPacket.stack.makePluginData());
+ 			}
+ 			return;
+ 		} else if (packet instanceof C11PacketEnchantItem) {
+ 			C11PacketEnchantItem newPacket = (C11PacketEnchantItem) packet;
+ 			data.set("windowId", newPacket.windowId);
+ 			data.set("button", newPacket.button);
+ 			return;
+ 		} else if (packet instanceof C12PacketUpdateSign) {
+ 			C12PacketUpdateSign newPacket = (C12PacketUpdateSign) packet;
+ 			if (newPacket.pos != null) {
+ 				data.set("pos", newPacket.pos.makePluginData());
+ 			}
+ 			String[] stringArr = new String[newPacket.lines.length];
+ 			for (int i = 0; i < stringArr.length; i++) {
+ 				if (newPacket.lines[i] != null) {
+ 					stringArr[i] = newPacket.lines[i].getFormattedText();
+ 				}
+ 			}
+ 			data.set("lines", stringArr);
+ 			return;
+ 		} else if (packet instanceof C13PacketPlayerAbilities) {
+ 			C13PacketPlayerAbilities newPacket = (C13PacketPlayerAbilities) packet;
+ 			data.set("invulnerable", newPacket.invulnerable);
+ 			data.set("flying", newPacket.flying);
+ 			data.set("allowFlying", newPacket.allowFlying);
+ 			data.set("creativeMode", newPacket.creativeMode);
+ 			data.set("flySpeed", newPacket.flySpeed);
+ 			data.set("walkSpeed", newPacket.walkSpeed);
+ 			return;
+ 		} else if (packet instanceof C14PacketTabComplete) {
+ 			C14PacketTabComplete newPacket = (C14PacketTabComplete) packet;
+ 			data.set("message", newPacket.message);
+ 			if (newPacket.targetBlock != null) {
+ 				data.set("targetBlock", newPacket.targetBlock.makePluginData());
+ 			}
+ 			return;
+ 		} else if (packet instanceof C15PacketClientSettings) {
+ 			C15PacketClientSettings newPacket = (C15PacketClientSettings) packet;
+ 			data.set("lang", newPacket.lang);
+ 			data.set("view", newPacket.view);
+ 			data.set("chatVisibility", newPacket.chatVisibility.name());
+ 			data.set("enableColors", newPacket.enableColors);
+ 			data.set("modelPartFlags", newPacket.modelPartFlags);
+ 			return;
+ 		} else if (packet instanceof C16PacketClientStatus) {
+ 			C16PacketClientStatus newPacket = (C16PacketClientStatus) packet;
+ 			data.set("status", newPacket.status.name());
+ 			return;
+ 		} else if (packet instanceof C17PacketCustomPayload) {
+ 			C17PacketCustomPayload newPacket = (C17PacketCustomPayload) packet;
+ 			data.set("channel", newPacket.channel);
+ 			return;
+ 		} else if (packet instanceof C18PacketSpectate) {
+ 			C18PacketSpectate newPacket = (C18PacketSpectate) packet;
+ 			data.set("id", newPacket.id.toString());
+ 			return;
+ 		} else if (packet instanceof C19PacketResourcePackStatus) {
+ 			C19PacketResourcePackStatus newPacket = (C19PacketResourcePackStatus) packet;
+ 			data.set("hash", newPacket.hash);
+ 			data.set("status", newPacket.status.name());
+ 			return;
+ 		}
+ 	}
+ 
+ 	public Packet setPropertiesToPacket(BaseData data, Packet packet) {
+ 		if (packet instanceof C0APacketAnimation) {
+ 			C0APacketAnimation newPacket = (C0APacketAnimation) packet;
+ 			// Nothing to do
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C0BPacketEntityAction) {
+ 			C0BPacketEntityAction newPacket = (C0BPacketEntityAction) packet;
+ 			newPacket.entityID = data.getInt("entityID");
+ 			newPacket.auxData = data.getInt("auxData");
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C0CPacketInput) {
+ 			C0CPacketInput newPacket = (C0CPacketInput) packet;
+ 			newPacket.strafeSpeed = data.getFloat("strafeSpeed");
+ 			newPacket.forwardSpeed = data.getFloat("forwardSpeed");
+ 			newPacket.jumping = data.getBoolean("jumping");
+ 			newPacket.sneaking = data.getBoolean("sneaking");
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C0DPacketCloseWindow) {
+ 			C0DPacketCloseWindow newPacket = (C0DPacketCloseWindow) packet;
+ 			newPacket.windowId = data.getInt("windowId");
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C0EPacketClickWindow) {
+ 			C0EPacketClickWindow newPacket = (C0EPacketClickWindow) packet;
+ 			newPacket.windowId = data.getInt("windowId");
+ 			newPacket.slotId = data.getInt("slotId");
+ 			newPacket.usedButton = data.getInt("usedButton");
+ 			newPacket.actionNumber = data.getShort("actionNumber");
+ 			newPacket.mode = data.getInt("mode");
+ 			if (data.has("clickedItem")) {
+ 				newPacket.clickedItem = (ItemStack) data.getRef("clickedItem");
+ 			}
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C0FPacketConfirmTransaction) {
+ 			C0FPacketConfirmTransaction newPacket = (C0FPacketConfirmTransaction) packet;
+ 			newPacket.windowId = data.getInt("windowId");
+ 			newPacket.uid = data.getShort("uid");
+ 			newPacket.accepted = data.getBoolean("accepted");
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C00PacketKeepAlive) {
+ 			C00PacketKeepAlive newPacket = (C00PacketKeepAlive) packet;
+ 			newPacket.key = data.getInt("key");
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C01PacketChatMessage) {
+ 			C01PacketChatMessage newPacket = (C01PacketChatMessage) packet;
+ 			newPacket.message = data.getString("message");
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C02PacketUseEntity) {
+ 			C02PacketUseEntity newPacket = (C02PacketUseEntity) packet;
+ 			newPacket.entityId = data.getInt("entityId");
+ 			newPacket.action = C02PacketUseEntity.Action.valueOf(data.getString("action"));
+ 			if (newPacket.hitVec != null) {
+ 				newPacket.hitVec.loadPluginData(data.getBaseData("hitVec"));
+ 			}
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C04PacketPlayerPosition) {
+ 			C04PacketPlayerPosition newPacket = (C04PacketPlayerPosition) packet;
+ 			newPacket.x = data.getDouble("x");
+ 			newPacket.y = data.getDouble("y");
+ 			newPacket.z = data.getDouble("z");
+ 			newPacket.yaw = data.getFloat("yaw");
+ 			newPacket.pitch = data.getFloat("pitch");
+ 			newPacket.onGround = data.getBoolean("onGround");
+ 			newPacket.moving = data.getBoolean("moving");
+ 			newPacket.rotating = data.getBoolean("rotating");
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C05PacketPlayerLook) {
+ 			C05PacketPlayerLook newPacket = (C05PacketPlayerLook) packet;
+ 			newPacket.x = data.getDouble("x");
+ 			newPacket.y = data.getDouble("y");
+ 			newPacket.z = data.getDouble("z");
+ 			newPacket.yaw = data.getFloat("yaw");
+ 			newPacket.pitch = data.getFloat("pitch");
+ 			newPacket.onGround = data.getBoolean("onGround");
+ 			newPacket.moving = data.getBoolean("moving");
+ 			newPacket.rotating = data.getBoolean("rotating");
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C06PacketPlayerPosLook) {
+ 			C06PacketPlayerPosLook newPacket = (C06PacketPlayerPosLook) packet;
+ 			newPacket.x = data.getDouble("x");
+ 			newPacket.y = data.getDouble("y");
+ 			newPacket.z = data.getDouble("z");
+ 			newPacket.yaw = data.getFloat("yaw");
+ 			newPacket.pitch = data.getFloat("pitch");
+ 			newPacket.onGround = data.getBoolean("onGround");
+ 			newPacket.moving = data.getBoolean("moving");
+ 			newPacket.rotating = data.getBoolean("rotating");
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C03PacketPlayer) {
+ 			C03PacketPlayer newPacket = (C03PacketPlayer) packet;
+ 			newPacket.x = data.getDouble("x");
+ 			newPacket.y = data.getDouble("y");
+ 			newPacket.z = data.getDouble("z");
+ 			newPacket.yaw = data.getFloat("yaw");
+ 			newPacket.pitch = data.getFloat("pitch");
+ 			newPacket.onGround = data.getBoolean("onGround");
+ 			newPacket.moving = data.getBoolean("moving");
+ 			newPacket.rotating = data.getBoolean("rotating");
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C07PacketPlayerDigging) {
+ 			C07PacketPlayerDigging newPacket = (C07PacketPlayerDigging) packet;
+ 			newPacket.position = BlockPos.fromPluginData(data.getBaseData("position"));
+ 			newPacket.facing = EnumFacing.valueOf(data.getString("facing"));
+ 			newPacket.status = C07PacketPlayerDigging.Action.valueOf(data.getString("status"));
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C08PacketPlayerBlockPlacement) {
+ 			C08PacketPlayerBlockPlacement newPacket = (C08PacketPlayerBlockPlacement) packet;
+ 			newPacket.placedBlockDirection = data.getInt("placedBlockDirection");
+ 			newPacket.facingX = data.getFloat("facingX");
+ 			newPacket.facingY = data.getFloat("facingY");
+ 			newPacket.facingZ = data.getFloat("facingZ");
+ 			newPacket.position = BlockPos.fromPluginData(data.getBaseData("position"));
+ 			if (data.has("stack")) {
+ 				newPacket.stack = (ItemStack) data.getRef("stack");
+ 			}
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C09PacketHeldItemChange) {
+ 			C09PacketHeldItemChange newPacket = (C09PacketHeldItemChange) packet;
+ 			newPacket.slotId = data.getInt("slotId");
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C10PacketCreativeInventoryAction) {
+ 			C10PacketCreativeInventoryAction newPacket = (C10PacketCreativeInventoryAction) packet;
+ 			if (data.has("stack")) {
+ 				newPacket.stack = (ItemStack) data.getRef("stack");
+ 			}
+ 			newPacket.slotId = data.getInt("slotId");
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C11PacketEnchantItem) {
+ 			C11PacketEnchantItem newPacket = (C11PacketEnchantItem) packet;
+ 			newPacket.windowId = data.getInt("windowId");
+ 			newPacket.button = data.getInt("button");
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C12PacketUpdateSign) {
+ 			C12PacketUpdateSign newPacket = (C12PacketUpdateSign) packet;
+ 			if (data.has("pos")) {
+ 				newPacket.pos = (BlockPos) data.getRef("pos");
+ 			}
+ 			String[] stringArr = data.getStringArr("lines");
+ 			for (int i = 0; i < stringArr.length; i++) {
+ 				if (stringArr[i] != null && (stringArr[i].length() != newPacket.lines[i].getFormattedText().length())) {
+ 					newPacket.lines[i] = new ChatComponentText(stringArr[i]);
+ 				}
+ 			}
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C13PacketPlayerAbilities) {
+ 			C13PacketPlayerAbilities newPacket = (C13PacketPlayerAbilities) packet;
+ 			newPacket.invulnerable = data.getBoolean("invulnerable");
+ 			newPacket.flying = data.getBoolean("flying");
+ 			newPacket.allowFlying = data.getBoolean("allowFlying");
+ 			newPacket.creativeMode = data.getBoolean("creativeMode");
+ 			newPacket.flySpeed = data.getFloat("flySpeed");
+ 			newPacket.walkSpeed = data.getFloat("walkSpeed");
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C14PacketTabComplete) {
+ 			C14PacketTabComplete newPacket = (C14PacketTabComplete) packet;
+ 			if (data.has("targetBlock")) {
+ 				newPacket.targetBlock = (BlockPos) data.getRef("targetBlock");
+ 			}
+ 			newPacket.message = data.getString("message");
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C15PacketClientSettings) {
+ 			C15PacketClientSettings newPacket = (C15PacketClientSettings) packet;
+ 			newPacket.lang = data.getString("lang");
+ 			newPacket.view = data.getInt("view");
+ 			newPacket.chatVisibility = EntityPlayer.EnumChatVisibility.valueOf(data.getString("chatVisibility"));
+ 			newPacket.enableColors = data.getBoolean("enableColors");
+ 			newPacket.modelPartFlags = data.getInt("modelPartFlags");
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C16PacketClientStatus) {
+ 			C16PacketClientStatus newPacket = (C16PacketClientStatus) packet;
+ 			newPacket.status = C16PacketClientStatus.EnumState.valueOf(data.getString("status"));
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C17PacketCustomPayload) {
+ 			C17PacketCustomPayload newPacket = (C17PacketCustomPayload) packet;
+ 			newPacket.channel = data.getString("channel");
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C18PacketSpectate) {
+ 			C18PacketSpectate newPacket = (C18PacketSpectate) packet;
+ 			newPacket.id = new EaglercraftUUID(data.getString("id"));
+ 			return (Packet) newPacket;
+ 		} else if (packet instanceof C19PacketResourcePackStatus) {
+ 			C19PacketResourcePackStatus newPacket = (C19PacketResourcePackStatus) packet;
+ 			newPacket.hash = data.getString("hash");
+ 			newPacket.status = C19PacketResourcePackStatus.Action.valueOf(data.getString("status"));
+ 			return (Packet) newPacket;
+ 		}
+ 		return packet;
+ 	}
+ 

> CHANGE  1 : 14  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("collectedItemEntityId", packetIn.collectedItemEntityId);
~ 		eventData.set("entityId", packetIn.entityId);
~ 		BaseData newEvent = PluginAPI.callEvent("packetcollectitem", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.collectedItemEntityId = newEvent.has("collectedItemEntityId")
~ 				? newEvent.getInt("collectedItemEntityId")
~ 				: packetIn.collectedItemEntityId;
~ 		packetIn.entityId = newEvent.has("entityId") ? newEvent.getInt("entityId") : packetIn.entityId;
~ 

> INSERT  22 : 31  @  22

+ 	/**
+ 	 * + Prints a chatmessage in the chat GUI
+ 	 */
+ 	/**
+ 	 * + Prints a chatmessage in the chat GUI
+ 	 */
+ 	/**
+ 	 * + Prints a chatmessage in the chat GUI
+ 	 */

> CHANGE  1 : 15  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("type", packetIn.type);
~ 		eventData.set("chat", packetIn.chatComponent.getFormattedText());
~ 		BaseData newEvent = PluginAPI.callEvent("packetchat", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.type = newEvent.has("type") ? newEvent.getByte("type") : packetIn.type;
~ 		if (newEvent.has("chat")
~ 				&& (newEvent.getString("chat").length() != packetIn.chatComponent.getFormattedText().length())) {
~ 			packetIn.chatComponent = new ChatComponentText(newEvent.getString("chat"));
~ 		}
~ 

> DELETE  5  @  5 : 6

> INSERT  2 : 17  @  2

+ 	/**
+ 	 * + Renders a specified animation: Waking up a player, a living entity swinging
+ 	 * its currently held item, being hurt or receiving a critical hit by normal or
+ 	 * magical means
+ 	 */
+ 	/**
+ 	 * + Renders a specified animation: Waking up a player, a living entity swinging
+ 	 * its currently held item, being hurt or receiving a critical hit by normal or
+ 	 * magical means
+ 	 */
+ 	/**
+ 	 * + Renders a specified animation: Waking up a player, a living entity swinging
+ 	 * its currently held item, being hurt or receiving a critical hit by normal or
+ 	 * magical means
+ 	 */

> CHANGE  1 : 12  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("entityId", packetIn.entityId);
~ 		eventData.set("type", packetIn.type);
~ 		BaseData newEvent = PluginAPI.callEvent("packetanimation", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.entityId = newEvent.has("entityId") ? newEvent.getInt("entityId") : packetIn.entityId;
~ 		packetIn.type = newEvent.has("type") ? newEvent.getInt("type") : packetIn.type;
~ 

> INSERT  19 : 31  @  19

+ 	/**
+ 	 * + Retrieves the player identified by the packet, puts him to sleep if
+ 	 * possible (and flags whether all players are asleep)
+ 	 */
+ 	/**
+ 	 * + Retrieves the player identified by the packet, puts him to sleep if
+ 	 * possible (and flags whether all players are asleep)
+ 	 */
+ 	/**
+ 	 * + Retrieves the player identified by the packet, puts him to sleep if
+ 	 * possible (and flags whether all players are asleep)
+ 	 */

> CHANGE  1 : 14  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("bedPos", packetIn.bedPos.makePluginData());
~ 		eventData.set("playerID", packetIn.playerID);
~ 		BaseData newEvent = PluginAPI.callEvent("packetusebed", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		if (newEvent.has("bedPos")) {
~ 			packetIn.bedPos.loadPluginData(newEvent.getBaseData("bedPos"));
~ 		}
~ 		packetIn.playerID = newEvent.has("playerID") ? newEvent.getInt("playerID") : packetIn.playerID;
~ 

> INSERT  3 : 18  @  3

+ 	/**
+ 	 * + Spawns the mob entity at the specified location, with the specified
+ 	 * rotation, momentum and type. Updates the entities Datawatchers with the
+ 	 * entity metadata specified in the packet
+ 	 */
+ 	/**
+ 	 * + Spawns the mob entity at the specified location, with the specified
+ 	 * rotation, momentum and type. Updates the entities Datawatchers with the
+ 	 * entity metadata specified in the packet
+ 	 */
+ 	/**
+ 	 * + Spawns the mob entity at the specified location, with the specified
+ 	 * rotation, momentum and type. Updates the entities Datawatchers with the
+ 	 * entity metadata specified in the packet
+ 	 */

> CHANGE  1 : 30  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("entityId", packetIn.entityId);
~ 		eventData.set("type", packetIn.type);
~ 		eventData.set("x", packetIn.x);
~ 		eventData.set("y", packetIn.y);
~ 		eventData.set("z", packetIn.z);
~ 		eventData.set("velocityX", packetIn.velocityX);
~ 		eventData.set("velocityY", packetIn.velocityY);
~ 		eventData.set("velocityZ", packetIn.velocityZ);
~ 		eventData.set("yaw", packetIn.yaw);
~ 		eventData.set("pitch", packetIn.pitch);
~ 		eventData.set("headPitch", packetIn.headPitch);
~ 		BaseData newEvent = PluginAPI.callEvent("packetspawnmob", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.entityId = newEvent.has("entityId") ? newEvent.getInt("entityId") : packetIn.entityId;
~ 		packetIn.type = newEvent.has("type") ? newEvent.getInt("type") : packetIn.type;
~ 		packetIn.x = newEvent.has("x") ? newEvent.getInt("x") : packetIn.x;
~ 		packetIn.y = newEvent.has("y") ? newEvent.getInt("y") : packetIn.y;
~ 		packetIn.z = newEvent.has("z") ? newEvent.getInt("z") : packetIn.z;
~ 		packetIn.velocityX = newEvent.has("velocityX") ? newEvent.getInt("velocityX") : packetIn.velocityX;
~ 		packetIn.velocityY = newEvent.has("velocityY") ? newEvent.getInt("velocityY") : packetIn.velocityY;
~ 		packetIn.velocityZ = newEvent.has("velocityZ") ? newEvent.getInt("velocityZ") : packetIn.velocityZ;
~ 		packetIn.yaw = newEvent.has("yaw") ? newEvent.getByte("yaw") : packetIn.yaw;
~ 		packetIn.pitch = newEvent.has("pitch") ? newEvent.getByte("pitch") : packetIn.pitch;
~ 		packetIn.headPitch = newEvent.has("headPitch") ? newEvent.getByte("headPitch") : packetIn.headPitch;
~ 

> CHANGE  35 : 44  @  35 : 36

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("totalWorldTime", (double) packetIn.totalWorldTime);
~ 		eventData.set("worldTime", (double) packetIn.worldTime);
~ 		BaseData newEvent = PluginAPI.callEvent("packettimeupdate", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 

> CHANGE  5 : 16  @  5 : 6

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("spawnBlockPos", packetIn.spawnBlockPos.makePluginData());
~ 		BaseData newEvent = PluginAPI.callEvent("packetspawnposition", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		if (newEvent.has("spawnBlockPos")) {
~ 			packetIn.spawnBlockPos.loadPluginData(newEvent.getBaseData("spawnBlockPos"));
~ 		}
~ 

> CHANGE  5 : 19  @  5 : 6

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("leash", packetIn.leash);
~ 		eventData.set("entityId", packetIn.entityId);
~ 		eventData.set("vehicleEntityId", packetIn.vehicleEntityId);
~ 		BaseData newEvent = PluginAPI.callEvent("packetentityattatch", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.leash = newEvent.has("leash") ? newEvent.getInt("leash") : packetIn.leash;
~ 		packetIn.entityId = newEvent.has("entityId") ? newEvent.getInt("entityId") : packetIn.entityId;
~ 		packetIn.vehicleEntityId = newEvent.has("vehicleEntityId") ? newEvent.getInt("vehicleEntityId")
~ 				: packetIn.vehicleEntityId;
~ 

> INSERT  38 : 62  @  38

+ 	/**
+ 	 * + Invokes the entities' handleUpdateHealth method which is implemented in
+ 	 * LivingBase (hurt/death), MinecartMobSpawner (spawn delay), FireworkRocket &
+ 	 * MinecartTNT (explosion), IronGolem (throwing,...), Witch (spawn particles),
+ 	 * Zombie (villager transformation), Animal (breeding mode particles), Horse
+ 	 * (breeding/smoke particles), Sheep (...), Tameable (...), Villager (particles
+ 	 * for breeding mode, angry and happy), Wolf (...)
+ 	 */
+ 	/**
+ 	 * + Invokes the entities' handleUpdateHealth method which is implemented in
+ 	 * LivingBase (hurt/death), MinecartMobSpawner (spawn delay), FireworkRocket &
+ 	 * MinecartTNT (explosion), IronGolem (throwing,...), Witch (spawn particles),
+ 	 * Zombie (villager transformation), Animal (breeding mode particles), Horse
+ 	 * (breeding/smoke particles), Sheep (...), Tameable (...), Villager (particles
+ 	 * for breeding mode, angry and happy), Wolf (...)
+ 	 */
+ 	/**
+ 	 * + Invokes the entities' handleUpdateHealth method which is implemented in
+ 	 * LivingBase (hurt/death), MinecartMobSpawner (spawn delay), FireworkRocket &
+ 	 * MinecartTNT (explosion), IronGolem (throwing,...), Witch (spawn particles),
+ 	 * Zombie (villager transformation), Animal (breeding mode particles), Horse
+ 	 * (breeding/smoke particles), Sheep (...), Tameable (...), Villager (particles
+ 	 * for breeding mode, angry and happy), Wolf (...)
+ 	 */

> CHANGE  1 : 12  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("entityId", packetIn.entityId);
~ 		eventData.set("logicOpcode", packetIn.logicOpcode);
~ 		BaseData newEvent = PluginAPI.callEvent("packetentitystatus", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.entityId = newEvent.has("entityId") ? newEvent.getInt("entityId") : packetIn.entityId;
~ 		packetIn.logicOpcode = newEvent.has("logicOpcode") ? newEvent.getByte("logicOpcode") : packetIn.logicOpcode;
~ 

> CHANGE  12 : 26  @  12 : 13

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("health", packetIn.health);
~ 		eventData.set("foodLevel", packetIn.foodLevel);
~ 		eventData.set("saturationLevel", packetIn.saturationLevel);
~ 		BaseData newEvent = PluginAPI.callEvent("packetupdatehealth", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.foodLevel = newEvent.has("foodLevel") ? newEvent.getInt("foodLevel") : packetIn.foodLevel;
~ 		packetIn.health = newEvent.has("health") ? newEvent.getFloat("health") : packetIn.health;
~ 		packetIn.saturationLevel = newEvent.has("saturationLevel") ? newEvent.getFloat("saturationLevel")
~ 				: packetIn.saturationLevel;
~ 

> CHANGE  6 : 18  @  6 : 7

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("totalExperience", packetIn.totalExperience);
~ 		eventData.set("level", packetIn.level);
~ 		BaseData newEvent = PluginAPI.callEvent("packetsetxp", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.totalExperience = newEvent.has("totalExperience") ? newEvent.getInt("totalExperience")
~ 				: packetIn.totalExperience;
~ 		packetIn.level = newEvent.has("level") ? newEvent.getInt("level") : packetIn.level;
~ 

> CHANGE  5 : 16  @  5 : 6

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("dimensionID", packetIn.dimensionID);
~ 		eventData.set("difficulty", packetIn.difficulty.name());
~ 		eventData.set("gameType", packetIn.gameType.name());
~ 		BaseData newEvent = PluginAPI.callEvent("packetrespawn", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.dimensionID = newEvent.has("dimensionID") ? newEvent.getInt("dimensionID") : packetIn.dimensionID;
~ 

> INSERT  16 : 28  @  16

+ 	/**
+ 	 * + Initiates a new explosion (sound, particles, drop spawn) for the affected
+ 	 * blocks indicated by the packet.
+ 	 */
+ 	/**
+ 	 * + Initiates a new explosion (sound, particles, drop spawn) for the affected
+ 	 * blocks indicated by the packet.
+ 	 */
+ 	/**
+ 	 * + Initiates a new explosion (sound, particles, drop spawn) for the affected
+ 	 * blocks indicated by the packet.
+ 	 */

> CHANGE  1 : 16  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("posX", packetIn.posX);
~ 		eventData.set("posY", packetIn.posY);
~ 		eventData.set("posZ", packetIn.posZ);
~ 		eventData.set("strength", packetIn.strength);
~ 		BaseData newEvent = PluginAPI.callEvent("packetexplosion", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.posX = newEvent.has("posX") ? newEvent.getDouble("posX") : packetIn.posX;
~ 		packetIn.posY = newEvent.has("posY") ? newEvent.getDouble("posY") : packetIn.posY;
~ 		packetIn.posZ = newEvent.has("posZ") ? newEvent.getDouble("posZ") : packetIn.posZ;
~ 		packetIn.strength = newEvent.has("strength") ? newEvent.getFloat("strength") : packetIn.strength;
~ 

> INSERT  8 : 23  @  8

+ 	/**
+ 	 * + Displays a GUI by ID. In order starting from id 0: Chest, Workbench,
+ 	 * Furnace, Dispenser, Enchanting table, Brewing stand, Villager merchant,
+ 	 * Beacon, Anvil, Hopper, Dropper, Horse
+ 	 */
+ 	/**
+ 	 * + Displays a GUI by ID. In order starting from id 0: Chest, Workbench,
+ 	 * Furnace, Dispenser, Enchanting table, Brewing stand, Villager merchant,
+ 	 * Beacon, Anvil, Hopper, Dropper, Horse
+ 	 */
+ 	/**
+ 	 * + Displays a GUI by ID. In order starting from id 0: Chest, Workbench,
+ 	 * Furnace, Dispenser, Enchanting table, Brewing stand, Villager merchant,
+ 	 * Beacon, Anvil, Hopper, Dropper, Horse
+ 	 */

> CHANGE  1 : 19  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("windowId", packetIn.windowId);
~ 		eventData.set("inventoryType", packetIn.inventoryType);
~ 		eventData.set("slotCount", packetIn.slotCount);
~ 		eventData.set("entityId", packetIn.entityId);
~ 
~ 		eventData.set("windowTitle", packetIn.windowTitle.getFormattedText());
~ 		BaseData newEvent = PluginAPI.callEvent("packetopenwindow", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.windowId = newEvent.has("windowId") ? newEvent.getInt("windowId") : packetIn.windowId;
~ 		packetIn.slotCount = newEvent.has("slotCount") ? newEvent.getInt("slotCount") : packetIn.slotCount;
~ 		packetIn.entityId = newEvent.has("entityId") ? newEvent.getInt("entityId") : packetIn.entityId;
~ 		packetIn.inventoryType = newEvent.has("inventoryType") ? newEvent.getString("inventoryType")
~ 				: packetIn.inventoryType;
~ 

> INSERT  26 : 38  @  26

+ 	/**
+ 	 * + Handles pickin up an ItemStack or dropping one in your inventory or an open
+ 	 * (non-creative) container
+ 	 */
+ 	/**
+ 	 * + Handles pickin up an ItemStack or dropping one in your inventory or an open
+ 	 * (non-creative) container
+ 	 */
+ 	/**
+ 	 * + Handles pickin up an ItemStack or dropping one in your inventory or an open
+ 	 * (non-creative) container
+ 	 */

> CHANGE  1 : 18  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("windowId", packetIn.windowId);
~ 		eventData.set("slot", packetIn.slot);
~ 		if (packetIn.item != null) {
~ 			eventData.set("item", packetIn.item.makePluginData());
~ 		}
~ 		BaseData newEvent = PluginAPI.callEvent("packetsetslot", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		if (newEvent.has("item") && packetIn.item != null) {
~ 			packetIn.item.loadPluginData(newEvent.getBaseData("item"));
~ 		}
~ 		packetIn.windowId = newEvent.has("windowId") ? newEvent.getInt("windowId") : packetIn.windowId;
~ 		packetIn.slot = newEvent.has("slot") ? newEvent.getInt("slot") : packetIn.slot;
~ 

> INSERT  26 : 38  @  26

+ 	/**
+ 	 * + Verifies that the server and client are synchronized with respect to the
+ 	 * inventory/container opened by the player and confirms if it is the case.
+ 	 */
+ 	/**
+ 	 * + Verifies that the server and client are synchronized with respect to the
+ 	 * inventory/container opened by the player and confirms if it is the case.
+ 	 */
+ 	/**
+ 	 * + Verifies that the server and client are synchronized with respect to the
+ 	 * inventory/container opened by the player and confirms if it is the case.
+ 	 */

> CHANGE  1 : 13  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("windowId", packetIn.windowId);
~ 		eventData.set("actionNumber", packetIn.actionNumber);
~ 		BaseData newEvent = PluginAPI.callEvent("packetconfirmtransaction", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.windowId = newEvent.has("windowId") ? newEvent.getInt("windowId") : packetIn.windowId;
~ 		packetIn.actionNumber = newEvent.has("actionNumber") ? newEvent.getShort("actionNumber")
~ 				: packetIn.actionNumber;
~ 

> INSERT  15 : 27  @  15

+ 	/**
+ 	 * + Handles the placement of a specified ItemStack in a specified
+ 	 * container/inventory slot
+ 	 */
+ 	/**
+ 	 * + Handles the placement of a specified ItemStack in a specified
+ 	 * container/inventory slot
+ 	 */
+ 	/**
+ 	 * + Handles the placement of a specified ItemStack in a specified
+ 	 * container/inventory slot
+ 	 */

> CHANGE  1 : 26  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		PluginData[] parBaseDatas = new PluginData[packetIn.itemStacks.length];
~ 		for (int i = 0; i < packetIn.itemStacks.length; i++) {
~ 			if (packetIn.itemStacks[i] != null) {
~ 				parBaseDatas[i] = packetIn.itemStacks[i].makePluginData();
~ 			}
~ 		}
~ 		eventData.set("windowId", packetIn.windowId);
~ 		eventData.set("itemStacks", parBaseDatas);
~ 		BaseData newEvent = PluginAPI.callEvent("packetwindowitems", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.windowId = newEvent.has("windowId") ? newEvent.getInt("windowId") : packetIn.windowId;
~ 
~ 		BaseData[] parItemStacks = newEvent.getBaseDataArr("itemStacks");
~ 		for (int i = 0; i < parItemStacks.length && i < packetIn.itemStacks.length; i++) {
~ 			if (packetIn.itemStacks[i] != null) {
~ 				packetIn.itemStacks[i].loadPluginData(parItemStacks[i]);
~ 			} else if (parItemStacks[i] != null) {
~ 				packetIn.itemStacks[i] = ItemStack.fromPluginData(parItemStacks[i]);
~ 			}
~ 		}
~ 

> INSERT  9 : 21  @  9

+ 	/**
+ 	 * + Creates a sign in the specified location if it didn't exist and opens the
+ 	 * GUI to edit its text
+ 	 */
+ 	/**
+ 	 * + Creates a sign in the specified location if it didn't exist and opens the
+ 	 * GUI to edit its text
+ 	 */
+ 	/**
+ 	 * + Creates a sign in the specified location if it didn't exist and opens the
+ 	 * GUI to edit its text
+ 	 */

> CHANGE  1 : 12  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("signPosition", packetIn.signPosition.makePluginData());
~ 		BaseData newEvent = PluginAPI.callEvent("packetsigneditoropen", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		if (newEvent.has("signPosition")) {
~ 			packetIn.signPosition.loadPluginData(newEvent.getBaseData("signPosition"));
~ 		}
~ 

> INSERT  10 : 19  @  10

+ 	/**
+ 	 * + Updates a specified sign with the specified text lines
+ 	 */
+ 	/**
+ 	 * + Updates a specified sign with the specified text lines
+ 	 */
+ 	/**
+ 	 * + Updates a specified sign with the specified text lines
+ 	 */

> CHANGE  1 : 12  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("blockPos", packetIn.blockPos.makePluginData());
~ 		BaseData newEvent = PluginAPI.callEvent("packetupdatesign", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		if (newEvent.has("blockPos")) {
~ 			packetIn.blockPos.loadPluginData(newEvent.getBaseData("blockPos"));
~ 		}
~ 

> INSERT  21 : 33  @  21

+ 	/**
+ 	 * + Updates the NBTTagCompound metadata of instances of the following
+ 	 * entitytypes: Mob spawners, command blocks, beacons, skulls, flowerpot
+ 	 */
+ 	/**
+ 	 * + Updates the NBTTagCompound metadata of instances of the following
+ 	 * entitytypes: Mob spawners, command blocks, beacons, skulls, flowerpot
+ 	 */
+ 	/**
+ 	 * + Updates the NBTTagCompound metadata of instances of the following
+ 	 * entitytypes: Mob spawners, command blocks, beacons, skulls, flowerpot
+ 	 */

> CHANGE  1 : 14  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("blockPos", packetIn.blockPos.makePluginData());
~ 		eventData.set("metadata", packetIn.metadata);
~ 		BaseData newEvent = PluginAPI.callEvent("packetupdatetileentity", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		if (newEvent.has("blockPos")) {
~ 			packetIn.blockPos.loadPluginData(newEvent.getBaseData("blockPos"));
~ 		}
~ 		packetIn.metadata = newEvent.has("metadata") ? newEvent.getInt("metadata") : packetIn.metadata;
~ 

> DELETE  12  @  12 : 13

> INSERT  2 : 11  @  2

+ 	/**
+ 	 * + Sets the progressbar of the opened window to the specified value
+ 	 */
+ 	/**
+ 	 * + Sets the progressbar of the opened window to the specified value
+ 	 */
+ 	/**
+ 	 * + Sets the progressbar of the opened window to the specified value
+ 	 */

> CHANGE  1 : 14  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("windowId", packetIn.windowId);
~ 		eventData.set("varValue", packetIn.varValue);
~ 		eventData.set("varIndex", packetIn.varIndex);
~ 		BaseData newEvent = PluginAPI.callEvent("packetwindowproperty", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.windowId = newEvent.has("windowId") ? newEvent.getInt("windowId") : packetIn.windowId;
~ 		packetIn.varValue = newEvent.has("varValue") ? newEvent.getInt("varValue") : packetIn.varValue;
~ 		packetIn.varIndex = newEvent.has("varIndex") ? newEvent.getInt("varIndex") : packetIn.varIndex;
~ 

> CHANGE  8 : 26  @  8 : 9

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("entityID", packetIn.entityID);
~ 		eventData.set("equipmentSlot", packetIn.equipmentSlot);
~ 		if (packetIn.itemStack != null) {
~ 			eventData.set("itemStack", packetIn.itemStack.makePluginData());
~ 		}
~ 		BaseData newEvent = PluginAPI.callEvent("packetentityequipment", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.entityID = newEvent.has("entityID") ? newEvent.getInt("entityID") : packetIn.entityID;
~ 		packetIn.equipmentSlot = newEvent.has("equipmentSlot") ? newEvent.getInt("equipmentSlot")
~ 				: packetIn.equipmentSlot;
~ 		if (newEvent.has("itemStack") && packetIn.itemStack != null) {
~ 			packetIn.itemStack.loadPluginData(newEvent.getBaseData("itemStack"));
~ 		}
~ 

> INSERT  7 : 16  @  7

+ 	/**
+ 	 * + Resets the ItemStack held in hand and closes the window that is opened
+ 	 */
+ 	/**
+ 	 * + Resets the ItemStack held in hand and closes the window that is opened
+ 	 */
+ 	/**
+ 	 * + Resets the ItemStack held in hand and closes the window that is opened
+ 	 */

> CHANGE  1 : 10  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("windowId", packetIn.windowId);
~ 		BaseData newEvent = PluginAPI.callEvent("packetclosewindow", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.windowId = newEvent.has("windowId") ? newEvent.getInt("windowId") : packetIn.windowId;
~ 

> INSERT  3 : 21  @  3

+ 	/**
+ 	 * + Triggers Block.onBlockEventReceived, which is implemented in
+ 	 * BlockPistonBase for extension/retraction, BlockNote for setting the
+ 	 * instrument (including audiovisual feedback) and in BlockContainer to set the
+ 	 * number of players accessing a (Ender)Chest
+ 	 */
+ 	/**
+ 	 * + Triggers Block.onBlockEventReceived, which is implemented in
+ 	 * BlockPistonBase for extension/retraction, BlockNote for setting the
+ 	 * instrument (including audiovisual feedback) and in BlockContainer to set the
+ 	 * number of players accessing a (Ender)Chest
+ 	 */
+ 	/**
+ 	 * + Triggers Block.onBlockEventReceived, which is implemented in
+ 	 * BlockPistonBase for extension/retraction, BlockNote for setting the
+ 	 * instrument (including audiovisual feedback) and in BlockContainer to set the
+ 	 * number of players accessing a (Ender)Chest
+ 	 */

> CHANGE  1 : 20  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("instrument", packetIn.instrument);
~ 		eventData.set("pitch", packetIn.pitch);
~ 		eventData.set("blockPosition", packetIn.blockPosition.makePluginData());
~ 		eventData.set("block", packetIn.block.makePluginData());
~ 		BaseData newEvent = PluginAPI.callEvent("packetblockaction", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.instrument = newEvent.has("instrument") ? newEvent.getInt("instrument") : packetIn.instrument;
~ 		packetIn.pitch = newEvent.has("pitch") ? newEvent.getInt("pitch") : packetIn.pitch;
~ 		if (newEvent.has("blockPosition")) {
~ 			packetIn.blockPosition.loadPluginData(newEvent.getBaseData("blockPosition"));
~ 		}
~ 		if (newEvent.has("block")) {
~ 			packetIn.block.loadPluginData(newEvent.getBaseData("block"));
~ 		}
~ 

> INSERT  4 : 16  @  4

+ 	/**
+ 	 * + Updates all registered IWorldAccess instances with
+ 	 * destroyBlockInWorldPartially
+ 	 */
+ 	/**
+ 	 * + Updates all registered IWorldAccess instances with
+ 	 * destroyBlockInWorldPartially
+ 	 */
+ 	/**
+ 	 * + Updates all registered IWorldAccess instances with
+ 	 * destroyBlockInWorldPartially
+ 	 */

> CHANGE  1 : 16  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("breakerId", packetIn.breakerId);
~ 		eventData.set("progress", packetIn.progress);
~ 		eventData.set("position", packetIn.position.makePluginData());
~ 		BaseData newEvent = PluginAPI.callEvent("packetblockbreakanim", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.breakerId = newEvent.has("breakerId") ? newEvent.getInt("breakerId") : packetIn.breakerId;
~ 		packetIn.progress = newEvent.has("progress") ? newEvent.getInt("progress") : packetIn.progress;
~ 		if (newEvent.has("position")) {
~ 			packetIn.position.loadPluginData(newEvent.getBaseData("position"));
~ 		}
~ 

> CHANGE  5 : 17  @  5 : 6

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("xPositions", packetIn.xPositions);
~ 		eventData.set("zPositions", packetIn.zPositions);
~ 		eventData.set("isOverworld", packetIn.isOverworld);
~ 		PluginData[] chunkDataArr = new PluginData[packetIn.chunksData.length];
~ 		for (int i = 0; i < chunkDataArr.length; i++) {
~ 			if (packetIn.chunksData[i] != null) {
~ 				chunkDataArr[i] = packetIn.chunksData[i].makePluginData();
~ 			}
~ 		}
~ 		eventData.set("chunksData", chunkDataArr);

> INSERT  1 : 17  @  1

+ 		BaseData newEvent = PluginAPI.callEvent("packetmapchunkbulk", eventData);
+ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
+ 			return;
+ 		}
+ 		packetIn.xPositions = newEvent.has("xPositions") ? newEvent.getIntArr("xPositions") : packetIn.xPositions;
+ 		packetIn.zPositions = newEvent.has("zPositions") ? newEvent.getIntArr("zPositions") : packetIn.zPositions;
+ 		packetIn.isOverworld = newEvent.has("isOverworld") ? newEvent.getBoolean("isOverworld") : packetIn.isOverworld;
+ 		if (newEvent.has("chunksData")) {
+ 			BaseData[] parChunkDatas = newEvent.getBaseDataArr("chunksData");
+ 			for (int k = 0; k < packetIn.chunksData.length; k++) {
+ 				if (parChunkDatas[k] != null && packetIn.chunksData[k] != null) {
+ 					packetIn.chunksData[k].loadPluginData(parChunkDatas[k]);
+ 				}
+ 			}
+ 		}
+ 

> CHANGE  18 : 27  @  18 : 19

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("state", packetIn.state);
~ 		BaseData newEvent = PluginAPI.callEvent("packetchangegamestate", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.state = newEvent.has("state") ? newEvent.getInt("state") : packetIn.state;
~ 

> CHANGE  21 : 24  @  21 : 40

~ 
~ 			// minecraft demo screen
~ 

> INSERT  17 : 29  @  17

+ 	/**
+ 	 * + Updates the worlds MapStorage with the specified MapData for the specified
+ 	 * map-identifier and invokes a MapItemRenderer for it
+ 	 */
+ 	/**
+ 	 * + Updates the worlds MapStorage with the specified MapData for the specified
+ 	 * map-identifier and invokes a MapItemRenderer for it
+ 	 */
+ 	/**
+ 	 * + Updates the worlds MapStorage with the specified MapData for the specified
+ 	 * map-identifier and invokes a MapItemRenderer for it
+ 	 */

> CHANGE  1 : 43  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("mapId", packetIn.mapId);
~ 		eventData.set("mapScale", packetIn.mapScale);
~ 
~ 		eventData.set("mapMinX", packetIn.mapMinX);
~ 		eventData.set("mapMinY", packetIn.mapMinY);
~ 		eventData.set("mapMaxX", packetIn.mapMaxX);
~ 		eventData.set("mapMaxY", packetIn.mapMaxY);
~ 		eventData.set("mapDataBytes", packetIn.mapDataBytes);
~ 
~ 		PluginData[] playerMapData = new PluginData[packetIn.mapVisiblePlayersVec4b.length];
~ 		for (int i = 0; i < playerMapData.length; i++) {
~ 			if (packetIn.mapVisiblePlayersVec4b[i] != null) {
~ 				playerMapData[i] = packetIn.mapVisiblePlayersVec4b[i].makePluginData();
~ 			}
~ 		}
~ 		eventData.set("mapVisiblePlayersVec4b", playerMapData);
~ 
~ 		BaseData newEvent = PluginAPI.callEvent("packetmaps", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.mapId = newEvent.has("mapId") ? newEvent.getInt("mapId") : packetIn.mapId;
~ 		packetIn.mapScale = newEvent.has("mapScale") ? newEvent.getByte("mapScale") : packetIn.mapScale;
~ 
~ 		packetIn.mapMinX = newEvent.has("mapMinX") ? newEvent.getInt("mapMinX") : packetIn.mapMinX;
~ 		packetIn.mapMinY = newEvent.has("mapMinY") ? newEvent.getInt("mapMinY") : packetIn.mapMinY;
~ 		packetIn.mapMaxX = newEvent.has("mapMaxX") ? newEvent.getInt("mapMaxX") : packetIn.mapMaxX;
~ 		packetIn.mapMaxY = newEvent.has("mapMaxY") ? newEvent.getInt("mapMaxY") : packetIn.mapMaxY;
~ 		packetIn.mapDataBytes = newEvent.has("mapDataBytes") ? newEvent.getByteArr("mapDataBytes")
~ 				: packetIn.mapDataBytes;
~ 
~ 		if (newEvent.has("mapVisiblePlayersVec4b")) {
~ 			BaseData[] parChunkDatas = newEvent.getBaseDataArr("mapVisiblePlayersVec4b");
~ 			for (int k = 0; k < packetIn.mapVisiblePlayersVec4b.length; k++) {
~ 				if (parChunkDatas[k] != null && packetIn.mapVisiblePlayersVec4b[k] != null) {
~ 					packetIn.mapVisiblePlayersVec4b[k].loadPluginData(parChunkDatas[k]);
~ 				}
~ 			}
~ 		}
~ 

> CHANGE  6 : 23  @  6 : 7

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("soundType", packetIn.soundType);
~ 		eventData.set("soundData", packetIn.soundData);
~ 		eventData.set("soundPos", packetIn.soundPos.makePluginData());
~ 		eventData.set("serverWide", packetIn.serverWide);
~ 		BaseData newEvent = PluginAPI.callEvent("packeteffect", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.soundType = newEvent.has("soundType") ? newEvent.getInt("soundType") : packetIn.soundType;
~ 		packetIn.soundData = newEvent.has("soundData") ? newEvent.getInt("soundData") : packetIn.soundData;
~ 		packetIn.serverWide = newEvent.has("serverWide") ? newEvent.getBoolean("serverWide") : packetIn.serverWide;
~ 		if (newEvent.has("soundPos")) {
~ 			packetIn.soundPos.loadPluginData(newEvent.getBaseData("soundPos"));
~ 		}
~ 

> INSERT  10 : 19  @  10

+ 	/**
+ 	 * + Updates the players statistics or achievements
+ 	 */
+ 	/**
+ 	 * + Updates the players statistics or achievements
+ 	 */
+ 	/**
+ 	 * + Updates the players statistics or achievements
+ 	 */

> CHANGE  1 : 8  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		BaseData newEvent = PluginAPI.callEvent("packetstatistics", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 

> DELETE  9  @  9 : 10

> CHANGE  25 : 43  @  25 : 26

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("entityId", packetIn.entityId);
~ 		eventData.set("duration", packetIn.duration);
~ 		eventData.set("effectId", packetIn.effectId);
~ 		eventData.set("amplifier", packetIn.amplifier);
~ 		eventData.set("hideParticles", packetIn.hideParticles);
~ 		BaseData newEvent = PluginAPI.callEvent("packetentityeffect", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.entityId = newEvent.has("entityId") ? newEvent.getInt("entityId") : packetIn.entityId;
~ 		packetIn.duration = newEvent.has("duration") ? newEvent.getInt("duration") : packetIn.duration;
~ 		packetIn.effectId = newEvent.has("effectId") ? newEvent.getByte("effectId") : packetIn.effectId;
~ 		packetIn.amplifier = newEvent.has("amplifier") ? newEvent.getByte("amplifier") : packetIn.amplifier;
~ 		packetIn.hideParticles = newEvent.has("hideParticles") ? newEvent.getByte("hideParticles")
~ 				: packetIn.hideParticles;
~ 

> CHANGE  10 : 17  @  10 : 25

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("deathMessage", packetIn.deathMessage);
~ 		eventData.set("eventType", packetIn.eventType.name());
~ 		BaseData newEvent = PluginAPI.callEvent("packetcombatevent", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;

> INSERT  1 : 3  @  1

+ 		packetIn.deathMessage = newEvent.has("deathMessage") ? newEvent.getString("deathMessage")
+ 				: packetIn.deathMessage;

> INSERT  1 : 3  @  1

+ 		// used by twitch stream
+ 

> CHANGE  3 : 14  @  3 : 4

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("difficulty", packetIn.difficulty.name());
~ 		eventData.set("difficultyLocked", packetIn.difficultyLocked);
~ 		BaseData newEvent = PluginAPI.callEvent("packetserverdifficulty", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.difficultyLocked = newEvent.has("difficultyLocked") ? newEvent.getBoolean("difficultyLocked")
~ 				: packetIn.difficultyLocked;
~ 

> CHANGE  5 : 14  @  5 : 6

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("entityId", packetIn.entityId);
~ 		BaseData newEvent = PluginAPI.callEvent("packetcamera", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.entityId = newEvent.has("entityId") ? newEvent.getInt("entityId") : packetIn.entityId;
~ 

> CHANGE  8 : 33  @  8 : 9

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("action", packetIn.action.name());
~ 
~ 		eventData.set("size", packetIn.size);
~ 		eventData.set("centerX", packetIn.centerX);
~ 		eventData.set("centerZ", packetIn.centerZ);
~ 		eventData.set("targetSize", packetIn.targetSize);
~ 		eventData.set("diameter", packetIn.diameter);
~ 		eventData.set("warningTime", packetIn.warningTime);
~ 		eventData.set("warningDistance", packetIn.warningDistance);
~ 		eventData.set("timeUntilTarget", (double) packetIn.timeUntilTarget);
~ 		BaseData newEvent = PluginAPI.callEvent("packetworldborder", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.size = newEvent.has("size") ? newEvent.getInt("size") : packetIn.size;
~ 		packetIn.centerX = newEvent.has("centerX") ? newEvent.getDouble("centerX") : packetIn.centerX;
~ 		packetIn.centerZ = newEvent.has("centerZ") ? newEvent.getDouble("centerZ") : packetIn.centerZ;
~ 		packetIn.targetSize = newEvent.has("targetSize") ? newEvent.getDouble("targetSize") : packetIn.targetSize;
~ 		packetIn.diameter = newEvent.has("diameter") ? newEvent.getDouble("diameter") : packetIn.diameter;
~ 		packetIn.warningTime = newEvent.has("warningTime") ? newEvent.getInt("warningTime") : packetIn.warningTime;
~ 		packetIn.warningDistance = newEvent.has("warningDistance") ? newEvent.getInt("warningDistance")
~ 				: packetIn.warningDistance;
~ 

> CHANGE  4 : 23  @  4 : 5

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("type", packetIn.type.name());
~ 		eventData.set("message", packetIn.message.getFormattedText());
~ 		eventData.set("fadeInTime", packetIn.fadeInTime);
~ 		eventData.set("displayTime", packetIn.displayTime);
~ 		eventData.set("fadeOutTime", packetIn.fadeOutTime);
~ 		BaseData newEvent = PluginAPI.callEvent("packettitle", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		if (newEvent.has("message")
~ 				&& (newEvent.getString("message").length() != packetIn.message.getFormattedText().length())) {
~ 			packetIn.message = new ChatComponentText(newEvent.getString("message"));
~ 		}
~ 		packetIn.fadeInTime = newEvent.has("fadeInTime") ? newEvent.getInt("fadeInTime") : packetIn.fadeInTime;
~ 		packetIn.displayTime = newEvent.has("displayTime") ? newEvent.getInt("displayTime") : packetIn.displayTime;
~ 		packetIn.fadeOutTime = newEvent.has("fadeOutTime") ? newEvent.getInt("fadeOutTime") : packetIn.fadeOutTime;
~ 

> INSERT  22 : 31  @  22

+ 		PluginData eventData = new PluginData();
+ 		eventData.set("preventDefault", false);
+ 		eventData.set("threshold", packetIn.field_179761_a);
+ 		BaseData newEvent = PluginAPI.callEvent("packetsetcompressionlevel", eventData);
+ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
+ 			return;
+ 		}
+ 		packetIn.field_179761_a = newEvent.has("threshold") ? newEvent.getInt("threshold") : packetIn.field_179761_a;
+ 

> INSERT  7 : 24  @  7

+ 		PluginData eventData = new PluginData();
+ 		eventData.set("preventDefault", false);
+ 		eventData.set("header", packetIn.header.getFormattedText());
+ 		eventData.set("footer", packetIn.footer.getFormattedText());
+ 		BaseData newEvent = PluginAPI.callEvent("packetplayerlistheaderfooter", eventData);
+ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
+ 			return;
+ 		}
+ 		if (newEvent.has("header")
+ 				&& (newEvent.getString("header").length() != packetIn.header.getFormattedText().length())) {
+ 			packetIn.header = new ChatComponentText(newEvent.getString("header"));
+ 		}
+ 		if (newEvent.has("footer")
+ 				&& (newEvent.getString("footer").length() != packetIn.footer.getFormattedText().length())) {
+ 			packetIn.footer = new ChatComponentText(newEvent.getString("footer"));
+ 		}
+ 

> CHANGE  7 : 18  @  7 : 8

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("entityId", packetIn.entityId);
~ 		eventData.set("effectId", packetIn.effectId);
~ 		BaseData newEvent = PluginAPI.callEvent("packetremoveentityeffect", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.entityId = newEvent.has("entityId") ? newEvent.getInt("entityId") : packetIn.entityId;
~ 		packetIn.effectId = newEvent.has("effectId") ? newEvent.getInt("effectId") : packetIn.effectId;
~ 

> CHANGE  8 : 11  @  8 : 9

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("action", packetIn.action.name());

> INSERT  1 : 14  @  1

+ 		PluginData[] packetPlayers = new PluginData[packetIn.players.size()];
+ 		for (int i = 0; i < packetPlayers.length; i++) {
+ 			if (packetIn.players.get(i) != null) {
+ 				packetPlayers[i] = packetIn.players.get(i).makePluginData();
+ 			}
+ 		}
+ 		eventData.set("players", packetPlayers);
+ 
+ 		BaseData newEvent = PluginAPI.callEvent("packetplayerlistitem", eventData);
+ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
+ 			return;
+ 		}
+ 

> CHANGE  2 : 5  @  2 : 3

~ 				EaglercraftUUID uuid = s38packetplayerlistitem$addplayerdata.getProfile().getId();
~ 				this.playerInfoMap.remove(uuid);
~ 				this.skinCache.evictSkin(uuid);

> INSERT  30 : 39  @  30

+ 		PluginData eventData = new PluginData();
+ 		eventData.set("preventDefault", false);
+ 		eventData.set("id", packetIn.id);
+ 		BaseData newEvent = PluginAPI.callEvent("packetkeepalive", eventData);
+ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
+ 			return;
+ 		}
+ 		packetIn.id = newEvent.has("id") ? newEvent.getInt("id") : packetIn.id;
+ 

> CHANGE  4 : 25  @  4 : 5

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("flySpeed", packetIn.flySpeed);
~ 		eventData.set("walkSpeed", packetIn.walkSpeed);
~ 		eventData.set("invulnerable", packetIn.invulnerable);
~ 		eventData.set("flying", packetIn.flying);
~ 		eventData.set("creativeMode", packetIn.creativeMode);
~ 		eventData.set("allowFlying", packetIn.allowFlying);
~ 		BaseData newEvent = PluginAPI.callEvent("packetplayerabilities", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.flySpeed = newEvent.has("flySpeed") ? newEvent.getFloat("flySpeed") : packetIn.flySpeed;
~ 		packetIn.walkSpeed = newEvent.has("walkSpeed") ? newEvent.getFloat("walkSpeed") : packetIn.walkSpeed;
~ 		packetIn.invulnerable = newEvent.has("invulnerable") ? newEvent.getBoolean("invulnerable")
~ 				: packetIn.invulnerable;
~ 		packetIn.flying = newEvent.has("flying") ? newEvent.getBoolean("flying") : packetIn.flying;
~ 		packetIn.creativeMode = newEvent.has("creativeMode") ? newEvent.getBoolean("creativeMode")
~ 				: packetIn.creativeMode;
~ 		packetIn.allowFlying = newEvent.has("allowFlying") ? newEvent.getBoolean("allowFlying") : packetIn.allowFlying;
~ 

> INSERT  9 : 18  @  9

+ 	/**
+ 	 * + Displays the available command-completion options the server knows of
+ 	 */
+ 	/**
+ 	 * + Displays the available command-completion options the server knows of
+ 	 */
+ 	/**
+ 	 * + Displays the available command-completion options the server knows of
+ 	 */

> CHANGE  1 : 10  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("matches", packetIn.matches);
~ 		BaseData newEvent = PluginAPI.callEvent("packettabcomplete", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.matches = newEvent.has("matches") ? newEvent.getStringArr("matches") : packetIn.matches;
~ 

> CHANGE  9 : 28  @  9 : 10

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("soundName", packetIn.soundName);
~ 		eventData.set("posX", packetIn.posX);
~ 		eventData.set("posY", packetIn.posY);
~ 		eventData.set("posZ", packetIn.posZ);
~ 		eventData.set("soundVolume", packetIn.soundVolume);
~ 		eventData.set("soundPitch", packetIn.soundPitch);
~ 		BaseData newEvent = PluginAPI.callEvent("packetsoundeffect", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.soundName = newEvent.has("soundName") ? newEvent.getString("soundName") : packetIn.soundName;
~ 		packetIn.posX = newEvent.has("posX") ? newEvent.getInt("posX") : packetIn.posX;
~ 		packetIn.posY = newEvent.has("posY") ? newEvent.getInt("posY") : packetIn.posY;
~ 		packetIn.posZ = newEvent.has("posZ") ? newEvent.getInt("posZ") : packetIn.posZ;
~ 		packetIn.soundVolume = newEvent.has("soundVolume") ? newEvent.getFloat("soundVolume") : packetIn.soundVolume;
~ 		packetIn.soundPitch = newEvent.has("soundPitch") ? newEvent.getInt("soundPitch") : packetIn.soundPitch;
~ 

> INSERT  5 : 16  @  5

+ 		PluginData eventData = new PluginData();
+ 		eventData.set("preventDefault", false);
+ 		eventData.set("url", packetIn.url);
+ 		eventData.set("hash", packetIn.hash);
+ 		BaseData newEvent = PluginAPI.callEvent("packetresourcepack", eventData);
+ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
+ 			return;
+ 		}
+ 		packetIn.url = newEvent.has("url") ? newEvent.getString("url") : packetIn.url;
+ 		packetIn.hash = newEvent.has("hash") ? newEvent.getString("hash") : packetIn.hash;
+ 

> CHANGE  3 : 25  @  3 : 26

~ 			this.netManager
~ 					.sendPacket(new C19PacketResourcePackStatus(s1, C19PacketResourcePackStatus.Action.DECLINED));
~ 			return;
~ 		}
~ 		if (this.gameController.getCurrentServerData() != null && this.gameController.getCurrentServerData()
~ 				.getResourceMode() == ServerData.ServerResourceMode.ENABLED) {
~ 			NetHandlerPlayClient.this.netManager
~ 					.sendPacket(new C19PacketResourcePackStatus(s1, C19PacketResourcePackStatus.Action.ACCEPTED));
~ 			NetHandlerPlayClient.this.gameController.getResourcePackRepository().downloadResourcePack(s, s1,
~ 					success -> {
~ 						if (success) {
~ 							NetHandlerPlayClient.this.netManager.sendPacket(new C19PacketResourcePackStatus(s1,
~ 									C19PacketResourcePackStatus.Action.SUCCESSFULLY_LOADED));
~ 						} else {
~ 							NetHandlerPlayClient.this.netManager.sendPacket(new C19PacketResourcePackStatus(s1,
~ 									C19PacketResourcePackStatus.Action.FAILED_DOWNLOAD));
~ 						}
~ 					});
~ 		} else if (this.gameController.getCurrentServerData() != null && this.gameController.getCurrentServerData()
~ 				.getResourceMode() != ServerData.ServerResourceMode.PROMPT) {
~ 			this.netManager
~ 					.sendPacket(new C19PacketResourcePackStatus(s1, C19PacketResourcePackStatus.Action.DECLINED));

> CHANGE  1 : 9  @  1 : 11

~ 			NetHandlerPlayClient.this.gameController.displayGuiScreen(new GuiYesNo(new GuiYesNoCallback() {
~ 				public void confirmClicked(boolean flag, int var2) {
~ 					NetHandlerPlayClient.this.gameController = Minecraft.getMinecraft();
~ 					if (flag) {
~ 						if (NetHandlerPlayClient.this.gameController.getCurrentServerData() != null) {
~ 							NetHandlerPlayClient.this.gameController.getCurrentServerData()
~ 									.setResourceMode(ServerData.ServerResourceMode.ENABLED);
~ 						}

> CHANGE  1 : 11  @  1 : 20

~ 						NetHandlerPlayClient.this.netManager.sendPacket(
~ 								new C19PacketResourcePackStatus(s1, C19PacketResourcePackStatus.Action.ACCEPTED));
~ 						NetHandlerPlayClient.this.gameController.getResourcePackRepository().downloadResourcePack(s, s1,
~ 								success -> {
~ 									if (success) {
~ 										NetHandlerPlayClient.this.netManager.sendPacket(new C19PacketResourcePackStatus(
~ 												s1, C19PacketResourcePackStatus.Action.SUCCESSFULLY_LOADED));
~ 									} else {
~ 										NetHandlerPlayClient.this.netManager.sendPacket(new C19PacketResourcePackStatus(
~ 												s1, C19PacketResourcePackStatus.Action.FAILED_DOWNLOAD));

> INSERT  1 : 7  @  1

+ 								});
+ 					} else {
+ 						if (NetHandlerPlayClient.this.gameController.getCurrentServerData() != null) {
+ 							NetHandlerPlayClient.this.gameController.getCurrentServerData()
+ 									.setResourceMode(ServerData.ServerResourceMode.DISABLED);
+ 						}

> CHANGE  1 : 3  @  1 : 34

~ 						NetHandlerPlayClient.this.netManager.sendPacket(
~ 								new C19PacketResourcePackStatus(s1, C19PacketResourcePackStatus.Action.DECLINED));

> DELETE  1  @  1 : 3

> INSERT  1 : 6  @  1

+ 					ServerList.func_147414_b(NetHandlerPlayClient.this.gameController.getCurrentServerData());
+ 					NetHandlerPlayClient.this.gameController.displayGuiScreen((GuiScreen) null);
+ 				}
+ 			}, I18n.format("multiplayer.texturePrompt.line1", new Object[0]),
+ 					I18n.format("multiplayer.texturePrompt.line2", new Object[0]), 0));

> CHANGE  4 : 22  @  4 : 5

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("entityId", packetIn.entityId);
~ 		eventData.set("nbt", packetIn.tagCompound.toString());
~ 		BaseData newEvent = PluginAPI.callEvent("packetupdateentitynbt", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.entityId = newEvent.has("entityId") ? newEvent.getInt("entityId") : packetIn.entityId;
~ 		if (newEvent.has("nbt")) {
~ 			try {
~ 				NBTTagCompound nbtParsed = JsonToNBT.getTagFromJson(newEvent.getString("nbt"));
~ 				packetIn.tagCompound = nbtParsed;
~ 			} catch (Exception e) {
~ 				// TODO: handle exception
~ 			}
~ 		}
~ 

> INSERT  7 : 28  @  7

+ 	/**
+ 	 * + Handles packets that have room for a channel specification. Vanilla
+ 	 * implemented channels are "MC|TrList" to acquire a MerchantRecipeList trades
+ 	 * for a villager merchant, "MC|Brand" which sets the server brand? on the
+ 	 * player instance and finally "MC|RPack" which the server uses to communicate
+ 	 * the identifier of the default server resourcepack for the client to load.
+ 	 */
+ 	/**
+ 	 * + Handles packets that have room for a channel specification. Vanilla
+ 	 * implemented channels are "MC|TrList" to acquire a MerchantRecipeList trades
+ 	 * for a villager merchant, "MC|Brand" which sets the server brand? on the
+ 	 * player instance and finally "MC|RPack" which the server uses to communicate
+ 	 * the identifier of the default server resourcepack for the client to load.
+ 	 */
+ 	/**
+ 	 * + Handles packets that have room for a channel specification. Vanilla
+ 	 * implemented channels are "MC|TrList" to acquire a MerchantRecipeList trades
+ 	 * for a villager merchant, "MC|Brand" which sets the server brand? on the
+ 	 * player instance and finally "MC|RPack" which the server uses to communicate
+ 	 * the identifier of the default server resourcepack for the client to load.
+ 	 */

> CHANGE  1 : 10  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("channel", packetIn.channel);
~ 		BaseData newEvent = PluginAPI.callEvent("packetcustompayload", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.channel = newEvent.has("channel") ? newEvent.getString("channel") : packetIn.channel;
~ 

> DELETE  2  @  2 : 3

> DELETE  11  @  11 : 13

> INSERT  9 : 16  @  9

+ 		} else if ("EAG|Skins-1.8".equals(packetIn.getChannelName())) {
+ 			try {
+ 				SkinPackets.readPluginMessage(packetIn.getBufferData(), skinCache);
+ 			} catch (IOException e) {
+ 				logger.error("Couldn't read EAG|Skins-1.8 packet!");
+ 				logger.error(e);
+ 			}

> INSERT  4 : 16  @  4

+ 	/**
+ 	 * + May create a scoreboard objective, remove an objective from the scoreboard
+ 	 * or update an objectives' displayname
+ 	 */
+ 	/**
+ 	 * + May create a scoreboard objective, remove an objective from the scoreboard
+ 	 * or update an objectives' displayname
+ 	 */
+ 	/**
+ 	 * + May create a scoreboard objective, remove an objective from the scoreboard
+ 	 * or update an objectives' displayname
+ 	 */

> CHANGE  1 : 15  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("objectiveName", packetIn.objectiveName);
~ 		eventData.set("objectiveValue", packetIn.objectiveValue);
~ 		eventData.set("type", packetIn.type.name());
~ 		BaseData newEvent = PluginAPI.callEvent("packetscoreboardobjective", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.objectiveName = newEvent.has("objectiveName") ? newEvent.getString("objectiveName")
~ 				: packetIn.objectiveName;
~ 		packetIn.objectiveValue = newEvent.has("objectiveValue") ? newEvent.getString("objectiveValue")
~ 				: packetIn.objectiveValue;
~ 

> INSERT  18 : 30  @  18

+ 	/**
+ 	 * + Either updates the score with a specified value or removes the score for an
+ 	 * objective
+ 	 */
+ 	/**
+ 	 * + Either updates the score with a specified value or removes the score for an
+ 	 * objective
+ 	 */
+ 	/**
+ 	 * + Either updates the score with a specified value or removes the score for an
+ 	 * objective
+ 	 */

> CHANGE  1 : 15  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("name", packetIn.name);
~ 		eventData.set("objective", packetIn.objective);
~ 		eventData.set("value", packetIn.value);
~ 		eventData.set("action", packetIn.action.name());
~ 		BaseData newEvent = PluginAPI.callEvent("packetupdatescore", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.name = newEvent.has("name") ? newEvent.getString("name") : packetIn.name;
~ 		packetIn.objective = newEvent.has("objective") ? newEvent.getString("objective") : packetIn.objective;
~ 		packetIn.value = newEvent.has("value") ? newEvent.getInt("value") : packetIn.value;
~ 

> INSERT  15 : 27  @  15

+ 	/**
+ 	 * + Removes or sets the ScoreObjective to be displayed at a particular
+ 	 * scoreboard position (list, sidebar, below name)
+ 	 */
+ 	/**
+ 	 * + Removes or sets the ScoreObjective to be displayed at a particular
+ 	 * scoreboard position (list, sidebar, below name)
+ 	 */
+ 	/**
+ 	 * + Removes or sets the ScoreObjective to be displayed at a particular
+ 	 * scoreboard position (list, sidebar, below name)
+ 	 */

> CHANGE  1 : 12  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("scoreName", packetIn.scoreName);
~ 		eventData.set("position", packetIn.position);
~ 		BaseData newEvent = PluginAPI.callEvent("packetdisplayscoreboard", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.scoreName = newEvent.has("scoreName") ? newEvent.getString("scoreName") : packetIn.scoreName;
~ 		packetIn.position = newEvent.has("position") ? newEvent.getInt("position") : packetIn.position;
~ 

> INSERT  10 : 25  @  10

+ 	/**
+ 	 * + Updates a team managed by the scoreboard: Create/Remove the team
+ 	 * registration, Register/Remove the player-team-memberships, Set team
+ 	 * displayname/prefix/suffix and/or whether friendly fire is enabled
+ 	 */
+ 	/**
+ 	 * + Updates a team managed by the scoreboard: Create/Remove the team
+ 	 * registration, Register/Remove the player-team-memberships, Set team
+ 	 * displayname/prefix/suffix and/or whether friendly fire is enabled
+ 	 */
+ 	/**
+ 	 * + Updates a team managed by the scoreboard: Create/Remove the team
+ 	 * registration, Register/Remove the player-team-memberships, Set team
+ 	 * displayname/prefix/suffix and/or whether friendly fire is enabled
+ 	 */

> CHANGE  1 : 8  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		BaseData newEvent = PluginAPI.callEvent("packetteams", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 

> INSERT  38 : 50  @  38

+ 	/**
+ 	 * + Spawns a specified number of particles at the specified location with a
+ 	 * randomized displacement according to specified bounds
+ 	 */
+ 	/**
+ 	 * + Spawns a specified number of particles at the specified location with a
+ 	 * randomized displacement according to specified bounds
+ 	 */
+ 	/**
+ 	 * + Spawns a specified number of particles at the specified location with a
+ 	 * randomized displacement according to specified bounds
+ 	 */

> CHANGE  1 : 33  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("particleType", packetIn.particleType.name());
~ 		eventData.set("xCoord", packetIn.xCoord);
~ 		eventData.set("yCoord", packetIn.yCoord);
~ 		eventData.set("zCoord", packetIn.zCoord);
~ 		eventData.set("xOffset", packetIn.xOffset);
~ 		eventData.set("yOffset", packetIn.yOffset);
~ 		eventData.set("zOffset", packetIn.zOffset);
~ 		eventData.set("particleSpeed", packetIn.particleSpeed);
~ 		eventData.set("particleCount", packetIn.particleCount);
~ 		eventData.set("longDistance", packetIn.longDistance);
~ 		eventData.set("particleArguments", packetIn.particleArguments);
~ 		BaseData newEvent = PluginAPI.callEvent("packetparticles", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.xCoord = newEvent.has("xCoord") ? newEvent.getFloat("xCoord") : packetIn.xCoord;
~ 		packetIn.yCoord = newEvent.has("yCoord") ? newEvent.getFloat("yCoord") : packetIn.yCoord;
~ 		packetIn.zCoord = newEvent.has("zCoord") ? newEvent.getFloat("zCoord") : packetIn.zCoord;
~ 		packetIn.xOffset = newEvent.has("xOffset") ? newEvent.getFloat("xOffset") : packetIn.xOffset;
~ 		packetIn.yOffset = newEvent.has("yOffset") ? newEvent.getFloat("yOffset") : packetIn.yOffset;
~ 		packetIn.zOffset = newEvent.has("zOffset") ? newEvent.getFloat("zOffset") : packetIn.zOffset;
~ 		packetIn.particleSpeed = newEvent.has("particleSpeed") ? newEvent.getFloat("particleSpeed")
~ 				: packetIn.particleSpeed;
~ 		packetIn.particleCount = newEvent.has("particleCount") ? newEvent.getInt("particleCount")
~ 				: packetIn.particleCount;
~ 		packetIn.longDistance = newEvent.has("longDistance") ? newEvent.getBoolean("longDistance")
~ 				: packetIn.longDistance;
~ 		packetIn.particleArguments = newEvent.has("particleArguments") ? newEvent.getIntArr("particleArguments")
~ 				: packetIn.particleArguments;
~ 

> INSERT  34 : 52  @  34

+ 	/**
+ 	 * + Updates en entity's attributes and their respective modifiers, which are
+ 	 * used for speed bonusses (player sprinting, animals fleeing, baby speed),
+ 	 * weapon/tool attackDamage, hostiles followRange randomization, zombie
+ 	 * maxHealth and knockback resistance as well as reinforcement spawning chance.
+ 	 */
+ 	/**
+ 	 * + Updates en entity's attributes and their respective modifiers, which are
+ 	 * used for speed bonusses (player sprinting, animals fleeing, baby speed),
+ 	 * weapon/tool attackDamage, hostiles followRange randomization, zombie
+ 	 * maxHealth and knockback resistance as well as reinforcement spawning chance.
+ 	 */
+ 	/**
+ 	 * + Updates en entity's attributes and their respective modifiers, which are
+ 	 * used for speed bonusses (player sprinting, animals fleeing, baby speed),
+ 	 * weapon/tool attackDamage, hostiles followRange randomization, zombie
+ 	 * maxHealth and knockback resistance as well as reinforcement spawning chance.
+ 	 */

> CHANGE  1 : 10  @  1 : 2

~ 		PluginData eventData = new PluginData();
~ 		eventData.set("preventDefault", false);
~ 		eventData.set("entityId", packetIn.entityId);
~ 		BaseData newEvent = PluginAPI.callEvent("packetentityproperties", eventData);
~ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault") == true) {
~ 			return;
~ 		}
~ 		packetIn.entityId = newEvent.has("entityId") ? newEvent.getInt("entityId") : packetIn.entityId;
~ 

> CHANGE  29 : 42  @  29 : 30

~ 	/**
~ 	 * + Returns this the NetworkManager instance registered with this
~ 	 * NetworkHandlerPlayClient
~ 	 */
~ 	/**
~ 	 * + Returns this the NetworkManager instance registered with this
~ 	 * NetworkHandlerPlayClient
~ 	 */
~ 	/**
~ 	 * + Returns this the NetworkManager instance registered with this
~ 	 * NetworkHandlerPlayClient
~ 	 */
~ 	public EaglercraftNetworkManager getNetworkManager() {

> CHANGE  7 : 20  @  7 : 8

~ 	/**
~ 	 * + Gets the client's description information about another player on the
~ 	 * server.
~ 	 */
~ 	/**
~ 	 * + Gets the client's description information about another player on the
~ 	 * server.
~ 	 */
~ 	/**
~ 	 * + Gets the client's description information about another player on the
~ 	 * server.
~ 	 */
~ 	public NetworkPlayerInfo getPlayerInfo(EaglercraftUUID parUUID) {

> INSERT  3 : 15  @  3

+ 	/**
+ 	 * + Gets the client's description information about another player on the
+ 	 * server.
+ 	 */
+ 	/**
+ 	 * + Gets the client's description information about another player on the
+ 	 * server.
+ 	 */
+ 	/**
+ 	 * + Gets the client's description information about another player on the
+ 	 * server.
+ 	 */

> EOF
