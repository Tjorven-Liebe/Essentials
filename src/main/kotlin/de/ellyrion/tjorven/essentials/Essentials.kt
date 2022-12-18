package de.ellyrion.tjorven.essentials

import org.bukkit.plugin.java.JavaPlugin

class Essentials : JavaPlugin() {
    companion object {
        lateinit var plugin: Essentials;
        fun instance(): Essentials {
            return plugin
        }
    }

    override fun onEnable() {
        plugin = this
        Register(plugin)
        super.onEnable()
    }

}