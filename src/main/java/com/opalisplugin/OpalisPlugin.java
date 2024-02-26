package com.opalisplugin;

import com.opalisplugin.commands.*;
import com.opalisplugin.commands.Faction.factionCommand;
import com.opalisplugin.events.*;
import jdk.jfr.internal.tool.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public final class OpalisPlugin extends JavaPlugin {

    private static OpalisPlugin instance;

    @Override
    public void onEnable() {

        instance = this;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("[  <===================>  ===> OPALIS <===  <===================>  ]");
        System.out.println("                       OPALIS PLUGIN INITIALISÉ                     ");
        System.out.println("[ <==============> Dev: Etraxx_ & KikalDonuts_inc. <==============> ]");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");


        getCommand("spawn").setExecutor(new spawn());
        getCommand("feed").setExecutor(new feed());
        getCommand("msg").setExecutor(new msg());
        getCommand("nick").setExecutor(new nick());
        getCommand("chat").setExecutor(new chat());
        getCommand("report").setExecutor(new report());
        getCommand("furnace").setExecutor(new Furnace());
        getCommand("seeinv").setExecutor(new Seeinv());
        getCommand("ec").setExecutor(new Ender());
        getCommand("fly").setExecutor(new Fly());
        getCommand("heal").setExecutor(new heal());
        getCommand("help").setExecutor(new help());
        getCommand("denick").setExecutor(new deNick());
        getCommand("craft").setExecutor(new craft());
        getCommand("credits").setExecutor(new credits());
        getCommand("alert").setExecutor(new alert());
        getCommand("f").setExecutor(new factionCommand());
        getServer().getPluginManager().registerEvents(new ClickOnItemGui(), this);
        getServer().getPluginManager().registerEvents(new onDead(), this);
        getServer().getPluginManager().registerEvents(new onJoin(), this);
        getServer().getPluginManager().registerEvents(new onQuit(), this);
        getServer().getPluginManager().registerEvents(new onRG(), this);
        getServer().getPluginManager().registerEvents(new PlayerSendMessage(), this);

    }

    @Override
    public void onDisable() {

    }


    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return super.onTabComplete(sender, command, alias, args);

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return super.onCommand(sender, command, label, args);

    }


    public static OpalisPlugin getInstance() {
        return instance;
    }

}
