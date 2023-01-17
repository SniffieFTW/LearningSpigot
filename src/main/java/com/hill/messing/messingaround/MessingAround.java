package com.hill.messing.messingaround;

import com.hill.messing.messingaround.Heart.*;
import com.hill.messing.messingaround.Listener.BossBarListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class MessingAround extends JavaPlugin {

    @Override
    public void onEnable() {
        // Listeners
        Bukkit.getPluginManager().registerEvents(new BossBarListener(), this);

        //Registers Commands
        getCommand("fwork").setExecutor(new FWork());
        getCommand("potion").setExecutor(new PotionEff());
        getCommand("weather").setExecutor(new Weather());
        getCommand("time").setExecutor(new Time());

        //Sends Console a MSG when starting Up
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&d"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&d LearningSpigot"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&d Is Starting Up"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&d"));
    }

    @Override
    public void onDisable() {
        //Sends Console a MSG when starting Up
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&d"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&d LearningSpigot"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&d Is Shutting Down"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&d"));
    }
}
