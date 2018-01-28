// Dominic Rutkowski
//
/* The driver class below uses
   the Grade class to convert
   grades entered by the user
   into other forms of the same
   grade. The results are shown
   in a GUI, as is the input.
*/

import javax.swing.JOptionPane;

public class U3A1
{
	public static void main(String[] args)
	{
		String origLetter = JOptionPane.showInputDialog("Please enter Letter Grade:");
		String origNumeric = JOptionPane.showInputDialog("Please enter Numeric Grade:");
		
		Grade userGrades = new Grade(origLetter, Double.parseDouble(origNumeric));
		
		JOptionPane.showMessageDialog(null,
				"Numeric Grade Equivalent = " + userGrades.getNewNumeric() +
						"\n\nLetter Grade Equivalent = " + userGrades.getNewLetter(),
				"U3A1",
				JOptionPane.INFORMATION_MESSAGE);
	}
}