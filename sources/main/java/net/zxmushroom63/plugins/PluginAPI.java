package net.zxmushroom63.plugins;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;

import net.lax1dude.eaglercraft.v1_8.log4j.LogManager;
import net.lax1dude.eaglercraft.v1_8.log4j.Logger;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.util.ChatComponentText;
import net.minecraft.block.material.Material;
import net.minecraft.client.ClientBrandRetriever;

import net.minecraft.client.resources.I18n;

import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PluginAPI {
    private Minecraft mc;
    public ArrayList<String> requiredList;
    public static final Logger logger = LogManager.getLogger();
    public static boolean clientPacketSendEventsEnabled = true;
    public static String version = "a5.3";

    @JSBody(params = { "version" }, script = "var PluginAPI = {};\r\n" + //
            "PluginAPI.events = {};\r\n" + //
            "PluginAPI.events.types = [\"event\"];\r\n" + //
            "PluginAPI.events.listeners = {\"event\": []};\r\n" + //
            "PluginAPI.globals = {};\r\n" + //
            "PluginAPI.version = version;\r\n" + //
            "PluginAPI.addEventListener = function addEventListener(name, callback) {\r\n" + //
            "  if (!callback) {\r\n" + //
            "    throw new Error(\"Invalid callback!\");\r\n" + //
            "  }\r\n" + //
            "  if (PluginAPI.events.types.includes(name)) {\r\n" + //
            "    if (!Array.isArray(PluginAPI.events.listeners[name])) {\r\n" + //
            "      PluginAPI.events.listeners[name] = [];\r\n" + //
            "    }\r\n" + //
            "    PluginAPI.events.listeners[name].push(callback);\r\n" + //
            "    console.log(\"Added new event listener.\");\r\n" + //
            "  } else {\r\n" + //
            "    throw new Error(\"This event does not exist!\");\r\n" + //
            "  }\r\n" + //
            "};\r\n" + //
            "PluginAPI.removeEventListener = function removeEventListener(name, func, slow) {\r\n" + //
            "  if (!func) {\r\n" + //
            "    throw new Error(\"Invalid callback!\");\r\n" + //
            "  }\r\n" + //
            "  if (!Array.isArray(PluginAPI.events.listeners[name])) {\r\n" + //
            "    PluginAPI.events.listeners[name] = [];\r\n" + //
            "  }\r\n" + //
            "  var targetArr = PluginAPI.events.listeners[name];\r\n" + //
            "  if (!slow) {\r\n" + //
            "    if (targetArr.indexOf(func) !== -1) {\r\n" + //
            "      targetArr.splice(targetArr.indexOf(func), 1);\r\n" + //
            "      console.log(\"Removed event listener.\");\r\n" + //
            "    }\r\n" + //
            "  } else {\r\n" + //
            "    var functionString = func.toString();\r\n" + //
            "    targetArr.forEach((f, i) => {\r\n" + //
            "      if (f.toString() === functionString) {\r\n" + //
            "        targetArr.splice(i, 1);\r\n" + //
            "        console.log(\"Removed event listener.\");\r\n" + //
            "      }\r\n" + //
            "    });\r\n" + //
            "  }\r\n" + //
            "};\r\n" + //
            "PluginAPI.events.newEvent = function newEvent(name) {\r\n" + //
            "  PluginAPI.events.types.push(name);\r\n" + //
            "};\r\n" + //
            "PluginAPI.events.callEvent = function callEvent(name, data) {\r\n" + //
            "  if (\r\n" + //
            "    !PluginAPI.events.types.includes(name) ||\r\n" + //
            "    !Array.isArray(PluginAPI.events.listeners[name])\r\n" + //
            "  ) {\r\n" + //
            "    if (!Array.isArray(PluginAPI.events.listeners[name])) {\r\n" + //
            "      if (PluginAPI.events.types.includes(name)) {\r\n" + //
            "        PluginAPI.events.listeners.event.forEach((func) => {\r\n" + //
            "          func({event: name, data: data});\r\n" + //
            "        });\r\n" + //
            "        return;\r\n" + //
            "      }\r\n" + //
            "      return;\r\n" + //
            "    }\r\n" + //
            "    console.error(\"The PluginAPI has been called with an invalid event name: \"+name);\r\n" + //
            "    console.error(\"Please report this bug to the repo.\");\r\n" + //
            "    return;\r\n" + //
            "  }\r\n" + //
            "  PluginAPI.events.listeners[name].forEach((func) => {\r\n" + //
            "    func(data);\r\n" + //
            "  });\r\n" + //
            "  PluginAPI.events.listeners.event.forEach((func) => {\r\n" + //
            "    func({event: name, data: data});\r\n" + //
            "  });\r\n" + //
            "\r\n" + //
            "  PluginAPI.globals._initUpdate();\r\n" + //
            "};\r\n" + //
            "PluginAPI.updateComponent = function updateComponent(component) {\r\n" + //
            "  if (\r\n" + //
            "    typeof component !== \"string\" ||\r\n" + //
            "    PluginAPI[component] === null ||\r\n" + //
            "    PluginAPI[component] === undefined\r\n" + //
            "  ) {\r\n" + //
            "    return;\r\n" + //
            "  }\r\n" + //
            "  if (!PluginAPI.globals || !PluginAPI.globals.onGlobalsUpdate) {\r\n" + //
            "    return;\r\n" + //
            "  }\r\n" + //
            "  if (!PluginAPI.globals.toUpdate) {\r\n" + //
            "    PluginAPI.globals.toUpdate = [];\r\n" + //
            "  }\r\n" + //
            "  if (PluginAPI.globals.toUpdate.indexOf(component) === -1) {\r\n" + //
            "    PluginAPI.globals.toUpdate.push(component);\r\n" + //
            "  }\r\n" + //
            "};\r\n" + //
            "PluginAPI.require = function require(component) {\r\n" + //
            "  if (typeof component !== \"string\") {\r\n" + //
            "    return;\r\n" + //
            "  }\r\n" + //
            "  if (!PluginAPI.globals || !PluginAPI.globals.onRequire) {\r\n" + //
            "    return;\r\n" + //
            "  }\r\n" + //
            "  PluginAPI.globals.onRequire(component);\r\n" + //
            "};\r\n" + //
            "PluginAPI.globals._initUpdate = function _initUpdate() {\r\n" + //
            "  if (!PluginAPI.globals.toUpdate) {\r\n" + //
            "    PluginAPI.globals.toUpdate = [];\r\n" + //
            "  }\r\n" + //
            "  PluginAPI.globals.toUpdate.forEach((id) => {\r\n" + //
            "    PluginAPI.globals.onGlobalsUpdate(id);\r\n" + //
            "  });\r\n" + //
            "  PluginAPI.globals.toUpdate = [];\r\n" + //
            "};\r\n" + //
            "window.PluginAPI = PluginAPI;\r\n" + //
            "")
    private static native void init(String version);

    @JSBody(params = { "name" }, script = "PluginAPI.events.newEvent(name);")
    private static native void newEvent(String name);

    @JSBody(params = { "name", "data" }, script = "PluginAPI.events.callEvent(name, data); return data;")
    public static native BaseData callEvent(String name, BaseData data);

    @JSBody(params = { "name", "data" }, script = "PluginAPI[name]=data;")
    public static native void setGlobal(String name, BaseData data);

    @JSBody(params = { "name" }, script = "return PluginAPI[name] || {};")
    public static native BaseData getGlobal(String name);

    @JSBody(params = {}, script = "return PluginAPI;")
    public static native BaseData getPluginAPI();

    @JSBody(params = { "data" }, script = "console.log(data);")
    public static native void logJSObj(JSObject data);

    public void onGlobalUpdated(String global) {
        // logger.info("Global update request: "+global);
        BaseData data = getGlobal(global);
        // logJSObj(data);
        if (data == null) {
            return;
        }
        switch (global) {
            case "player":
                mc.thePlayer.loadPluginData(data);
        }
    }

    public void onRequire(String global) {
        if (!requiredList.contains(global)) {
            logger.info("Required global: " + global);
            requiredList.add(global);
        }
    }

    public PluginAPI(Minecraft mcIn) {
        this.mc = mcIn;
        requiredList = new ArrayList<String>();

        init(version);

        newEvent("load");
        newEvent("gui");

        newEvent("sendchatmessage");
        newEvent("key");
        newEvent("update");
        newEvent("postmotionupdate");
        newEvent("motionupdate");
        newEvent("premotionupdate");

        newEvent("packetjoingame");
        newEvent("packetspawnobject");
        newEvent("packetspawnxporb");
        newEvent("packetspawnglobalentity");
        newEvent("packetspawnpainting");
        newEvent("packetentityvelocity");
        newEvent("packetentitymetadata");
        newEvent("packetspawnplayer");
        newEvent("packetentityteleport");
        newEvent("packethelditemchange");
        newEvent("packetentity");
        newEvent("packetentityheadlook");
        newEvent("packetdestroyentities");
        newEvent("packetplayerposlook");
        newEvent("packetmultiblockchange");
        newEvent("packetchunkdata");
        newEvent("packetblockchange");
        newEvent("packetdisconnect");
        newEvent("packetcollectitem");
        newEvent("packetchat");
        newEvent("packetanimation");
        newEvent("packetusebed");
        newEvent("packetspawnmob");
        newEvent("packettimeupdate");
        newEvent("packetspawnposition");
        newEvent("packetentityattatch");
        newEvent("packetentitystatus");
        newEvent("packetupdatehealth");
        newEvent("packetsetxp");
        newEvent("packetrespawn");
        newEvent("packetexplosion");
        newEvent("packetopenwindow");
        newEvent("packetsetslot");
        newEvent("packetconfirmtransaction");
        newEvent("packetwindowitems");
        newEvent("packetsigneditoropen");
        newEvent("packetupdatesign");
        newEvent("packetupdatetileentity");
        newEvent("packetwindowproperty");
        newEvent("packetentityequipment");
        newEvent("packetclosewindow");
        newEvent("packetblockaction");
        newEvent("packetblockbreakanim");
        newEvent("packetmapchunkbulk");
        newEvent("packetchangegamestate");
        newEvent("packetmaps");
        newEvent("packeteffect");
        newEvent("packetstatistics");
        newEvent("packetentityeffect");
        newEvent("packetcombatevent");
        newEvent("packetserverdifficulty");
        newEvent("packetcamera");
        newEvent("packetworldborder");
        newEvent("packettitle");
        newEvent("packetsetcompressionlevel");
        newEvent("packetplayerlistheaderfooter");
        newEvent("packetremoveentityeffect");
        newEvent("packetplayerlistitem");
        newEvent("packetkeepalive");
        newEvent("packetplayerabilities");
        newEvent("packettabcomplete");
        newEvent("packetsoundeffect");
        newEvent("packetresourcepack");
        newEvent("packetupdateentitynbt");
        newEvent("packetcustompayload");
        newEvent("packetscoreboardobjective");
        newEvent("packetupdatescore");
        newEvent("packetdisplayscoreboard");
        newEvent("packetteams");
        newEvent("packetparticles");
        newEvent("packetentityproperties");

        newEvent("sendpacketanimation");
        newEvent("sendpacketentityaction");
        newEvent("sendpacketinput");
        newEvent("sendpacketclosewindow");
        newEvent("sendpacketclickwindow");
        newEvent("sendpacketconfirmtransaction");
        newEvent("sendpacketkeepalive");
        newEvent("sendpacketchatmessage");
        newEvent("sendpacketuseentity");
        newEvent("sendpacketplayer");
        newEvent("sendpacketplayerposition");
        newEvent("sendpacketplayerlook");
        newEvent("sendpacketplayerposlook");
        newEvent("sendpacketplayerdigging");
        newEvent("sendpacketplayerblockplacement");
        newEvent("sendpackethelditemchange");
        newEvent("sendpacketcreativeinventoryaction");
        newEvent("sendpacketenchantitem");
        newEvent("sendpacketupdatesign");
        newEvent("sendpacketplayerabilities");
        newEvent("sendpackettabcomplete");
        newEvent("sendpacketclientsettings");
        newEvent("sendpacketclientstatus");
        newEvent("sendpacketcustompayload");
        newEvent("sendpacketspectate");
        newEvent("sendpacketresourcepackstatus");

        globalsFunctor(this);
        globalsRequireFunctor(this);
        globalsUpdateFunctor(this);

        getPluginAPI().setCallbackVoidWithDataArg("displayToChat", (BaseData params) -> {
            mc.ingameGUI.getChatGUI().printChatMessage(new ChatComponentText(params.getString("msg")));
        });
        getPluginAPI().setCallbackVoid("clickMouse", () -> {
            mc.clickMouse();
        });
        getPluginAPI().setCallbackVoid("rightClickMouse", () -> {
            mc.rightClickMouse();
        });
        getPluginAPI().set("clientBrand", ClientBrandRetriever.getClientModName());

        setGlobal("enchantments", Enchantment.makePluginDataStatic());
        setGlobal("blocks", Blocks.makePluginData());
        setGlobal("items", Items.makePluginData());
        setGlobal("materials", Material.makePluginDataStatic());
        setGlobal("constructors", PluginConstructors.makeContructorsPluginData());
        setGlobal("javaClient", mc);
        PluginGUI.loadFont();
    }

    static void globalsFunctor(PluginAPI pluginAPI) {
        GlobalsListener.provideCallback((String name) -> {
            pluginAPI.onGlobalUpdated(name);
        });
    }

    static void globalsRequireFunctor(PluginAPI pluginAPI) {
        GlobalsListener.provideRequireCallback((String name) -> {
            pluginAPI.onRequire(name);
        });
    }

    static void globalsUpdateFunctor(PluginAPI pluginAPI) {
        GlobalsListener.provideUpdateCallback(() -> {
            pluginAPI.onUpdate();
        });
    }

    public void onUpdate() {
        if (requiredList.contains("player") && mc.thePlayer != null) {
            PluginAPI.setGlobal("player", mc.thePlayer.makePluginData());
        }
        if (requiredList.contains("network") && mc.thePlayer != null && mc.thePlayer.sendQueue != null) {
            PluginAPI.setGlobal("network", mc.thePlayer.sendQueue.makePluginData());
        }
        if (requiredList.contains("settings") && mc.gameSettings != null) {
            PluginAPI.setGlobal("settings", mc.gameSettings.makePluginData());
        }
        PluginAPI.callEvent("update", new PluginData());
    }
}
