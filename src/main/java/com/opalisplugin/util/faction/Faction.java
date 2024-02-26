package com.opalisplugin.util.faction;


import com.opalisplugin.util.Yml.FactionConfig;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Faction {

    public String name = "";
    private ArrayList<Player> players;
    private Player chef;
    private ArrayList<Player> BrasDroits;
    private ArrayList<Player> Officiers;
    private ArrayList<Player> Players;

    private FactionConfig config;

    public int level;

    public int xp;
    public Faction(String name) {

        this.name = name;

        config = new FactionConfig("factions" + name);
    }

    private void addPlayerToList(Player player, String path){
        String name = player.getName();
        String NonSplittedStrings = (String) config.getConfig().get(path);
        String[] strings = NonSplittedStrings.split(";");
        StringBuilder Sb = null;
        for(String s : strings){
            Sb.append(s);
            Sb.append(";");
        }
        Sb.append(player.getName());
        Sb.append(";");

        config.getConfig().set(path, Sb.toString());
        config.saveConfig();
    }

    private void deletePlayerToList(Player player, String path){
        String name = player.getName();
        String NonSplittedStrings = (String) config.getConfig().get(path);
        String[] strings = NonSplittedStrings.split(";");
        StringBuilder Sb = null;
        int i = 0;
        while(i < Sb.length()){

            Sb.deleteCharAt(i);

            i += 1;
        }
        config.getConfig().set(path, Sb.toString());
        config.saveConfig();
    }

    public void changeChef(Player player) {
        chef = player;
        config.saveConfig();
    }

    public void addBrasDroit(Player player) {
        addPlayerToList(player, "bradroits");
        config.saveConfig();
    }

    public void delBrasDroit(Player player) {
        deletePlayerToList(player, "bradroits");
        config.saveConfig();
    }


    public void addOficiers(Player player) {
        addPlayerToList(player, "officiers");
        config.saveConfig();
    }

    public void delOfficiers(Player player) {
        deletePlayerToList(player, "officiers");
        config.saveConfig();
    }

    public void addJoueur(Player player) {
        addPlayerToList(player, "joueur");
        config.saveConfig();
    }

    public void delJoueur(Player player) {
        deletePlayerToList(player, "joueur");
        config.saveConfig();
    }

}
