
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> INSERT  4 : 7  @  4

+ 
+ import net.lax1dude.eaglercraft.v1_8.opengl.GlStateManager;
+ import net.lax1dude.eaglercraft.v1_8.opengl.WorldRenderer;

> DELETE  3  @  3 : 7

> CHANGE  61 : 62  @  61 : 62

~ 		if (list1.size() > 0 && (!blockIn.noRender)) {

> INSERT  13 : 14  @  13

+ 		BlockPos.MutableBlockPos pointer = new BlockPos.MutableBlockPos();

> CHANGE  3 : 4  @  3 : 4

~ 				BlockPos blockpos = blockPosIn.offsetEvenFaster(enumfacing, pointer);

> CHANGE  10 : 11  @  10 : 11

~ 		if (list1.size() > 0 && (!blockIn.noRender)) {

> EOF
