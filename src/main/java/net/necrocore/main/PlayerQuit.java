package net.necrocore.main;

import net.necrocore.main.SQL.SQLCrates;
import net.necrocore.main.SQL.SQLLevels;
import net.necrocore.main.SQL.SQLShards;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuit implements Listener{
	
	@SuppressWarnings("unused")
	private HyperialCore plugin;
	public PlayerQuit(HyperialCore listener) {
		this.plugin = listener;		
	}
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e){
		if(SQLShards.shards.containsKey(e.getPlayer().getUniqueId())){
			SQLShards.savePlayer(e.getPlayer());
		}
		if(SQLCrates.meteors.containsKey(e.getPlayer().getUniqueId())){
			SQLCrates.savePlayer(e.getPlayer());
		}
		if(SQLLevels.levels.containsKey(e.getPlayer().getUniqueId())){
			SQLLevels.savePlayer(e.getPlayer());
		}
	}
}
