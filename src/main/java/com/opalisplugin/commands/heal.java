package com.opalisplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class heal implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player) {
            Player player = (Player) commandSender;
            if(player.isOp()){
                player.setHealth(20);
                // []~(￣▽￣)~* \\
                player.setFoodLevel(20);
                player.setSaturation(20);
                player.sendMessage(ChatColor.DARK_BLUE + "HEAL > " + ChatColor.WHITE + "Vie et Nourriture remis au max");
                return true;
            }
        }
        return false;
    }
}
