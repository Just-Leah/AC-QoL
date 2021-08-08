package io.github.stonewall0210;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/*
Where the custom icons are made.
Any icon that isn't a provided
item is initialised here
 */

public class Icons {

    public static final Item BED_OLD = new Item(new FabricItemSettings()); // Creates item

    public static void Init() {
        Registry.register(Registry.ITEM, new Identifier("ac_qol", "bed_old"), BED_OLD); // Makes sure the game knows the item is there, and also gives it an ID
    }
}
