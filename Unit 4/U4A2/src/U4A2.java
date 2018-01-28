// Dominic Rutkowski
//
/* This application determines how many terms are
   required in the Gregory-Leibniz summation to
   approximate pi to the nearest five decimal places.
   
   NOTE: The original summation calculates pi/4
         This summation calculates pi by placing
         4 in all of the numerators instead of 1.
*/

public class U4A2
{
	// Constant value of pi to the nearest five decimal places
	private static final double PI = 3.14159;
	
	public static void main(String[] args)
	{
		double valueOfPi = 0; // Value of the summation
		String strValueOfPi = ""; // Allows for rounding and testing
		double testValueOfPi = 0; // Allows for rounding and testing
		int i = 0; // Number of terms
		
		// Runs the summation to determine pi to the nearest five decimal places
		do
		{
			// Calculates the number of terms
			i += 1;
			
			// Checks to add or subtract
			if (i % 2 == 0)
			{
				valueOfPi -= (double) 4 / ((2 * i) - 1);
			}
			else
			{
				valueOfPi += (double) 4 / ((2 * i) - 1);
			}
			
			// Rounds the summation value to the nearest five decimal places
			strValueOfPi = String.format("%.5f", valueOfPi);
			testValueOfPi = Double.parseDouble(strValueOfPi);
		}
		while (testValueOfPi != PI);
		
		// Prints the results to the console
		System.out.println("Value of pi = " + strValueOfPi);
		System.out.println("\nNumber of elements of the series = " + i);
	}
}