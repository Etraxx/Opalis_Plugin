package com.opalisplugin.commands;

import com.opalisplugin.gui.CreditsGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class credits implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        player.openInventory(CreditsGUI.creadits());


        return false;
    }
}
