PluginAPI.require("player");
PluginAPI.addEventListener("sendchatmessage", function (event) {
  event.message = `${event.message}`
    .replaceAll("{health}", PluginAPI.player.getHealth() / 2 + "❤")
    .replaceAll(
      "{pos}",
      Math.floor(PluginAPI.player.x) +
        " " +
        Math.floor(PluginAPI.player.y) +
        " " +
        Math.floor(PluginAPI.player.z)
    ).replaceAll(
      "{name}",
      PluginAPI.player.getDisplayName()
    ).replaceAll(
      "{me}",
      PluginAPI.player.getDisplayName()
    ).replaceAll(
      "{x}",
      Math.floor(PluginAPI.player.x)
    ).replaceAll(
      "{y}",
      Math.floor(PluginAPI.player.y)
    ).replaceAll(
      "{z}",
      Math.floor(PluginAPI.player.z)
    ).replaceAll(
      "{level}",
      PluginAPI.player.experienceLevel
    ).replaceAll(
      "{walked}",
      Math.floor(PluginAPI.player.movedDistance)
    ).replaceAll(
      "{chunk}",
      Math.floor(PluginAPI.player.chunkCoordX) +
        " " +
        Math.floor(PluginAPI.player.chunkCoordY) +
        " " +
        Math.floor(PluginAPI.player.chunkCoordZ)
    ).replaceAll(
      "\\n",
      "\n"
    );
});
