// TrainCar.java
// Train case study, Stage #5
// AUTHOR: PARAM MEHTA 


import java.awt.*;


public class TrainCar
{
	protected Color carColor;
	protected int xPos;
	protected int yPos;

	public TrainCar(Color cC, int xP, int yP)
	{
		carColor = cC;
		xPos = xP;
		yPos = yP;
	}

	public void drawCar(Graphics g)
	{
		g.setColor(carColor);
		g.fillRect(xPos,yPos,150,100);
		g.setColor(Color.black);
		g.fillOval(xPos+5,yPos+75,50,50);
		g.fillOval(xPos+95,yPos+75,50,50);
	}
}

