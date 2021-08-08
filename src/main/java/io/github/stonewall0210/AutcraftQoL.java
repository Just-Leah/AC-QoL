package io.github.stonewall0210;

import net.fabricmc.api.ModInitializer;

/*
Server side code with a warning if you somehow
run this on a server, and also where the init
code for icon creation is run
 */

public class AutcraftQoL implements ModInitializer {
	@Override
	public void onInitialize() {
		System.out.println("Hi, if you are reading this, and are setting up a server, theres a problem here. Because you have a client side mod installed!");
		System.out.println("If that is true, please either remove the mod 'Autcraft QoL', or proceed with caution, thanks :)");

		System.out.println("Now creating items for icons...");
		Icons.Init(); // Runs init code in icon class
	}
}
