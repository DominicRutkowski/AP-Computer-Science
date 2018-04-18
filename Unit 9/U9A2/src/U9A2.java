// Dominic Rutkowski
//
/* This class draws three rectangles to
   a JApplet and demonstrates the inheritance
   of Rectangles from Lines from Points.
*/

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

public class U9A2 extends JApplet
{
	public void init()
	{
		getContentPane().setBackground(Color.YELLOW);
		setSize(400, 400);
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		new Rectangle(25, 30, 10, 5).draw(g);
		new Rectangle(75, 100, 15, 3).draw(g);
		new Rectangle(50, 200, 8, 12).draw(g);
	}
}