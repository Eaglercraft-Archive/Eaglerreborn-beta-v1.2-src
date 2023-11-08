
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  2 : 6  @  2 : 3

~ import net.zxmushroom63.plugins.BaseData;
~ import net.zxmushroom63.plugins.PluginData;
~ 
~ public class MapColor extends PluginData {

> CHANGE  37 : 39  @  37 : 39

~ 	public int colorValue;
~ 	public int colorIndex;

> INSERT  11 : 49  @  11

+ 	public void loadPluginData(BaseData data) {
+ 		colorIndex = data.getInt("colorIndex");
+ 		colorValue = data.getInt("colorValue");
+ 	}
+ 
+ 	public PluginData makePluginData() {
+ 		PluginData data = new PluginData();
+ 		data.set("colorIndex", colorIndex);
+ 		data.set("colorValue", colorValue);
+ 
+ 		int[] rgb = new int[3];
+ 		int rr;
+ 		int gg;
+ 		int bb;
+ 		int dec = colorValue;
+ 		rr = (int) Math.floor(dec / 65536);
+ 		dec -= rr * 65536;
+ 		gg = (int) Math.floor(dec / 256);
+ 		dec -= gg * 256;
+ 		bb = dec;
+ 		rr = Math.min(rr, 255);
+ 		rgb[0] = rr;
+ 		rgb[1] = gg;
+ 		rgb[2] = bb;
+ 		data.set("rgb", rgb);
+ 
+ 		data.setCallbackVoid("reload", () -> {
+ 			loadPluginData(data);
+ 		});
+ 
+ 		data.setCallbackObject("getRef", () -> {
+ 			return this;
+ 		});
+ 
+ 		return data;
+ 
+ 	}
+ 

> EOF
