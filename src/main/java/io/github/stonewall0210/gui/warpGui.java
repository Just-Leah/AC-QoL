package io.github.stonewall0210.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.*;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import net.minecraft.text.LiteralText;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;

public class warpGui extends LightweightGuiDescription {
    public warpGui() {
        WPlainPanel root = new WPlainPanel();
        setRootPanel(root);
        root.setSize(200, 200);
        root.setInsets(Insets.ROOT_PANEL);

        WButton calmrooms = new WButton(new TranslatableText("button.ac_qol.warp.calmrooms"));
        calmrooms.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp calmrooms");
            }
        });
        root.add(calmrooms, 0, 0, 100, 20);
        WButton canada = new WButton(new TranslatableText("button.ac_qol.warp.canada"));
        canada.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp canada");
            }
        });
        root.add(canada, 0, 20, 100, 20);
        WButton endermanfarm = new WButton(new TranslatableText("button.ac_qol.warp.endermanfarm"));
        endermanfarm.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp endermanfarm");
            }
        });
        root.add(endermanfarm, 0, 40, 100, 20);
        WButton farm = new WButton(new TranslatableText("button.ac_qol.warp.farm"));
        farm.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp farm");
            }
        });
        root.add(farm, 0, 60, 100, 20);
        WButton gwr = new WButton(new TranslatableText("button.ac_qol.warp.gwr"));
        gwr.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp gwr");
            }
        });
        root.add(gwr, 0, 80, 100, 20);
        WButton jobs = new WButton(new TranslatableText("button.ac_qol.warp.jobs"));
        jobs.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp jobs");
            }
        });
        root.add(jobs, 0, 100, 100, 20);
        WButton minigames = new WButton(new TranslatableText("button.ac_qol.warp.minigames"));
        minigames.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp minigames");
            }
        });
        root.add(minigames, 0, 120, 100, 20);
        WButton mobfarm = new WButton(new TranslatableText("button.ac_qol.warp.mobfarm"));
        mobfarm.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp mobfarm");
            }
        });
        root.add(mobfarm, 0, 140, 100, 20);
        WButton shops = new WButton(new TranslatableText("button.ac_qol.warp.shops"));
        shops.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp shops");
            }
        });
        root.add(shops, 0, 160, 100, 20);
        WButton spamrooms = new WButton(new TranslatableText("button.ac_qol.warp.spamrooms"));
        spamrooms.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp spamrooms");
            }
        });
        root.add(spamrooms, 0, 180, 100, 20);
        WButton spawn = new WButton(new TranslatableText("button.ac_qol.warp.spawn"));
        spawn.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp spawn");
            }
        });
        root.add(spawn, 0, 200, 100, 20);
        WButton spawn1 = new WButton(new TranslatableText("button.ac_qol.warp.spawn1"));
        spawn1.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp spawn1");
            }
        });
        root.add(spawn1, 100, 0, 100, 20);
        WButton spawn2 = new WButton(new TranslatableText("button.ac_qol.warp.spawn2"));
        spawn2.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp spawn2");
            }
        });
        root.add(spawn2, 100, 20, 100, 20);
        WButton spawn3 = new WButton(new TranslatableText("button.ac_qol.warp.spawn3"));
        spawn3.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp spawn3");
            }
        });
        root.add(spawn3, 100, 40, 100, 20);
        WButton spawn4 = new WButton(new TranslatableText("button.ac_qol.warp.spawn4"));
        spawn4.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp spawn4");
            }
        });
        root.add(spawn4, 100, 60, 100, 20);
        WButton tao = new WButton(new TranslatableText("button.ac_qol.warp.tao"));
        tao.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp tao");
            }
        });
        root.add(tao, 100, 80, 100, 20);
        WButton tardis = new WButton(new TranslatableText("button.ac_qol.warp.tardis"));
        tardis.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp tardis");
            }
        });
        root.add(tardis, 100, 100, 100, 20);
        WButton tardis1 = new WButton(new TranslatableText("button.ac_qol.warp.tardis1"));
        tardis1.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp tardis1");
            }
        });
        root.add(tardis1, 100, 120, 100, 20);
        WButton tardis2 = new WButton(new TranslatableText("button.ac_qol.warp.tardis2"));
        tardis2.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp tardis2");
            }
        });
        root.add(tardis2, 100, 140, 100, 20);
        WButton trades = new WButton(new TranslatableText("button.ac_qol.warp.trades"));
        trades.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp trades");
            }
        });
        root.add(trades, 100, 160, 100, 20);
        WButton wither = new WButton(new TranslatableText("button.ac_qol.warp.wither"));
        wither.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp wither");
            }
        });
        root.add(wither, 100, 180, 100, 20);
        WButton worlds = new WButton(new TranslatableText("button.ac_qol.warp.worlds"));
        worlds.setOnClick(() -> {
            if (MinecraftClient.getInstance().player != null) {
                MinecraftClient.getInstance().player.sendChatMessage("/warp worlds");
            }
        });
        root.add(worlds, 100, 200, 100, 20);

        root.validate(this);
    }
}
