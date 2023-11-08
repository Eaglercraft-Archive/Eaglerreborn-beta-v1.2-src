
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  2  @  2 : 6

> CHANGE  2 : 8  @  2 : 3

~ 
~ import com.google.common.base.Objects;
~ import com.google.common.collect.Lists;
~ 
~ import net.lax1dude.eaglercraft.v1_8.mojang.authlib.GameProfile;
~ import net.lax1dude.eaglercraft.v1_8.mojang.authlib.Property;

> INSERT  5 : 7  @  5

+ import net.zxmushroom63.plugins.BaseData;
+ import net.zxmushroom63.plugins.PluginData;

> CHANGE  2 : 4  @  2 : 4

~ 	public S38PacketPlayerListItem.Action action;
~ 	public final List<S38PacketPlayerListItem.AddPlayerData> players = Lists.newArrayList();

> DELETE  4  @  4 : 26

> CHANGE  58 : 59  @  58 : 111

~ 		// server only

> CHANGE  22 : 25  @  22 : 25

~ 	public class AddPlayerData extends PluginData {
~ 		public final int ping;
~ 		public final WorldSettings.GameType gamemode;

> CHANGE  1 : 2  @  1 : 2

~ 		public final IChatComponent displayName;

> INSERT  13 : 39  @  13

+ 		public void loadPluginData(BaseData data) {
+ 			// Yep, all the fields are 'final', so i can be lazy here.
+ 		}
+ 
+ 		public PluginData makePluginData() {
+ 			PluginData data = new PluginData();
+ 			data.setCallbackVoid("reload", () -> {
+ 				loadPluginData(data);
+ 			});
+ 			data.set("ping", ping);
+ 			if (gamemode != null) {
+ 				data.set("gamemode", gamemode.name());
+ 			}
+ 			if (displayName != null) {
+ 				data.set("displayNameFormatted", displayName.getFormattedText());
+ 				data.set("displayName", displayName.getUnformattedText());
+ 			}
+ 			if (profile != null && profile.name != null) {
+ 				data.set("profileName", profile.name);
+ 			}
+ 			data.setCallbackObject("getRef", () -> {
+ 				return this;
+ 			});
+ 			return data;
+ 		}
+ 

> EOF
