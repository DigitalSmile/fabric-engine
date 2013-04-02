package ru.digitalsmile.application;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

import ru.digitalsmile.fabric_engine.core.Fabric;
import ru.digitalsmile.fabric_engine.core.timeline.Tick;
import ru.digitalsmile.panels.MainPanel;
import ru.digitalsmile.panels.TopPanel;

public class MainWindow implements Runnable {

	public static final Fabric fabric = new Fabric(Tick.SHIFT);

	private final MainPanel mainPanel = new MainPanel();
	private final TopPanel topPanel = new TopPanel(new FlowLayout(
			FlowLayout.RIGHT));

	public void run() {
		// Create the window
		JFrame f = new JFrame("Fabric test ui");
		// Sets the behavior for when the window is closed
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600, 300);
		f.setLocationRelativeTo(null);

		f.add(mainPanel, BorderLayout.CENTER);

		JMenuBar menubar = new JMenuBar();
		JMenu file = new JMenu("Application");
		file.setMnemonic(KeyEvent.VK_F);
		JMenuItem eMenuItem = new JMenuItem("Exit");
		eMenuItem.setMnemonic(KeyEvent.VK_C);
		eMenuItem.setToolTipText("Exit application");
		eMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}

		});

		file.add(eMenuItem);

		menubar.add(file);

		f.setJMenuBar(menubar);

		f.add(topPanel, BorderLayout.NORTH);

		// By default, the window is not visible. Make it visible.
		f.setVisible(true);
	}

	public static void main(String[] args) {
		MainWindow se = new MainWindow();
		// Schedules the application to be run at the correct time in the event
		// queue.
		SwingUtilities.invokeLater(se);
	}

}