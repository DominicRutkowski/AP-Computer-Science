
// Dominic Rutkowski
//
/* The DataSet class allows for the
   calculation of the average of a
   set of numbers. The numbers can be
   chosen and added to by the user.
*/

public class DataSet
{
	// Instance fields
	private int sum;
	private int count;
	
	// Default constructor
	public DataSet()
	{
		sum = 0;
		count = 0;
	}
	
	// Parametric constructor
	public DataSet(int paraSum, int paraCount)
	{
		sum = paraSum;
		count = paraCount;
	}
	
	// Public member method for adding a value
	public void addValue(int x)
	{
		sum += x;
		count++;
	}
	
	// Public member method for finding the average
	public double average()
	{
		double average = ((double) sum) / count;
		return average;
	}
	
	// Accessor method for sum
	public int getSum()
	{
		return sum;
	}
	
	// Accessor method for count
	public int getCount()
	{
		return count;
	}
}