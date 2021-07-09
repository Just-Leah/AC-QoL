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

public class AutcraftQoLClient implements ClientModInitializer {

    private static KeyBinding openGUI;

    @Override
    public void onInitializeClient() {

        openGUI = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.ac_qol.open_gui", // The translation key of the keybinding's name
                InputUtil.Type.KEYSYM, // The type of the keybinding, KEYSYM for keyboard, MOUSE for mouse.
                GLFW.GLFW_KEY_G, // The keycode of the key
                "category.ac_qol.keybinds" // The translation key of the keybinding's category.
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (openGUI.wasPressed()) {
                MinecraftClient.getInstance().openScreen(new ACQoLScreen(new warpGui()));
            }
        });
    }
}
