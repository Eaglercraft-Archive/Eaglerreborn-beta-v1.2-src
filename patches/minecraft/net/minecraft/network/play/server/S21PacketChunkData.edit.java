
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  2  @  2 : 3

> INSERT  2 : 5  @  2

+ 
+ import com.google.common.collect.Lists;
+ 

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

> CHANGE  1 : 4  @  1 : 4

~ 	public int chunkX;
~ 	public int chunkZ;
~ 	public S21PacketChunkData.Extracted extractedData;

> INSERT  12 : 15  @  12

+ 	/**
+ 	 * + Reads the raw packet data from the data stream.
+ 	 */

> INSERT  9 : 12  @  9

+ 	/**
+ 	 * + Writes the raw packet data to the data stream.
+ 	 */

> INSERT  8 : 11  @  8

+ 	/**
+ 	 * + Passes this Packet on to the NetHandler for processing.
+ 	 */

> CHANGE  35 : 36  @  35 : 36

~ 		for (ExtendedBlockStorage extendedblockstorage1 : (ArrayList<ExtendedBlockStorage>) arraylist) {

> CHANGE  8 : 9  @  8 : 9

~ 		for (ExtendedBlockStorage extendedblockstorage2 : (ArrayList<ExtendedBlockStorage>) arraylist) {

> CHANGE  5 : 6  @  5 : 6

~ 			for (ExtendedBlockStorage extendedblockstorage3 : (ArrayList<ExtendedBlockStorage>) arraylist) {

> CHANGE  33 : 34  @  33 : 34

~ 	public static class Extracted extends PluginData {

> INSERT  2 : 20  @  2

+ 
+ 		public PluginData makePluginData() {
+ 			PluginData d = new PluginData();
+ 			d.setCallbackVoid("reload", () -> {
+ 				loadPluginData(d);
+ 			});
+ 			d.set("data", data);
+ 			d.set("dataSize", dataSize);
+ 			d.setCallbackObject("getRef", () -> {
+ 				return this;
+ 			});
+ 			return d;
+ 		}
+ 
+ 		public void loadPluginData(BaseData d) {
+ 			data = d.getByteArr("data");
+ 			dataSize = d.getInt("dataSize");
+ 		}

> EOF
