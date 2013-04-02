package ru.digitalsmile.fabric_engine.core;

import java.util.Map;

import ru.digitalsmile.fabric_engine.core.structure.operations.Workflow;
import ru.digitalsmile.fabric_engine.core.structure.production.Production;
import ru.digitalsmile.fabric_engine.core.timeline.Timeline;
import ru.digitalsmile.fabric_engine.core.timeline.Turn;

public interface IFabric {
	Timeline getTimeline();

	Map<Production, Workflow> getProductions();

	Turn getTurn();
}
