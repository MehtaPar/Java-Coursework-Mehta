// Caboose.java 
// Train case study, Stage #5
// AUTHOR: PARAM MEHTA 

import java.awt.*;


public class Caboose extends TrainCar
{
	public Caboose(Color cc, int xP, int yP)
	{
		super(cc,xP,yP);
	}

	public void drawCar(Graphics g)
	{
		super.drawCar(g);
		drawWindows(g);
		drawTop(g);
	}

	private void drawWindows(Graphics g)
	{
	    g.setColor(Color.white);
	    g.fillRect(xPos+30,yPos+30,30,30);
	    g.fillRect(xPos+90,yPos+30,30,30);
	}

	private void drawTop(Graphics g)
	{
	    g.setColor(carColor);
	    g.fillRect(xPos+30,yPos-30,90,30);
	    g.setColor(Color.black);
	    g.fillRect(xPos+25,yPos-30,100,5);
	}
}

