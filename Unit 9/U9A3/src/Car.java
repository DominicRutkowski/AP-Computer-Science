// Dominic Rutkowski
//
/* The Car class is a type of Vehicle.
   It can be painted on a JFrame with
   a driver class.
*/

import java.awt.Color;
import java.awt.Graphics;

public class Car extends Vehicle
{
	public Car(int initX, int initY)
	{
		super(initX, initY);
	}

	public void draw(Graphics g)
	{
		g.setColor(Color.RED);
		int x = super.getInitX();
		int y = super.getInitY();
		g.drawRect(x + 20, y, 60, 15);
		g.drawRect(x, y + 15, 100, 25);
		g.drawOval(x + 8, y + 40, 15, 15);
		g.drawOval(x + 77, y + 40, 15, 15);
	}
}