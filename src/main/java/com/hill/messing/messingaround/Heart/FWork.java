package com.hill.messing.messingaround.Heart;

import org.bukkit.FireworkEffect;
import org.bukkit.Color;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.util.BlockIterator;
import org.bukkit.util.Vector;

import java.util.Set;

public class FWork implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            //Makes sure it's a player doing the command
            Player p = (Player) sender;
            // Gets the Block The player is looking at
            Block b = p.getTargetBlock((Set<Material>) null, 5);
            //Gets PLayers Location and Direction
            Location loc = b.getLocation();

            //If you just want to do a distance and not a block use Vector and set loc = p.getLocation() and set front = loc.add(dir)
                // & Commit out Block b = p...

            //Vector dir = p.getLocation().getDirection().multiply(10);

            // Combines the Players Location and Direction
            Location front = loc;
            // FireWork Variable
            Firework firework = p.getPlayer().getWorld().spawn(front, Firework.class);
            // FireWork Meta
            FireworkMeta fmeta = (FireworkMeta) firework.getFireworkMeta();
            //Building & Customizing FireWork
            fmeta.addEffect(FireworkEffect.builder().withColor(Color.BLUE).withColor(Color.BLACK).with(Type.STAR).withTrail().build());
            // Sets Power from 1-5
            fmeta.setPower(1);
            // Combines it all and Makes the Firework itself
            firework.setFireworkMeta(fmeta);
        }


        return false;
    }
}
