// Java1211.java 
// Train case study, Stage #5
// This program concludes by adding the <Train> class
// A train has train cars.  The first train car is the locomotive.
// The last train car is the Caboose.
// This program now combines inheritance with composition.
// AUTHOR: PARAM MEHTA 

import java.awt.*;
import java.applet.*;


public class Java1211 extends Applet
{
	public void paint(Graphics g)
	{
		Train t = new Train(55,250);
		t.drawTrain(g);
	}
}


