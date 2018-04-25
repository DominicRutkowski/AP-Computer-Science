// Dominic Rutkowski
//
/* This driver class draws ten random
   Vehicles in random places on a JFrame.
*/

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class U9A3 extends JFrame
{
	private ArrayList<Vehicle> list = new ArrayList<Vehicle>();

	private U9A3()
	{
		super("Unit 9 Assignment 3");
		Random random = new Random();
		for (int i = 0; i < 10; i++)
		{
			if (random.nextBoolean())
			{
				int x = random.nextInt(400);
				int y = random.nextInt(445);
				list.add(new Car(x, y));
			}
			else
			{
				int x = random.nextInt(300);
				int y = random.nextInt(395);
				list.add(new Truck(x, y));
			}
		}
		getContentPane().setBackground(Color.YELLOW);
		setSize(500, 500);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		for (Vehicle vehicle : list)
		{
			vehicle.draw(g);
		}
	}

	public static void main(String[] args)
	{
		U9A3 app = new U9A3();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}