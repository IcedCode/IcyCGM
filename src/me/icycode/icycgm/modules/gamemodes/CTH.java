package me.icycode.icycgm.modules.gamemodes;

import me.icycode.icycgm.Main;

public class CTH implements Gamemode{

	@Override
	public String getName() {
		return "Capture The Hill";
	}

	@Override
	public void setAsActiveGamemode() {
		Main.activeGamemode = GamemodeType.CTH;
	}

	@Override
	public String getDescrption() {
		return "Get points by controlling the centre hill and killing players!";
	}

}
