package de.ellyrion.tjorven.essentials.command.gui

import de.ellyrion.tjorven.essentials.util.EssentialsCommand

class WorkbenchCommand : EssentialsCommand("gui.workbench.open") {
    override fun run(p0: String?, vararg p1: String?): Boolean {
        if (asPlayer.hasPermission("essentials.gui.workbench")
            || asPlayer.hasPermission("essentials.gui.*")
            || asPlayer.hasPermission("essentials.*")) {
            asPlayer.openWorkbench(null, true)
        }
        return false
    }

    override fun complete(p0: String?, vararg p1: String?): MutableList<String> {
        TODO("Not yet implemented")
    }
}