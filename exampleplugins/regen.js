//Regen mod. enable with .regenon and disable with .regenoff
PluginAPI.require("network"); //Require the network, we need to send packets.
PluginAPI.require("player"); //Require the player, we need to view health, hunger and whether or not they are on the ground.
var regenOn = false; //Variable to store if regen is activated or not.
var regenPacketCount = 500; //How many packets to send
function regenTick() { //Called every tick if regen is enabled.
  if (
    !PluginAPI.player.capabilities.isCreativeMode && //If the player is not in creative
    PluginAPI.player.getHealth() < 20 && //And their health is less than 20
    PluginAPI.player.getHealth() !== 0 && //And they are not dead
    PluginAPI.player.onGround && //And they are on the ground (to avoid fly kicks)
    PluginAPI.player.getFoodStats().getFoodLevel() > 17 //And they have enough hunger to regen
  ) {
    for (let i = 0; i < regenPacketCount; i++) { //Send n player packets.
      PluginAPI.network.sendPacketPlayer({
        isOnGround: PluginAPI.player.onGround,
      });
    }
  }
}
PluginAPI.addEventListener("sendchatmessage", (ev) => { //When the player tries to send a chat message
  if (ev.message.toLowerCase().trim() === ".regenon" || ev.message.toLowerCase().trim() === ".regenoff") { //If the chat message is .regenon or .regenoff
    ev.preventDefault = true; //Cancel sending the chat message
  }
  if (ev.message.toLowerCase().trim() === ".regenon" && !regenOn) { //If the message is .regenon, and regen is not active
    PluginAPI.addEventListener("update", regenTick); //Enable calling regenTick every game tick
    PluginAPI.displayToChat({ msg: "Regen activated." }); //Display a message
    regenOn = true; //Set regen status to active
  }
  if (ev.message.toLowerCase().trim() === ".regenoff" && regenOn) { //If the message is .regenoff, and regen is active
    PluginAPI.removeEventListener("update", regenTick); //Disable calling regenTick every game tick
    PluginAPI.displayToChat({ msg: "Regen deactivated." }); //Display a message
    regenOn = false; //Set regen status to inactive
  }
});
