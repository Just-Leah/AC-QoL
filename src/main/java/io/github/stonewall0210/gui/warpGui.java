package io.github.stonewall0210.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WPlainPanel;
import io.github.cottonmc.cotton.gui.widget.WTabPanel;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import io.github.cottonmc.cotton.gui.widget.icon.ItemIcon;
import io.github.stonewall0210.Icons;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.TranslatableText;

/*
This is where the warp GUI is stored
 */

public class warpGui extends LightweightGuiDescription {
    public warpGui() {
        /*
        The different tabs of the main GUI are
        created here, the buttons are then attached
        to these in the correct location
        */
        WPlainPanel main = new WPlainPanel();
        main.setSize(200, 60);
        main.setInsets(Insets.ROOT_PANEL);
        WPlainPanel QoL = new WPlainPanel();
        QoL.setSize(200, 80);
        QoL.setInsets(Insets.ROOT_PANEL);
        WPlainPanel farms = new WPlainPanel();
        farms.setSize(200, 40);
        farms.setInsets(Insets.ROOT_PANEL);
        WPlainPanel events = new WPlainPanel();
        events.setSize(200, 40);
        events.setInsets(Insets.ROOT_PANEL);
        WPlainPanel archive = new WPlainPanel();
        archive.setSize(200, 120);
        archive.setInsets(Insets.ROOT_PANEL);


        /*
        Here the GUI group is created, and it adds the panels created above as tabs.
        This is where the paths to icon textures ~~are~~ will be stored, as soon as I get textures.
         */
        WTabPanel warpTabs = new WTabPanel();
        warpTabs.add(main, tab -> tab.icon(new ItemIcon(new ItemStack(Items.ENDER_EYE))).tooltip(new TranslatableText("gui.ac_qol.warp.tabs.main")));
        warpTabs.add(QoL, tab -> tab.icon(new ItemIcon(new ItemStack(Items.COOKIE))).tooltip(new TranslatableText("gui.ac_qol.warp.tabs.qol")));
        warpTabs.add(farms, tab -> tab.icon(new ItemIcon(new ItemStack(Items.BAKED_POTATO))).tooltip(new TranslatableText("gui.ac_qol.warp.tabs.farms")));
        warpTabs.add(events, tab -> tab.icon(new ItemIcon(new ItemStack(Items.DRAGON_EGG))).tooltip(new TranslatableText("gui.ac_qol.warp.tabs.events")));
        warpTabs.add(archive, tab -> tab.icon(new ItemIcon(new ItemStack(Items.BARREL))).tooltip(new TranslatableText("gui.ac_qol.warp.tabs.archive")));
        setRootPanel(warpTabs);

        /*
        Below is where the buttons on the GUIs are created, and given their attributes.
        Example of code block is on spawn
         */

        /*
        Main
            The warps that are mainly used the most
         */
        WButton spawn = new WButton(new TranslatableText("button.ac_qol.warp.spawn")); // Creates the button, and applies the text to it.
        spawn.setIcon(new ItemIcon(new ItemStack(Items.LIGHT_BLUE_STAINED_GLASS))); // Adds an icon to the button
        spawn.setOnClick(() -> { // Sets the click action for the button (This is different for the spawn command, so reference the next button for more information)
            if (MinecraftClient.getInstance().player != null) { // Makes sure that a player is running the code. This is for if you somehow run this on a server, it wont crash ;)
                MinecraftClient.getInstance().player.sendChatMessage("/spawn"); // Sends the command in the players name (eg. the warp command)
            }
        });
        main.add(spawn, 0, 0, 100, 20); // Adds the button to the correct tab, with the correct dimensions

        WButton worlds = new WButton(new TranslatableText("button.ac_qol.warp.worlds"));
        worlds.setIcon(new ItemIcon(new ItemStack(Items.END_PORTAL_FRAME)));
        worlds.setOnClick(() -> {
            buildCommand("worlds", false); // References the method at the bottom of the class for sending the command.
        });
        main.add(worlds, 0, 20, 100, 20);

        WButton shops = new WButton(new TranslatableText("button.ac_qol.warp.shops"));
        shops.setIcon(new ItemIcon(new ItemStack(Items.EMERALD)));
        shops.setOnClick(() -> buildCommand("shops", false));
        main.add(shops, 0, 40, 100, 20);

        WButton wither = new WButton(new TranslatableText("button.ac_qol.warp.wither"));
        wither.setIcon(new ItemIcon(new ItemStack(Items.WITHER_ROSE)));
        wither.setOnClick(() -> buildCommand("wither", false));
        main.add(wither, 100, 0, 100, 20);

        WButton minigames = new WButton(new TranslatableText("button.ac_qol.warp.minigames"));
        minigames.setIcon(new ItemIcon(new ItemStack(Icons.BED_OLD)));
        minigames.setOnClick(() -> buildCommand("minigames", false));
        main.add(minigames, 100, 20, 100, 20);

        WButton tardis = new WButton(new TranslatableText("button.ac_qol.warp.tardis"));
        tardis.setIcon(new ItemIcon(new ItemStack(Items.PLAYER_HEAD)));
        tardis.setOnClick(() -> buildCommand("tardis", false));
        main.add(tardis, 100, 40, 100, 20);

        /*
        Only on Autcraft
            Things that make AC what it is
         */
        WButton calmrooms = new WButton(new TranslatableText("button.ac_qol.warp.calmrooms"));
        calmrooms.setIcon(new ItemIcon(new ItemStack(Items.NOTE_BLOCK)));
        calmrooms.setOnClick(() -> buildCommand("calmrooms", false));
        QoL.add(calmrooms, 0, 0, 200, 20);

        WButton spamrooms = new WButton(new TranslatableText("button.ac_qol.warp.spamrooms"));
        spamrooms.setIcon(new ItemIcon(new ItemStack(Items.LEVER)));
        spamrooms.setOnClick(() -> buildCommand("spamrooms", false));
        QoL.add(spamrooms, 0, 20, 200, 20);

        WButton jobs = new WButton(new TranslatableText("button.ac_qol.warp.jobs"));
        jobs.setIcon(new ItemIcon(new ItemStack(Items.NETHERITE_PICKAXE)));
        jobs.setOnClick(() -> buildCommand("jobs", false));
        QoL.add(jobs, 0, 40, 200, 20);

        WButton tao = new WButton(new TranslatableText("button.ac_qol.warp.tao"));
        tao.setIcon(new ItemIcon(new ItemStack(Items.SPYGLASS)));
        tao.setOnClick(() -> buildCommand("tao", false));
        QoL.add(tao, 0, 60, 200, 20);

        WButton mapart = new WButton(new TranslatableText("button.ac_qol.warp.mapart"));
        mapart.setIcon(new ItemIcon(new ItemStack(Items.FILLED_MAP)));
        mapart.setOnClick(() -> buildCommand("mapart", false));
        QoL.add(mapart, 0, 80, 200, 20);

        /*
        Farms
            Different farm warps
         */
        WButton endermanfarm = new WButton(new TranslatableText("button.ac_qol.warp.endermanfarm"));
        endermanfarm.setIcon(new ItemIcon(new ItemStack(Items.ENDER_PEARL)));
        endermanfarm.setOnClick(() -> buildCommand("endermanfarm", false));
        farms.add(endermanfarm, 0, 0, 100, 20);

        WButton farm = new WButton(new TranslatableText("button.ac_qol.warp.farm"));
        farm.setIcon(new ItemIcon(new ItemStack(Items.NETHERITE_HOE)));
        farm.setOnClick(() -> buildCommand("farm", false));
        farms.add(farm, 0, 20, 100, 20);

        WButton mobfarm = new WButton(new TranslatableText("button.ac_qol.warp.mobfarm"));
        mobfarm.setIcon(new ItemIcon(new ItemStack(Items.NETHERITE_SWORD)));
        mobfarm.setOnClick(() -> buildCommand("mobfarm", false));
        farms.add(mobfarm, 100, 0, 100, 20);

        WButton trades = new WButton(new TranslatableText("button.ac_qol.warp.trades"));
        trades.setIcon(new ItemIcon(new ItemStack(Items.EMERALD)));
        trades.setOnClick(() -> buildCommand("trades", false));
        farms.add(trades, 100, 20, 100, 20);

        /*
        Events
            Areas for past events
         */
        WButton canada = new WButton(new TranslatableText("button.ac_qol.warp.canada"));
        canada.setIcon(new ItemIcon(new ItemStack(Items.POWDER_SNOW_BUCKET)));
        canada.setOnClick(() -> buildCommand("canada", false));
        events.add(canada, 0, 0, 200, 20);

        WButton gwr = new WButton(new TranslatableText("button.ac_qol.warp.gwr"));
        gwr.setIcon(new ItemIcon(new ItemStack(Items.GOLD_INGOT)));
        gwr.setOnClick(() -> buildCommand("gwr_world", false));
        events.add(gwr, 0, 20, 200, 20);

        /*
        Archive
            Old areas that have gone through different iterations
         */
        WButton spawnArchive = new WButton(new TranslatableText("button.ac_qol.warp.spawn"));
        spawnArchive.setIcon(new ItemIcon(new ItemStack(Items.BUNDLE)));
        spawnArchive.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/spawn");
            }
        });
        archive.add(spawnArchive, 0, 0, 200, 20);

        WButton spawn1 = new WButton(new TranslatableText("button.ac_qol.warp.spawn1"));
        spawn1.setOnClick(() -> buildCommand("spawn1", false));
        archive.add(spawn1, 0, 20, 100, 20);

        WButton spawn2 = new WButton(new TranslatableText("button.ac_qol.warp.spawn2"));
        spawn2.setOnClick(() -> buildCommand("spawn2", false));
        archive.add(spawn2, 100, 20, 100, 20);

        WButton spawn3 = new WButton(new TranslatableText("button.ac_qol.warp.spawn3"));
        spawn3.setOnClick(() -> buildCommand("spawn3", false));
        archive.add(spawn3, 0, 40, 100, 20);

        WButton spawn4 = new WButton(new TranslatableText("button.ac_qol.warp.spawn4"));
        spawn4.setOnClick(() -> buildCommand("spawn4", false));
        archive.add(spawn4, 100, 40, 100, 20);

        WButton tardisArchive = new WButton(new TranslatableText("button.ac_qol.warp.tardis"));
        tardisArchive.setIcon(new ItemIcon(new ItemStack(Items.BUNDLE)));
        tardisArchive.setOnClick(() -> buildCommand("tardis", false));
        archive.add(tardisArchive, 0, 60, 200, 20);

        WButton tardis1 = new WButton(new TranslatableText("button.ac_qol.warp.tardis1"));
        tardis1.setOnClick(() -> buildCommand("tardis1", false));
        archive.add(tardis1, 0, 80, 100, 20);

        WButton tardis2 = new WButton(new TranslatableText("button.ac_qol.warp.tardis2"));
        tardis2.setOnClick(() -> buildCommand("tardis2", true));
        archive.add(tardis2, 100, 80, 100, 20);

        warpTabs.validate(this);
    }

    private void buildCommand(String warpCode, Boolean compatibilityMode) {
        ClientPlayerEntity Player = MinecraftClient.getInstance().player; // This makes it easier to reference the player attached to the Minecraft client.
        if (Player != null) { // Makes sure that there is a player connected to the Minecraft instance (if this is false then it would be running server side)
            if (compatibilityMode) { // Compatibility mode for broken warps
                Player.sendChatMessage("/essentials:warp "+warpCode); // Command uses essentials namespace because sometimes warps don't work with /warp
            }
            else { // Code for warps that work intentionally
                Player.sendChatMessage("/warp "+warpCode); // Sends warp command. Uses the warp code from the input string.
            }
        }
        else {
            /*
                Error handler. What? Who says I can't have fun while coding?!
             */
            System.out.println("Congrats! Client code is running on the server! I've no clue how you did that but hooray for you! I suggest you report a bug about this actually...");
        }
    }
}
