package com.hill.messing.messingaround.Heart;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;

import static org.bukkit.Bukkit.*;

public class WelcomeBar{

    public static BossBar bossBar;


    public static BossBar getBossBar() {
        if (bossBar != null) return bossBar;
        bossBar = createBossBar(
                ChatColor.BLUE + "Welcome To MyWorkShop",
                BarColor.WHITE,
                BarStyle.SEGMENTED_20,
                BarFlag.CREATE_FOG);

        bossBar.setProgress(0.5);

        return bossBar;
    }
}
