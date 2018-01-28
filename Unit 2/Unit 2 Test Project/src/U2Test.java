// Dominic Rutkowski
//
/* This driver class uses the
   DataSet class to create two
   data sets of numbers, add more
   numbers, and find the average.
*/

import java.util.Scanner;

public class U2Test
{
	public static void main(String[] args)
	{
		// Constructs two DataSet objects, one with the default constructor and one with the parametric constructor
		DataSet defaultSet = new DataSet();
		DataSet parametricSet = new DataSet(73, 8);
		
		// Constructs Scanner object
		Scanner input = new Scanner(System.in);
		
		// Asks user for the values to add to each DataSet object, and skips a line
		System.out.print("Enter Integer #1: ");
		int a = input.nextInt();
		System.out.print("Enter Integer #2: ");
		int b = input.nextInt();
		System.out.print("Enter Integer #3: ");
		int c = input.nextInt();
		System.out.print("Enter Integer #4: ");
		int d = input.nextInt();
		System.out.println();
		
		// Adds values collected to the defaultSet
		defaultSet.addValue(a);
		defaultSet.addValue(b);
		defaultSet.addValue(c);
		defaultSet.addValue(d);
		
		// Adds values collected to the parametricSet
		parametricSet.addValue(a);
		parametricSet.addValue(b);
		parametricSet.addValue(c);
		parametricSet.addValue(d);
		
		// Prints the averages of each data set
		System.out.printf("Default Constructor Average    = %.1f%n%n", defaultSet.average());
		System.out.printf("Parametric Constructor Average = %.1f%n", parametricSet.average());
	}
}