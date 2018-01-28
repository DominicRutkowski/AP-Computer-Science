// Dominic Rutkowski
//
/* This driver class uses the TimeInterval
   class to calculate the amount that an
   employee must be paid based on their
   hourly wage, start time, and end time
   (both in military time).
*/

import java.util.Scanner;

public class U2A3
{
	public static void main(String[] args)
	{
		// Constructs Scanner object
		Scanner input = new Scanner(System.in);
		
		// Asks for start time in military time
		System.out.print("Please enter the starting time: ");
		int startTime = input.nextInt();
		
		// Asks for end time in military time
		System.out.print("Please enter the finishing time: ");
		int endTime = input.nextInt();
		
		// Asks for wage and skips line
		System.out.print("Please enter rate of pay: ");
		double wage = input.nextDouble();
		System.out.println();
		
		// Constructs TimeInterval object to calculate hours worked, minutes worked, and pay due
		TimeInterval work = new TimeInterval(startTime, endTime, wage);
		
		// Logs the hours worked, minutes worked, and pay due to the console
		System.out.println("Time on Task = " + work.getHours() + " hours " + work.getMinutes() + " minutes\n");
		System.out.printf("Pay = $%.2f%n", work.getPay());
	}
}