// Dominic Rutkowski
//
/* This class accepts a letter grade A-F
   and a numeric grade 0 - 4 and converts
   the letter grade to a numeric grade and
   the numeric grade to a letter grade.
*/

public class Grade
{
	// Instance fields
	private String origLetter;
	private double newNumeric;
	
	private double origNumeric;
	private String newLetter;
	
	// Default constructor
	public Grade()
	{
		origLetter = "";
		origNumeric = 0;
		newLetter = "";
		newNumeric = 0;
	}
	
	// Parametric constructor
	public Grade(String oldLetter, double oldNumeric)
	{
		origLetter = oldLetter;
		origNumeric = oldNumeric;
		
		setNewNumeric();
		setNewLetter();
	}
	
	// Mutator method for new numeric grade
	private void setNewNumeric()
	{
		if (origLetter.substring(0, 1).equals("A"))
		{
			newNumeric = 4;
		}
		else if (origLetter.substring(0, 1).equals("B"))
		{
			newNumeric = 3;
		}
		else if (origLetter.substring(0, 1).equals("C"))
		{
			newNumeric = 2;
		}
		else if (origLetter.substring(0, 1).equals("D"))
		{
			newNumeric = 1;
		}
		else if (origLetter.substring(0, 1).equals("F"))
		{
			newNumeric = 0;
		}
		
		if (origLetter.substring(1).equals("+") && !origLetter.substring(0, 1).equals("A") && !origLetter.substring(0, 1).equals("F"))
		{
			newNumeric = newNumeric + 0.3;
		}
		else if (origLetter.substring(1).equals("-") && !origLetter.substring(0, 1).equals("F"))
		{
			newNumeric = newNumeric - 0.3;
		}
	}
	
	// Mutator method for new letter grade
	private void setNewLetter()
	{
		if (origNumeric == 4)
		{
			newLetter = "A+";
		}
		else if (origNumeric <= 3.99 && origNumeric >= 3.85)
		{
			newLetter = "A";
		}
		else if (origNumeric <= 3.84 && origNumeric >= 3.5)
		{
			newLetter = "A-";
		}
		else if (origNumeric <= 3.49 && origNumeric >= 3.15)
		{
			newLetter = "B+";
		}
		else if (origNumeric <= 3.14 && origNumeric >= 2.85)
		{
			newLetter = "B";
		}
		else if (origNumeric <= 2.84 && origNumeric >= 2.5)
		{
			newLetter = "B-";
		}
		else if (origNumeric <= 2.49 && origNumeric >= 2.15)
		{
			newLetter = "C+";
		}
		else if (origNumeric <= 2.14 && origNumeric >= 1.85)
		{
			newLetter = "C";
		}
		else if (origNumeric <= 1.84 && origNumeric >= 1.5)
		{
			newLetter = "C-";
		}
		else if (origNumeric <= 1.49 && origNumeric >= 1.15)
		{
			newLetter = "D+";
		}
		else if (origNumeric <= 1.14 && origNumeric >= 0.85)
		{
			newLetter = "D";
		}
		else if (origNumeric <= 0.84 && origNumeric >= 0.5)
		{
			newLetter = "D-";
		}
		else if (origNumeric <= 0.49 && origNumeric >= 0)
		{
			newLetter = "F";
		}
	}
	
	// Accessor method for new numeric grade
	public double getNewNumeric()
	{
		return newNumeric;
	}
	
	// Accessor method for new letter grade
	public String getNewLetter()
	{
		return newLetter;
	}
}