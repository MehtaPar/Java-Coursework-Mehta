import java.awt.*;
import java.util.Scanner;


public class Pilot {
	private int age;
	private String name;
	
	public Pilot (int a, String n){
		age = a;
		name = n;
	}

	
	/*
	public void name() { 
		Scanner input = new Scanner(System.in);
		System.out.println("Type Pilot's Name Below: ");
		//setName(input.toString());
		String n = input.toString();
		
	
	}
	
	*/
	public void drawPilot(Graphics g){
		
		/*
		g.setColor(Color.BLUE);
		g.drawString("PILOT:", 350, 100);
		g.setColor(Color.BLACK);
		g.drawString(name, 400, 100);
		*/
		
		g.setColor(Color.RED);
		g.drawLine(425,250,425,200);
		g.drawLine(400, 237, 450, 237);
		g.setColor(Color.YELLOW);
		g.fillOval(412, 200, 25, 25);
		g.setColor(Color.BLACK);
		g.drawOval(412, 200, 25, 25);
	}
	
}
