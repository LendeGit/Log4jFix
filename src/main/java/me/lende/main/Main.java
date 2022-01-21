package me.lende.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Log4jFix(), this);
        System.out.println("[Log4jFix] Plugin is now enabled!");

    }

    @Override
    public void onDisable() {
        System.out.println("[Log4jFix] Plugin is now disabled!");
        // Plugin shutdown logic
    }
}
