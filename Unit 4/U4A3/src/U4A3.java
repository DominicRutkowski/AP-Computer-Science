// Dominic Rutkowski
//
/* This program creates a salary schedule
   for teachers based on the number of years
   of experience and education level.
*/

import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.Font;

public class U4A3 extends JApplet
{
	public void init()
	{
		String input = JOptionPane.showInputDialog("Enter Base Salary(10000-50000),\n" +
				"Enter Number of Lanes(3-6),\n" +
				"Enter Number of Steps per Lane(10-20)\n\n" +
				"(Separate the numbers with single spaces)");
		int baseSalary = Integer.parseInt(input.substring(0, 5));
		int noOfLanes = Integer.parseInt(input.substring(6, 7));
		int noOfSteps = Integer.parseInt(input.substring(8, 10));
		String result = "\t       Salary Schedule\n\n";
		for (int i = 1; i <= noOfLanes; i++)
		{
			result += "\t  " + i;
		}
		result += "\n\n";
		
		int term = baseSalary;
		for (int i = 1; i <= noOfSteps; i++)
		{
			if (i != 1)
			{
				term = (int) Math.floor(term * 1.03);
			}
			result += i;
			
			int internalTerm = term;
			for (int j = 1; j <= noOfLanes; j++)
			{
				if (j != 1)
				{
					internalTerm = (int) Math.floor(internalTerm * 1.09);
				}
				result += "\t" + internalTerm;
			}
			result += "\n";
		}
		
		JTextArea text = new JTextArea();
		text.setFont(new Font("Monospaced", Font.BOLD, 14));
		text.setText(result);
		
		Container cont = getContentPane();
		cont.add(text);
	}
}