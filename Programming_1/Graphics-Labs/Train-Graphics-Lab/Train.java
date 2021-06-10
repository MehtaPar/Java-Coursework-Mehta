// Train.java 
// Train case study, Stage #5
// AUTHOR: PARAM MEHTA 


import java.awt.*;


public class Train
{
	private Locomotive loc;
	private TrainCar tc1;
	private TrainCar tc2;
	private TrainCar tc3;
	private Caboose cab;
	private int tlX;
	private int tlY;

	public Train(int tlX, int tlY)
	{
		this.tlX = tlX;
		this.tlY = tlY;
		loc = new Locomotive(Color.red,tlX,tlY);
		tc1 = new TrainCar(Color.green,tlX+160,tlY);
		tc2 = new TrainCar(Color.yellow,tlX+320,tlY);
		tc3 = new TrainCar(Color.magenta,tlX+480,tlY);
		cab = new Caboose(Color.blue,tlX+640,tlY);
	}

	public void drawTrain(Graphics g)
	{
		loc.drawCar(g);
		tc1.drawCar(g);
		tc2.drawCar(g);
		tc3.drawCar(g);
		cab.drawCar(g);
	}
}

