// Dominic Rutkowski
//
/*
*/

public class Line extends Point
{
	private int length;

	public Line(int x, int y, int length)
	{
		super(x, y);
		this.length = length;
	}

	public void setLength(int length)
	{
		this.length = length;
	}

	public void draw()
	{
		for (int i = 0; i < length; i++)
		{
			super.draw();
			super.setX(super.getX() + 1);
		}
		for (int i = 0; i < length; i++)
		{
			super.setX(super.getX() - 1);
		}
	}

	public int getLength()
	{
		return length;
	}
}