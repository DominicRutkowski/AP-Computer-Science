// Dominic Rutkowski
//
/* The Rectangle class extends the Line class
   by including a height instance field.
*/

import java.awt.Graphics;

public final class Rectangle extends Line
{
	private int height;

	public Rectangle(int x, int y, int length, int height)
	{
		super(x, y, length);
		this.height = height;
	}

	public void draw(Graphics g)
	{
		for (int i = 0; i < height; i++)
		{
			super.draw(g);
			incrementY();
		}
		for (int i = 0; i < height; i++)
		{
			decrementY();
		}
	}
}