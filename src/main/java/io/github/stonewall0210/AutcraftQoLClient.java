package io.github.stonewall0210;

import io.github.stonewall0210.gui.screen.ACQoLScreen;
import io.github.stonewall0210.gui.warpGui;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

/*
Client init code, this is where the keybinds are created
 */

public class AutcraftQoLClient implements ClientModInitializer {

    // Creates the keybind, however the game does not know that this keybind exists yet
    private static KeyBinding openGUI;

    @Override
    public void onInitializeClient() {

        /*
        This registers the keybind so the game knows it exists and
        also knows where to find it again
         */
        openGUI = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.ac_qol.open_gui", // Keybind name: used to show a human friendly name with the lang file and also so the game has a way of identifying this keybind again
                InputUtil.Type.KEYSYM, // Specifies that this is a keyboard based keybind.
                GLFW.GLFW_KEY_G, // Key that this keybind defaults to (in this case G)
                "category.ac_qol.keybinds" // Category name for keybind. Provides human friendly name using lang file and also identifies the sorting of this keybind for the controls menu
        ));

        /*
        This is where the code the keybind executes on press is stored
         */
        ClientTickEvents.END_CLIENT_TICK.register(client -> { // Tells the game that we want to listen to something on the client side
            while (openGUI.wasPressed()) { // Listens for the keybind being pressed
                MinecraftClient.getInstance().openScreen(new ACQoLScreen(new warpGui())); // Opens the warp GUI
            }
        });
    }
}
