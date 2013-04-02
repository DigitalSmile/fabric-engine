package ru.digitalsmile.fabric_engine.core.timeline;

import java.util.LinkedList;

import ru.digitalsmile.fabric_engine.core.actions.IAction;
import ru.digitalsmile.fabric_engine.core.actions.IEqual;
import ru.digitalsmile.fabric_engine.core.events.EventBus;

public class Turn {
	private final LinkedList<IAction> actions = new LinkedList<IAction>();

	public Turn(EventBus eventBus) {
		eventBus.register(this);
	}

	public void addAction(IAction action) {
		actions.add(action);
	}

	public void deleteAction(IAction action) {
		actions.remove(actions);
	}

	public IAction getAction(int index) {
		return actions.get(index);
	}

	public void execute() {
		for (IAction action : actions) {
			action.execute();
		}
	}

	public void undo(int toActionIndex) {
		while (actions.size() != toActionIndex + 1) {
			actions.removeLast().undo();
		}
	}

	public int findAction(IEqual<IAction> equility) {
		for (IAction action : actions) {
			if (equility.equal(action)) {
				return actions.indexOf(action);
			}
		}
		return -1;
	}

	public void nextTurn() {
		// TODO: move to history
		actions.clear();
	}
}
