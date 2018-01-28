// Dominic Rutkowski
//
/* This driver class below lets the user input
   as many binary numbers as they want. It then
   converts the numbers to base ten, averages them,
   and reports all the data.
*/

import javax.swing.JApplet;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import java.awt.Container;
import java.awt.Font;

public class U4A1 extends JApplet
{
	public void init()
	{
		// Counter i, accumulator a, input input, result result
		String input;
		String result = "Results of U4A1\n\n";
		int a = 0;
		int i = 0;
		
		// Priming read
		input = JOptionPane.showInputDialog("Enter Binary Number:");
		
		// Sentinel controlled loop
		while (!input.equals("-1"))
		{
			// Update i and a, construct Binary object
			i++;
			Binary binary = new Binary(input);
			a += binary.convert();
			
			// Get correct number of tabs
			String tabs = "\t";
			if (input.length() < 4)
			{
				tabs = "\t\t";
			}
			
			// Add results to the result
			result += "Number " + i + ": " + input + " =" + tabs + binary.convert() + "\n";
			
			// Ask for new value
			input = JOptionPane.showInputDialog("Enter Binary Number:");
		}
		
		// Add final results (accumulator, counter, and mean)
		String mean = String.format("%.2f", (double) a / i);
		result += "\nNumber of Numbers = " + i + "\nAccumulated Value = " + a + "\nMean\t      = " + mean;
		
		// Send output to the JApplet and set font
		JTextArea text = new JTextArea();
		text.setText(result);
		text.setFont(new Font("Monospaced", Font.BOLD, 18));
		Container cont = getContentPane();
		cont.add(text);
	}
}