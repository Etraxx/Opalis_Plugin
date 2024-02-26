package com.opalisplugin.events;

import com.opalisplugin.Opalis;
import com.opalisplugin.customItems.CustomItems;
import com.opalisplugin.gui.verificationGui;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.ArrayList;
import java.util.List;

public class onRG implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent e) {
        if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if(e.getItem() == CustomItems.ChunkKiller()) {
                Chunk chunk = e.getPlayer().getLocation().getChunk();
                ArrayList<Block> blocks = Opalis.getBlocksOfAChunk(chunk);
                e.getPlayer().openInventory(verificationGui.verificationGui("Etes vous sur de vouloir utiliser le Chunk_Buster ( Il détruira le chunk dans lequel vous trouvez ) ?"));
                for(Block b : blocks) {
                    b.setType(Material.AIR);

                }
            }
        }

    }

}
