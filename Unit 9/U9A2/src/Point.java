// Dominic Rutkowski
//
/*
*/

import java.awt.Color;
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

	public void decremendY()
	{
		y -= INCREMENT;
	}

	public void draw(Graphics g)
	{
		g.setColor(Color.GREEN);
		g.drawString("*", x, y);
	}
}