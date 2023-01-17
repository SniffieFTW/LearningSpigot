package com.hill.messing.messingaround.Heart;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Time implements CommandExecutor {

    // Can change the Time  /t or /time <Morning/Midday/Midnight>

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;

            if (args.length == 1) {
                switch (args[0].toLowerCase()) {
                    case "morning":
                        p.getLocation().getWorld().setTime(0);
                        break;
                    case "midday":
                        p.getLocation().getWorld().setTime(6000);
                        break;
                    case "night":
                        p.getLocation().getWorld().setTime(18000);
                        break;
                    default:
                        p.sendMessage(ChatColor.RED + "Invalid Usage! /t or /time <Morning/Midday/Night>");
                        return false;

                }
            } else {
                p.sendMessage(ChatColor.RED + "Invalid Usage! /t or /time <Morning/Midday/Night>");
            }
        }



        return false;
    }
}
