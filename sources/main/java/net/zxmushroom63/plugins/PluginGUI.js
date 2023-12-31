function gui() {
  if (document.querySelector("#eaglerpl_gui")) {
    document.querySelector("#eaglerpl_gui").remove();
  }
  localStorage.setItem(
    "pl::plugins",
    localStorage.getItem("pl::plugins") || "[]"
  );
  try {
    localStorage.setItem(
      "pl::plugins",
      JSON.stringify(JSON.parse(localStorage.getItem("pl::plugins")))
    );
  } catch (error) {
    localStorage.setItem("pl::plugins", "[]");
  }
  var plugins = JSON.parse(localStorage.getItem("pl::plugins"));
  var container = document.createElement("div");
  container.id = "eaglerpl_gui";
  container.style = `width:100%; height: 100%; position: fixed; top: 0; left: 0; z-index: 10; color: white; font-family: Minecraftia, sans-serif; overflow-y: scroll; overflow-x: hidden; background-image: url(data:image/png;base64,UklGRhoBAABXRUJQVlA4TA0BAAAvn8AnAIWjtpEECdnA2N0DsTROy7xUqfrWw0jbyLkJKTz0+I20jTT/Bo89e1YR/Wfktm0Y+wNKLobT7QP/n/B7Z/naW26QHoTpHB7LFouyKHlzeHxfCStSuj9KdbC8z1IJ5iWiyQed48vtYJ+lUu0t4VwranS1XMIutSiLYlbb8G54uf2p3VPSfRZtSrlsPFjOzZZrd/us3B3uK+HcHJQql+xbLMrS/WqNpm6DeZ/VIPVYaN/KzUbp91nd9xl5pYu50dU2W417nbdTj5l2Ne92uM9qXNpyf6+oXkabHKXaZ1HS4Iaqpim+1KIJ+0M49/LjNbTGP5mrrMZEuc7Uzcb1ViOJ6TuOt4NGJs+zDgA=); background-color: rgb(60,60,60); background-blend-mode: multiply; background-size: 64px;`;
  var title = document.createElement("h1");
  title.style = "text-shadow: 0px 0px 4px;";
  title.innerHTML = "Plugin Manager";
  var closeButton = document.createElement("a");
  closeButton.style = `margin-left: 2rem; color: red;`;
  closeButton.href = "javascript:void(0)";
  closeButton.addEventListener("click", () => {
    document.querySelector("#eaglerpl_gui").remove();
  });
  closeButton.innerHTML = "[X]";
  title.appendChild(closeButton);
  container.appendChild(title);

  var warningPoster = document.createElement("p");
  warningPoster.style = "font-size: 0.8rem; color: orangered;";
  warningPoster.innerHTML =
    "Warning: Installing plugins gives them full control over the game. Be cautious when installing them.<br>Plugins that have been removed also need a reload to stop running in the background.";
  container.appendChild(warningPoster);

  var table = document.createElement("table");
  table.style = "table-layout: fixed; width: 100%";
  var headerRow = document.createElement("tr");
  headerRow.style = "background: rgb(50,50,50);";
  var urlBox = document.createElement("th");
  urlBox.style = "text-align: center;";
  urlBox.innerHTML = "URL";
  headerRow.appendChild(urlBox);
  var statusBox = document.createElement("th");
  statusBox.style = "text-align: center; width: 15%;";
  statusBox.innerHTML = "Status";
  headerRow.appendChild(statusBox);
  table.appendChild(headerRow);

  plugins.forEach((url) => {
    var row = document.createElement("tr");
    row.style = `box-shadow: 0px 2px 0px grey;`;
    var urlBox = document.createElement("td");
    urlBox.style = "user-select: text;";
    var textWrapper = document.createElement("div");
    textWrapper.style = `max-width: 100%; overflow-wrap: anywhere; max-height: 3rem; overflow-y: scroll;`;
    textWrapper.innerText = url;
    urlBox.append(textWrapper);
    row.appendChild(urlBox);
    var statusBox = document.createElement("td");
    statusBox.innerHTML = ((curl) => {
      var targs = document.querySelectorAll("script[data-plugin]");
      for (let i = 0; i < targs.length; i++) {
        const elem = targs[i];
        if (elem.getAttribute("data-plugin") === curl) {
          return "LOADED";
        }
      }
      return "FAILED";
    })(url);
    switch (statusBox.innerHTML) {
      case "LOADED":
        statusBox.style = "background-color: green; text-align: center;";
        break;
      case "FAILED":
        statusBox.style = "background-color: dimgrey; text-align: center;";
        break;
      default:
        break;
    }
    var binBtn = document.createElement("button");
    binBtn.style =
      "background: transparent; text-align: center; color: yellow; cursor: pointer; font-family: 'Minecraftia', sans-serif; text-decoration: underline; border: 0; margin-left: 1rem; font-size: 1rem;";
    binBtn.innerHTML = "[X]";
    binBtn.addEventListener("click", () => {
      if (!window.confirm("Delete plugin?") || plugins.indexOf(url) === -1) {
        return;
      }
      plugins.splice(plugins.indexOf(url), 1);
      localStorage.setItem("pl::plugins", JSON.stringify(plugins));
      gui();
    });
    statusBox.appendChild(binBtn);
    row.appendChild(statusBox);
    table.appendChild(row);
  });

  var addBtn = document.createElement("button");
  addBtn.style =
    "background: transparent; text-align: center; color: yellow; cursor: pointer; font-family: 'Minecraftia', sans-serif; text-decoration: underline; border: 0; margin-right: 1rem;  font-size: 1rem;";
  addBtn.innerHTML = "Add new";
  addBtn.addEventListener("click", () => {
    var newPlugin = window.prompt(
      "URL of plugin: ",
      "http://example.com/example.js"
    );
    plugins.push(newPlugin);
    localStorage.setItem("pl::plugins", JSON.stringify(plugins));
    if (window.pluginLoader) {
      pluginLoader([newPlugin]);
    }
    gui();
  });

  var uploadBtn = document.createElement("button");
  uploadBtn.style =
    "background: transparent; text-align: center; color: yellow; cursor: pointer; font-family: 'Minecraftia', sans-serif; text-decoration: underline; border: 0;  font-size: 1rem;";
  uploadBtn.innerHTML = "Upload...";
  uploadBtn.addEventListener("click", function uploadBtnListener() {
    var filePicker = document.createElement("input");
    filePicker.type = "file";
    filePicker.addEventListener("input", function onInput() {
      if (filePicker.files[0]) {
        var reader = new FileReader();
        reader.addEventListener("load", function onPluginRead() {
          var newPlugin = reader.result.replace(
            ";base64",
            `;fs=${
              encodeURIComponent(filePicker.files[0].name) || "unknown"
            };base64`
          );
          plugins.push(newPlugin);
          localStorage.setItem("pl::plugins", JSON.stringify(plugins));
          if (window.pluginLoader) {
            pluginLoader([newPlugin]);
          }
          gui();
        });
        reader.readAsDataURL(filePicker.files[0]);
      }
    });
    filePicker.click();
  });

  container.appendChild(table);
  container.appendChild(addBtn);
  container.appendChild(uploadBtn);

  var notice = document.createElement("a");
  notice.innerHTML = "Refresh GUI";
  notice.href = "javascript:void(0)";
  notice.addEventListener("click", function reloadListener() {
    setTimeout(gui, 500);
    this.remove();
  });
  notice.style =
    "color: yellow; display: block; margin-top: 2rem; width: 0; white-space: nowrap;";
  container.appendChild(notice);

  document.body.appendChild(container);
  PluginAPI.events.callEvent("gui", {});
}
gui();
