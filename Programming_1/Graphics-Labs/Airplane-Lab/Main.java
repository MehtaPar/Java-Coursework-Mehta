import java.applet.Applet;
import java.awt.*;
import java.util.Scanner;


public class Main extends Applet{

	public void paint(Graphics g){
		super.setSize(1000,700);
		g.drawString("PLANE TYPE= ", 25, 25);
		Jet p = new Jet(50,"JET", 5);
		Pilot Tom = new Pilot(52, "Tom Jerry");
		p.drawJet(g);
		Tom.drawPilot(g);		
		
		//System.out.println("Plane Name: " + p.name);
	}

	/*
	private String get(String n) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type Pilot's Name: ");
		String n1 = input.toString();
		return n1;
	}
	*/

}
