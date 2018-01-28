// Dominic Rutkowski
//
/* The TimeInterval class below allows
   the driver class to create TimeInterval
   objects that can calculate the hours and
   minutes worked and pay due based on the
   starting time, ending time, and wage.
*/

public class TimeInterval
{
	// Instance fields
	private int hours;
	private int minutes;
	private double pay;
	
	// Default constructor
	public TimeInterval()
	{
		hours = 0;
		minutes = 0;
		pay = 0;
	}
	
	// Parametric constructor
	public TimeInterval(int startTime, int endTime, double wage)
	{
		// Converts the starting and ending times to minutes
		int startTimeMinutes = ((startTime / 100) * 60) + (startTime - ((startTime / 100) * 100));
		int endTimeMinutes = ((endTime / 100) * 60) + (endTime - ((endTime / 100) * 100));
		
		// Determines the difference (time worked) between the start and end time in minutes
		int timeIntervalMinutes = endTimeMinutes - startTimeMinutes;
		
		// Uses the wage and time worked to calculate the pay
		pay = wage * ((double) timeIntervalMinutes / 60);
		
		// Converts the time worked back to hours and minutes
		hours = timeIntervalMinutes / 60;
		minutes = timeIntervalMinutes - (hours * 60);
	}
	
	// Accessor method for hours
	public int getHours()
	{
		return hours;
	}
	
	// Accessor method for minutes above hours
	public int getMinutes()
	{
		return minutes;
	}
	
	// Accessor method for pay
	public double getPay()
	{
		return pay;
	}
}