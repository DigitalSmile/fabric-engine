package ru.digitalsmile.fabric_engine.core.structure.operations;

import ru.digitalsmile.fabric_engine.core.machine.Machine;

public class Operation {
	private final String name;
	private final String description;
	private final OperationType type;
	private final Machine machine;

	private final double operationTime;

	private final double cummulativeTime;

	public Operation(String name, String description, OperationType type,
			Machine machine, double operationTime, double previousTime) {
		this.name = name;
		this.description = description;
		this.type = type;
		this.machine = machine;
		this.operationTime = operationTime;
		this.cummulativeTime = operationTime + previousTime;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public OperationType getType() {
		return type;
	}

	public Machine getMachine() {
		return machine;
	}

	public double getOperationTime() {
		return operationTime;
	}

	public double getCummulativeTime() {
		return cummulativeTime;
	}

}
