package de.ellyrion.tjorven.essentials.command.weather

import de.ellyrion.tjorven.essentials.util.EssentialsCommand

class WeatherClearCommand : EssentialsCommand("weather.weatherclear.set") {
    override fun run(label: String?, vararg args: String?): Boolean {

        return false
    }

    override fun complete(label: String?, vararg args: String?): MutableList<String> {

        return arrayListOf()
    }
}