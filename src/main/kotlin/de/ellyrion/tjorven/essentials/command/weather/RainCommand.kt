package de.ellyrion.tjorven.essentials.command.weather

import de.ellyrion.tjorven.essentials.util.EssentialsCommand

class RainCommand : EssentialsCommand("command.rain.set") {

    override fun run(p0: String?, vararg p1: String?): Boolean {
        return false
    }

    override fun complete(p0: String?, vararg p1: String?): MutableList<String> {
        return arrayListOf("")
    }

}