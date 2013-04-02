package ru.digitalsmile.fabric_engine.core.structure.production;

import java.util.ArrayList;
import java.util.List;

import ru.digitalsmile.fabric_engine.core.labour.operative.Operative;
import ru.digitalsmile.fabric_engine.core.machine.Machine;
import ru.digitalsmile.fabric_engine.core.structure.operations.OperationType;

public class Station {
	private final List<Operative> operatives;
	private final Machine machine;

	// private double width;
	// private double height;
	// private double length;

	public Station(List<Operative> operatives, Machine machine) {
		OperationType type = machine.getType();
		for (Operative op : operatives) {
			if (!op.getQualification().containsKey(type)) {
				throw new IllegalArgumentException(
						"Operative has no qualification for machines' type "
								+ type);
			}
		}
		this.machine = machine;
		this.operatives = operatives;
	}

	public Station(Operative operative, Machine machine) {
		OperationType type = machine.getType();
		if (!operative.getQualification().containsKey(type)) {
			throw new IllegalArgumentException(
					"Operative has no qualification for machines' type " + type);
		}

		this.machine = machine;
		this.operatives = new ArrayList<Operative>();
		this.operatives.add(operative);
	}

	public List<Operative> getOperatives() {
		return operatives;
	}

	public Machine getMachine() {
		return machine;
	}
}
