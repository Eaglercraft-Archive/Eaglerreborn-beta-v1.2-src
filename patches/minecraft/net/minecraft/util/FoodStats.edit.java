
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  6  @  6 : 7

> INSERT  1 : 3  @  1

+ import net.zxmushroom63.plugins.BaseData;
+ import net.zxmushroom63.plugins.PluginData;

> CHANGE  1 : 2  @  1 : 2

~ public class FoodStats extends PluginData {

> INSERT  6 : 54  @  6

+ 	public void loadPluginData(BaseData data) {
+ 		foodLevel = data.getInt("foodLevel");
+ 		foodSaturationLevel = data.getFloat("foodSaturationLevel");
+ 		foodExhaustionLevel = data.getFloat("foodExhaustionLevel");
+ 		foodTimer = data.getInt("foodTimer");
+ 		prevFoodLevel = data.getInt("prevFoodLevel");
+ 	}
+ 
+ 	public PluginData makePluginData() {
+ 		PluginData data = new PluginData();
+ 		data.setCallbackObject("getRef", () -> {
+ 			return this;
+ 		});
+ 		data.setCallbackVoid("reload", () -> {
+ 			loadPluginData(data);
+ 		});
+ 		data.set("foodLevel", foodLevel);
+ 		data.set("foodSaturationLevel", foodSaturationLevel);
+ 		data.set("foodExhaustionLevel", foodExhaustionLevel);
+ 		data.set("foodTimer", foodTimer);
+ 		data.set("prevFoodLevel", prevFoodLevel);
+ 		data.setCallbackVoidWithDataArg("addStats", (BaseData params) -> {
+ 			addStats(params.getInt("foodLevelIn"), params.getFloat("foodSaturationModifier"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("addExhaustion", (BaseData params) -> {
+ 			addExhaustion(params.getFloat("parFloat1"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setFoodLevel", (BaseData params) -> {
+ 			setFoodLevel(params.getInt("foodLevelIn"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setFoodSaturationLevel", (BaseData params) -> {
+ 			setFoodSaturationLevel(params.getFloat("foodSaturationLevelIn"));
+ 		});
+ 		data.setCallbackInt("getFoodLevel", () -> {
+ 			return getFoodLevel();
+ 		});
+ 		data.setCallbackInt("getPrevFoodLevel", () -> {
+ 			return getPrevFoodLevel();
+ 		});
+ 		data.setCallbackFloat("getSaturationLevel", () -> {
+ 			return getSaturationLevel();
+ 		});
+ 		data.setCallbackBoolean("needFood", () -> {
+ 			return needFood();
+ 		});
+ 		return data;
+ 	}
+ 

> EOF
