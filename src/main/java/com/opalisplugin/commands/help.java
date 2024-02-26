package com.opalisplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class help implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings){

        if(commandSender instanceof Player) {

            Player player = (Player) commandSender;

            ArrayList<String> Help = new ArrayList<>();
            Help.add("Ouvrir un établi");
            Help.add("Ouvrir son Ender Chest");
            Help.add("Se Nourrir");
            Help.add("Cuire ces Item");
            Help.add("Envoyer un message privé à un joueur");
            Help.add("Se Renommer");
            Help.add("Signaler un joueur");
            Help.add("Se Téléporter au spawn");

            for(String p : Help) {
                player.sendMessage(p);
            }


            player.sendMessage(ChatColor.BLUE + "Help > " + ChatColor.WHITE + "Voici la liste des commandes");

            return true;

        }

        return false;

    }
}
