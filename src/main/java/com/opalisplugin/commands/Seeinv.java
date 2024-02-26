package com.opalisplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Seeinv implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        if(player.isOp()){
            if(args.length != 1) {
                player.sendMessage(ChatColor.RED + "Commande Incorrecte, Syntaxe : /seeinv <Joueur>");
            }else{
                Player target = Bukkit.getPlayerExact(args[0]);
                Player Kikal = Bukkit.getPlayerExact("KikalDonuts");
                Player Etrax = Bukkit.getPlayerExact("Etraxx_");
                if(target.isOp() && player != Kikal){
                    player.sendMessage("Cette personne est un dévelppeur donc il est impossible de ouvrir son inventaire");
                }else{
                    player.openInventory(target.getInventory());
                }
                if(target.isOp() && player != Etrax){
                    player.sendMessage("Cette personne est un dévelppeur donc il est impossible de ouvrir son inventaire");
                }else{
                    player.openInventory(target.getInventory());
                }

            }
        }else{
            player.sendMessage(ChatColor.RED + "Vous n'avez pas la permission");
        }

        return false;
    }
}
