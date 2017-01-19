package net.necrocore.main.utils;

import java.util.HashMap;

import net.necrocore.main.HyperialCore;

import org.bukkit.event.Listener;

public class HashMapStorage implements Listener{
	
	@SuppressWarnings("unused")
	private HyperialCore plugin;
	public HashMapStorage(HyperialCore listener) {
		plugin = listener;		
	}
	
	public static HashMap<String, Integer> PlayerCount = new HashMap<String, Integer>();
}
