
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> INSERT  2 : 4  @  2

+ import net.lax1dude.eaglercraft.v1_8.minecraft.IAcceleratedParticleEngine;
+ import net.lax1dude.eaglercraft.v1_8.opengl.WorldRenderer;

> DELETE  1  @  1 : 4

> INSERT  4 : 5  @  4

+ import net.minecraft.util.MathHelper;

> INSERT  2 : 21  @  2

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

> INSERT  1 : 2  @  1

+ 

> INSERT  28 : 31  @  28

+ 	/**
+ 	 * + Renders the particle
+ 	 */

> INSERT  42 : 55  @  42

+ 	public boolean renderAccelerated(IAcceleratedParticleEngine accelerator, Entity var2, float f, float f1, float f2,
+ 			float f3, float f4, float f5) {
+ 		int w = this.particleIcon.getIconWidth();
+ 		int h = this.particleIcon.getIconHeight();
+ 		int xOffset = MathHelper.floor_float(w * this.particleTextureJitterX * 4.0f * 0.0625f);
+ 		int yOffset = MathHelper.floor_float(h * this.particleTextureJitterY * 4.0f * 0.0625f);
+ 		int texSize = Math.min(w, h) / 4;
+ 		accelerator.drawParticle(this, this.particleIcon.getOriginX() + xOffset,
+ 				this.particleIcon.getOriginY() + yOffset, getBrightnessForRender(f), texSize, particleScale * 0.1f,
+ 				this.particleRed, this.particleGreen, this.particleBlue, 1.0f);
+ 		return true;
+ 	}
+ 

> EOF
