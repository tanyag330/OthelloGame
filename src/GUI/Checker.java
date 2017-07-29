package GUI;

import java.awt.Color;
import java.awt.Graphics;

public final class Checker {
	private final static int DIMENSION = 50;

	private CheckerType checkerType;

	public Checker(CheckerType checkerType) {
		this.checkerType = checkerType;
	}

	public void draw(Graphics g, int cx, int cy) {
		int x = cx - DIMENSION / 2;
		int y = cy - DIMENSION / 2;

		// Set checker color.
		g.setColor(checkerType == CheckerType.GREEN ? Color.GREEN : Color.RED);

		// Paint checker.
		g.fillOval(x, y, DIMENSION, DIMENSION);
		g.setColor(Color.WHITE);
		g.drawOval(x, y, DIMENSION, DIMENSION);
	}

	public void drawHint(Graphics g, int cx, int cy) {
		int x = cx - DIMENSION / 2;
		int y = cy - DIMENSION / 2;

		// Set checker color.
		g.setColor(checkerType == CheckerType.GREEN_HINT ? Color.BLUE : Color.CYAN);

		// Paint checker.
		g.fillOval(x, y, DIMENSION, DIMENSION);
		g.setColor(Color.WHITE);
		g.drawOval(x, y, DIMENSION, DIMENSION);
	}
	
	public static boolean contains(int x, int y, int cx, int cy) {
		return (cx - x) * (cx - x) + (cy - y) * (cy - y) < DIMENSION / 2 * DIMENSION / 2;
	}

	
	public static int getDimension() {
		return DIMENSION;
	}
	public CheckerType getCheckerType() {
		return checkerType;
	}
}