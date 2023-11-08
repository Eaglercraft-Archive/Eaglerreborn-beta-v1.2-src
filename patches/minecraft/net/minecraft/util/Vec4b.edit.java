
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  2 : 6  @  2 : 3

~ import net.zxmushroom63.plugins.BaseData;
~ import net.zxmushroom63.plugins.PluginData;
~ 
~ public class Vec4b extends PluginData {

> INSERT  12 : 38  @  12

+ 	public void loadPluginData(BaseData data) {
+ 		field_176117_a = data.getByte("a");
+ 		field_176115_b = data.getByte("b");
+ 		field_176116_c = data.getByte("c");
+ 		field_176114_d = data.getByte("d");
+ 	}
+ 
+ 	public static Vec4b fromPluginData(BaseData data) {
+ 		return new Vec4b(data.getByte("a"), data.getByte("b"), data.getByte("c"), data.getByte("d"));
+ 	}
+ 
+ 	public PluginData makePluginData() {
+ 		PluginData data = new PluginData();
+ 		data.setCallbackVoid("reload", () -> {
+ 			loadPluginData(data);
+ 		});
+ 		data.setCallbackObject("getRef", () -> {
+ 			return this;
+ 		});
+ 		data.set("a", field_176117_a);
+ 		data.set("b", field_176115_b);
+ 		data.set("c", field_176116_c);
+ 		data.set("d", field_176114_d);
+ 		return data;
+ 	}
+ 

> EOF
