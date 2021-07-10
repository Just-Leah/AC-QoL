package io.github.stonewall0210;

import net.fabricmc.api.ModInitializer;

/*
Unused server side code with a warning if you somehow
run this on a server
 */

public class AutcraftQoL implements ModInitializer {
	@Override
	public void onInitialize() {
		System.out.println("Hi, if you are reading this, and are setting up a server, theres a problem here. Because you have a client side mod installed!");
		System.out.println("If that is true, please either remove the mod 'Autcraft QoL', or proceed with caution, thanks :)");
	}
}
