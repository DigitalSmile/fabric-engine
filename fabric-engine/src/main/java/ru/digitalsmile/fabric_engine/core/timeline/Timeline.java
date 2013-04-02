package ru.digitalsmile.fabric_engine.core.timeline;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Timeline {
	private static Logger logger = LogManager.getLogger(Timeline.class
			.getName());

	private long calculatedTics = 0;
	private final Tick tick;

	public Timeline(Tick tick) {
		this.tick = tick;
		logger.debug("Timeline created with tick type " + tick.name());
	}

	public long increaseTicks() {
		logger.debug("Tick increased. Previous: " + calculatedTics + ". Next: "
				+ calculatedTics + 1);
		calculatedTics++;

		return calculatedTics;
	}

	public long getCalculatedTicks() {
		return calculatedTics;
	}

	public Tick getTickType() {
		return tick;
	}

	public long reverseToTick(long tick) {
		logger.debug("Ticks reversed. Previous: " + calculatedTics + ". Next: "
				+ tick + ". Tick type: " + this.tick);
		this.calculatedTics = tick;
		return calculatedTics;
	}

}
