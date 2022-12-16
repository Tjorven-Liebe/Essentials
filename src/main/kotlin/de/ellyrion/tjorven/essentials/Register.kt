package de.ellyrion.tjorven.essentials

import de.ellyrion.ellyrionapi.util.AbstractCommand
import de.ellyrion.tjorven.essentials.command.chat.BroadcastCommand
import de.ellyrion.tjorven.essentials.command.economy.*
import de.ellyrion.tjorven.essentials.command.gui.*
import de.ellyrion.tjorven.essentials.command.home.DelHomeCommand
import de.ellyrion.tjorven.essentials.command.home.HomeCommand
import de.ellyrion.tjorven.essentials.command.home.HomesCommand
import de.ellyrion.tjorven.essentials.command.home.SetHomeCommand
import de.ellyrion.tjorven.essentials.command.interaction.BreakCommand
import de.ellyrion.tjorven.essentials.command.interaction.NearCommand
import de.ellyrion.tjorven.essentials.command.interaction.SeenCommand
import de.ellyrion.tjorven.essentials.command.interaction.player.*
import de.ellyrion.tjorven.essentials.command.item.*
import de.ellyrion.tjorven.essentials.command.item.meta.*
import de.ellyrion.tjorven.essentials.command.kits.CreateKitCommand
import de.ellyrion.tjorven.essentials.command.kits.DeleteKitCommand
import de.ellyrion.tjorven.essentials.command.kits.KitCommand
import de.ellyrion.tjorven.essentials.command.kits.KitsCommand
import de.ellyrion.tjorven.essentials.command.player_state.*
import de.ellyrion.tjorven.essentials.command.player_state.time.PDayCommand
import de.ellyrion.tjorven.essentials.command.player_state.time.PNightCommand
import de.ellyrion.tjorven.essentials.command.player_state.time.PTimeCommand
import de.ellyrion.tjorven.essentials.command.player_state.weather.PRainCommand
import de.ellyrion.tjorven.essentials.command.player_state.weather.PThunderCommand
import de.ellyrion.tjorven.essentials.command.player_state.weather.PWeatherClearCommand
import de.ellyrion.tjorven.essentials.command.player_state.weather.PWeatherCommand
import de.ellyrion.tjorven.essentials.command.server.ClearLagCommand
import de.ellyrion.tjorven.essentials.command.server.ListCommand
import de.ellyrion.tjorven.essentials.command.support.AdminVanishCommand
import de.ellyrion.tjorven.essentials.command.support.VanishCommand
import de.ellyrion.tjorven.essentials.command.teleport.RandomTeleportCommand
import de.ellyrion.tjorven.essentials.command.teleport.TeleportAllCommand
import de.ellyrion.tjorven.essentials.command.teleport.TeleportCommand
import de.ellyrion.tjorven.essentials.command.teleport.TeleportHereCommand
import de.ellyrion.tjorven.essentials.command.teleport_request.*
import de.ellyrion.tjorven.essentials.command.time.DayCommand
import de.ellyrion.tjorven.essentials.command.time.NightCommand
import de.ellyrion.tjorven.essentials.command.troll.*
import de.ellyrion.tjorven.essentials.command.troll.interact.BurnCommand
import de.ellyrion.tjorven.essentials.command.troll.interact.FireballCommand
import de.ellyrion.tjorven.essentials.command.troll.interact.LightningCommand
import de.ellyrion.tjorven.essentials.command.warp.DelWarpCommand
import de.ellyrion.tjorven.essentials.command.warp.SetWarpCommand
import de.ellyrion.tjorven.essentials.command.warp.WarpCommand
import de.ellyrion.tjorven.essentials.command.warp.WarpsCommand
import de.ellyrion.tjorven.essentials.command.weather.RainCommand
import de.ellyrion.tjorven.essentials.command.weather.ThunderCommand
import de.ellyrion.tjorven.essentials.command.weather.WeatherClearCommand
import de.ellyrion.tjorven.essentials.command.weather.WeatherCommand
import de.ellyrion.tjorven.essentials.command.world.CreateWorldCommand
import de.ellyrion.tjorven.essentials.command.world.LoadWorldCommand
import de.ellyrion.tjorven.essentials.command.world.TeleportWorldCommand
import de.ellyrion.tjorven.essentials.command.world.UnloadWorldCommand
import org.bukkit.Bukkit
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

class Register(var plugin: JavaPlugin) {

    val javaPlugin:JavaPlugin = plugin;

    init {
        /*Chat*/
        command("broadcast", BroadcastCommand())

        /*Economy*/
        command("balance", BalanceCommand())
        command("balancetop", BalanceTopCommand())
        command("economy", EconomyCommand())
        command("money", MoneyCommand())
        command("pay", PayCommand())

        /*GUI*/
        command("anvil", AnvilCommand())
        command("backpack", BackpackCommand())
        command("enderchest", EnderChestCommand())
        command("furnace", FurnaceCommand())
        command("workbench", WorkbenchCommand())

        /*Home*/
        command("delhome", DelHomeCommand())
        command("home", HomeCommand())
        command("homes", HomesCommand())
        command("sethome", SetHomeCommand())

        /*Interaction*/
        /*Player*/
        command("afk", AfkCommand())
        command("clear", ClearCommand())
        command("killall", KillAllCommand())
        command("kill", KillCommand())
        command("lay", LayCommand())
        command("sit", SitCommand())

        command("break", BreakCommand())
        command("near", NearCommand())
        command("seen", SeenCommand())

        /*Item*/
        /*meta*/
        command("enchant", EnchantCommand())
        command("itemflag", ItemFlagCommand())
        command("itemlore", ItemLoreCommand())
        command("rename", ItemRenameCommand())
        command("repair", RepairCommand())

        command("book", BookCommand())
        command("condense", CondenseCommand())
        command("skull", SkullCommand())
        command("spawner", SpawnerCommand())
        command("unbreakable", UnbreakableCommand())
        command("unlimited", UnlimitedItemCommand())

        /*Kits*/
        command("createkit", CreateKitCommand())
        command("deletekit", DeleteKitCommand())
        command("kit", KitCommand())
        command("kits", KitsCommand())

        /*player_state*/
        /*time*/
        command("playertime", PTimeCommand())
        command("playernight", PNightCommand())
        command("playerday", PDayCommand())
        /*weather*/
        command("playerweather", PWeatherCommand())
        command("playerrain", PRainCommand())
        command("playerthunder", PThunderCommand())
        command("playerweatherclear", PWeatherClearCommand())

        command("experience", ExperienceCommand())
        command("fly", FlyCommand())
        command("flyspeed", FlySpeedCommand())
        command("gamemode", GameModeCommand())
        command("godmode", GodModeCommand())
        command("hat", HatCommand())
        command("playtime", PlayTimeCommand())
        command("speed", SpeedCommand())
        command("suicide", SuicideCommand())
        command("walkspeed", WalkSpeedCommand())

        /*Server*/
        command("clearlag", ClearLagCommand())
        command("list", ListCommand())

        /*Support*/
        command("adminvanish", AdminVanishCommand())
        command("vanish", VanishCommand())

        /*Teleport*/
        command("teleport", TeleportCommand())
        command("teleportall", TeleportAllCommand())
        command("randomteleport", RandomTeleportCommand())
        command("teleporthere", TeleportHereCommand())

        /*Teleportrequest*/
        command("teleportrequestaccept", TeleportRequestAcceptCommand())
        command("teleportrequestblock", TeleportRequestBlockCommand())
        command("teleportrequest", TeleportRequestCommand())
        command("teleportrequestdecline", TeleportRequestDeclineCommand())
        command("teleportrequesthere", TeleportRequestHereCommand())
        command("teleportrequesttoggle", TeleportRequestToggleCommand())

        /*Time*/
        command("day", DayCommand())
        command("night", NightCommand())

        /*Troll*/
        /*Interact*/
        command("burn", BurnCommand())
        command("fireball", FireballCommand())
        command("lightning", LightningCommand())

        command("demoscreen", DemoScreenCommand())
        command("elderguardian", ElderGuardianCommand())
        command("endscreen", EndScreenCommand())
        command("freeze", FreezeCommand())
        command("sudo", SudoCommand())
        command("worldload", WorldLoadCommand())

        /*Warp*/
        command("delwarp", DelWarpCommand())
        command("setwarp", SetWarpCommand())
        command("warp", WarpCommand())
        command("warps", WarpsCommand())

        /*Weather*/
        command("rain", RainCommand())
        command("thunder", ThunderCommand())
        command("weatherclear", WeatherClearCommand())
        command("weather", WeatherCommand())

        /*World*/
        command("createworld", CreateWorldCommand())
        command("loadworld", LoadWorldCommand())
        command("teleportworld", TeleportWorldCommand())
        command("unloadworld", UnloadWorldCommand())
    }

    fun command(command:String, abstractCommand:AbstractCommand) {
        plugin.getCommand(command)?.setExecutor(abstractCommand)
        plugin.getCommand(command)?.tabCompleter = abstractCommand
    }

    fun event(listener:Listener) {
        Bukkit.getPluginManager().registerEvents(listener, plugin)
    }

}