package de.ellyrion.tjorven.essentials.command.time

import de.ellyrion.tjorven.essentials.util.EssentialsCommand

class DayCommand : EssentialsCommand("time.day.set") {

    override fun run(label: String?, vararg args: String?): Boolean {
        if (args.isEmpty()) return true
        val player = asPlayer
        if (!(player.hasPermission("essentials.time.day")
                    || player.hasPermission("essentials.time.*")
                    || player.hasPermission("essentials.*"))) return true
        player.sendMessage(getMessage("command.day.set"))
        player.world.time = 1000;
        return false
    }

    override fun complete(p0: String?, vararg p1: String?): MutableList<String> {
        return arrayListOf()
    }
}