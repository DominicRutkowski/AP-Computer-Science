// Dominic Rutkowski
//
/* The Postage class is used by Unit3TestProject.java
   to calculate how much the user must pay in postage to
   mail a package based on its weight and shipping type.
*/

public class Postage
{
	// Instance fields
	private String type;
	private double weight;
	
	// Default constructor
	public Postage()
	{
		type = "P";
		weight = 0;
	}
	
	// Parametric constructor
	public Postage(String input)
	{
		type = input.substring(0, 1);
		weight = Double.parseDouble(input.substring(2));
	}
	
	// Calculate method to calculate the cost
	public double calculate()
	{
		if (type.equals("F") && weight <= 13) // First class mail of 13oz or fewer
		{
			return 0.34 + (0.21 * Math.ceil(weight - 1)); // 13oz or fewer
		}
		else // Priority mail and first class mail over 13oz
		{
			if (weight <= 16) // 16oz or fewer
			{
				return 3.5;
			}
			else if (weight > 16 && weight <= 32) // Greater than 16oz but 32oz or fewer
			{
				return 3.95;
			}
			else // Greater than 32oz
			{
				return 3.95 + (1.2 * Math.ceil((weight - 32) / 16));
			}
		}
	}
}