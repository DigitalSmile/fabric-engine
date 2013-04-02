package ru.digitalsmile.panels;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ru.digitalsmile.fabric_engine.core.Fabric;
import ru.digitalsmile.fabric_engine.core.events.Event;
import ru.digitalsmile.fabric_engine.core.events.EventData;
import ru.digitalsmile.fabric_engine.core.events.EventListener;
import ru.digitalsmile.fabric_engine.core.events.NextTurnEvent;
import ru.digitalsmile.fabric_engine.core.events.TimelineChangeEvent;
import ru.digitalsmile.fabric_engine.core.timeline.Timeline;

@SuppressWarnings("serial")
public class TopPanel extends JPanel {

	private final JLabel turn = new JLabel();
	private final JButton nextTurn = new JButton("Next turn");

	public TopPanel(FlowLayout flowLayout) {
		super(flowLayout);
		init();
	}

	private void init() {
		add(nextTurn);
		add(turn);

		nextTurn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Fabric.get().getEventBus().fire(new NextTurnEvent());
			}
		});

		Fabric.get().getEventBus().addEvent(new EventListener() {

			public void fire(Event event) {
				EventData<Timeline> data = (EventData<Timeline>) event;
				turn.setText("Current tick type: "
						+ data.getData().getTickType() + ". Passed "
						+ data.getData().getCalculatedTicks() + " ticks.");
			}

			public boolean canFire(Class<?> type) {
				return type.equals(TimelineChangeEvent.class);
			}
		});

	}
}
