// Dominic Rutkowski
//
/* This program creates a class
   called Car, which has methods
   that allow a driver class to
   drive and add gas.
*/

public class Car
{
	// Instance fields
	private double gasAmt;
	private double fuelEfficiency;
	
	// Default constructor
	public Car()
	{
		gasAmt = 0;
		fuelEfficiency = 24;
	}
	
	// Method simulates adding gas to tank
	public void addGas(double gallons)
	{
		gasAmt = gasAmt + gallons;
	}
	
	// Method simulates removing gas from tank (driving)
	public void drive(int miles)
	{
		gasAmt = gasAmt - miles / fuelEfficiency;
	}
	
	// Accessor method that returns gas amount
	public double getGasAmt()
	{
		return gasAmt;
	}
}