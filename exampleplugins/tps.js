// Client-side server TPS estimator with the Plugin API
// Only reliable if you are not lagging (ie high fps)
var lastTime;
var lastAge = -1;
var currentTps = 0;
PluginAPI.addEventListener("packettimeupdate", (ev)=>{
  var age = ev.totalWorldTime;
  var time = (new Date()).getTime();
  if (lastAge == -1) {
    lastTime = time;
    lastAge = age;
  }
  var diffAge = age - lastAge;
  var diffTime = time - lastTime;
  lastAge = age;
  lastTime = time;
  currentTps = diffAge / (diffTime / 1000);
});
PluginAPI.addEventListener("sendchatmessage", (ev)=>{ //When the player tries to enter something in chat
  if(ev.message.toLowerCase() === ".tps"){ //If they typed '.tps', or '.TPS', or... etc.
    ev.preventDefault = true; //Prevent sending the chat message.
    PluginAPI.displayToChat({msg: "§3[TPS]§9 Current server tps is §5~" + currentTps.toFixed(1)}); //Print the TPS to chat.
  }
});
