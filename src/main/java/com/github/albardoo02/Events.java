package com.github.albardoo02;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class Events implements Listener {

    @EventHandler
    public void PlayerItemConsumeEvent(PlayerItemConsumeEvent event){
        Player player = event.getPlayer();
        if(event.getItem().getType().equals(Material.MILK_BUCKET)){
            player.sendMessage(ChatColor.translateAlternateColorCodes('&',
                    "&dショタの精◯を飲んだ...\n&dえっちだなぁ"));
        }

    }
}
