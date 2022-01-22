package me.lende.main;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Log4jFix implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        if (event.getMessage().contains("jndi")||event.getMessage().contains("ldap")||event.getMessage().contains("{")||event.getMessage().contains("}")) {
            event.setCancelled(true);
            System.out.println(event.getPlayer().getName() + " tried to use Log4j exploit. Their message have been blocked from chat!");
            player.sendMessage("§cThe Log4j exploit is already patched on this server!");
        }
    }
}
