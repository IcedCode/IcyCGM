package me.icycode.icycgm.listeners;

import me.icycode.icycgm.Main;
import me.icycode.icycgm.match.GameState;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class EntityDamageByEntity implements Listener{
	
	@EventHandler
	public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
		
		if(!(event.getEntity() instanceof Player)) {
	        // Victim is not a player
	        return;
	    }
		
		if(!(Main.gameState.equals(GameState.IN_GAME))) {
			event.setCancelled(true);
			Player player = (Player) event.getEntity();
			player.setHealth(20);
			return;
		}
		
	    Player victim = (Player) event.getEntity();
	 
	    Player attacker = null;
	 
	    if(event.getDamager() instanceof Player) {
	        attacker = (Player) event.getDamager();
	    } else if(event.getDamager() instanceof Arrow) {
	        Arrow arrow = (Arrow) event.getDamager();
	        if(!(arrow.getShooter() instanceof Player)) {
	            return;
	        }
	        attacker = (Player) arrow.getShooter();
	    } else if(event.getDamager() instanceof ThrownPotion) {
	        return;
	    }
	    
	    if(attacker == null) {
	        return;
	    }
	    

	    
	    /*Team check (from orbit)
	    if(TeamManager.team1.contains(attacker) && TeamManager.team1.contains(victim)) {
	        e.setCancelled(true);
	    } else if (TeamManager.team2.contains(attacker) && TeamManager.team2.contains(victim)){
	    	e.setCancelled(true);
	    } else if (TeamManager.team3.contains(attacker) && TeamManager.team3.contains(victim)){
	    	e.setCancelled(true);
	    } else if (TeamManager.team4.contains(attacker) && TeamManager.team4.contains(victim)){
	    	e.setCancelled(true);
	    }
	    */
	}
	
}
