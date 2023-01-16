package com.hill.messing.messingaround.Listener;

import com.hill.messing.messingaround.Heart.WelcomeBar;
import com.hill.messing.messingaround.MessingAround;
import org.bukkit.Bukkit;
import org.bukkit.boss.BossBar;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static com.hill.messing.messingaround.Heart.WelcomeBar.bossBar;

public class BossBarListener implements Listener{

    BossBar bossbar = WelcomeBar.getBossBar();

    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        bossBar.addPlayer(e.getPlayer());
        Bukkit.getScheduler().runTaskLater(
                MessingAround.getPlugin(MessingAround.class),
                () -> bossbar.removePlayer(e.getPlayer()),
                100);
    }

}
