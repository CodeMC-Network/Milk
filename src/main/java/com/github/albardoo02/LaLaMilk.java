package com.github.albardoo02;

import org.bukkit.plugin.java.JavaPlugin;

public final class LaLaMilk extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("乳搾りを始めたよ！");
        getServer().getPluginManager().registerEvents(new Events(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("乳搾りを終えたよ！");
    }
}
