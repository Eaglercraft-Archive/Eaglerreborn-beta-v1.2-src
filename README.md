![image](https://github.com/EaglerReborn/reborn/assets/144633084/b0f9ac4a-25f2-4fbf-992c-3ec2f05c1a5d)
---
### Eaglercraft client with Java support and a plugin API.
![title screen](https://github.com/EaglerReborn/reborn/assets/144633084/cfc346f3-5625-40e0-8f8f-5c7cb838ddfc)


---
### DMCA
[DMCA.md](DMCA.md)
### This repository contains:

 - **Utilities to decompile Minecraft 1.8 and apply patch files to it**
 - **Source code to provide the LWJGL keyboard, mouse, and OpenGL APIs in a browser**
 - **Patch files to mod the Minecraft 1.8 source code to make it browser compatible**
 - **Browser-modified portions of Minecraft 1.8's open-source dependencies**

### This repository does NOT contain:

 - **Any portion of the decompiled Minecraft 1.8 source code or resources**
 - **Any portion of Mod Coder Pack and it's config files**
 - **Data that can be used alone to reconstruct portions of the game's source code**
 - **Software configured by default to allow users to play without owning a copy of Minecraft**

## Getting Started:

### To compile the latest version of the client, on Windows:

1. Make sure you have at least Java 11 installed and added to your PATH
2. Download (clone) this repository to your computer
3. Double click `CompileLatestClient.bat`, a GUI resembling a classic windows installer should open
4. Follow the steps shown to you in the new window to finish compiling

### To compile the latest version of the client, on Linux/macOS:

1. Make sure you have at least Java 11 installed
2. Download (clone) this repository to your computer
3. Open a terminal in the folder the repository was cloned to
4. Type `chmod +x CompileLatestClient.sh` and hit enter
5. Type `./CompileLatestClient.sh` and hit enter, a GUI resembling a classic windows installer should open
6. Follow the steps shown to you in the new window to finish compiling


## Joining Non-Eagler servers


To join non eagler servers on the client, just do not include `wss://` in the server address. If you include `wss://`, the client will assume its an eagler server.

If the server has both Java and Eagler support, you should definitely use Eagler. Here's why:

1. Eagler is much faster than Java
2. Eagler is supported natively without needing to use a relay, resulting in better ping.

---

### Setting up a relay


<a href="https://replit.com/new/github/EaglerReborn/relay"><img src="https://raw.githubusercontent.com/BinBashBanana/deploy-buttons/main/buttons/remade/replit.svg"></img></a>

Just click the "Run on replit" button to make a relay.
make sure to set it to "blank repl" 


---

### Limitations
- only SRV records are accepted
- cannot add a port to the address of the server(for example example.com:25565 is not allowed)



### Installing Plugins
[How to install plugins](https://eaglerreborn.github.io/guide/InstallingPlugins.html)

### Plugin API Documentation

[PluginAPI.md](https://eaglerreborn.github.io/plugindocs)

