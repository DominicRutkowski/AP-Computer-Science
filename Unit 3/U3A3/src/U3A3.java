// Dominic Rutkowski
//
/* The U3A3 class below uses the Month
   class to determine how many days are
   in the month number entered by the user.
*/

import javax.swing.JApplet;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import java.awt.Container;
import java.awt.Font;

public class U3A3 extends JApplet
{
	// init() method required by all applets
	public void init()
	{
		// Gets month number from user
		String monthID = JOptionPane.showInputDialog("Please enter month as a number:");
		
		// Error handling if the month number is invalid (not required for assignment)
		while (Integer.parseInt(monthID) < 1 || Integer.parseInt(monthID) > 12)
		{
			JOptionPane.showMessageDialog(null, "Please enter a valid month number from 1 to 12.",
					"Error", JOptionPane.ERROR_MESSAGE);
			monthID = JOptionPane.showInputDialog("Please enter month as a number:");
		}
		
		// Constructs Month object
		Month month = new Month(Integer.parseInt(monthID));
		
		// Determines the name of the month
		switch (monthID)
		{
			case "1":
				monthID = "January";
				break;
			case "2":
				monthID = "February";
				break;
			case "3":
				monthID = "March";
				break;
			case "4":
				monthID = "April";
				break;
			case "5":
				monthID = "May";
				break;
			case "6":
				monthID = "June";
				break;
			case "7":
				monthID = "July";
				break;
			case "8":
				monthID = "August";
				break;
			case "9":
				monthID = "September";
				break;
			case "10":
				monthID = "October";
				break;
			case "11":
				monthID = "November";
				break;
			case "12":
				monthID = "December";
				break;
		}
		
		// Compiles the result into one string
		String result = "The month of " + monthID + "\nhas " + month.getDays() + " days.";
		
		// Creates a text area and container to paint into the applet
		JTextArea output = new JTextArea();
		output.setFont(new Font("Monospaced", Font.BOLD, 24));
		output.setText(result);
		Container cont = getContentPane();
		cont.add(output);
	}
}