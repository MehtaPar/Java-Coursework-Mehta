//AUTHOR: PARAM MEHTA

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

public class Jet extends Plane {
	private String name;
	private int turboLevel;
	
	public Jet(int capacity, String n, int externalTurbo) {

		super(capacity);
		turboLevel = externalTurbo;
		capacity = 10;
		name = n;
		

	}

	public void drawJet(Graphics g) {
		super.drawPlane(g);
		drawTurbo(g);
		drawName(g, name);
	}
	
	private void drawTurbo(Graphics g) {
		
		g.setColor(Color.BLACK);
		g.drawOval(900,175,50,50);
		
		g.setColor(Color.RED);
		g.fillOval(900, 175, 50, 50);
		
		g.setColor(Color.YELLOW);
		g.fillOval(900, 175, 40, 50);
		
		
		g.setColor(Color.BLUE);
		g.fillOval(900, 175, 25, 50);
		

		g.setColor(Color.BLACK);
		g.fillRect(900, 175, 20, 50);
		

	}
	
	private void drawName(Graphics g, String n) {
		g.drawString(n ,120, 25);
	}
	
}
