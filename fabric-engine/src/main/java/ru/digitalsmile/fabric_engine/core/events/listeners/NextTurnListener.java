package ru.digitalsmile.fabric_engine.core.events.listeners;

import ru.digitalsmile.fabric_engine.core.Fabric;

public class NextTurnListener implements EventListener {

	private final Class<NextTurnEvent> type = NextTurnEvent.class;

	private final Fabric fabric;

	public NextTurnListener(Fabric fabric) {
		this.fabric = fabric;
	}

	public boolean canFire(Class<?> type) {
		return this.type.equals(type);
	}

	public void fire(Event event) {

	}
}
