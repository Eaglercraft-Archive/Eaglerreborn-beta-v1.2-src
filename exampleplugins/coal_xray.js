//Coalest xray mod to ever exist!

//IIFE. I like scoped variables.
(function () {
  var targets = ["coal_block","coal_ore"]; //The target blocks
  var allblocks = Object.keys(PluginAPI.blocks); //List of all block IDsw
  function update() {
    allblocks.forEach(block=>{ //Loop through all the blocks
      if (targets.includes(block)) { //If it is in the targets list, force it to render.
        PluginAPI.blocks[block].forceRender = true;
        PluginAPI.blocks[block].reload(); //Push the changes.
      } else if (PluginAPI.blocks[block] && ("noRender" in PluginAPI.blocks[block])) { //Otherwise, if it is a valid block, and can be set to not render, do so.
        PluginAPI.blocks[block].noRender = true;
        PluginAPI.blocks[block].reload(); //Push the changes.
      }
    });
  }
  update(); //Trigger the coal xray.
})();
