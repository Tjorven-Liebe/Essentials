package de.ellyrion.tjorven.essentials.command.chat

import de.ellyrion.tjorven.essentials.util.EssentialsCommand
import org.bukkit.Bukkit
import org.bukkit.ChatColor

class BroadcastCommand : EssentialsCommand("chat.broadcast.send") {
    override fun run(p0: String?, vararg p1: String?): Boolean {
        if (asPlayer.hasPermission("essentials.chat.*")
            || asPlayer.hasPermission("essentials.*")
            || asPlayer.hasPermission("essentials.chat.broadcast")) {

            var string = ""
            p1.forEach {
                string += "$it ";
            }
            Bukkit.broadcastMessage(getMessage("chat.broadcast.send")
                .replace("%message%", ChatColor.translateAlternateColorCodes('&', string))
                .replace("/n", "\n"))
        }
        return false
    }

    override fun complete(p0: String?, vararg p1: String?): MutableList<String> {
        return arrayListOf("test")
    }
}