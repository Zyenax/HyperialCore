package net.necrocore.main.Commands;

import net.necrocore.main.HyperialCore;
import net.necrocore.main.utils.Utils;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class AntiReloadCommand implements Listener {
	
	@SuppressWarnings("unused")
	private HyperialCore plugin;

	public AntiReloadCommand(HyperialCore hub) {
		this.plugin = hub;
	}
	
	@EventHandler
    public void onPlayerCommand(PlayerCommandPreprocessEvent e) {
            if (e.getMessage().startsWith("/reload")) {
                    e.getPlayer().sendMessage(Utils.color(HyperialCore.name + " &eSorry this command is blocked globally as it breaks things!"));
                    e.setCancelled(true);
            }
    }

}
