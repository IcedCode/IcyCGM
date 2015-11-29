package me.icycode.icycgm.modules.gamemodes;

import me.icycode.icycgm.Main;

public class CTF implements Gamemode{

	@Override
	public String getName() {
		return "Capture The Flag";
	}

	@Override
	public void setAsActiveGamemode() {
		Main.activeGamemode = GamemodeType.CTF;		
	}

	@Override
	public String getDescrption() {
		return "Capture the enemy's falg and return it to your base";
	}

}
