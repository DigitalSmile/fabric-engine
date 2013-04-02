package ru.digitalsmile.fabric_engine.core.events.listeners;

import ru.digitalsmile.fabric_engine.core.Fabric;
import ru.digitalsmile.fabric_engine.core.timeline.Timeline;

public class TimelineChangeListener implements EventListener {
	private final Class<TimelineChangeEvent> type = TimelineChangeEvent.class;

	private final Fabric fabric;

	public TimelineChangeListener() {
		this.fabric = fabric;
	}

	public boolean canFire(Class<?> type) {
		return this.type.equals(type);
	}

	public void fire(Event event) {
		fabric.getTurn().execute();
		fabric.getTurn().nextTurn();
		fabric.getTimeline().increaseTicks();
		fabric.getEventBus().fire(
				new Event<Timeline>(EventType.NONE, fabric.getTimeline()));
	}
}
