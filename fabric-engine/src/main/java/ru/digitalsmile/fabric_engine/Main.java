package ru.digitalsmile.fabric_engine;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	private static Logger logger = LogManager.getLogger(Main.class.getName());

	private static int result;

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("hello!");
		// Timeline timeline = new Timeline(Tick.SHIFT);
		// Turn turn = new Turn();
		// while (true) {
		// System.out.print("Command: ");
		// InputStreamReader in = new InputStreamReader(System.in);
		// BufferedReader keyboard = new BufferedReader(in);
		// final String s = keyboard.readLine();
		// if (s.equals("q")) {
		// System.out.println("quitting");
		// break;
		// } else if (s.substring(0, 1).equals("a")) {
		// turn.getExecutor().addAction(new IAction() {
		//
		// public void execute() {
		// result += Integer.valueOf(s.substring(1, s.length()));
		// }
		//
		// public void undo() {
		// result -= Integer.valueOf(s.substring(1, s.length()));
		// }
		// });
		// } else if (s.equals("n")) {
		// System.out.print("Execute actions for tick "
		// + timeline.getCalculatedTicks() + ": ");
		// turn.getExecutor().execute();
		// System.out.println();
		// System.out.println("Calc ticks: " + timeline.increaseTicks());
		// System.out.println("Hours passed: "
		// + timeline.getCalculatedTicks()
		// * timeline.getTickType().getHours());
		// // turn = new Turn1();
		// }
		// }
	}
}
