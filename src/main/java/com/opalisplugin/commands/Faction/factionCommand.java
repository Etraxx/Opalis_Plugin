package com.opalisplugin.commands.Faction;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class factionCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(args.length == 0) {
                player.sendMessage(ChatColor.RED + "Utilisation : /f <f / join / create / claim / unclaim>");
            }

            if(args[0] == "f") {
                if(args.length < 2) {
                    player.sendMessage(ChatColor.RED + "Utilisation < /f f <nom d'une faction existante>");
                }
            }else{   
            }
        }
        return false;
    }
}
