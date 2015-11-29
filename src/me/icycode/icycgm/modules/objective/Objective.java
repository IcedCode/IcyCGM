package me.icycode.icycgm.modules.objective;

import lombok.Getter;

public class Objective {
	
	@Getter private ObjectiveType type;
	
	public Objective(ObjectiveType type) {
		this.type = type;
	}
	
}
