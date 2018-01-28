// Dominic Rutkowski
//
/* The Month class below takes an
   input of the number of a month
   and converts that into the month
   name. It then tells the user how
   many days are in that month in
   an applet window.
*/

public class Month
{
	// Instance fields
	private int month;
	private String days;
	
	// Default constructor
	public Month()
	{
		month = 1;
		days = "31";
	}
	
	// Parametric constructor
	public Month(int monthNumber)
	{
		month = monthNumber;
		setDays();
	}
	
	// Set days mutator method
	private void setDays()
	{
		switch (month)
		{
			case 4:
			case 6:
			case 9:
			case 11:
				days = "30";
				break;
			case 2:
				days ="28 or 29";
				break;
			default:
				days = "31";
				break;
		}
	}
	
	// Get days accessor method
	public String getDays()
	{
		return days;
	}
}