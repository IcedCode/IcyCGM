package me.icycode.icycgm.commands;

import me.icycode.icycgm.utils.Messages;

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
		
		Messages.JOINTEAM.send(player);
		
		return false;
	}

}
