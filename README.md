# Minecraft Prisoner Chain Mod

First of all, there are plenty of leash mods that work on all mobs, but most of them are not (yet) compatible with the current Minecraft version 1.19.4. So I decided to take matters into my own hands lmao.

Second, I have zero Java coding experience. None. And I see a lot of modding advice suggest that you should have at least some Java experience, but I don't. However I am a student of the 42Network, I'm sure I can learn this along the way. :thumbsup:

With that in mind, I cannot guarantee that any of the code will be the most optimised. Nor do I even know if I will actually succeed in creating this mod.

The purpose of this mod is to fulfill my evil minecraft desires. That is all I will say.

The Fabric mod template I used can be found [here](https://github.com/FabricMC/fabric-example-mod)

## Funny haha issues that I dealt with

* I had to reinstall JDK three times.
	* First JDK20 because I don't have JDK on my computer.
	* Second because gradle isn't compatible with JDK20.
	* Third because LWJGL said haha no no to JDK19.
	* So we stick to JDK17 :smiling_face_with_tear::ok_hand:

* Mod wasn't appearing in item group.
	* But item is suggested if I run ```/give``` ??
	* Item texture is loaded properly??
	* Hours later I realise I never actually called my ```addItemtoGroup()``` 