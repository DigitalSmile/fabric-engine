package ru.digitalsmile.fabric_engine.core.structure.operations;

import java.util.LinkedList;

public class Workflow {
	private final LinkedList<Operation> operations;

	public Workflow(LinkedList<Operation> operations) {
		this.operations = operations;
	}

	public void addOperation(Operation operation) {
		operations.add(operation);
	}

	public LinkedList<Operation> getOperations() {
		return operations;
	}
}
