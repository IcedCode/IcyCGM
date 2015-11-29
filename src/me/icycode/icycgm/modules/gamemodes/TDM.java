package me.icycode.icycgm.modules.gamemodes;

import me.icycode.icycgm.Main;

public class TDM implements Gamemode {

	

	@Override
	public String getName() {
		return "Team Death Match";
	}

	@Override
	public void setAsActiveGamemode() {
		Main.activeGamemode = GamemodeType.TDM;
	}

	@Override
	public String getDescrption() {
		return "10 minutes to be the team with the most points";
	}

}
