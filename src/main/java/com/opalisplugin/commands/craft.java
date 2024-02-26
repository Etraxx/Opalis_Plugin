package com.opalisplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class craft implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings){

        if(commandSender instanceof Player){

            Player player = (Player) commandSender;

            if(player.getWorld().getName() == "lobby") {
                player.sendMessage("Cette commande ne peut pas etre utilisée au lobby");
            }else{
                Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, "Craft");
                player.openInventory(inv);
            }

            return true;

        }

        return false;

    }
}
