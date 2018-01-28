// Dominic Rutkowski
//
/* This Cashier class below takes an
   input of the amount paid and the
   amount due, and calculates change
   due based on those amounts.
*/

public class Cashier
{
	// Instance fields
	private int dollars;
	private int quarters;
	private int dimes;
	private int nickels;
	private int pennies;
	
	// Default constructor
	public Cashier()
	{
		dollars = 0;
		quarters = 0;
		dimes = 0;
		nickels = 0;
		pennies = 0;
	}
	
	// Parametric constructor
	public Cashier(double due, double received)
	{
		// Determines cents due as change
		int change = (int) Math.round(100 * (received - due));
		
		// Calculates number of dollars due as change
		dollars = change / 100;
		change = change - (dollars * 100);
		
		// Calculates number of quarters due as change
		quarters = change / 25;
		change = change - (quarters * 25);
		
		// Calculates number of dimes due as change
		dimes = change / 10;
		change = change - (dimes * 10);
		
		// Calculates number of nickels due as change
		nickels = change / 5;
		change = change - (nickels * 5);
		
		// Calculates number of pennies due as change
		pennies = change;
	}
	
	// Accessor method for dollars
	public int getDollars()
	{
		return dollars;
	}
	
	// Accessor method for quarters
	public int getQuarters()
	{
		return quarters;
	}
	
	// Accessor method for dimes
	public int getDimes()
	{
		return dimes;
	}
	
	// Accessor method for nickels
	public int getNickels()
	{
		return nickels;
	}
	
	// Accessor method for pennies
	public int getPennies()
	{
		return pennies;
	}
}