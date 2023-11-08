
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  2  @  2 : 4

> INSERT  2 : 6  @  2

+ 
+ import com.google.common.collect.Lists;
+ import com.google.common.collect.Sets;
+ 

> INSERT  2 : 4  @  2

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
~ public class KeyBinding extends PluginData implements Comparable<KeyBinding> {

> INSERT  60 : 119  @  60

+ 	public void loadPluginData(BaseData data) {
+ 		keyCode = data.getInt("keyCode");
+ 		pressed = data.getBoolean("pressed");
+ 		pressTime = data.getInt("pressTime");
+ 
+ 	}
+ 
+ 	public PluginData makePluginData() {
+ 		PluginData data = new PluginData();
+ 
+ 		data.setCallbackVoid("reload", () -> {
+ 			loadPluginData(data);
+ 		});
+ 
+ 		data.setCallbackObject("getRef", () -> {
+ 			return this;
+ 		});
+ 
+ 		data.set("keyCode", keyCode);
+ 		data.set("pressed", pressed);
+ 		data.set("pressTime", pressTime);
+ 		data.set("keyDescription", keyDescription);
+ 		data.set("keyCategory", keyCategory);
+ 
+ 		data.setCallbackBoolean("isKeyDown", () -> {
+ 			return isKeyDown();
+ 		});
+ 
+ 		data.setCallbackString("getKeyCategory", () -> {
+ 			return getKeyCategory();
+ 		});
+ 
+ 		data.setCallbackBoolean("isPressed", () -> {
+ 			return isPressed();
+ 		});
+ 
+ 		data.setCallbackVoid("unpressKey", () -> {
+ 			unpressKey();
+ 		});
+ 
+ 		data.setCallbackString("getKeyDescription", () -> {
+ 			return getKeyDescription();
+ 		});
+ 
+ 		data.setCallbackInt("getKeyCodeDefault", () -> {
+ 			return getKeyCodeDefault();
+ 		});
+ 
+ 		data.setCallbackInt("getKeyCode", () -> {
+ 			return getKeyCode();
+ 		});
+ 
+ 		return data;
+ 	}
+ 
+ 	/**
+ 	 * + Returns true if the key is pressed (used for continuous querying). Should
+ 	 * be used in tickers.
+ 	 */

> INSERT  8 : 12  @  8

+ 	/**
+ 	 * + Returns true on the initial key press. For continuous querying use
+ 	 * {@link isKeyDown()}. Should be used in key events.
+ 	 */

> EOF
