package ru.digitalsmile.fabric_engine.core;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ru.digitalsmile.fabric_engine.core.structure.operations.Workflow;
import ru.digitalsmile.fabric_engine.core.structure.production.Production;
import ru.digitalsmile.fabric_engine.core.timeline.Tick;
import ru.digitalsmile.fabric_engine.core.timeline.Timeline;
import ru.digitalsmile.fabric_engine.core.timeline.Turn;

public class Fabric implements IFabric {

	private static Logger logger = LogManager.getLogger(Fabric.class.getName());

	private static Fabric instance;

	public static Fabric get() {
		if (instance == null) {
			logger.fatal("Fabric did not initialized.");
			throw new RuntimeException();
		}
		return instance;
	}

	private final Timeline timeline;
	private final Turn turn;
	private final Map<Production, Workflow> productions = new HashMap<Production, Workflow>();

	public Fabric(Tick tick) {
		this.timeline = new Timeline(tick);
		this.turn = new Turn();
	}

	public Timeline getTimeline() {
		return timeline;
	}

	public Turn getTurn() {
		return turn;
	}

	public Map<Production, Workflow> getProductions() {
		return productions;
	}
}
