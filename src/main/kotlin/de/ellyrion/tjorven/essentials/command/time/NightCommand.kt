package de.ellyrion.tjorven.essentials.command.time

import de.ellyrion.tjorven.essentials.util.EssentialsCommand
import org.bukkit.entity.Player

class NightCommand : EssentialsCommand("command.night.set") {

    override fun run(label: String?, vararg args: String?): Boolean {
        if (args.isEmpty()) return true
        val player = asPlayer
        if (!(player.hasPermission("essentials.time.night")
                    || player.hasPermission("essentials.*")
                    || player.hasPermission("essentials.time.*"))) return true
        player.sendMessage(getMessage("command.night.set"))
        return false
    }

    override fun complete(p0: String?, vararg p1: String?): MutableList<String> {
        return arrayListOf()
    }
}