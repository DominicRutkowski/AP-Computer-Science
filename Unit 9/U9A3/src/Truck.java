// Dominic Rutkowski
//
/* The Truck class is a type of Vehicle.
   It can be painted on a JFrame with
   a driver class.
*/

import java.awt.Color;
import java.awt.Graphics;

public class Truck extends Vehicle
{
	public Truck(int initX, int initY)
	{
		super(initX, initY);
	}

	public void draw(Graphics g)
	{
		g.setColor(Color.BLUE);
		int x = super.getInitX();
		int y = super.getInitY();
		g.drawRect(x, y + 30, 50, 60);
		g.drawRect(x + 60, y, 140, 90);
		g.drawOval(x + 10, y + 90, 15, 15);
		g.drawOval(x + 70, y + 90, 15, 15);
		g.drawOval(x + 85, y + 90, 15, 15);
		g.drawOval(x + 170, y + 90, 15, 15);
		g.drawOval(x + 185, y + 90, 15, 15);
	}
}