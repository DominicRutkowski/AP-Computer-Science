// Dominic Rutkowski
//
/*
*/

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

public class U9A3 extends JFrame
{
	private U9A3()
	{


		setSize(500, 500);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		super.paint(g);
	}

	public static void main(String[] args)
	{
		U9A3 app = new U9A3();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}