package ru.digitalsmile.fabric_engine.core.events;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EventBus {
	private static Logger logger = LogManager.getLogger(EventBus.class
			.getName());

	private final List<EventHandler> registeredListeners = new ArrayList<EventHandler>();

	public void register(Object obj) {
		Class<?> classType = obj.getClass();
		for (Class<?> interfaze : classType.getInterfaces()) {
			if (interfaze.getSuperclass() != null
					&& interfaze.getSuperclass().equals(EventHandler.class)) {
				registeredListeners.add((EventHandler) obj);
			}
		}
	}

	public void fire(Event event) {
		Class<?> classType = event.getClass();
		classType.get
	}

	public void addEvent(final Class<?> classType, final IOnFire onFire) {
		EventListener eventListener = new EventListener() {

			public void fire(Event event) {
				onFire.onFire(event);
			}

			public boolean canFire(Class<?> type) {
				return classType.equals(type);
			}
		};
		if (registeredListeners.contains(eventListener)) {
			logger.warn("The event" + eventListener.toString()
					+ "has already exists!");
			return;
		}
		registeredListeners.add(eventListener);
		logger.debug("The event" + eventListener.toString() + "has been added.");

	}

	public void fire(Event event) {
		for (EventListener listener : registeredListeners) {
			if (listener.canFire(event.getType())) {
				listener.fire(event);
				logger.debug("The event" + event.toString()
						+ "has been fired for listener " + listener.toString()
						+ ".");
			}
		}
	}
}
