package net.necrocore.main;

import net.necrocore.main.SQL.SQLCrates;
import net.necrocore.main.SQL.SQLLevels;
import net.necrocore.main.SQL.SQLShards;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener{
	
	@SuppressWarnings("unused")
	private HyperialCore plugin;
	public PlayerJoin(HyperialCore listener) {
		this.plugin = listener;		
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		final Player p = (Player) e.getPlayer();
		if(SQLShards.getShards(p) == null){
			SQLShards.setShards(p, 0);
		}
		SQLShards.loadPlayer(p);
		
		if(SQLCrates.getMeteors(p) == null){
			SQLCrates.setMeteors(p, 0);
		}
		SQLCrates.loadPlayer(p);
		
		if(SQLLevels.getLevel(p) == null){
			SQLLevels.setLevel(p, 1);
		}
		if(SQLLevels.getXP(p) == null){
			SQLLevels.setXP(p, 0);
		}
		if(SQLLevels.getXPNeeded(p) == null){
			SQLLevels.setXPNeeded(p, SQLLevels.getXPNeededForLevel(SQLLevels.getLevel(p)));
		}
		SQLLevels.loadPlayer(p);
	}
}
