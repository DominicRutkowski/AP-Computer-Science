// Dominic Rutkowski
//
/* The EasterSunday class below calculates
   the day Easter is on given the year using
   Carl Friedrich Gauss' algorithm.
*/

public class EasterSunday
{
	// Instance fields
	private int month;
	private int day;
	
	// Default constructor (April 19th is the most common day for Easter to fall on)
	public EasterSunday()
	{
		month = 4;
		day = 19;
	}
	
	// Parametric constructor with Gauss' algorithm
	public EasterSunday(int y) // 1
	{
		int a = y % 19; // 2
		int b = y / 100; // 3
		int c = y % 100; // 3
		int d = b / 4; // 4
		int e = b % 4; // 4
		int g = ((8 * b) + 13) / 25; // 5
		int h = ((19 * a) + b - d - g + 15) % 30; // 6
		int j = c / 4; // 7
		int k = c % 4; // 7
		int m = (a + (11 * h)) / 319; // 8
		int r = ((2 * e) + (2 * j) - k - h + m + 32) % 7; // 9
		int n = (h - m + r + 90) / 25; // 10
		int p = (h - m + r + n + 19) % 32; // 11
		
		// Initializes instance fields
		month = n;
		day = p;
	}
	
	// Accessor method for month
	public int getMonth()
	{
		return month;
	}
	
	// Accessor method for day
	public int getDay()
	{
		return day;
	}
}