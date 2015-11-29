package me.icycode.icycgm.commands;

import net.md_5.bungee.api.ChatColor;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class JoinCmd implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		
		if(!(sender instanceof Player)) {
			//Not a player
			return false;
		}
		
		Player player = (Player) sender;
		
		//Todo: Checks for whether player is in game or can join.
		
		player.sendMessage(ChatColor.DARK_GRAY + "You have joined " + ChatColor.YELLOW + "TEAM" + ChatColor.DARK_GRAY + ".");
		
		return false;
	}

}
