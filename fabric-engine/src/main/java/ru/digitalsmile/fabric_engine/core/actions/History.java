package ru.digitalsmile.fabric_engine.core.actions;

import java.util.LinkedHashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ru.digitalsmile.fabric_engine.core.timeline.Turn;

public class History {

	private static final int MAX_HISTORY_RECORDS = 3;

	private static Logger logger = LogManager
			.getLogger(History.class.getName());

	private final LinkedHashMap<Turn, IAction> historyRecords = new LinkedHashMap<Turn, IAction>();
	private static History history;

	public static History get() {
		if (history == null) {
			logger.fatal("Attempting to use null history!");
			throw new RuntimeException();
		}
		return history;
	}

}
