package de.ellyrion.tjorven.essentials.util

import de.ellyrion.ellyrionapi.util.AbstractCommand
import de.ellyrion.tjorven.essentials.Essentials
import java.io.InputStreamReader

abstract class EssentialsCommand(nonNullKey: String) : AbstractCommand("plugins/Essentials/essentials.yml", nonNullKey,
    Essentials.instance().getResource("messages.yml")?.let { InputStreamReader(it) })