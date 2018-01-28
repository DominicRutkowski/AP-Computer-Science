// Dominic Rutkowski
//
/* The Binary class below allows the user
   to input a binary number via a parametric
   constructor. The convert method will
   convert this number into base ten.
*/

public class Binary
{
	// Instance field
	private String binaryNumber;
	
	// Parametric constructor
	public Binary(String b)
	{
		binaryNumber = b;
	}
	
	// Calculate public member method
	public int convert()
	{
		int decimalNumber = 0;
		int i = 0;
		while (i < binaryNumber.length())
		{
			decimalNumber += Integer.parseInt(binaryNumber.substring(i, i + 1))
					* Math.pow(2, binaryNumber.length() - 1 - i);
			i++;
		}
		return decimalNumber;
	}
}