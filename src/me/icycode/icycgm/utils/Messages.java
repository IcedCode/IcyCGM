package me.icycode.icycgm.utils;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public enum Messages {
	
	GAMESTART("The game has started!"),
	JOINTEAM("You have joined ");
	
    private String message = "";

    Messages(String message) {
        this.message = Utils.color(message);
    }

    public String toString() {
        return message;
    }

    public String toString(Object... parts) {
        return String.format(message, parts);
    }

    public void send(Player player) {
        player.sendMessage(message);
    }

    public void send(CommandSender sender) {
        sender.sendMessage(message);
    }

    public void send(Player player, String replacement) {
        player.sendMessage(message.replace("%s", replacement));
    }

    public void send(Player player, Object... replacements) {
        player.sendMessage(String.format(message, replacements));
    }

    public void broadcast() {
        Bukkit.broadcastMessage(message);
    }

    public void broadcast(String replacement) {
        Bukkit.broadcastMessage(message.replace("%s", replacement));
    }

    public void broadcast(Object... replacements) {
        Bukkit.broadcastMessage(String.format(message, replacements));
    }
}
