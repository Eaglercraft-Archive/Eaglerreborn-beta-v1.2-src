
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  2  @  2 : 3

> INSERT  1 : 4  @  1

+ 
+ import com.google.common.collect.AbstractIterator;
+ 

> CHANGE  1 : 4  @  1 : 5

~ import net.zxmushroom63.plugins.BaseData;
~ import net.zxmushroom63.plugins.PluginData;
~ import net.minecraft.client.Minecraft;

> INSERT  32 : 78  @  32

+ 	@Override
+ 	public void loadPluginData(BaseData data) {
+ 		super.loadPluginData(data);
+ 	}
+ 
+ 	public static BlockPos fromPluginData(BaseData data) {
+ 		return new BlockPos(Vec3i.fromPluginData(data));
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
+ 		data.setCallbackObjectWithDataArg("add", (BaseData params) -> {
+ 			return add(params.getInt("x"), params.getInt("y"), params.getInt("z")).makePluginData();
+ 		});
+ 		data.setCallbackObjectWithDataArg("up", (BaseData params) -> {
+ 			return up(params.getInt("n")).makePluginData();
+ 		});
+ 		data.setCallbackObjectWithDataArg("down", (BaseData params) -> {
+ 			return down(params.getInt("n")).makePluginData();
+ 		});
+ 		data.setCallbackObjectWithDataArg("north", (BaseData params) -> {
+ 			return north(params.getInt("n")).makePluginData();
+ 		});
+ 		data.setCallbackObjectWithDataArg("south", (BaseData params) -> {
+ 			return south(params.getInt("n")).makePluginData();
+ 		});
+ 		data.setCallbackObjectWithDataArg("east", (BaseData params) -> {
+ 			return east(params.getInt("n")).makePluginData();
+ 		});
+ 		data.setCallbackObjectWithDataArg("west", (BaseData params) -> {
+ 			return west(params.getInt("n")).makePluginData();
+ 		});
+ 		data.setCallbackObject("getBlock", () -> {
+ 			loadPluginData(data);
+ 			return Minecraft.getMinecraft().theWorld.getBlock(this).makePluginData();
+ 		});
+ 		return data;
+ 	}
+ 

> INSERT  71 : 88  @  71

+ 	public BlockPos offsetFaster(EnumFacing facing, MutableBlockPos ret) {
+ 		ret.x = this.getX() + facing.getFrontOffsetX();
+ 		ret.y = this.getY() + facing.getFrontOffsetY();
+ 		ret.z = this.getZ() + facing.getFrontOffsetZ();
+ 		return ret;
+ 	}
+ 
+ 	/**
+ 	 * only use with a regular "net.minecraft.util.BlockPos"!
+ 	 */
+ 	public BlockPos offsetEvenFaster(EnumFacing facing, MutableBlockPos ret) {
+ 		ret.x = this.x + facing.getFrontOffsetX();
+ 		ret.y = this.y + facing.getFrontOffsetY();
+ 		ret.z = this.z + facing.getFrontOffsetZ();
+ 		return ret;
+ 	}
+ 

> DELETE  108  @  108 : 111

> CHANGE  6 : 7  @  6 : 10

~ 			super(x_, y_, z_);

> EOF
