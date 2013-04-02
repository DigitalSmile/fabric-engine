package ru.digitalsmile.panels;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MainPanel extends JPanel {

	public MainPanel() {
		super();
		init();
	}

	private void init() {
		// Add a label and a button
		add(new JLabel("Hello, world!"));
		add(new JButton("Press me!"));
	}
}
