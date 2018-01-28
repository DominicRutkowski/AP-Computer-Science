// Dominic Rutkowski
//
/* The Unit3TestProject application below uses
   the Postage class to determine the cost of
   postage based on the user's method of shipping
   and the weight of the package being shipped.
*/

import java.applet.Applet;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class U3Test extends Applet
{
	// Instance field (global scope)
	private Postage post;
	
	// init() method as required by applets
	public void init()
	{
		String input = JOptionPane.showInputDialog("Enter Postage Type & ounces, separated by a space:");
		post = new Postage(input);
		setBackground(Color.yellow);
	}
	
	// paint() method to draw results to the applet
	public void paint(Graphics g)
	{
		g.setColor(Color.darkGray);
		g.setFont(new Font("Monospaced", Font.BOLD, 16));
		
		g.drawString("Cost to mail this item =", 50, 50);
		String result = String.format("  $ %.2f", post.calculate());
		g.drawString(result, 50, 70);
	}
}