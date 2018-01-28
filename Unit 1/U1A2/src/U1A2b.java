// Dominic Rutkowski
//
/* This applet has a yellow background and
   displays the outline of two blue rectangles.
   It then fill the intersection of the two
   blue rectangles in red.
*/

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;
import java.applet.Applet;

public class U1A2b extends Applet
{
	public void init()
	{
		setBackground(Color.yellow);
	}
	
	public void paint(Graphics g)
	{
		// Draws rectangles 1&2 in graphics class
		g.setColor(Color.blue);
		g.drawRect(5, 10, 50, 80);
		g.drawRect(20, 50, 65, 55);
		
		// Creates rectangle 1&2 in rectangle class
		Rectangle one = new Rectangle(5, 10, 50, 80);
		Rectangle two = new Rectangle(20, 50, 65, 55);
		
		// Creates rectangle 3 (intersection of 1&2)
		Rectangle three = one.intersection(two);
		
		// Gets dimensions of rectangle 3
		int x = (int)(three.getX());
		int y = (int)(three.getY());
		int width = (int)(three.getWidth());
		int height = (int)(three.getHeight());
		
		// Fills rectangle 3
		g.setColor(Color.red);
		g.fillRect(x, y, width, height);
	}
}