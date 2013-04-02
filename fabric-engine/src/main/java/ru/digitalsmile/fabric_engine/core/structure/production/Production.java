package ru.digitalsmile.fabric_engine.core.structure.production;

import java.util.List;

public class Production {
	private final List<Workshop> workshops;

	public Production(List<Workshop> workshops) {
		this.workshops = workshops;
	}

	public List<Workshop> getWorkshops() {
		return workshops;
	}
}
