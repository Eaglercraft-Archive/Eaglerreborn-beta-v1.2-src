var PluginAPI = {};
PluginAPI.events = {};
PluginAPI.events.types = ["event"];
PluginAPI.events.listeners = {"event": []};
PluginAPI.globals = {};
PluginAPI.version = version;
PluginAPI.addEventListener = function addEventListener(name, callback) {
  if (!callback) {
    throw new Error("Invalid callback!");
  }
  if (PluginAPI.events.types.includes(name)) {
    if (!Array.isArray(PluginAPI.events.listeners[name])) {
      PluginAPI.events.listeners[name] = [];
    }
    PluginAPI.events.listeners[name].push(callback);
    console.log("Added new event listener.");
  } else {
    throw new Error("This event does not exist!");
  }
};
PluginAPI.removeEventListener = function removeEventListener(name, func, slow) {
  if (!func) {
    throw new Error("Invalid callback!");
  }
  if (!Array.isArray(PluginAPI.events.listeners[name])) {
    PluginAPI.events.listeners[name] = [];
  }
  var targetArr = PluginAPI.events.listeners[name];
  if (!slow) {
    if (targetArr.indexOf(func) !== -1) {
      targetArr.splice(targetArr.indexOf(func), 1);
      console.log("Removed event listener.");
    }
  } else {
    var functionString = func.toString();
    targetArr.forEach((f, i) => {
      if (f.toString() === functionString) {
        targetArr.splice(i, 1);
        console.log("Removed event listener.");
      }
    });
  }
};
PluginAPI.events.newEvent = function newEvent(name) {
  PluginAPI.events.types.push(name);
};
PluginAPI.events.callEvent = function callEvent(name, data) {
  if (
    !PluginAPI.events.types.includes(name) ||
    !Array.isArray(PluginAPI.events.listeners[name])
  ) {
    if (!Array.isArray(PluginAPI.events.listeners[name])) {
      if (PluginAPI.events.types.includes(name)) {
        PluginAPI.events.listeners.event.forEach((func) => {
          func({event: name, data: data});
        });
        return;
      }
      return;
    }
    console.error("The PluginAPI has been called with an invalid event name: "+name);
    console.error("Please report this bug to the repo.");
    return;
  }
  PluginAPI.events.listeners[name].forEach((func) => {
    func(data);
  });
  PluginAPI.events.listeners.event.forEach((func) => {
    func({event: name, data: data});
  });

  PluginAPI.globals._initUpdate();
};
PluginAPI.updateComponent = function updateComponent(component) {
  if (
    typeof component !== "string" ||
    PluginAPI[component] === null ||
    PluginAPI[component] === undefined
  ) {
    return;
  }
  if (!PluginAPI.globals || !PluginAPI.globals.onGlobalsUpdate) {
    return;
  }
  if (!PluginAPI.globals.toUpdate) {
    PluginAPI.globals.toUpdate = [];
  }
  if (PluginAPI.globals.toUpdate.indexOf(component) === -1) {
    PluginAPI.globals.toUpdate.push(component);
  }
};
PluginAPI.require = function require(component) {
  if (typeof component !== "string") {
    return;
  }
  if (!PluginAPI.globals || !PluginAPI.globals.onRequire) {
    return;
  }
  PluginAPI.globals.onRequire(component);
};
PluginAPI.globals._initUpdate = function _initUpdate() {
  if (!PluginAPI.globals.toUpdate) {
    PluginAPI.globals.toUpdate = [];
  }
  PluginAPI.globals.toUpdate.forEach((id) => {
    PluginAPI.globals.onGlobalsUpdate(id);
  });
  PluginAPI.globals.toUpdate = [];
};
window.PluginAPI = PluginAPI;
