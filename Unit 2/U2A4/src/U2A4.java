// Dominic Rutkowski
//
/* This driver class uses the EasterSunday
   class to calculate the day of Easter in
   the year given.
*/

import java.io.*;
import java.util.Scanner;

public class U2A4
{
	public static void main(String[] args)
	{
		U2A4 application = new U2A4();
	}
	
	public U2A4()
	{
		// Constructs scanner object
		Scanner input = new Scanner(System.in);
		
		// Asks for the year
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		
		// Constructs EasterSunday object
		EasterSunday easter = new EasterSunday(year);
		
		// Gets month name
		String monthName = getMonthName(easter.getMonth());
		
		// Outputs the result
		System.out.println("Easter Sunday is on " + monthName + easter.getDay() + ".");
	}
	
	// Method to get the month name
	private String getMonthName(int m)
	{
		Scanner in;
		
		try
		{
			// In IntelliJ, the String should be "src/U2A4.txt"
			in = new Scanner(new File("U2A4.txt"));
		}
		catch (IOException e)
		{
			throw new RuntimeException(e.toString());
		}
		
		String rawMonthString = in.nextLine();
		return rawMonthString.substring(((m - 1) * 9), (m * 9));
	}
}