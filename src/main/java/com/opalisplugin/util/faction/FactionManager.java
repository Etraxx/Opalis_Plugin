package com.opalisplugin.util.faction;

import com.opalisplugin.util.PlayerManager.PlayerProfile;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class FactionManager {

    public static ArrayList<Faction> profiles = new ArrayList<Faction>( );

    public void addFaction(Player player, String grade) {
        profiles.add(new Faction(""));
    }

    public PlayerProfile getFaction(String name ) {
        Faction faction = null;
        int i3 = 0;
        for (int i4 = 0; i4 < profiles.size(); i4 += 1) {
            if (profiles.get(i3).name == name) {
                faction = profiles.get(i3);
            }
        }
        i3 += 1;
        PlayerProfile Faction = null;
        return Faction;
    }
}
