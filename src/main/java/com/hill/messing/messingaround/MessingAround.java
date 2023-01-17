package com.hill.messing.messingaround;

import com.hill.messing.messingaround.Heart.FWork;
import com.hill.messing.messingaround.Heart.WelcomeBar;
import com.hill.messing.messingaround.Listener.BossBarListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class MessingAround extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new BossBarListener(), this);
        //Registers Commands
        getCommand("fwork").setExecutor(new FWork());

        //Sends Console a MSG when starting Up
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&d"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&d LearningSpigot"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&d Is Starting Up"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&d"));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
