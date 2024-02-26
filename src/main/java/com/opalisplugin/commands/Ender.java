//Ne fonctionne pas sur le serveur
//Permet d'ouvrir son ender chest
package com.opalisplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Ender implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player) {

            Player player = (Player) commandSender;

            if(player.getWorld().getName() == "lobby") {
                player.sendMessage("");
            }

            player.openInventory(player.getEnderChest());

            return true;
        }
        return false;
    }
}
