
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  2  @  2 : 4

> INSERT  3 : 7  @  3

+ 
+ import com.google.common.collect.Lists;
+ import com.google.common.collect.Sets;
+ 

> DELETE  2  @  2 : 5

> INSERT  4 : 6  @  4

+ import net.zxmushroom63.plugins.BaseData;
+ import net.zxmushroom63.plugins.PluginData;

> CHANGE  1 : 2  @  1 : 2

~ public abstract class Container extends PluginData {

> INSERT  1 : 42  @  1

+ 
+ 	public void loadPluginData(BaseData data) {
+ 		BaseData[] parItemStacks = data.getBaseDataArr("inventoryItemStacks");
+ 		for (int i = 0; i < parItemStacks.length && i < inventoryItemStacks.size(); i++) {
+ 			if (inventoryItemStacks.get(i) != null) {
+ 				inventoryItemStacks.get(i).loadPluginData(parItemStacks[i]);
+ 			} else if (parItemStacks[i] != null && parItemStacks[i].getRef() instanceof ItemStack) {
+ 				inventoryItemStacks.set(i, (ItemStack) parItemStacks[i].getRef());
+ 			}
+ 		}
+ 	}
+ 
+ 	public PluginData makePluginData() {
+ 		PluginData data = new PluginData();
+ 		PluginData[] parBaseDatas = new PluginData[inventoryItemStacks.size()];
+ 		for (int i = 0; i < inventoryItemStacks.size(); i++) {
+ 			if (inventoryItemStacks.get(i) != null) {
+ 				parBaseDatas[i] = inventoryItemStacks.get(i).makePluginData();
+ 			}
+ 		}
+ 		data.set("inventoryItemStacks", parBaseDatas);
+ 		data.setCallbackVoid("reload", () -> {
+ 			loadPluginData(data);
+ 		});
+ 		data.setCallbackObject("getRef", () -> {
+ 			return this;
+ 		});
+ 		data.setCallbackObjectArr("getPlayerList", () -> {
+ 			PluginData[] parPlayerList = new PluginData[playerList.size()];
+ 			int i = 0;
+ 			for (EntityPlayer player : playerList) {
+ 				if (player != null) {
+ 					parPlayerList[i] = player.makePluginData();
+ 				}
+ 				i++;
+ 			}
+ 			return parPlayerList;
+ 		});
+ 		return data;
+ 	}
+ 

> CHANGE  12 : 13  @  12 : 13

~ 		this.inventoryItemStacks.add((ItemStack) null);

> EOF
