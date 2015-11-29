package me.icycode.icycgm.listeners;

import me.icycode.icycgm.Main;
import me.icycode.icycgm.match.GameState;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeath implements Listener{
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent event) {
		Player player = event.getEntity();
		
		if (Main.gameState.equals(GameState.IN_LOBBY) || Main.gameState.equals(GameState.STARTING) || Main.gameState.equals(GameState.COUNTDOWN)) {
			player.setHealth(20);
			player.setFoodLevel(20);
		}
	}
	
}
