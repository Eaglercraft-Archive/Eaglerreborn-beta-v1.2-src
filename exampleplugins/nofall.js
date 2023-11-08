PluginAPI.require("player"); //Require the player, we need to see their fall height.
PluginAPI.require("network"); //Require the network, we need to send network packets.

PluginAPI.addEventListener("update", ()=>{ // Every client tick
  if (PluginAPI.player.fallDistance > 2.0) { // If the player is at a height that they can take damage from hitting the ground:
    PluginAPI.network.sendPacketPlayer({isOnGround: true}); // Tell the server the player is on the ground
  }
});
