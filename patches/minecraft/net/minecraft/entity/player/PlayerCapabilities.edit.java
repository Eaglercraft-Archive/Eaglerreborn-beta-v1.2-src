
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> INSERT  3 : 5  @  3

+ import net.zxmushroom63.plugins.BaseData;
+ import net.zxmushroom63.plugins.PluginData;

> CHANGE  1 : 2  @  1 : 2

~ public class PlayerCapabilities extends PluginData {

> INSERT  8 : 49  @  8

+ 	public void loadPluginData(BaseData data) {
+ 		disableDamage = data.getBoolean("disableDamage");
+ 		isFlying = data.getBoolean("isFlying");
+ 		allowFlying = data.getBoolean("allowFlying");
+ 		isCreativeMode = data.getBoolean("isCreativeMode");
+ 		allowEdit = data.getBoolean("allowEdit");
+ 
+ 		flySpeed = data.getFloat("flySpeed");
+ 		walkSpeed = data.getFloat("walkSpeed");
+ 	}
+ 
+ 	public PluginData makePluginData() {
+ 		PluginData data = new PluginData();
+ 		data.set("disableDamage", disableDamage);
+ 		data.set("isFlying", isFlying);
+ 		data.set("allowFlying", allowFlying);
+ 		data.set("isCreativeMode", isCreativeMode);
+ 		data.set("allowEdit", allowEdit);
+ 		data.set("flySpeed", flySpeed);
+ 		data.set("walkSpeed", walkSpeed);
+ 		data.setCallbackVoid("reload", () -> {
+ 			loadPluginData(data);
+ 		});
+ 		data.setCallbackObject("getRef", () -> {
+ 			return this;
+ 		});
+ 		data.setCallbackFloat("getFlySpeed", () -> {
+ 			return getFlySpeed();
+ 		});
+ 		data.setCallbackFloat("getWalkSpeed", () -> {
+ 			return getWalkSpeed();
+ 		});
+ 		data.setCallbackVoidWithDataArg("setFlySpeed", (BaseData params) -> {
+ 			setFlySpeed(params.getFloat("speed"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setPlayerWalkSpeed", (BaseData params) -> {
+ 			setPlayerWalkSpeed(params.getFloat("speed"));
+ 		});
+ 		return data;
+ 	}
+ 

> DELETE  28  @  28 : 29

> EOF
