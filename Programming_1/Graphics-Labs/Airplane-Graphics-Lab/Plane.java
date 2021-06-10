import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

class Plane {
	protected int Capacity;
	
	public Plane(int c){
		Capacity = c;
	}


	public void drawPlane(Graphics g){	
		//Fill back wing
		g.setColor(Color.GRAY);
		Polygon bWing = new Polygon();
		bWing.addPoint(850,175);
		bWing.addPoint(850, 125);
		bWing.addPoint(900, 175);
		g.fillPolygon(bWing);
		
		//Fill Gray
		g.setColor(Color.BLACK);
		Polygon plane = new Polygon();
		plane.addPoint(325, 250);
		plane.addPoint(400, 175);
		plane.addPoint(900, 175);
		plane.addPoint(900, 225);
		plane.addPoint(875, 225);
		plane.addPoint(850, 250);
		plane.addPoint(800, 250);
		plane.addPoint(775, 275);
		plane.addPoint(325, 275);
		g.fillPolygon(plane);
		
		//Fill right wing
		g.setColor(Color.GRAY);
		Polygon wingR = new Polygon();
		wingR.addPoint(475, 175);
		wingR.addPoint(650, 125);
		wingR.addPoint(600, 175);
		g.fillPolygon(wingR);
		

		
		
		g.setColor(Color.GRAY);
		g.fillRect(400,175, 375,100);
		g.fillRect(800, 175, 50, 75);
		g.fillRect(875,175,25,50);
		//g.fillPolygon(xPoints, yPoints, nPoints);
		
		//Side Rect
		g.setColor(Color.gray);
		g.fillRect(475, 215, 100, 15);
		g.setColor(Color.black);
		g.drawLine(475, 225, 750, 375);
		g.drawLine(575, 225, 750, 375);
		
		g.setColor(Color.BLACK);
		g.drawLine(325,250,400,175);
		g.drawLine(325,250,325,275);
		g.drawLine(400, 200, 350, 250);
		g.drawLine(400, 200, 450, 200);
		g.drawLine(450, 200, 450, 250);
		g.drawLine(350,250,450,250);
		g.drawLine(400, 175, 900, 175);
		g.drawLine(850,175,850,125);
		g.drawLine(850,125,900, 175);
		
		//Right Wing
		g.drawLine(475,175,650,125);
		g.drawLine(650, 125, 600, 175);
		
		
		g.drawString("UNITED AIRLINES", 625, 225);
		
		//FRONT ARC
		g.setColor(Color.GRAY);
		g.fillArc(317, 250, 15, 25, 90, 180);
		//g.fillArc(x, y, width, height, startAngle, arcAngle);
		
		g.setColor(Color.BLACK);
		g.drawLine(875, 225, 900, 225);
		g.drawLine(325, 275, 775, 275);
		g.drawLine(775, 275, 800, 250);
		g.drawLine(800,250,850,250);
		g.drawLine(850, 250, 875, 225);
		g.drawLine(900, 225, 900, 175);
		
		//Fill Rect
		g.fillRect(475, 215, 100, 15);
		g.drawLine(475, 225, 750, 375);
		g.drawLine(575, 225, 750, 375);
		
		//Fill left wing
		g.setColor(Color.gray);
		Polygon wingL = new Polygon();
		wingL.addPoint(475, 225);
		wingL.addPoint(750, 375);
		wingL.addPoint(575, 225);
		g.fillPolygon(wingL);

	}
}
