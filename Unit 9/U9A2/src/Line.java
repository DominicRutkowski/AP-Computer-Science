// Dominic Rutkowski
//
/* This class extends the Point class into
   a Line by including a length instance field.
*/

import java.awt.Graphics;

public class Line extends Point
{
	private int length;

	public Line(int x, int y, int length)
	{
		super(x, y);
		this.length = length;
	}

	public void draw(Graphics g)
	{
		for (int i = 0; i < length; i++)
		{
			super.draw(g);
			incrementX();
		}
		for (int i = 0; i < length; i++)
		{
			decrementX();
		}
	}
}