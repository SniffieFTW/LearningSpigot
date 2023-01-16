package com.hill.messing.messingaround;

import com.hill.messing.messingaround.Heart.WelcomeBar;
import com.hill.messing.messingaround.Listener.BossBarListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MessingAround extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new BossBarListener(), this);
        System.out.println("Welcome");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
