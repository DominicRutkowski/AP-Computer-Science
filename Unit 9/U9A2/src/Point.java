// Dominic Rutkowski
//
/* This class represents a Point on a
   JApplet. It can be printed in green.
*/

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Point
{
	private static final int INCREMENT = 10;
	private int x;
	private int y;

	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public void incrementX()
	{
		x += INCREMENT;
	}

	public void incrementY()
	{
		y += INCREMENT;
	}

	public void decrementX()
	{
		x -= INCREMENT;
	}

	public void decrementY()
	{
		y -= INCREMENT;
	}

	public void draw(Graphics g)
	{
		g.setColor(Color.GREEN);
		g.setFont(new Font("Monospaced", Font.BOLD, 16));
		g.drawString("*", x, y);
	}
}