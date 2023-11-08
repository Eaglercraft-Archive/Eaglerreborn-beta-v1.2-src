
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  2  @  2 : 5

> CHANGE  4 : 11  @  4 : 6

~ import net.lax1dude.eaglercraft.v1_8.EaglercraftRandom;
~ import net.lax1dude.eaglercraft.v1_8.EaglercraftUUID;
~ 
~ import com.google.common.base.Predicate;
~ import com.google.common.base.Predicates;
~ import com.google.common.collect.Maps;
~ 

> CHANGE  2 : 3  @  2 : 3

~ import net.minecraft.client.Minecraft;

> DELETE  1  @  1 : 5

> DELETE  5  @  5 : 8

> DELETE  1  @  1 : 3

> INSERT  4 : 5  @  4

+ import net.minecraft.nbt.JsonToNBT;

> DELETE  5  @  5 : 8

> CHANGE  13 : 15  @  13 : 14

~ import net.zxmushroom63.plugins.BaseData;
~ import net.zxmushroom63.plugins.PluginData;

> CHANGE  2 : 4  @  2 : 3

~ 	private static final EaglercraftUUID sprintingSpeedBoostModifierUUID = EaglercraftUUID
~ 			.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");

> INSERT  75 : 380  @  75

+ 	@Override
+ 	public void loadPluginData(BaseData data) {
+ 		super.loadPluginData(data);
+ 		isSwingInProgress = data.getBoolean("isSwingInProgress");
+ 		arrowHitTimer = data.getInt("arrowHitTimer");
+ 		hurtTime = data.getInt("hurtTime");
+ 		maxHurtTime = data.getInt("maxHurtTime");
+ 		swingProgressInt = data.getInt("swingProgressInt");
+ 		attackedAtYaw = data.getFloat("attackedAtYaw");
+ 		deathTime = data.getInt("deathTime");
+ 
+ 		prevSwingProgress = data.getFloat("prevSwingProgress");
+ 		swingProgress = data.getFloat("swingProgress");
+ 		prevLimbSwingAmount = data.getFloat("prevLimbSwingAmount");
+ 		limbSwingAmount = data.getFloat("limbSwingAmount");
+ 		limbSwing = data.getFloat("limbSwing");
+ 		maxHurtResistantTime = data.getInt("maxHurtResistantTime");
+ 		prevCameraPitch = data.getFloat("prevCameraPitch");
+ 		cameraPitch = data.getFloat("cameraPitch");
+ 		renderYawOffset = data.getFloat("renderYawOffset");
+ 		prevRenderYawOffset = data.getFloat("prevRenderYawOffset");
+ 		rotationYawHead = data.getFloat("rotationYawHead");
+ 		prevRotationYawHead = data.getFloat("prevRotationYawHead");
+ 		jumpMovementFactor = data.getFloat("jumpMovementFactor");
+ 
+ 		recentlyHit = data.getInt("recentlyHit");
+ 		dead = data.getBoolean("dead");
+ 		entityAge = data.getInt("entityAge");
+ 		onGroundSpeedFactor = data.getFloat("onGroundSpeedFactor");
+ 		prevOnGroundSpeedFactor = data.getFloat("prevOnGroundSpeedFactor");
+ 		movedDistance = data.getFloat("movedDistance");
+ 		prevMovedDistance = data.getFloat("prevMovedDistance");
+ 		scoreValue = data.getInt("scoreValue");
+ 		lastDamage = data.getFloat("lastDamage");
+ 		isJumping = data.getBoolean("isJumping");
+ 
+ 		moveForward = data.getFloat("moveForward");
+ 		moveStrafing = data.getFloat("moveStrafing");
+ 		randomYawVelocity = data.getFloat("randomYawVelocity");
+ 		newPosRotationIncrements = data.getInt("newPosRotationIncrements");
+ 		newPosX = data.getDouble("newPosX");
+ 		newPosY = data.getDouble("newPosY");
+ 		newPosZ = data.getDouble("newPosZ");
+ 		newRotationPitch = data.getDouble("newRotationPitch");
+ 		newRotationYaw = data.getDouble("newRotationYaw");
+ 		revengeTimer = data.getInt("revengeTimer");
+ 		lastAttackerTime = data.getInt("lastAttackerTime");
+ 		landMovementFactor = data.getFloat("landMovementFactor");
+ 		jumpTicks = data.getInt("jumpTicks");
+ 		absorptionAmount = data.getFloat("absorptionAmount");
+ 	}
+ 
+ 	@Override
+ 	public PluginData makePluginData() {
+ 		PluginData data = super.makePluginData();
+ 		data.setCallbackVoid("reload", () -> {
+ 			loadPluginData(data);
+ 		});
+ 		data.setCallbackObject("getRef", () -> {
+ 			return this;
+ 		});
+ 		data.setCallbackObjectArr("getPreviousEquipment", () -> {
+ 			PluginData[] itemstackBaseDatas = new PluginData[previousEquipment.length];
+ 			for (int i = 0; i < previousEquipment.length; i++) {
+ 				if (previousEquipment[i] != null) {
+ 					itemstackBaseDatas[i] = previousEquipment[i].makePluginData();
+ 				}
+ 			}
+ 			return itemstackBaseDatas;
+ 		});
+ 		data.setCallbackObject("getAttackingPlayer", () -> {
+ 			if (attackingPlayer != null) {
+ 				return attackingPlayer.makePluginData();
+ 			} else {
+ 				return new PluginData();
+ 			}
+ 		});
+ 		data.setCallbackObject("getLastAttacker", () -> {
+ 			if (lastAttacker != null) {
+ 				return lastAttacker.makePluginData();
+ 			} else {
+ 				return new PluginData();
+ 			}
+ 		});
+ 		data.setCallbackObject("getEntityLivingToAttack", () -> {
+ 			if (entityLivingToAttack != null) {
+ 				return entityLivingToAttack.makePluginData();
+ 			} else {
+ 				return new PluginData();
+ 			}
+ 		});
+ 		data.setCallbackVoidWithDataArg("setEntityLivingToAttack", (BaseData params) -> {
+ 			if (params.getBaseData("entity") instanceof EntityLivingBase) {
+ 				entityLivingToAttack = (EntityLivingBase) params.getBaseData("entity");
+ 			}
+ 		});
+ 		data.set("isSwingInProgress", isSwingInProgress);
+ 		data.set("arrowHitTimer", arrowHitTimer);
+ 		data.set("hurtTime", hurtTime);
+ 		data.set("maxHurtTime", maxHurtTime);
+ 		data.set("swingProgressInt", swingProgressInt);
+ 		data.set("attackedAtYaw", attackedAtYaw);
+ 		data.set("deathTime", deathTime);
+ 
+ 		data.set("prevSwingProgress", prevSwingProgress);
+ 		data.set("swingProgress", swingProgress);
+ 		data.set("prevLimbSwingAmount", prevLimbSwingAmount);
+ 		data.set("limbSwingAmount", limbSwingAmount);
+ 		data.set("limbSwing", limbSwing);
+ 		data.set("maxHurtResistantTime", maxHurtResistantTime);
+ 
+ 		data.set("prevCameraPitch", prevCameraPitch);
+ 		data.set("cameraPitch", cameraPitch);
+ 		data.set("renderYawOffset", renderYawOffset);
+ 		data.set("prevRenderYawOffset", prevRenderYawOffset);
+ 		data.set("rotationYawHead", rotationYawHead);
+ 		data.set("prevRotationYawHead", prevRotationYawHead);
+ 		data.set("jumpMovementFactor", jumpMovementFactor);
+ 
+ 		data.set("recentlyHit", recentlyHit);
+ 		data.set("dead", dead);
+ 		data.set("entityAge", entityAge);
+ 		data.set("onGroundSpeedFactor", onGroundSpeedFactor);
+ 		data.set("movedDistance", movedDistance);
+ 		data.set("prevOnGroundSpeedFactor", prevOnGroundSpeedFactor);
+ 		data.set("prevMovedDistance", prevMovedDistance);
+ 		data.set("scoreValue", scoreValue);
+ 		data.set("lastDamage", lastDamage);
+ 		data.set("isJumping", isJumping);
+ 
+ 		data.set("moveForward", moveForward);
+ 		data.set("moveStrafing", moveStrafing);
+ 		data.set("randomYawVelocity", randomYawVelocity);
+ 		data.set("newPosRotationIncrements", newPosRotationIncrements);
+ 		data.set("newPosX", newPosX);
+ 		data.set("newPosY", newPosY);
+ 		data.set("newPosZ", newPosZ);
+ 		data.set("newRotationPitch", newRotationPitch);
+ 		data.set("newRotationYaw", newRotationYaw);
+ 		data.set("revengeTimer", revengeTimer);
+ 		data.set("lastAttackerTime", lastAttackerTime);
+ 		data.set("landMovementFactor", landMovementFactor);
+ 		data.set("jumpTicks", jumpTicks);
+ 		data.set("absorptionAmount", absorptionAmount);
+ 
+ 		data.setCallbackBoolean("canBreatheUnderwater", () -> {
+ 			return canBreatheUnderwater();
+ 		});
+ 		data.setCallbackBoolean("isChild", () -> {
+ 			return isChild();
+ 		});
+ 		data.setCallbackBoolean("canDropLoot", () -> {
+ 			return canDropLoot();
+ 		});
+ 		data.setCallbackIntWithDataArg("decreaseAirSupply", (BaseData params) -> {
+ 			return decreaseAirSupply(params.getInt("parInt1"));
+ 		});
+ 		data.setCallbackBoolean("isPlayer", () -> {
+ 			return isPlayer();
+ 		});
+ 		data.setCallbackObject("getAITarget", () -> {
+ 			return getAITarget().makePluginData();
+ 		});
+ 		data.setCallbackInt("getRevengeTimer", () -> {
+ 			return getRevengeTimer();
+ 		});
+ 		data.setCallbackInt("getLastAttackerTime", () -> {
+ 			return getLastAttackerTime();
+ 		});
+ 		data.setCallbackInt("getAge", () -> {
+ 			return getAge();
+ 		});
+ 		data.setCallbackVoid("clearActivePotions", () -> {
+ 			clearActivePotions();
+ 		});
+ 		data.setCallbackBooleanWithDataArg("isPotionActive", (BaseData params) -> {
+ 			return isPotionActive(params.getInt("potionId"));
+ 		});
+ 		data.setCallbackBoolean("isEntityUndead", () -> {
+ 			return isEntityUndead();
+ 		});
+ 		data.setCallbackVoidWithDataArg("removePotionEffectClient", (BaseData params) -> {
+ 			removePotionEffectClient(params.getInt("potionId"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("removePotionEffect", (BaseData params) -> {
+ 			removePotionEffect(params.getInt("potionId"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("heal", (BaseData params) -> {
+ 			heal(params.getFloat("f"));
+ 		});
+ 		data.setCallbackFloat("getHealth", () -> {
+ 			return getHealth();
+ 		});
+ 		data.setCallbackVoidWithDataArg("setHealth", (BaseData params) -> {
+ 			setHealth(params.getFloat("health"));
+ 		});
+ 		data.setCallbackString("getHurtSound", () -> {
+ 			return getHurtSound();
+ 		});
+ 		data.setCallbackString("getDeathSound", () -> {
+ 			return getDeathSound();
+ 		});
+ 		data.setCallbackVoid("addRandomDrop", () -> {
+ 			addRandomDrop();
+ 		});
+ 		data.setCallbackBoolean("isOnLadder", () -> {
+ 			return isOnLadder();
+ 		});
+ 		data.setCallbackBoolean("isEntityAlive", () -> {
+ 			return isEntityAlive();
+ 		});
+ 		data.setCallbackVoidWithDataArg("fall", (BaseData params) -> {
+ 			fall(params.getFloat("f"), params.getFloat("f1"));
+ 		});
+ 		data.setCallbackStringWithDataArg("getFallSoundString", (BaseData params) -> {
+ 			return getFallSoundString(params.getInt("damageValue"));
+ 		});
+ 		data.setCallbackVoid("performHurtAnimation", () -> {
+ 			performHurtAnimation();
+ 		});
+ 		data.setCallbackInt("getTotalArmorValue", () -> {
+ 			return getTotalArmorValue();
+ 		});
+ 		data.setCallbackVoidWithDataArg("damageArmor", (BaseData params) -> {
+ 			damageArmor(params.getFloat("parFloat1"));
+ 		});
+ 		data.setCallbackFloat("getMaxHealth", () -> {
+ 			return getMaxHealth();
+ 		});
+ 		data.setCallbackInt("getArrowCountInEntity", () -> {
+ 			return getArrowCountInEntity();
+ 		});
+ 		data.setCallbackVoidWithDataArg("setArrowCountInEntity", (BaseData params) -> {
+ 			setArrowCountInEntity(params.getInt("count"));
+ 		});
+ 		data.setCallbackVoid("swingItem", () -> {
+ 			swingItem();
+ 		});
+ 		data.setCallbackVoid("kill", () -> {
+ 			kill();
+ 		});
+ 		data.setCallbackVoidWithDataArg("setSprinting", (BaseData params) -> {
+ 			setSprinting(params.getBoolean("flag"));
+ 		});
+ 		data.setCallbackFloat("getSoundVolume", () -> {
+ 			return getSoundVolume();
+ 		});
+ 		data.setCallbackFloat("getSoundPitch", () -> {
+ 			return getSoundPitch();
+ 		});
+ 		data.setCallbackBoolean("isMovementBlocked", () -> {
+ 			return isMovementBlocked();
+ 		});
+ 		data.setCallbackFloat("getJumpUpwardsMotion", () -> {
+ 			return getJumpUpwardsMotion();
+ 		});
+ 		data.setCallbackVoid("jump", () -> {
+ 			jump();
+ 		});
+ 		data.setCallbackVoid("updateAITick", () -> {
+ 			updateAITick();
+ 		});
+ 		data.setCallbackVoid("handleJumpLava", () -> {
+ 			handleJumpLava();
+ 		});
+ 		data.setCallbackFloat("getAIMoveSpeed", () -> {
+ 			return getAIMoveSpeed();
+ 		});
+ 		data.setCallbackVoidWithDataArg("setAIMoveSpeed", (BaseData params) -> {
+ 			setAIMoveSpeed(params.getFloat("speedIn"));
+ 		});
+ 		data.setCallbackVoid("collideWithNearbyEntities", () -> {
+ 			collideWithNearbyEntities();
+ 		});
+ 		data.setCallbackVoidWithDataArg("setJumping", (BaseData params) -> {
+ 			setJumping(params.getBoolean("parFlag"));
+ 		});
+ 		data.setCallbackBoolean("canBeCollidedWith", () -> {
+ 			return canBeCollidedWith();
+ 		});
+ 		data.setCallbackBoolean("canBePushed", () -> {
+ 			return canBePushed();
+ 		});
+ 		data.setCallbackVoid("setBeenAttacked", () -> {
+ 			setBeenAttacked();
+ 		});
+ 		data.setCallbackFloat("getRotationYawHead", () -> {
+ 			return getRotationYawHead();
+ 		});
+ 		data.setCallbackVoidWithDataArg("setRotationYawHead", (BaseData params) -> {
+ 			setRotationYawHead(params.getFloat("f"));
+ 		});
+ 		data.setCallbackFloat("getAbsorptionAmount", () -> {
+ 			return getAbsorptionAmount();
+ 		});
+ 		data.setCallbackVoidWithDataArg("setAbsorptionAmount", (BaseData params) -> {
+ 			setAbsorptionAmount(params.getFloat("amount"));
+ 		});
+ 		data.setCallbackVoid("markPotionsDirty", () -> {
+ 			markPotionsDirty();
+ 		});
+ 
+ 		return data;
+ 	}
+ 

> DELETE  18  @  18 : 35

> CHANGE  25 : 26  @  25 : 28

~ 		this.extinguish();

> DELETE  22  @  22 : 25

> CHANGE  14 : 15  @  14 : 15

~ 		if (this.hurtResistantTime > 0) {

> DELETE  41  @  41 : 44

> DELETE  1  @  1 : 9

> CHANGE  33 : 34  @  33 : 34

~ 	public EaglercraftRandom getRNG() {

> DELETE  74  @  74 : 77

> CHANGE  37 : 38  @  37 : 43

~ 			if (potioneffect.onUpdate(this) && potioneffect.getDuration() % 600 == 0) {

> CHANGE  4 : 5  @  4 : 8

~ 		this.potionsNeedUpdate = false;

> DELETE  1  @  1 : 4

> DELETE  47  @  47 : 48

> DELETE  1  @  1 : 10

> DELETE  62  @  62 : 67

> DELETE  4  @  4 : 11

> DELETE  4  @  4 : 9

> CHANGE  19 : 20  @  19 : 112

~ 		return false;

> DELETE  33  @  33 : 38

> DELETE  1  @  1 : 10

> DELETE  190  @  190 : 194

> DELETE  59  @  59 : 60

> CHANGE  154 : 157  @  154 : 159

~ 					if (!this.worldObj.isBlockLoaded(new BlockPos((int) this.posX, 0, (int) this.posZ))
~ 							|| !this.worldObj.getChunkFromBlockCoords(new BlockPos((int) this.posX, 0, (int) this.posZ))
~ 									.isLoaded()) {

> DELETE  87  @  87 : 123

> DELETE  158  @  158 : 162

> DELETE  29  @  29 : 33

> DELETE  31  @  31 : 37

> DELETE  1  @  1 : 12

> CHANGE  31 : 32  @  31 : 32

~ 		return false;

> EOF
