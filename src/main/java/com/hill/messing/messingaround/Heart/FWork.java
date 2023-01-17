package com.hill.messing.messingaround.Heart;

import org.bukkit.FireworkEffect;
import org.bukkit.Color;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.util.Vector;

public class FWork implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            //Makes sure it's a player doing the command
            Player p = (Player) sender;
            //Gets PLayers Location and Direction
            Location loc = p.getEyeLocation();
            Vector dir = p.getLocation().getDirection().multiply(5);
            // Combines the Players Location and Direction
            Location front = loc.add(dir);
            // FireWork Variable
            Firework firework = p.getPlayer().getWorld().spawn(front, Firework.class);
            // FireWork Meta
            FireworkMeta fmeta = (FireworkMeta) firework.getFireworkMeta();
            //Building & Customizing FireWork
            fmeta.addEffect(FireworkEffect.builder().withColor(Color.BLUE).withColor(Color.BLACK).with(Type.STAR).withTrail().build());
            fmeta.setPower(1);
            firework.setFireworkMeta(fmeta);
        }


        return false;
    }
}
