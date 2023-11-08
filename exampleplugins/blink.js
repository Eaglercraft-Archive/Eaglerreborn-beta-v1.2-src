PluginAPI.require("network");
PluginAPI.require("player");
var packetsOnTodoList = [];
var blinking = false;
PluginAPI.addEventListener("event", (ev) => {
  if (
    blinking &&
    ev.event.startsWith("sendpacket") &&
    ev.event !== "sendpacketkeepalive"
  ) {
    ev.data.preventDefault = true;
    packetsOnTodoList.push(ev);
  }
});
function blinkOn() {
  if (blinking === true) {
    return;
  }
  blinking = true;
  PluginAPI.displayToChat({ msg: "Blink activated." });
}
function blinkOff() {
  if (blinking === false) {
    return;
  }
  blinking = false;
  PluginAPI.displayToChat({ msg: "Blink deactivated." });
  packetsOnTodoList.forEach((ev) => {
    var data = ev.data;
    switch (ev.event) {
      case "sendpacketanimation":
        PluginAPI.network.sendPacketAnimation();
        break;
      case "sendpacketentityaction":
        PluginAPI.network.sendPacketEntityAction({
          entityId: data.entityID,
          action: data.action,
          auxData: data.auxData,
        });
        break;
      case "sendpacketinput":
        PluginAPI.network.sendPacketInput({
          strafeSpeed: data.strafeSpeed,
          forwardSpeed: data.forwardSpeed,
          jumping: data.jumping,
          sneaking: data.sneaking,
        });
        break;
      case "sendpacketclosewindow":
        PluginAPI.network.sendPacketCloseWindow({ windowId: data.windowId });
        break;
      case "sendpacketclickwindow":
        PluginAPI.network.sendPacketClickWindow({
          windowId: data.windowId,
          slotId: data.slotId,
          usedButton: data.usedButton,
          mode: data.mode,
          clickedItemRef: data.clickedItem ? data.clickedItem.getRef() : {},
          actionNumber: data.actionNumber,
        });
        break;
      case "sendpacketconfirmtransaction":
        PluginAPI.network.sendPacketConfirmTransaction({
          windowId: data.windowId,
          uid: data.uid,
          accepted: data.accepted,
        });
        break;
      case "sendpacketchatmessage":
        PluginAPI.network.sendPacketConfirmTransaction({
          messageIn: data.message,
        });
        break;
      case "sendpacketuseentity":
        PluginAPI.network.sendPacketUseEntity({
          entityId: data.entityId,
          action: data.action,
        });
        break;
      case "sendpacketplayerposition":
        PluginAPI.network.sendPacketPlayerPosition({
          posX: data.x,
          posY: data.y,
          posZ: data.z,
          isOnGround: data.onGround,
        });
      case "sendpacketplayerlook":
        PluginAPI.network.sendPacketPlayerLook({
          playerYaw: data.yaw,
          playerPitch: data.pitch,
          isOnGround: data.onGround,
        });
        break;
      case "sendpacketplayerposlook":
        PluginAPI.network.sendPacketPlayerPosLook({
          playerX: data.x,
          playerY: data.y,
          playerZ: data.z,
          playerYaw: data.yaw,
          playerPitch: data.pitch,
          isOnGround: data.onGround,
        });
      case "sendpacketplayer":
        PluginAPI.network.sendPacketPlayer({
          isOnGround: data.onGround,
        });
        break;
      case "sendpacketplayerdigging":
        PluginAPI.network.sendPacketPlayerDigging({
          pos: data.position,
          facing: data.facing,
          action: data.status,
        });
        break;
      case "sendpacketplayerblockplacement":
        PluginAPI.network.sendPacketPlayerBlockPlacement({
          stackRef: data.stack.getRef(),
          posRef: data.position.getRef(),
          placedBlockDirectionIn: data.placedBlockDirection,
          facingXIn: data.facingX,
          facingYIn: data.facingY,
          facingZIn: data.facingZ,
        });
        break;
      case "sendpackethelditemchange":
        PluginAPI.network.sendPacketHeldItemChange({
          slotId: data.slotId,
        });
        break;
      case "sendpacketcreativeinventoryaction":
        PluginAPI.network.sendPacketCreativeInventoryAction({
          slotId: data.slotId,
          stackRef: data.stack.getRef(),
        });
        break;
      case "sendpacketenchantitem":
        PluginAPI.network.sendPacketEnchantItem({
          windowId: data.windowId,
          button: data.button,
        });
        break;
      case "sendpacketupdatesign":
        PluginAPI.network.sendPacketUpdateSign({
          pos: data.pos,
          lines: data.lines,
        });
        break;
      case "sendpacketplayerabilities":
        PluginAPI.network.sendPacketPlayerAbilities({
          capabilitiesRef: PluginAPI.player.capabilities.getRef(),
        });
        break;
      case "sendpackettabcomplete":
        PluginAPI.network.sendPacketTabComplete({
          msg: data.message,
          target: data.targetBlock,
        });
        break;
      case "sendpacketclientsettings":
        PluginAPI.network.sendPacketClientSettings({
          lang: data.lang,
          view: data.view,
          chatVisibility: data.chatVisibility,
          enableColors: data.enableColors,
          modelPartFlags: data.modelPartFlags,
        });
        break;
      case "sendpacketclientstatus":
        PluginAPI.network.sendPacketClientStatus({
          status: data.status,
        });
        break;
      case "sendpacketspectate":
        PluginAPI.network.sendPacketSpectate({
          uuid: data.id,
        });
        break;
      case "sendpacketresourcepackstatus":
        PluginAPI.network.sendPacketResourcePackStatus({
          hash: data.hash,
          status: data.status,
        });
        break;
      default:
        break;
    }
  });
  packetsOnTodoList = [];
}
PluginAPI.addEventListener("sendchatmessage", (ev) => {
  if (ev.message.toLowerCase().trim() === ".blinkon") {
    ev.preventDefault = true;
    blinkOn();
  }
  if (ev.message.toLowerCase().trim() === ".blinkoff") {
    ev.preventDefault = true;
    blinkOff();
  }
});
