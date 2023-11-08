//Jetpack v1.1 Plugin by radmanplays

PluginAPI.require("player"); //We need to add vertical velocity
var jetpackActive = false; //Variable to track wether or not the jetpack is active
window.addEventListener("keydown", (event) => { //When a key is pressed
  if (event.key.toLowerCase() === "h") { //If the key is h
    jetpackActive = true; //Set jetpack to be active
  }
});
window.addEventListener("keyup", (event) => { //When a key is released
  if (event.key.toLowerCase() === "h") { //If the key is h
    jetpackActive = false; //Set jetpack to be inactive
  }
});
PluginAPI.addEventListener("update", ()=>{ //Every client tick
  if(!jetpackActive){ //If the jetpack is not active
    return; //Exit
  }
  PluginAPI.player.motionY += 0.2; //Add 0.2 to the players vertical moition
  PluginAPI.player.reload(); //Push changes
});
