package ru.digitalsmile.fabric_engine.core.structure.production;

import java.util.List;

public class Site {
	private final List<Station> stations;

	public Site(List<Station> stations) {
		this.stations = stations;
	}

	public List<Station> getStations() {
		return stations;
	}

}
