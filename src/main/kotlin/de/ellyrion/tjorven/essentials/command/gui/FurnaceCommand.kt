package de.ellyrion.tjorven.essentials.command.gui

import de.ellyrion.tjorven.essentials.util.EssentialsCommand
import org.bukkit.Bukkit
import org.bukkit.event.inventory.InventoryType

class FurnaceCommand : EssentialsCommand("gui.furnace.open") {
    override fun run(p0: String?, vararg p1: String?): Boolean {
        if (asPlayer.hasPermission("essentials.gui.workbench")
            || asPlayer.hasPermission("essentials.gui.*")
            || asPlayer.hasPermission("essentials.*")) {
            asPlayer.openInventory(Bukkit.createInventory(null, InventoryType.FURNACE));
        }
        return false
    }

    override fun complete(p0: String?, vararg p1: String?): MutableList<String> {
        TODO("Not yet implemented")
    }
}