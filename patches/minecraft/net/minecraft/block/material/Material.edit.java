
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  2 : 4  @  2 : 7

~ import net.zxmushroom63.plugins.BaseData;
~ import net.zxmushroom63.plugins.PluginData;

> CHANGE  1 : 2  @  1 : 2

~ public class Material extends PluginData {

> INSERT  54 : 173  @  54

+ 	public static PluginData makePluginDataStatic() {
+ 		PluginData data = new PluginData();
+ 		data.set("air", air.makePluginData());
+ 		data.set("grass", grass.makePluginData());
+ 		data.set("ground", ground.makePluginData());
+ 		data.set("wood", wood.makePluginData());
+ 		data.set("rock", rock.makePluginData());
+ 		data.set("iron", iron.makePluginData());
+ 		data.set("anvil", anvil.makePluginData());
+ 		data.set("water", water.makePluginData());
+ 		data.set("lava", lava.makePluginData());
+ 		data.set("leaves", leaves.makePluginData());
+ 		data.set("plants", plants.makePluginData());
+ 		data.set("vine", vine.makePluginData());
+ 		data.set("sponge", sponge.makePluginData());
+ 		data.set("cloth", cloth.makePluginData());
+ 		data.set("fire", fire.makePluginData());
+ 		data.set("sand", sand.makePluginData());
+ 		data.set("circuits", circuits.makePluginData());
+ 		data.set("carpet", carpet.makePluginData());
+ 		data.set("glass", glass.makePluginData());
+ 		data.set("redstoneLight", redstoneLight.makePluginData());
+ 		data.set("tnt", tnt.makePluginData());
+ 		data.set("coral", coral.makePluginData());
+ 		data.set("ice", ice.makePluginData());
+ 		data.set("packedIce", packedIce.makePluginData());
+ 		data.set("snow", snow.makePluginData());
+ 		data.set("craftedSnow", craftedSnow.makePluginData());
+ 		data.set("cactus", cactus.makePluginData());
+ 		data.set("clay", clay.makePluginData());
+ 		data.set("gourd", gourd.makePluginData());
+ 		data.set("dragonEgg", dragonEgg.makePluginData());
+ 		data.set("portal", portal.makePluginData());
+ 		data.set("cake", cake.makePluginData());
+ 		data.set("web", web.makePluginData());
+ 		data.set("piston", piston.makePluginData());
+ 		data.set("barrier", barrier.makePluginData());
+ 		return data;
+ 	}
+ 
+ 	public void loadPluginData(BaseData data) {
+ 		canBurn = data.getBoolean("canBurn");
+ 		replaceable = data.getBoolean("replaceable");
+ 		requiresNoTool = data.getBoolean("requiresNoTool");
+ 		isTranslucent = data.getBoolean("isTranslucent");
+ 		isAdventureModeExempt = data.getBoolean("isAdventureModeExempt");
+ 		materialMapColor.loadPluginData(data.getBaseData("materialMapColor"));
+ 
+ 		mobilityFlag = data.getInt("mobilityFlag");
+ 	}
+ 
+ 	public PluginData makePluginData() {
+ 		PluginData data = new PluginData();
+ 		data.setCallbackObject("getRef", () -> {
+ 			return this;
+ 		});
+ 		data.set("canBurn", canBurn);
+ 		data.set("replaceable", replaceable);
+ 		data.set("isTranslucent", isTranslucent);
+ 		data.set("requiresNoTool", requiresNoTool);
+ 		data.set("mobilityFlag", mobilityFlag);
+ 		data.set("isAdventureModeExempt", isAdventureModeExempt);
+ 		data.set("materialMapColor", materialMapColor.makePluginData());
+ 
+ 		data.setCallbackVoid("reload", () -> {
+ 			loadPluginData(data);
+ 		});
+ 
+ 		data.setCallbackBoolean("isLiquid", () -> {
+ 			return isLiquid();
+ 		});
+ 		data.setCallbackBoolean("isSolid", () -> {
+ 			return isSolid();
+ 		});
+ 		data.setCallbackBoolean("isReplaceable", () -> {
+ 			return isReplaceable();
+ 		});
+ 		data.setCallbackBoolean("isToolNotRequired", () -> {
+ 			return isToolNotRequired();
+ 		});
+ 		data.setCallbackBoolean("isOpaque", () -> {
+ 			return isOpaque();
+ 		});
+ 		data.setCallbackBoolean("getCanBurn", () -> {
+ 			return getCanBurn();
+ 		});
+ 		data.setCallbackBoolean("blocksLight", () -> {
+ 			return blocksLight();
+ 		});
+ 		data.setCallbackBoolean("blocksMovement", () -> {
+ 			return blocksMovement();
+ 		});
+ 		data.setCallbackObject("setTranslucent", () -> {
+ 			return setTranslucent().makePluginData();
+ 		});
+ 		data.setCallbackObject("setRequiresTool", () -> {
+ 			return setRequiresTool().makePluginData();
+ 		});
+ 		data.setCallbackObject("setBurning", () -> {
+ 			return setBurning().makePluginData();
+ 		});
+ 		data.setCallbackObject("setReplaceable", () -> {
+ 			return setReplaceable().makePluginData();
+ 		});
+ 		data.setCallbackObject("setNoPushMobility", () -> {
+ 			return setNoPushMobility().makePluginData();
+ 		});
+ 		data.setCallbackInt("getMaterialMobility", () -> {
+ 			return getMaterialMobility();
+ 		});
+ 		data.setCallbackObject("setImmovableMobility", () -> {
+ 			return setImmovableMobility().makePluginData();
+ 		});
+ 		data.setCallbackObject("setAdventureModeExempt", () -> {
+ 			return setAdventureModeExempt().makePluginData();
+ 		});
+ 		return data;
+ 	}
+ 

> EOF
