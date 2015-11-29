package me.icycode.icycgm.utils.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class MatchStartEvent extends Event {
	
	public MatchStartEvent() {
		
	}

    private static final HandlerList handlers = new HandlerList();
	
	public HandlerList getHandlers() {
        return handlers;
    }
     
    public static HandlerList getHandlerList() {
        return handlers;
    }

}
