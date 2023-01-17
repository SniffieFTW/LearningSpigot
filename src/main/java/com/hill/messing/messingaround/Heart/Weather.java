package com.hill.messing.messingaround.Heart;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Weather implements CommandExecutor {

    // Can change the Weather  /w or /weather <Sun/Storm>

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;

            if (args.length == 1) {
                switch (args[0].toLowerCase()) {
                    case "sun":
                        p.getWorld().setStorm(false);
                        break;
                    case "storm":
                        p.getWorld().setStorm(true);
                        break;
                    case "thunder":
                        p.getWorld().setThundering(true);
                        break;
                    default:
                        p.sendMessage(ChatColor.RED + "Invalid Usage! /w or /weather <Sun/Storm/Thunder>");
                        return false;

                }
            } else {
                p.sendMessage(ChatColor.RED + "Invalid Usage! /w or /weather <Sun/Storm>");
            }


        }



        return false;
    }
}
