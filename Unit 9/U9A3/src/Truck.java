// Dominic Rutkowski
//
/*
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
	}
}