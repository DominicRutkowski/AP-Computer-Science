// Dominic Rutkowski
//
/*
*/

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class U9A3 extends JFrame
{
	private U9A3()
	{
		super("Unit 9 Assignment 3");
		getContentPane().setBackground(Color.YELLOW);
		setSize(500, 500);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		for (int i = 0; i < 10; i++)
		{

		}
		new Car(100, 100).draw(g);
	}

	public static void main(String[] args)
	{
		U9A3 app = new U9A3();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}