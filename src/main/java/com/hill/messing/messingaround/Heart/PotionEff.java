package com.hill.messing.messingaround.Heart;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PotionEff implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;
            // Adds Potion Effect and the Type, can change the Amplifier and Duration aswell
            p.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 200, 3));

        }



        return false;
    }
}
