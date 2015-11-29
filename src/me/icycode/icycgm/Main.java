package me.icycode.icycgm;

import me.icycode.icycgm.commands.JoinCmd;
import me.icycode.icycgm.listeners.EntityDamageByEntity;
import me.icycode.icycgm.listeners.PlayerDeath;
import me.icycode.icycgm.listeners.PlayerInteract;
import me.icycode.icycgm.listeners.PlayerJoin;
import me.icycode.icycgm.listeners.PlayerPickupItem;
import me.icycode.icycgm.listeners.PlayerQuit;
import me.icycode.icycgm.listeners.ServerListener;
import me.icycode.icycgm.match.GameState;
import me.icycode.icycgm.modules.gamemodes.GamemodeType;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public static GamemodeType activeGamemode;
	public static GameState gameState;
	
	@Override
	public void onEnable() {
		registerListeners();
		
		getCommand("join").setExecutor(new JoinCmd());
		
		gameState = GameState.IN_LOBBY;
		
	}
	
	
    private void registerListeners() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new EntityDamageByEntity(), this);
        pm.registerEvents(new PlayerDeath(), this);
        pm.registerEvents(new PlayerInteract(), this);
        pm.registerEvents(new PlayerJoin(), this);
        pm.registerEvents(new PlayerPickupItem(), this);
        pm.registerEvents(new PlayerQuit(), this);

        pm.registerEvents(new ServerListener(), this);
    }
	
}
