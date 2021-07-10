package io.github.stonewall0210.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.*;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import io.github.cottonmc.cotton.gui.widget.icon.ItemIcon;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;

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
        warpTabs.add(main, tab -> tab.icon(new ItemIcon(new ItemStack(Items.ARMOR_STAND))).tooltip(new TranslatableText("gui.ac_qol.warp.tabs.main")));
        warpTabs.add(QoL, tab -> tab.icon(new ItemIcon(new ItemStack(Items.COOKIE))).tooltip(new TranslatableText("gui.ac_qol.warp.tabs.qol")));
        warpTabs.add(farms, tab -> tab.icon(new ItemIcon(new ItemStack(Items.FARMLAND))).tooltip(new TranslatableText("gui.ac_qol.warp.tabs.farms")));
        warpTabs.add(events, tab -> tab.icon(new ItemIcon(new ItemStack(Items.DRAGON_EGG))).tooltip(new TranslatableText("gui.ac_qol.warp.tabs.events")));
        warpTabs.add(archive, tab -> tab.icon(new ItemIcon(new ItemStack(Items.BUNDLE))).tooltip(new TranslatableText("gui.ac_qol.warp.tabs.archive")));
        setRootPanel(warpTabs);

        /*
        Below is where the buttons on the GUIs are created, and given their attributes.
        Example of code block is on spawn
         */

        /*
        Main
            The warps that are mainly used the most
         */
        WButton spawn = new WButton(new TranslatableText("button.ac_qol.warp.spawn")); // Creates the button, and applies the text ~~and icon~~
        spawn.setOnClick(() -> { // Sets the click action for the button
            if (MinecraftClient.getInstance().player != null) { // Makes sure that a player is running the code. This is for if you somehow run this on a server, it wont crash ;)
                MinecraftClient.getInstance().player.sendChatMessage("/spawn"); // Sends the command in the players name (eg. the warp command)
            }
        });
        main.add(spawn, 0, 0, 100, 20); // Adds the button to the correct tab, with the correct dimensions

        WButton worlds = new WButton(new TranslatableText("button.ac_qol.warp.worlds"));
        worlds.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp worlds");
            }
        });
        main.add(worlds, 0, 20, 100, 20);

        WButton shops = new WButton(new TranslatableText("button.ac_qol.warp.shops"));
        shops.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp shops");
            }
        });
        main.add(shops, 0, 40, 100, 20);

        WButton wither = new WButton(new TranslatableText("button.ac_qol.warp.wither"));
        wither.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp wither");
            }
        });
        main.add(wither, 100, 0, 100, 20);

        WButton minigames = new WButton(new TranslatableText("button.ac_qol.warp.minigames"));
        minigames.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp minigames");
            }
        });
        main.add(minigames, 100, 20, 100, 20);

        WButton tardis = new WButton(new TranslatableText("button.ac_qol.warp.tardis"));
        tardis.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp tardis");
            }
        });
        main.add(tardis, 100, 40, 100, 20);

        /*
        Only on Autcraft
            Things that make AC what it is
         */
        WButton calmrooms = new WButton(new TranslatableText("button.ac_qol.warp.calmrooms"));
        calmrooms.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp calmrooms");
            }
        });
        QoL.add(calmrooms, 0, 0, 200, 20);

        WButton spamrooms = new WButton(new TranslatableText("button.ac_qol.warp.spamrooms"));
        spamrooms.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp spamrooms");
            }
        });
        QoL.add(spamrooms, 0, 20, 200, 20);

        WButton jobs = new WButton(new TranslatableText("button.ac_qol.warp.jobs"));
        jobs.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp jobs");
            }
        });
        QoL.add(jobs, 0, 40, 200, 20);

        WButton tao = new WButton(new TranslatableText("button.ac_qol.warp.tao"));
        tao.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp tao");
            }
        });
        QoL.add(tao, 0, 60, 200, 20);

        WButton trades = new WButton(new TranslatableText("button.ac_qol.warp.trades"));
        trades.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp trades");
            }
        });
        farms.add(trades, 100, 20, 100, 20);

        /*
        Farms
            Different farm warps
         */
        WButton endermanfarm = new WButton(new TranslatableText("button.ac_qol.warp.endermanfarm"));
        endermanfarm.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp endermanfarm");
            }
        });
        farms.add(endermanfarm, 0, 0, 100, 20);

        WButton farm = new WButton(new TranslatableText("button.ac_qol.warp.farm"));
        farm.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp farm");
            }
        });
        farms.add(farm, 0, 20, 100, 20);

        WButton mobfarm = new WButton(new TranslatableText("button.ac_qol.warp.mobfarm"));
        mobfarm.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp mobfarm");
            }
        });
        farms.add(mobfarm, 100, 0, 100, 20);

        /*
        Events
            Areas for past events
         */
        WButton canada = new WButton(new TranslatableText("button.ac_qol.warp.canada"));
        canada.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp canada");
            }
        });
        events.add(canada, 0, 0, 200, 20);

        WButton gwr = new WButton(new TranslatableText("button.ac_qol.warp.gwr"));
        gwr.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp gwr");
            }
        });
        events.add(gwr, 0, 20, 200, 20);

        /*
        Archive
            Old areas that have gone through different iterations
         */
        WButton spawnArchive = new WButton(new TranslatableText("button.ac_qol.warp.spawn"));
        spawnArchive.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/spawn");
            }
        });
        archive.add(spawnArchive, 0, 0, 200, 20);

        WButton spawn1 = new WButton(new TranslatableText("button.ac_qol.warp.spawn1"));
        spawn1.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp spawn1");
            }
        });
        archive.add(spawn1, 0, 20, 100, 20);

        WButton spawn2 = new WButton(new TranslatableText("button.ac_qol.warp.spawn2"));
        spawn2.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp spawn2");
            }
        });
        archive.add(spawn2, 100, 20, 100, 20);

        WButton spawn3 = new WButton(new TranslatableText("button.ac_qol.warp.spawn3"));
        spawn3.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp spawn3");
            }
        });
        archive.add(spawn3, 0, 40, 100, 20);

        WButton spawn4 = new WButton(new TranslatableText("button.ac_qol.warp.spawn4"));
        spawn4.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp spawn4");
            }
        });
        archive.add(spawn4, 100, 40, 100, 20);

        WButton tardisArchive = new WButton(new TranslatableText("button.ac_qol.warp.tardis"));
        tardisArchive.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp tardis");
            }
        });
        archive.add(tardisArchive, 0, 60, 200, 20);

        WButton tardis1 = new WButton(new TranslatableText("button.ac_qol.warp.tardis1"));
        tardis1.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp tardis1");
            }
        });
        archive.add(tardis1, 0, 80, 100, 20);

        WButton tardis2 = new WButton(new TranslatableText("button.ac_qol.warp.tardis2"));
        tardis2.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp tardis2");
            }
        });
        archive.add(tardis2, 100, 80, 100, 20);

        warpTabs.validate(this);
    }
}
