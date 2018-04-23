// Dominic Rutkowski
//
/*
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
	}
}