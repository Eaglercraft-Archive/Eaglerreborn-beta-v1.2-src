
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  2  @  2 : 7

> CHANGE  1 : 4  @  1 : 4

~ import java.io.ByteArrayOutputStream;
~ import java.io.InputStreamReader;
~ import java.io.OutputStreamWriter;

> DELETE  1  @  1 : 3

> INSERT  3 : 21  @  3

+ 
+ import org.json.JSONArray;
+ 
+ import com.google.common.collect.ImmutableSet;
+ import com.google.common.collect.Lists;
+ import com.google.common.collect.Maps;
+ import com.google.common.collect.Sets;
+ 
+ import net.lax1dude.eaglercraft.v1_8.ArrayUtils;
+ import net.lax1dude.eaglercraft.v1_8.EagRuntime;
+ import net.lax1dude.eaglercraft.v1_8.EaglerInputStream;
+ import net.lax1dude.eaglercraft.v1_8.EaglerZLIB;
+ import net.lax1dude.eaglercraft.v1_8.HString;
+ import net.lax1dude.eaglercraft.v1_8.Keyboard;
+ import net.lax1dude.eaglercraft.v1_8.Mouse;
+ import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
+ import net.lax1dude.eaglercraft.v1_8.log4j.LogManager;
+ import net.lax1dude.eaglercraft.v1_8.log4j.Logger;

> DELETE  5  @  5 : 7

> CHANGE  5 : 7  @  5 : 11

~ import net.zxmushroom63.plugins.BaseData;
~ import net.zxmushroom63.plugins.PluginData;

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
~ public class GameSettings extends PluginData {

> DELETE  1  @  1 : 6

> CHANGE  1 : 4  @  1 : 9

~ 	/**
~ 	 * + GUI scale values
~ 	 */

> CHANGE  3 : 4  @  3 : 4

~ 			"options.particles.minimal", "options.particles.disabled" };

> CHANGE  19 : 28  @  19 : 22

~ 	/**
~ 	 * + Clouds flag
~ 	 */
~ 	public int clouds = 1;
~ 	public boolean fancyGraphics = false;
~ 	/**
~ 	 * + Smooth Lighting
~ 	 */
~ 	public int ambientOcclusion = 0;

> DELETE  8  @  8 : 9

> DELETE  1  @  1 : 2

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Whether to pause when the game loses focus, toggled by F3+P
+ 	 */

> CHANGE  32 : 33  @  32 : 33

~ 	public KeyBinding keyBindSprint = new KeyBinding("key.sprint", KeyboardConstants.KEY_R, "key.categories.movement");

> CHANGE  10 : 16  @  10 : 17

~ 	public KeyBinding keyBindSmoothCamera = new KeyBinding("key.smoothCamera", KeyboardConstants.KEY_M,
~ 			"key.categories.misc");
~ 	public KeyBinding keyBindZoomCamera = new KeyBinding("key.zoomCamera", KeyboardConstants.KEY_C,
~ 			"key.categories.misc");
~ 	public KeyBinding keyBindFunction = new KeyBinding("key.function", KeyboardConstants.KEY_F, "key.categories.misc");
~ 	public KeyBinding keyBindClose = new KeyBinding("key.close", KeyboardConstants.KEY_GRAVE, "key.categories.misc");

> DELETE  12  @  12 : 13

> CHANGE  12 : 16  @  12 : 13

~ 	/**
~ 	 * + GUI scale
~ 	 */
~ 	public int guiScale = 3;

> INSERT  3 : 12  @  3

+ 	public boolean hudFps = true;
+ 	public boolean hudCoords = true;
+ 	public boolean hudPlayer = false;
+ 	public boolean hudWorld = false;
+ 	public boolean hudStats = false;
+ 	public boolean hud24h = false;
+ 	public boolean chunkFix = true;
+ 	public boolean fog = true;
+ 	public int fxaa = 0;

> CHANGE  1 : 2  @  1 : 2

~ 	public GameSettings(Minecraft mcIn) {

> CHANGE  4 : 6  @  4 : 7

~ 				this.keyBindTogglePerspective, this.keyBindSmoothCamera, this.keyBindZoomCamera, this.keyBindFunction,
~ 				this.keyBindClose }, this.keyBindsHotbar);

> CHANGE  3 : 5  @  3 : 4

~ 		this.gammaSetting = 1.0F;
~ 		this.language = EagRuntime.getConfiguration().getDefaultLocale();

> CHANGE  2 : 3  @  2 : 8

~ 		GameSettings.Options.RENDER_DISTANCE.setValueMax(18.0F);

> CHANGE  1 : 2  @  1 : 2

~ 		this.renderDistanceChunks = 4;

> CHANGE  3 : 84  @  3 : 16

~ 	public void loadPluginData(BaseData data) {
~ 		mouseSensitivity = data.getFloat("mouseSensitivity");
~ 		invertMouse = data.getBoolean("invertMouse");
~ 		renderDistanceChunks = data.getInt("renderDistanceChunks");
~ 		viewBobbing = data.getBoolean("viewBobbing");
~ 		anaglyph = data.getBoolean("anaglyph");
~ 		fboEnable = data.getBoolean("fboEnable");
~ 		limitFramerate = data.getInt("limitFramerate");
~ 		clouds = data.getInt("clouds");
~ 
~ 		fancyGraphics = data.getBoolean("fancyGraphics");
~ 		ambientOcclusion = data.getInt("ambientOcclusion");
~ 		chatVisibility = EntityPlayer.EnumChatVisibility.valueOf(data.getString("chatVisibility"));
~ 		chatColours = data.getBoolean("chatColours");
~ 		chatLinks = data.getBoolean("chatLinks");
~ 		chatLinksPrompt = data.getBoolean("chatLinksPrompt");
~ 		chatOpacity = data.getFloat("chatOpacity");
~ 		enableVsync = data.getBoolean("enableVsync");
~ 		snooperEnabled = data.getBoolean("snooperEnabled");
~ 
~ 		allowBlockAlternatives = data.getBoolean("allowBlockAlternatives");
~ 		reducedDebugInfo = data.getBoolean("reducedDebugInfo");
~ 		hideServerAddress = data.getBoolean("hideServerAddress");
~ 		pauseOnLostFocus = data.getBoolean("pauseOnLostFocus");
~ 		touchscreen = data.getBoolean("touchscreen");
~ 		overrideWidth = data.getInt("overrideWidth");
~ 		overrideHeight = data.getInt("overrideHeight");
~ 		heldItemTooltips = data.getBoolean("heldItemTooltips");
~ 		chatScale = data.getFloat("chatScale");
~ 		chatWidth = data.getFloat("chatWidth");
~ 
~ 		chatHeightUnfocused = data.getFloat("chatHeightUnfocused");
~ 		chatHeightFocused = data.getFloat("chatHeightFocused");
~ 		streamBytesPerPixel = data.getFloat("streamBytesPerPixel");
~ 		streamMicVolume = data.getFloat("streamMicVolume");
~ 		streamGameVolume = data.getFloat("streamGameVolume");
~ 		streamKbps = data.getFloat("streamKbps");
~ 		streamFps = data.getFloat("streamFps");
~ 		fovSetting = data.getFloat("fovSetting");
~ 		gammaSetting = data.getFloat("gammaSetting");
~ 		saturation = data.getFloat("saturation");
~ 
~ 		streamChatEnabled = data.getInt("streamChatEnabled");
~ 		streamChatUserFilter = data.getInt("streamChatUserFilter");
~ 		streamMicToggleBehavior = data.getInt("streamMicToggleBehavior");
~ 		guiScale = data.getInt("guiScale");
~ 		fxaa = data.getInt("fxaa");
~ 		particleSetting = data.getInt("particleSetting");
~ 		streamCompression = data.getInt("streamCompression");
~ 		thirdPersonView = data.getInt("thirdPersonView");
~ 		mipmapLevels = data.getInt("mipmapLevels");
~ 
~ 		forceUnicodeFont = data.getBoolean("forceUnicodeFont");
~ 		hudFps = data.getBoolean("hudFps");
~ 		hudCoords = data.getBoolean("hudCoords");
~ 		hudPlayer = data.getBoolean("hudPlayer");
~ 		hudWorld = data.getBoolean("hudWorld");
~ 		hudStats = data.getBoolean("hudStats");
~ 		hud24h = data.getBoolean("hud24h");
~ 		chunkFix = data.getBoolean("chunkFix");
~ 		fog = data.getBoolean("fog");
~ 		streamSendMetadata = data.getBoolean("streamSendMetadata");
~ 		hideGUI = data.getBoolean("hideGUI");
~ 		smoothCamera = data.getBoolean("smoothCamera");
~ 		debugCamEnable = data.getBoolean("debugCamEnable");
~ 		showDebugInfo = data.getBoolean("showDebugInfo");
~ 		showDebugProfilerChart = data.getBoolean("showDebugProfilerChart");
~ 		showInventoryAchievementHint = data.getBoolean("showInventoryAchievementHint");
~ 
~ 		difficulty = EnumDifficulty.valueOf(data.getString("difficulty"));
~ 
~ 		lastServer = data.getString("lastServer");
~ 		language = data.getString("language");
~ 		streamPreferredServer = data.getString("streamPreferredServer");
~ 
~ 		BaseData[] parBaseDatas = data.getBaseDataArr("keyBindings");
~ 		for (int i = 0; i < keyBindings.length; i++) {
~ 			if (keyBindings[i] != null && parBaseDatas[i] != null) {
~ 				keyBindings[i].loadPluginData(parBaseDatas[i]);
~ 			}
~ 		}

> INSERT  2 : 103  @  2

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
+ 		PluginData[] parPluginDatas = new PluginData[keyBindings.length];
+ 		for (int i = 0; i < keyBindings.length; i++) {
+ 			if (keyBindings[i] != null) {
+ 				parPluginDatas[i] = keyBindings[i].makePluginData();
+ 			}
+ 		}
+ 
+ 		data.set("keyBindings", parPluginDatas);
+ 
+ 		data.set("mouseSensitivity", mouseSensitivity);
+ 		data.set("invertMouse", invertMouse);
+ 		data.set("renderDistanceChunks", renderDistanceChunks);
+ 		data.set("viewBobbing", viewBobbing);
+ 		data.set("anaglyph", anaglyph);
+ 		data.set("fboEnable", fboEnable);
+ 		data.set("limitFramerate", limitFramerate);
+ 		data.set("clouds", clouds);
+ 
+ 		data.set("fancyGraphics", fancyGraphics);
+ 		data.set("ambientOcclusion", ambientOcclusion);
+ 		data.set("chatVisibility", chatVisibility.name());
+ 		data.set("chatColours", chatColours);
+ 		data.set("chatLinks", chatLinks);
+ 		data.set("chatLinksPrompt", chatLinksPrompt);
+ 		data.set("chatOpacity", chatOpacity);
+ 		data.set("snooperEnabled", snooperEnabled);
+ 		data.set("enableVsync", enableVsync);
+ 
+ 		data.set("allowBlockAlternatives", allowBlockAlternatives);
+ 		data.set("reducedDebugInfo", reducedDebugInfo);
+ 		data.set("hideServerAddress", hideServerAddress);
+ 		data.set("advancedItemTooltips", advancedItemTooltips);
+ 		data.set("pauseOnLostFocus", pauseOnLostFocus);
+ 		data.set("touchscreen", touchscreen);
+ 		data.set("overrideWidth", overrideWidth);
+ 		data.set("overrideHeight", overrideHeight);
+ 		data.set("heldItemTooltips", heldItemTooltips);
+ 		data.set("chatScale", chatScale);
+ 		data.set("chatWidth", chatWidth);
+ 
+ 		data.set("chatHeightUnfocused", chatHeightUnfocused);
+ 		data.set("chatHeightFocused", chatHeightFocused);
+ 		data.set("streamBytesPerPixel", streamBytesPerPixel);
+ 		data.set("streamMicVolume", streamMicVolume);
+ 		data.set("streamGameVolume", streamGameVolume);
+ 		data.set("streamKbps", streamKbps);
+ 		data.set("streamFps", streamFps);
+ 		data.set("fovSetting", fovSetting);
+ 		data.set("gammaSetting", gammaSetting);
+ 		data.set("saturation", saturation);
+ 
+ 		data.set("streamChatEnabled", streamChatEnabled);
+ 		data.set("streamChatUserFilter", streamChatUserFilter);
+ 		data.set("streamMicToggleBehavior", streamMicToggleBehavior);
+ 		data.set("guiScale", guiScale);
+ 		data.set("fxaa", fxaa);
+ 		data.set("particleSetting", particleSetting);
+ 		data.set("streamCompression", streamCompression);
+ 		data.set("thirdPersonView", thirdPersonView);
+ 		data.set("mipmapLevels", mipmapLevels);
+ 
+ 		data.set("forceUnicodeFont", forceUnicodeFont);
+ 		data.set("hudFps", hudFps);
+ 		data.set("hudCoords", hudCoords);
+ 		data.set("hudPlayer", hudPlayer);
+ 		data.set("hudWorld", hudWorld);
+ 		data.set("hudStats", hudStats);
+ 		data.set("hud24h", hud24h);
+ 		data.set("chunkFix", chunkFix);
+ 		data.set("fog", fog);
+ 		data.set("streamSendMetadata", streamSendMetadata);
+ 		data.set("hideGUI", hideGUI);
+ 		data.set("smoothCamera", smoothCamera);
+ 		data.set("debugCamEnable", debugCamEnable);
+ 		data.set("showDebugInfo", showDebugInfo);
+ 		data.set("showDebugProfilerChart", showDebugProfilerChart);
+ 		data.set("showInventoryAchievementHint", showInventoryAchievementHint);
+ 
+ 		data.set("difficulty", difficulty.name());
+ 
+ 		data.set("lastServer", lastServer);
+ 		data.set("language", language);
+ 		data.set("streamPreferredServer", streamPreferredServer);
+ 
+ 		return data;
+ 	}
+ 
+ 	/**
+ 	 * + Represents a key or mouse button as a string. Args: key
+ 	 */

> CHANGE  3 : 4  @  3 : 4

~ 						: HString.format("%c", new Object[] { Character.valueOf((char) (parInt1 - 256)) })

> INSERT  3 : 6  @  3

+ 	/**
+ 	 * + Returns whether the specified key binding is currently being pressed.
+ 	 */

> INSERT  6 : 9  @  6

+ 	/**
+ 	 * + Sets a key binding and then saves all settings.
+ 	 */

> INSERT  5 : 9  @  5

+ 	/**
+ 	 * + If the specified option is controlled by a slider (float value), this will
+ 	 * set the float value.
+ 	 */

> DELETE  69  @  69 : 70

> DELETE  4  @  4 : 5

> INSERT  12 : 16  @  12

+ 	/**
+ 	 * + For non-float options. Toggles the option on/off, or cycles through the
+ 	 * list i.e. render distances.
+ 	 */

> CHANGE  10 : 11  @  10 : 11

~ 			this.particleSetting = (this.particleSetting + parInt1) % 4;

> INSERT  22 : 24  @  22

+ 			this.mc.loadingScreen.eaglerShow(I18n.format("resourcePack.load.refreshing"),
+ 					I18n.format("resourcePack.load.pleaseWait"));

> DELETE  58  @  58 : 75

> INSERT  13 : 53  @  13

+ 		if (parOptions == GameSettings.Options.HUD_FPS) {
+ 			this.hudFps = !this.hudFps;
+ 		}
+ 
+ 		if (parOptions == GameSettings.Options.HUD_COORDS) {
+ 			this.hudCoords = !this.hudCoords;
+ 		}
+ 
+ 		if (parOptions == GameSettings.Options.HUD_PLAYER) {
+ 			this.hudPlayer = !this.hudPlayer;
+ 		}
+ 
+ 		if (parOptions == GameSettings.Options.HUD_STATS) {
+ 			this.hudStats = !this.hudStats;
+ 		}
+ 
+ 		if (parOptions == GameSettings.Options.HUD_WORLD) {
+ 			this.hudWorld = !this.hudWorld;
+ 		}
+ 
+ 		if (parOptions == GameSettings.Options.HUD_24H) {
+ 			this.hud24h = !this.hud24h;
+ 		}
+ 
+ 		if (parOptions == GameSettings.Options.CHUNK_FIX) {
+ 			this.chunkFix = !this.chunkFix;
+ 		}
+ 
+ 		if (parOptions == GameSettings.Options.FOG) {
+ 			this.fog = !this.fog;
+ 		}
+ 
+ 		if (parOptions == GameSettings.Options.FXAA) {
+ 			this.fxaa = (this.fxaa + parInt1) % 3;
+ 		}
+ 
+ 		if (parOptions == GameSettings.Options.FULLSCREEN) {
+ 			this.mc.toggleFullscreen();
+ 		}
+ 

> DELETE  54  @  54 : 60

> INSERT  12 : 30  @  12

+ 		case HUD_COORDS:
+ 			return this.hudCoords;
+ 		case HUD_FPS:
+ 			return this.hudFps;
+ 		case HUD_PLAYER:
+ 			return this.hudPlayer;
+ 		case HUD_STATS:
+ 			return this.hudStats;
+ 		case HUD_WORLD:
+ 			return this.hudWorld;
+ 		case HUD_24H:
+ 			return this.hud24h;
+ 		case CHUNK_FIX:
+ 			return this.chunkFix;
+ 		case FOG:
+ 			return this.fog;
+ 		case FULLSCREEN:
+ 			return this.mc.isFullScreen();

> INSERT  5 : 10  @  5

+ 	/**
+ 	 * + Returns the translation of the given index in the given String array. If
+ 	 * the index is smaller than 0 or greater than/equal to the length of the String
+ 	 * array, it is changed to 0.
+ 	 */

> INSERT  8 : 11  @  8

+ 	/**
+ 	 * + Gets a key binding.
+ 	 */

> CHANGE  30 : 33  @  30 : 34

~ 																	: (parOptions == GameSettings.Options.CHAT_SCALE
~ 																			? s + (int) (f * 90.0F + 10.0F) + "%"
~ 																			: (parOptions == GameSettings.Options.CHAT_HEIGHT_UNFOCUSED

> CHANGE  3 : 4  @  3 : 4

~ 																					: (parOptions == GameSettings.Options.CHAT_HEIGHT_FOCUSED

> CHANGE  1 : 2  @  1 : 2

~ 																									.calculateChatboxHeight(

> CHANGE  2 : 21  @  2 : 36

~ 																							: (parOptions == GameSettings.Options.CHAT_WIDTH
~ 																									? s + GuiNewChat
~ 																											.calculateChatboxWidth(
~ 																													f)
~ 																											+ "px"
~ 																									: (parOptions == GameSettings.Options.RENDER_DISTANCE
~ 																											? s + (int) f1
~ 																													+ (f1 == 1.0F
~ 																															? " chunk"
~ 																															: " chunks")
~ 																											: (parOptions == GameSettings.Options.MIPMAP_LEVELS
~ 																													? (f == 0.0F
~ 																															? s + I18n
~ 																																	.format("options.off",
~ 																																			new Object[0])
~ 																															: s + (int) (f
~ 																																	* 100.0F)
~ 																																	+ "%")
~ 																													: "yee"))))))))))));

> INSERT  28 : 36  @  28

+ 		} else if (parOptions == GameSettings.Options.FXAA) {
+ 			if (this.fxaa == 0) {
+ 				return s + I18n.format("options.fxaa.auto");
+ 			} else if (this.fxaa == 1) {
+ 				return s + I18n.format("options.on");
+ 			} else {
+ 				return s + I18n.format("options.off");
+ 			}

> INSERT  5 : 9  @  5

+ 	/**
+ 	 * + Loads the options from the options file. It appears that this has replaced
+ 	 * the previous 'loadOptions'
+ 	 */

> CHANGE  2 : 4  @  2 : 3

~ 			byte[] options = EagRuntime.getStorage("g");
~ 			if (options == null) {

> CHANGE  3 : 5  @  3 : 4

~ 			BufferedReader bufferedreader = new BufferedReader(
~ 					new InputStreamReader(EaglerZLIB.newGZIPInputStream(new EaglerInputStream(options))));

> CHANGE  83 : 89  @  83 : 84

~ 						this.resourcePacks.clear();
~ 						for (Object o : (new JSONArray(s.substring(s.indexOf(58) + 1))).toList()) {
~ 							if (o instanceof String) {
~ 								this.resourcePacks.add((String) o);
~ 							}
~ 						}

> CHANGE  6 : 12  @  6 : 7

~ 						this.field_183018_l.clear();
~ 						for (Object o : (new JSONArray(s.substring(s.indexOf(58) + 1))).toList()) {
~ 							if (o instanceof String) {
~ 								this.field_183018_l.add((String) o);
~ 							}
~ 						}

> DELETE  38  @  38 : 42

> DELETE  4  @  4 : 8

> INSERT  116 : 153  @  116

+ 					if (astring[0].equals("hudFps")) {
+ 						this.hudFps = astring[1].equals("true");
+ 					}
+ 
+ 					if (astring[0].equals("hudWorld")) {
+ 						this.hudWorld = astring[1].equals("true");
+ 					}
+ 
+ 					if (astring[0].equals("hudCoords")) {
+ 						this.hudCoords = astring[1].equals("true");
+ 					}
+ 
+ 					if (astring[0].equals("hudPlayer")) {
+ 						this.hudPlayer = astring[1].equals("true");
+ 					}
+ 
+ 					if (astring[0].equals("hudStats")) {
+ 						this.hudStats = astring[1].equals("true");
+ 					}
+ 
+ 					if (astring[0].equals("hud24h")) {
+ 						this.hud24h = astring[1].equals("true");
+ 					}
+ 
+ 					if (astring[0].equals("chunkFix")) {
+ 						this.chunkFix = astring[1].equals("true");
+ 					}
+ 
+ 					if (astring[0].equals("fog")) {
+ 						this.fog = astring[1].equals("true");
+ 					}
+ 
+ 					if (astring[0].equals("fxaa")) {
+ 						this.fxaa = (astring[1].equals("true") || astring[1].equals("false")) ? 0
+ 								: Integer.parseInt(astring[1]);
+ 					}
+ 

> INSERT  6 : 8  @  6

+ 					Keyboard.setFunctionKeyModifier(keyBindFunction.getKeyCode());
+ 

> DELETE  17  @  17 : 18

> INSERT  6 : 9  @  6

+ 	/**
+ 	 * + Parses a string into a float.
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Saves the options to the options file.
+ 	 */

> CHANGE  2 : 4  @  2 : 3

~ 			ByteArrayOutputStream bao = new ByteArrayOutputStream();
~ 			PrintWriter printwriter = new PrintWriter(new OutputStreamWriter(EaglerZLIB.newGZIPOutputStream(bao)));

> CHANGE  26 : 28  @  26 : 28

~ 			printwriter.println("resourcePacks:" + toJSONArray(this.resourcePacks));
~ 			printwriter.println("incompatibleResourcePacks:" + toJSONArray(this.field_183018_l));

> DELETE  8  @  8 : 9

> DELETE  1  @  1 : 2

> INSERT  29 : 38  @  29

+ 			printwriter.println("hudFps:" + this.hudFps);
+ 			printwriter.println("hudWorld:" + this.hudWorld);
+ 			printwriter.println("hudCoords:" + this.hudCoords);
+ 			printwriter.println("hudPlayer:" + this.hudPlayer);
+ 			printwriter.println("hudStats:" + this.hudStats);
+ 			printwriter.println("hud24h:" + this.hud24h);
+ 			printwriter.println("chunkFix:" + this.chunkFix);
+ 			printwriter.println("fog:" + this.fog);
+ 			printwriter.println("fxaa:" + this.fxaa);

> INSERT  5 : 7  @  5

+ 			Keyboard.setFunctionKeyModifier(keyBindFunction.getKeyCode());
+ 

> INSERT  11 : 13  @  11

+ 
+ 			EagRuntime.setStorage("g", bao.toByteArray());

> CHANGE  10 : 11  @  10 : 11

~ 				: (parSoundCategory == SoundCategory.VOICE ? 0.0F : 1.0F);

> INSERT  7 : 10  @  7

+ 	/**
+ 	 * + Send a client info packet with settings information to the server
+ 	 */

> INSERT  46 : 54  @  46

+ 	private String toJSONArray(List<String> e) {
+ 		JSONArray arr = new JSONArray();
+ 		for (String s : e) {
+ 			arr.put(s);
+ 		}
+ 		return arr.toString();
+ 	}
+ 

> CHANGE  4 : 5  @  4 : 5

~ 		RENDER_DISTANCE("options.renderDistance", true, false, 1.0F, 16.0F, 1.0F),

> CHANGE  8 : 10  @  8 : 12

~ 		TOUCHSCREEN("options.touchscreen", false, true), CHAT_SCALE("options.chat.scale", true, false),
~ 		CHAT_WIDTH("options.chat.width", true, false), CHAT_HEIGHT_FOCUSED("options.chat.height.focused", true, false),

> CHANGE  14 : 20  @  14 : 15

~ 		ENTITY_SHADOWS("options.entityShadows", false, true), HUD_FPS("options.hud.fps", false, true),
~ 		HUD_COORDS("options.hud.coords", false, true), HUD_STATS("options.hud.stats", false, true),
~ 		HUD_WORLD("options.hud.world", false, true), HUD_PLAYER("options.hud.player", false, true),
~ 		HUD_24H("options.hud.24h", false, true), CHUNK_FIX("options.chunkFix", false, true),
~ 		FOG("options.fog", false, true), FXAA("options.fxaa", false, false),
~ 		FULLSCREEN("options.fullscreen", false, true);

> EOF
