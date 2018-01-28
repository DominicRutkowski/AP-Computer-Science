// Dominic Rutkowski
//
/* This application uses the Cashier
   class to calculate the amount of
   change due based on the amount
   paid and the amount due.
*/

import java.util.Scanner;

public class U2A2
{
	public static void main(String[] args)
	{
		// Constructs Scanner object
		Scanner input = new Scanner(System.in);
		
		// Reserves spots in memory for the amounts due and received
		double amtDue;
		double amtReceived;
		
		// Asks user for the amount due
		System.out.print("Enter Amount Due: ");
		amtDue = input.nextDouble();
		
		// Asks user for the amount received and skips a line
		System.out.print("Enter Amount Received: ");
		amtReceived = input.nextDouble();
		System.out.print("\n");
		
		// Constructs Cashier object called billy
		Cashier billy = new Cashier(amtDue, amtReceived);
		
		// Prints the change due to the console window
		System.out.println("Dollars  = " + billy.getDollars());
		System.out.println("Quarters = " + billy.getQuarters());
		System.out.println("Dimes    = " + billy.getDimes());
		System.out.println("Nickels  = " + billy.getNickels());
		System.out.println("Pennies  = " + billy.getPennies());
	}
}