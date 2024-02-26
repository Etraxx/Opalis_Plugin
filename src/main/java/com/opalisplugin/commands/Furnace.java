package com.opalisplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.rmi.MarshalException;

public class Furnace implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player) {

            Player player = (Player) commandSender;

            if(player.getWorld().getName() != "lobby") {
                player.getItemInHand();
                ItemStack item = player.getItemInHand();

                if(item.getType()== Material.SAND) {
                    player.getItemInHand().setType(Material.GLASS);
                }
                if(item.getType()== Material.COBBLESTONE) {
                    player.getItemInHand().setType(Material.STONE);
                }
                if(item.getType()== Material.DIAMOND_ORE) {
                    player.getItemInHand().setType(Material.DIAMOND);
                }
                if(item.getType()== Material.GOLD_ORE) {
                    player.getItemInHand().setType(Material.GOLD_INGOT);
                }
                if(item.getType()== Material.IRON_ORE) {
                    player.getItemInHand().setType(Material.IRON_INGOT);
                }
                if(item.getType()== Material.COAL_ORE) {
                    player.getItemInHand().setType(Material.COAL);
                }
                if(item.getType()== Material.POTATO) {
                    player.getItemInHand().setType(Material.BAKED_POTATO);
                }
                if(item.getType()== Material.REDSTONE_ORE) {
                    player.getItemInHand().setType(Material.REDSTONE);
                }
                if(item.getType()== Material.EMERALD_ORE) {
                    player.getItemInHand().setType(Material.EMERALD);
                }
                if(item.getType()== Material.QUARTZ_ORE) {
                    player.getItemInHand().setType(Material.QUARTZ);
                }
                // []~(￣▽￣)~* \\
                if(item.getType()== Material.RAW_BEEF) {
                    player.getItemInHand().setType(Material.COOKED_BEEF);
                }
                if(item.getType()== Material.RAW_CHICKEN) {
                    player.getItemInHand().setType(Material.COOKED_CHICKEN);
                }
                if(item.getType()== Material.RAW_FISH) {
                    player.getItemInHand().setType(Material.COOKED_FISH);
                }
                if(item.getType()== Material.RABBIT){
                    player.getItemInHand().setType(Material.COOKED_RABBIT);
                }
                if(item.getType()== Material.PORK){
                    player.getItemInHand().setType(Material.GRILLED_PORK);
                }
                if(item.getType()== Material.MUTTON){
                    player.getItemInHand().setType(Material.COOKED_MUTTON);
                }
                if(item.getType()== Material.CLAY){
                    player.getItemInHand().setType(Material.BRICK);
                }
                if(item.getType()== Material.NETHERRACK){
                    player.getItemInHand().setType(Material.NETHER_BRICK);
                }
                if(item.getType()== Material.GOLD_AXE){
                    player.getItemInHand().setType(Material.GOLD_NUGGET);
                }
                if(item.getType()== Material.GOLD_HOE){
                    player.getItemInHand().setType(Material.GOLD_NUGGET);
                }
                if(item.getType()== Material.GOLD_PICKAXE){
                    player.getItemInHand().setType(Material.GOLD_NUGGET);
                }
                if(item.getType()== Material.GOLD_SWORD){
                    player.getItemInHand().setType(Material.GOLD_NUGGET);
                }
                if(item.getType()== Material.GOLD_SPADE){
                    player.getItemInHand().setType(Material.GOLD_NUGGET);
                }
                if(item.getType()== Material.GOLD_BOOTS){
                    player.getItemInHand().setType(Material.GOLD_NUGGET);
                }
                if(item.getType()== Material.GOLD_LEGGINGS){
                    player.getItemInHand().setType(Material.GOLD_NUGGET);
                }
                if(item.getType()== Material.GOLD_CHESTPLATE){
                    player.getItemInHand().setType(Material.GOLD_NUGGET);
                }
                if(item.getType()== Material.GOLD_HELMET){
                    player.getItemInHand().setType(Material.GOLD_NUGGET);
                }
                if(item.getType()== Material.GOLD_BARDING){
                    player.getItemInHand().setType(Material.GOLD_NUGGET);
                }

                player.sendMessage(ChatColor.BLUE + "Furnace > " + ChatColor.WHITE + "Vos Item son cuit");

                return true;
            }

        }


        return false;
    }
}

