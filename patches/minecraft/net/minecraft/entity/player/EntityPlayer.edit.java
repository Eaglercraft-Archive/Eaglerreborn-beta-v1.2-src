
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  2  @  2 : 5

> CHANGE  2 : 8  @  2 : 3

~ import net.lax1dude.eaglercraft.v1_8.EaglercraftUUID;
~ 
~ import com.google.common.base.Charsets;
~ import com.google.common.collect.Lists;
~ 
~ import net.lax1dude.eaglercraft.v1_8.mojang.authlib.GameProfile;

> INSERT  5 : 6  @  5

+ import net.minecraft.command.ICommandSender;

> DELETE  15  @  15 : 16

> DELETE  3  @  3 : 7

> DELETE  16  @  16 : 17

> DELETE  7  @  7 : 8

> INSERT  19 : 21  @  19

+ import net.zxmushroom63.plugins.BaseData;
+ import net.zxmushroom63.plugins.PluginData;

> CHANGE  1 : 5  @  1 : 2

~ public abstract class EntityPlayer extends EntityLivingBase implements ICommandSender {
~ 	/**
~ 	 * + Inventory of the player
~ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + The food object of the player, the general hunger logic.
+ 	 */

> INSERT  20 : 23  @  20

+ 	/**
+ 	 * + The player's capabilities. (See class PlayerCapabilities)
+ 	 */

> CHANGE  18 : 19  @  18 : 19

~ 		this.inventoryContainer = new ContainerPlayer(this.inventory, false, this);

> INSERT  22 : 441  @  22

+ 	@Override
+ 	public void loadPluginData(BaseData data) {
+ 		super.loadPluginData(data);
+ 		cameraYaw = data.getFloat("cameraYaw");
+ 		chasingPosX = data.getDouble("chasingPosX");
+ 		chasingPosY = data.getDouble("chasingPosY");
+ 		chasingPosZ = data.getDouble("chasingPosZ");
+ 		experience = data.getFloat("experience");
+ 		experienceLevel = data.getInt("experienceLevel");
+ 		experienceTotal = data.getInt("experienceTotal");
+ 		if (fishEntity != null) {
+ 			fishEntity.loadPluginData(data.getBaseData("fishEntity"));
+ 		}
+ 		if (foodStats != null) {
+ 			foodStats.loadPluginData(data.getBaseData("foodStats"));
+ 		}
+ 		if (inventory != null) {
+ 			inventory.loadPluginData(data.getBaseData("inventory"));
+ 		}
+ 		flyToggleTimer = data.getInt("flyToggleTimer");
+ 		hasReducedDebug = data.getBoolean("hasReducedDebug");
+ 		lastXPSound = data.getInt("lastXPSound");
+ 		sleepTimer = data.getInt("sleepTimer");
+ 		sleeping = data.getBoolean("sleeping");
+ 		spawnForced = data.getBoolean("spawnForced");
+ 		speedInAir = data.getFloat("speedInAir");
+ 		speedOnGround = data.getFloat("speedOnGround");
+ 		xpCooldown = data.getInt("xpCooldown");
+ 		xpSeed = data.getInt("xpSeed");
+ 		if (itemInUse != null) {
+ 			itemInUse.loadPluginData(data.getBaseData("itemInUse"));
+ 		}
+ 
+ 		if (inventoryContainer != null) {
+ 			inventoryContainer.loadPluginData(data.getBaseData("inventoryContainer"));
+ 		}
+ 
+ 		if (openContainer != null) {
+ 			openContainer.loadPluginData(data.getBaseData("openContainer"));
+ 		}
+ 		if (capabilities != null) {
+ 			capabilities.loadPluginData(data.getBaseData("capabilities"));
+ 		}
+ 	}
+ 
+ 	@Override
+ 	public PluginData makePluginData() {
+ 		PluginData data = super.makePluginData();
+ 		data.setCallbackObject("getRef", () -> {
+ 			return this;
+ 		});
+ 		data.set("cameraYaw", cameraYaw);
+ 		data.set("chasingPosX", chasingPosX);
+ 		data.set("chasingPosY", chasingPosY);
+ 		data.set("chasingPosZ", chasingPosZ);
+ 		data.set("experience", experience);
+ 		data.set("experienceLevel", experienceLevel);
+ 		data.set("experienceTotal", experienceTotal);
+ 		if (fishEntity != null) {
+ 			data.set("fishEntity", fishEntity.makePluginData());
+ 		}
+ 		if (itemInUse != null) {
+ 			data.set("itemInUse", itemInUse.makePluginData());
+ 		}
+ 		if (foodStats != null) {
+ 			data.set("foodStats", foodStats.makePluginData());
+ 		}
+ 		data.set("flyToggleTimer", flyToggleTimer);
+ 		data.set("hasReducedDebug", hasReducedDebug);
+ 		data.set("itemInUseCount", itemInUseCount);
+ 		data.set("lastXPSound", lastXPSound);
+ 		data.set("sleepTimer", sleepTimer);
+ 		data.set("sleeping", sleeping);
+ 		data.set("spawnForced", spawnForced);
+ 		data.set("speedInAir", speedInAir);
+ 		data.set("speedOnGround", speedOnGround);
+ 		data.set("xpCooldown", xpCooldown);
+ 		data.set("xpSeed", xpSeed);
+ 
+ 		if (inventoryContainer != null) {
+ 			data.set("inventoryContainer", inventoryContainer.makePluginData());
+ 		}
+ 
+ 		if (openContainer != null) {
+ 			data.set("openContainer", openContainer.makePluginData());
+ 		}
+ 		if (inventory != null) {
+ 			data.set("inventory", inventory.makePluginData());
+ 		}
+ 		if (capabilities != null) {
+ 			data.set("capabilities", capabilities.makePluginData());
+ 		}
+ 		data.setCallbackVoid("reload", () -> {
+ 			loadPluginData(data);
+ 		});
+ 
+ 		// Todone: adding functions
+ 
+ 		data.setCallbackObject("getItemInUse", () -> {
+ 			if (getItemInUse() != null) {
+ 				return getItemInUse().makePluginData();
+ 			} else {
+ 				return new PluginData();
+ 			}
+ 		});
+ 		data.setCallbackInt("getItemInUseCount", () -> {
+ 			return getItemInUseCount();
+ 		});
+ 		data.setCallbackBoolean("isUsingItem", () -> {
+ 			return isUsingItem();
+ 		});
+ 		data.setCallbackInt("getItemInUseDuration", () -> {
+ 			return getItemInUseDuration();
+ 		});
+ 		data.setCallbackVoid("stopUsingItem", () -> {
+ 			stopUsingItem();
+ 		});
+ 		data.setCallbackVoid("clearItemInUse", () -> {
+ 			clearItemInUse();
+ 		});
+ 		data.setCallbackBoolean("isBlocking", () -> {
+ 			return isBlocking();
+ 		});
+ 		data.setCallbackInt("getMaxInPortalTime", () -> {
+ 			return getMaxInPortalTime();
+ 		});
+ 		data.setCallbackString("getSwimSound", () -> {
+ 			return getSwimSound();
+ 		});
+ 		data.setCallbackString("getSplashSound", () -> {
+ 			return getSplashSound();
+ 		});
+ 		data.setCallbackInt("getPortalCooldown", () -> {
+ 			return getPortalCooldown();
+ 		});
+ 		data.setCallbackVoidWithDataArg("playSound", (BaseData params) -> {
+ 			playSound(params.getString("s"), params.getFloat("f"), params.getFloat("f1"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("updateItemUse", (BaseData params) -> {
+ 			updateItemUse((ItemStack) params.getRef("itemStackIn"), params.getInt("parInt1"));
+ 		});
+ 		data.setCallbackVoid("onItemUseFinish", () -> {
+ 			onItemUseFinish();
+ 		});
+ 		data.setCallbackVoidWithDataArg("handleStatusUpdate", (BaseData params) -> {
+ 			handleStatusUpdate(params.getByte("b0"));
+ 		});
+ 		data.setCallbackBoolean("isMovementBlocked", () -> {
+ 			return isMovementBlocked();
+ 		});
+ 		data.setCallbackVoid("closeScreen", () -> {
+ 			closeScreen();
+ 		});
+ 		data.setCallbackVoid("updateRidden", () -> {
+ 			updateRidden();
+ 		});
+ 		data.setCallbackVoid("preparePlayerToSpawn", () -> {
+ 			preparePlayerToSpawn();
+ 		});
+ 		data.setCallbackVoid("updateEntityActionState", () -> {
+ 			updateEntityActionState();
+ 		});
+ 		data.setCallbackVoid("onLivingUpdate", () -> {
+ 			onLivingUpdate();
+ 		});
+ 		data.setCallbackVoidWithDataArg("collideWithPlayer", (BaseData params) -> {
+ 			collideWithPlayer((Entity) params.getRef("parEntity"));
+ 		});
+ 		data.setCallbackInt("getScore", () -> {
+ 			return getScore();
+ 		});
+ 		data.setCallbackVoidWithDataArg("addScore", (BaseData params) -> {
+ 			addScore(params.getInt("parInt1"));
+ 		});
+ 		data.setCallbackString("getHurtSound", () -> {
+ 			return getHurtSound();
+ 		});
+ 		data.setCallbackString("getDeathSound", () -> {
+ 			return getDeathSound();
+ 		});
+ 		data.setCallbackVoidWithDataArg("addToPlayerScore", (BaseData params) -> {
+ 			addToPlayerScore((Entity) params.getRef("entity"), params.getInt("i"));
+ 		});
+ 		data.setCallbackObjectWithDataArg("dropOneItem", (BaseData params) -> {
+ 			return dropOneItem(params.getBoolean("flag")).makePluginData();
+ 		});
+ 		data.setCallbackObjectWithDataArg("dropPlayerItemWithRandomChoice", (BaseData params) -> {
+ 			// The second argument (boolean) is not used.
+ 			return dropPlayerItemWithRandomChoice((ItemStack) params.getRef("itemStackIn"), false).makePluginData();
+ 		});
+ 		data.setCallbackObjectWithDataArg("dropItem", (BaseData params) -> {
+ 			return dropItem((ItemStack) params.getRef("droppedItem"), params.getBoolean("dropAround"),
+ 					params.getBoolean("traceItem")).makePluginData();
+ 		});
+ 		data.setCallbackVoidWithDataArg("joinEntityItemWithWorld", (BaseData params) -> {
+ 			joinEntityItemWithWorld((EntityItem) params.getRef("entityitem"));
+ 		});
+ 		data.setCallbackFloatWithDataArg("getToolDigEfficiency", (BaseData params) -> {
+ 			return getToolDigEfficiency((Block) params.getRef("parBlock"));
+ 		});
+ 		data.setCallbackBooleanWithDataArg("canHarvestBlock", (BaseData params) -> {
+ 			return canHarvestBlock((Block) params.getRef("blockToHarvest"));
+ 		});
+ 		data.setCallbackBooleanWithDataArg("canAttackPlayer", (BaseData params) -> {
+ 			return canAttackPlayer((EntityPlayer) params.getRef("entityplayer"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("damageArmor", (BaseData params) -> {
+ 			damageArmor(params.getFloat("f"));
+ 		});
+ 		data.setCallbackInt("getTotalArmorValue", () -> {
+ 			return getTotalArmorValue();
+ 		});
+ 		data.setCallbackFloat("getArmorVisibility", () -> {
+ 			return getArmorVisibility();
+ 		});
+ 		data.setCallbackBooleanWithDataArg("interactWith", (BaseData params) -> {
+ 			return interactWith((Entity) params.getRef("parEntity"));
+ 		});
+ 		data.setCallbackObject("getCurrentEquippedItem", () -> {
+ 			if (getCurrentEquippedItem() != null) {
+ 				return getCurrentEquippedItem().makePluginData();
+ 			} else {
+ 				return new PluginData();
+ 			}
+ 		});
+ 		data.setCallbackVoid("destroyCurrentEquippedItem", () -> {
+ 			destroyCurrentEquippedItem();
+ 		});
+ 		data.setCallbackDouble("getYOffset", () -> {
+ 			return getYOffset();
+ 		});
+ 		data.setCallbackVoidWithDataArg("attackTargetEntityWithCurrentItem", (BaseData params) -> {
+ 			attackTargetEntityWithCurrentItem((Entity) params.getRef("entity"));
+ 		});
+ 		data.setCallbackVoid("respawnPlayer", () -> {
+ 			respawnPlayer();
+ 		});
+ 		data.setCallbackBoolean("isEntityInsideOpaqueBlock", () -> {
+ 			return isEntityInsideOpaqueBlock();
+ 		});
+ 		data.setCallbackBoolean("isUser", () -> {
+ 			return isUser();
+ 		});
+ 		data.setCallbackStringWithDataArg("trySleep", (BaseData params) -> {
+ 			return trySleep((BlockPos) params.getRef("blockpos")).name();
+ 		});
+ 		data.setCallbackVoidWithDataArg("wakeUpPlayer", (BaseData params) -> {
+ 			wakeUpPlayer(params.getBoolean("flag"), params.getBoolean("flag1"), params.getBoolean("flag2"));
+ 		});
+ 		data.setCallbackBoolean("isInBed", () -> {
+ 			return isInBed();
+ 		});
+ 		data.setCallbackFloat("getBedOrientationInDegrees", () -> {
+ 			return getBedOrientationInDegrees();
+ 		});
+ 		data.setCallbackBoolean("isPlayerSleeping", () -> {
+ 			return isPlayerSleeping();
+ 		});
+ 		data.setCallbackBoolean("isPlayerFullyAsleep", () -> {
+ 			return isPlayerFullyAsleep();
+ 		});
+ 		data.setCallbackInt("getSleepTimer", () -> {
+ 			return getSleepTimer();
+ 		});
+ 		data.setCallbackObject("getBedLocation", () -> {
+ 			if (getBedLocation() != null) {
+ 				return getBedLocation().makePluginData();
+ 			} else {
+ 				return new PluginData();
+ 			}
+ 		});
+ 		data.setCallbackBoolean("isSpawnForced", () -> {
+ 			return isSpawnForced();
+ 		});
+ 		data.setCallbackVoidWithDataArg("setSpawnPoint", (BaseData params) -> {
+ 			setSpawnPoint((BlockPos) params.getRef("pos"), params.getBoolean("forced"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("moveEntityWithHeading", (BaseData params) -> {
+ 			moveEntityWithHeading(params.getFloat("f"), params.getFloat("f1"));
+ 		});
+ 		data.setCallbackFloat("getAIMoveSpeed", () -> {
+ 			return getAIMoveSpeed();
+ 		});
+ 		data.setCallbackVoidWithDataArg("addMovementStat", (BaseData params) -> {
+ 			addMovementStat(params.getDouble("parDouble1"), params.getDouble("parDouble2"),
+ 					params.getDouble("parDouble3"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("addMountedMovementStat", (BaseData params) -> {
+ 			addMountedMovementStat(params.getDouble("parDouble1"), params.getDouble("parDouble2"),
+ 					params.getDouble("parDouble3"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("fall", (BaseData params) -> {
+ 			fall(params.getFloat("f"), params.getFloat("f1"));
+ 		});
+ 		data.setCallbackVoid("resetHeight", () -> {
+ 			resetHeight();
+ 		});
+ 		data.setCallbackStringWithDataArg("getFallSoundString", (BaseData params) -> {
+ 			return getFallSoundString(params.getInt("i"));
+ 		});
+ 		data.setCallbackVoid("setInWeb", () -> {
+ 			setInWeb();
+ 		});
+ 		data.setCallbackObjectWithDataArg("getCurrentArmor", (BaseData params) -> {
+ 			if (getCurrentArmor(params.getInt("i")) != null) {
+ 				return getCurrentArmor(params.getInt("i")).makePluginData();
+ 			} else {
+ 				return new PluginData();
+ 			}
+ 		});
+ 		data.setCallbackVoidWithDataArg("addExperience", (BaseData params) -> {
+ 			addExperience(params.getInt("amount"));
+ 		});
+ 		data.setCallbackInt("getXPSeed", () -> {
+ 			return getXPSeed();
+ 		});
+ 		data.setCallbackVoidWithDataArg("removeExperienceLevel", (BaseData params) -> {
+ 			removeExperienceLevel(params.getInt("i"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("addExperienceLevel", (BaseData params) -> {
+ 			addExperienceLevel(params.getInt("i"));
+ 		});
+ 		data.setCallbackInt("xpBarCap", () -> {
+ 			return xpBarCap();
+ 		});
+ 		data.setCallbackVoidWithDataArg("addExhaustion", (BaseData params) -> {
+ 			addExhaustion(params.getFloat("parFloat1"));
+ 		});
+ 		data.setCallbackObject("getFoodStats", () -> {
+ 			return getFoodStats().makePluginData();
+ 		});
+ 		data.setCallbackBooleanWithDataArg("canEat", (BaseData params) -> {
+ 			return canEat(params.getBoolean("ignoreHunger"));
+ 		});
+ 		data.setCallbackBoolean("shouldHeal", () -> {
+ 			return shouldHeal();
+ 		});
+ 		data.setCallbackVoidWithDataArg("setItemInUse", (BaseData params) -> {
+ 			setItemInUse((ItemStack) params.getRef("itemstack"), params.getInt("i"));
+ 		});
+ 		data.setCallbackBoolean("isAllowEdit", () -> {
+ 			return isAllowEdit();
+ 		});
+ 		data.setCallbackBooleanWithDataArg("canPlayerEdit", (BaseData params) -> {
+ 			return canPlayerEdit((BlockPos) params.getRef("parBlockPos"),
+ 					EnumFacing.valueOf(params.getString("parEnumFacing")), (ItemStack) params.getRef("parItemStack"));
+ 		});
+ 		data.setCallbackBoolean("isPlayer", () -> {
+ 			return isPlayer();
+ 		});
+ 		data.setCallbackBoolean("getAlwaysRenderNameTagForRender", () -> {
+ 			return getAlwaysRenderNameTagForRender();
+ 		});
+ 		data.setCallbackVoidWithDataArg("clonePlayer", (BaseData params) -> {
+ 			clonePlayer((EntityPlayer) params.getRef("entityplayer"), params.getBoolean("flag"));
+ 		});
+ 		data.setCallbackBoolean("canTriggerWalking", () -> {
+ 			return canTriggerWalking();
+ 		});
+ 		data.setCallbackVoid("sendPlayerAbilities", () -> {
+ 			sendPlayerAbilities();
+ 		});
+ 		data.setCallbackString("getName", () -> {
+ 			return getName();
+ 		});
+ 		data.setCallbackObjectWithDataArg("getEquipmentInSlot", (BaseData params) -> {
+ 			if (getEquipmentInSlot(params.getInt("i")) != null) {
+ 				return getEquipmentInSlot(params.getInt("i")).makePluginData();
+ 			} else {
+ 				return new PluginData();
+ 			}
+ 		});
+ 		data.setCallbackObject("getHeldItem", () -> {
+ 			if (getHeldItem() != null) {
+ 				return getHeldItem();
+ 			} else {
+ 				return new PluginData();
+ 			}
+ 		});
+ 		data.setCallbackVoidWithDataArg("setCurrentItemOrArmor", (BaseData params) -> {
+ 			setCurrentItemOrArmor(params.getInt("i"), (ItemStack) params.getRef("itemstack"));
+ 		});
+ 		data.setCallbackBooleanWithDataArg("isInvisibleToPlayer", (BaseData params) -> {
+ 			return isInvisibleToPlayer((EntityPlayer) params.getRef("entityplayer"));
+ 		});
+ 		data.setCallbackObjectArr("getInventory", () -> {
+ 			ItemStack[] inventory = getInventory();
+ 			PluginData[] parDatas = new PluginData[inventory.length];
+ 			for (int i = 0; i < inventory.length; i++) {
+ 				if (inventory[i] != null) {
+ 					parDatas[i] = inventory[i].makePluginData();
+ 				}
+ 			}
+ 			return parDatas;
+ 		});
+ 		data.setCallbackBoolean("isPushedByWater", () -> {
+ 			return isPushedByWater();
+ 		});
+ 		data.setCallbackFloat("getEyeHeight", () -> {
+ 			return getEyeHeight();
+ 		});
+ 		data.setCallbackStringWithDataArg("getOfflineUUID", (BaseData params) -> {
+ 			return getOfflineUUID(params.getString("username")).toString();
+ 		});
+ 		data.setCallbackBooleanWithDataArg("replaceItemInInventory", (BaseData params) -> {
+ 			return replaceItemInInventory(params.getInt("i"), (ItemStack) params.getRef("itemstack"));
+ 		});
+ 		data.setCallbackBoolean("hasReducedDebug", () -> {
+ 			return hasReducedDebug();
+ 		});
+ 		data.setCallbackVoidWithDataArg("setReducedDebug", (BaseData params) -> {
+ 			setReducedDebug(params.getBoolean("reducedDebug"));
+ 		});
+ 		return data;
+ 	}
+ 
+ 	/**
+ 	 * + returns the ItemStack containing the itemInUse
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Returns the item in use count
+ 	 */

> INSERT  4 : 8  @  4

+ 	/**
+ 	 * + Checks if the entity is currently using an item (e.g., bow, food, sword) by
+ 	 * holding down the useItemButton
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + gets the duration for how long the current itemInUse has been in use
+ 	 */

> DELETE  15  @  15 : 19

> INSERT  6 : 9  @  6

+ 	/**
+ 	 * + Called to update the entity's position/logic.
+ 	 */

> CHANGE  13 : 14  @  13 : 16

~ 				--this.itemInUseCount;

> DELETE  14  @  14 : 22

> DELETE  8  @  8 : 12

> DELETE  43  @  43 : 51

> INSERT  9 : 13  @  9

+ 	/**
+ 	 * + Return the amount of time this entity should stay in a portal before being
+ 	 * transported.
+ 	 */

> INSERT  12 : 15  @  12

+ 	/**
+ 	 * + Return the amount of cooldown before this entity can use a portal again.
+ 	 */

> INSERT  8 : 11  @  8

+ 	/**
+ 	 * + Plays sounds and makes particles for item in use state
+ 	 */

> INSERT  32 : 35  @  32

+ 	/**
+ 	 * + Used for when item use count runs out, ie: eating completed
+ 	 */

> INSERT  30 : 33  @  30

+ 	/**
+ 	 * + Dead and sleeping entities cannot move
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + set current crafting inventory back to the 2x2 square
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Handles updating while being ridden by an entity
+ 	 */

> CHANGE  1 : 14  @  1 : 20

~ 		double d0 = this.posX;
~ 		double d1 = this.posY;
~ 		double d2 = this.posZ;
~ 		float f = this.rotationYaw;
~ 		float f1 = this.rotationPitch;
~ 		super.updateRidden();
~ 		this.prevCameraYaw = this.cameraYaw;
~ 		this.cameraYaw = 0.0F;
~ 		this.addMountedMovementStat(this.posX - d0, this.posY - d1, this.posZ - d2);
~ 		if (this.ridingEntity instanceof EntityPig) {
~ 			this.rotationPitch = f1;
~ 			this.rotationYaw = f;
~ 			this.renderYawOffset = ((EntityPig) this.ridingEntity).renderYawOffset;

> INSERT  3 : 8  @  3

+ 	/**
+ 	 * + Keeps moving the entity up so it isn't colliding with blocks and other
+ 	 * requirements for this entity to be spawned (only actually used on players
+ 	 * though its also on Entity)
+ 	 */

> INSERT  13 : 18  @  13

+ 	/**
+ 	 * + Called frequently so the entity can update its state every tick as
+ 	 * required. For example, zombies and skeletons use this to react to sunlight
+ 	 * and start to burn.
+ 	 */

> DELETE  20  @  20 : 23

> INSERT  52 : 55  @  52

+ 	/**
+ 	 * + Set player's score
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Add to player's score
+ 	 */

> INSERT  5 : 8  @  5

+ 	/**
+ 	 * + Called when the mob's health reaches 0.
+ 	 */

> INSERT  26 : 29  @  26

+ 	/**
+ 	 * + Returns the sound this mob makes when it is hurt.
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Returns the sound this mob makes on death.
+ 	 */

> INSERT  4 : 8  @  4

+ 	/**
+ 	 * + Adds a value to the player score. Currently not actually used and the
+ 	 * entity passed in does nothing. Args: entity, scoreToAdd
+ 	 */

> CHANGE  13 : 14  @  13 : 14

~ 		for (ScoreObjective scoreobjective : (Collection<ScoreObjective>) collection) {

> INSERT  30 : 33  @  30

+ 	/**
+ 	 * + Called when player presses the drop item key
+ 	 */

> INSERT  6 : 9  @  6

+ 	/**
+ 	 * + Args: itemstack, flag
+ 	 */

> INSERT  46 : 49  @  46

+ 	/**
+ 	 * + Joins the passed in entity item with the world. Args: entityItem
+ 	 */

> INSERT  4 : 8  @  4

+ 	/**
+ 	 * + Block hardness will be further counted in
+ 	 * net/minecraft/block/Block.getPlayerRelativeBlockHardness
+ 	 */

> INSERT  45 : 49  @  45

+ 	/**
+ 	 * + Checks if the player has the ability to harvest a block (checks current
+ 	 * inventory item for a tool if necessary)
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + (abstract) Protected helper method to read subclass entity data from NBT.
+ 	 */

> INSERT  38 : 41  @  38

+ 	/**
+ 	 * + (abstract) Protected helper method to write subclass entity data to NBT.
+ 	 */

> INSERT  28 : 31  @  28

+ 	/**
+ 	 * + Called when the entity is attacked.
+ 	 */

> DELETE  10  @  10 : 14

> INSERT  38 : 42  @  38

+ 	/**
+ 	 * + Returns the current armor value as determined by a call to
+ 	 * InventoryPlayer.getTotalArmorValue
+ 	 */

> INSERT  4 : 8  @  4

+ 	/**
+ 	 * + When searching for vulnerable players, if a player is invisible, the return
+ 	 * value of this is the chance of seeing them anyway.
+ 	 */

> INSERT  12 : 17  @  12

+ 	/**
+ 	 * + Deals damage to the entity. If its a EntityPlayer then will take damage
+ 	 * from the armor first and then health second with the reduced value. Args:
+ 	 * damageAmount
+ 	 */

> INSERT  33 : 37  @  33

+ 	/**
+ 	 * + Displays the GUI for interacting with a chest inventory. Args:
+ 	 * chestInventory
+ 	 */

> INSERT  9 : 12  @  9

+ 	/**
+ 	 * + Displays the GUI for interacting with a book.
+ 	 */

> INSERT  43 : 46  @  43

+ 	/**
+ 	 * + Returns the currently being used item by the player.
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Destroys the currently equipped item from the player's inventory.
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Returns the Y Offset of this entity.
+ 	 */

> INSERT  4 : 8  @  4

+ 	/**
+ 	 * + Attacks for the player the targeted entity with the currently equipped
+ 	 * item. The equipped item has hitEntity called on it. Args: targetEntity
+ 	 */

> DELETE  50  @  50 : 59

> INSERT  51 : 55  @  51

+ 	/**
+ 	 * + Called when the player performs a critical hit on the Entity. Args: entity
+ 	 * that was hit critically
+ 	 */

> INSERT  9 : 12  @  9

+ 	/**
+ 	 * + Will get destroyed next tick.
+ 	 */

> INSERT  9 : 12  @  9

+ 	/**
+ 	 * + Checks if this entity is inside of an opaque block
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + returns true if this is an EntityPlayerSP, or the logged in player.
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Returns the GameProfile for this player
+ 	 */

> DELETE  5  @  5 : 9

> DELETE  1  @  1 : 26

> DELETE  36  @  36 : 39

> INSERT  23 : 26  @  23

+ 	/**
+ 	 * + Wake up the player if they're sleeping.
+ 	 */

> DELETE  16  @  16 : 19

> INSERT  12 : 15  @  12

+ 	/**
+ 	 * + Return null if bed is invalid
+ 	 */

> INSERT  15 : 18  @  15

+ 	/**
+ 	 * + Returns the orientation of the bed in degrees.
+ 	 */

> INSERT  19 : 22  @  19

+ 	/**
+ 	 * + Returns whether player is sleeping or not
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Returns whether or not the player is asleep and the screen has fully faded.
+ 	 */

> INSERT  30 : 33  @  30

+ 	/**
+ 	 * + Will trigger the specified trigger.
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Adds a value to a statistic field.
+ 	 */

> INSERT  6 : 9  @  6

+ 	/**
+ 	 * + Causes this entity to do an upwards motion (jumping).
+ 	 */

> INSERT  11 : 14  @  11

+ 	/**
+ 	 * + Moves the entity based on the specified heading. Args: strafe, forward
+ 	 */

> INSERT  18 : 21  @  18

+ 	/**
+ 	 * + the movespeed used for the new AI system
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Adds a value to a movement statistic field - like run, walk, swin or climb.
+ 	 */

> INSERT  44 : 48  @  44

+ 	/**
+ 	 * + Adds a value to a mounted movement statistic field - by minecart, boat, or
+ 	 * pig.
+ 	 */

> INSERT  37 : 41  @  37

+ 	/**
+ 	 * + sets the players height back to normal after doing things like sleeping and
+ 	 * dieing
+ 	 */

> DELETE  4  @  4 : 5

> INSERT  6 : 9  @  6

+ 	/**
+ 	 * + This method gets called when the entity kills another one.
+ 	 */

> INSERT  13 : 16  @  13

+ 	/**
+ 	 * + Sets the Entity inside a web block.
+ 	 */

> INSERT  11 : 14  @  11

+ 	/**
+ 	 * + Add experience points to player.
+ 	 */

> INSERT  31 : 34  @  31

+ 	/**
+ 	 * + Add experience levels to this player.
+ 	 */

> INSERT  16 : 21  @  16

+ 	/**
+ 	 * + This method returns the cap amount of experience that the experience bar
+ 	 * can hold. With each level, the experience cap on the player's experience bar
+ 	 * is raised by 10.
+ 	 */

> INSERT  5 : 8  @  5

+ 	/**
+ 	 * + increases exhaustion level by supplied amount
+ 	 */

> DELETE  1  @  1 : 5

> DELETE  1  @  1 : 2

> INSERT  2 : 5  @  2

+ 	/**
+ 	 * + Returns the player's FoodStats object.
+ 	 */

> INSERT  8 : 11  @  8

+ 	/**
+ 	 * + Checks if the player's health is not full and not zero.
+ 	 */

> INSERT  4 : 8  @  4

+ 	/**
+ 	 * + sets the itemInUse when the use item button is clicked. Args: itemstack,
+ 	 * int maxItemUseDuration
+ 	 */

> DELETE  4  @  4 : 8

> INSERT  19 : 22  @  19

+ 	/**
+ 	 * + Get the experience points the entity currently has.
+ 	 */

> INSERT  9 : 13  @  9

+ 	/**
+ 	 * + Only use is to identify if class is an instance of player for experience
+ 	 * dropping
+ 	 */

> INSERT  8 : 12  @  8

+ 	/**
+ 	 * + Copies the values from the given player into this player if boolean par2 is
+ 	 * true. Always clones Ender Chest Inventory.
+ 	 */

> INSERT  25 : 29  @  25

+ 	/**
+ 	 * + returns if this entity triggers Block.onEntityWalking on the blocks they
+ 	 * walk on. used for spiders and wolves to prevent them from trampling crops
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Sends the player's abilities to the server (if there is one).
+ 	 */

> INSERT  3 : 6  @  3

+ 	/**
+ 	 * + Sets the player's game mode and sends it to them.
+ 	 */

> INSERT  3 : 7  @  3

+ 	/**
+ 	 * + Gets the name of this command sender (usually username, but possibly
+ 	 * "Rcon")
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Returns the InventoryEnderChest of this player.
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + 0: Tool in Hand; 1-4: Armor
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Returns the item that this EntityLiving is holding, if any.
+ 	 */

> INSERT  4 : 8  @  4

+ 	/**
+ 	 * + Sets the held item, or an armor slot. Slot 0 is held item. Slot 1-4 is
+ 	 * armor. Params: Item, slot
+ 	 */

> INSERT  4 : 10  @  4

+ 	/**
+ 	 * + Only used by renderer in EntityLivingBase subclasses.\nDetermines if an
+ 	 * entity is visible or not to a specfic player, if the entity is normally
+ 	 * invisible.\nFor EntityLivingBase subclasses, returning false when invisible
+ 	 * will render the entity semitransparent.
+ 	 */

> INSERT  14 : 17  @  14

+ 	/**
+ 	 * + returns the inventory of this entity (only used in EntityPlayerMP it seems)
+ 	 */

> INSERT  16 : 20  @  16

+ 	/**
+ 	 * + Get the formatted ChatComponent that will be used for the sender's username
+ 	 * in chat
+ 	 */

> CHANGE  35 : 40  @  35 : 37

~ 	/**
~ 	 * + Gets a players UUID given their GameProfie
~ 	 */
~ 	public static EaglercraftUUID getUUID(GameProfile profile) {
~ 		EaglercraftUUID uuid = profile.getId();

> CHANGE  7 : 9  @  7 : 9

~ 	public static EaglercraftUUID getOfflineUUID(String username) {
~ 		return EaglercraftUUID.nameUUIDFromBytes(("OfflinePlayer:" + username).getBytes(Charsets.UTF_8));

> INSERT  2 : 6  @  2

+ 	/**
+ 	 * + Check whether this player can open an inventory locked with the given
+ 	 * LockCode.
+ 	 */

> INSERT  15 : 19  @  15

+ 	/**
+ 	 * + Returns true if the command sender should be sent feedback about executed
+ 	 * commands
+ 	 */

> CHANGE  1 : 2  @  1 : 2

~ 		return true;

> INSERT  35 : 38  @  35

+ 	/**
+ 	 * + Whether the "reducedDebugInfo" option is active for this player.
+ 	 */

> EOF
