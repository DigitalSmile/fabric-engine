package ru.digitalsmile.fabric_engine.core.structure.production;

import java.util.List;

public class Workshop {
	private final List<Site> sites;

	public Workshop(List<Site> sites) {
		this.sites = sites;
	}

	public List<Site> getSites() {
		return sites;
	}
}
