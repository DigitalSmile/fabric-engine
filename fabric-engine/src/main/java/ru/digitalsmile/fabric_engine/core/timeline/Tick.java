package ru.digitalsmile.fabric_engine.core.timeline;

public enum Tick {
	HOUR(1), SHIFT(8), DOUBLE_SHIFT(16), TRIPLE_SHIFT(24), WEEK(168);

	private final int hours;

	private Tick(int hours) {
		this.hours = hours;
	}

	public int getHours() {
		return hours;
	}
}
