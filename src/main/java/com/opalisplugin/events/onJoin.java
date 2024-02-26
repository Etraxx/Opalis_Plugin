package com.opalisplugin.events;

import com.opalisplugin.Opalis;
import com.opalisplugin.util.Grades;
import com.opalisplugin.util.PlayerManager.PlayerProfile;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.List;

public class onJoin implements Listener {

    @EventHandler

    public void OnJoin(PlayerJoinEvent event) {

        String grade = "";

        String faction = "";

        Player player = event.getPlayer();

        Player Kikal = Bukkit.getPlayer("KikalDonuts");
        Player Ghost = Bukkit.getPlayer("Ghost_Killer80");
        Player Etrax = Bukkit.getPlayer("Etraxx_");
        Player pappag = Bukkit.getPlayer("pro_pappag");
        Player Heverwan = Bukkit.getPlayer("Heverwan");
        //potes a Kikal
        Player pierre = Bukkit.getPlayer("pierre6207");
        Player sinay = Bukkit.getPlayer("yaya2008");
        Player Andréa = Bukkit.getPlayer("ANDREA_LE_COOKIE");

        if(player == Kikal) {
            grade = Grades.Owner();
        }

        if(player == Etrax) {
            grade = Grades.Administrateur();
        }

        if(player == pappag || player == Ghost || player == Heverwan) {
            grade = Grades.Poto();
        }
        Opalis.getPlayers().connectPlayer(player, grade, faction);

        Location spawn = new Location(event.getPlayer().getWorld(), 0.5, 33, 0.5);
        event.getPlayer().teleport(spawn);

        PlayerProfile pp = Opalis.getPlayers().getPlayer(player);

        String name = pp.getFaction() + " " + pp.getGrade() + " " + pp.getPseudo();

        player.setDisplayName(name);
        player.setCustomName(name);
        player.setPlayerListName(name);

        event.setJoinMessage(ChatColor.GRAY + "[" + ChatColor.GREEN + ">" + ChatColor.GRAY + "] " + Opalis.getPlayers().getPlayer(player).getFaction() + " " + Opalis.getPlayers().getPlayer(player).getGrade() + " " + Opalis.getPlayers().getPlayer(player).getPseudo());
    }

}
