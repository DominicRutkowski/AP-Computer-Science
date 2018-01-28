// Dominic Rutkowski
//
/* This JApplet determines the smallest prime number
   after a number entered by the user.
*/

import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import javax.swing.JApplet;
import java.awt.Container;

public class U4Test extends JApplet
{
	// Instance fields for time
	private long start;
	private long stop;
	
	public void init()
	{
		// Get user input for the base number
		long in = Long.parseLong(JOptionPane.showInputDialog("Enter Base Number:"));
		String result = "Results of the Prime Number Search\n\nBase Number = " + in + "\n\nPrime Number = ";
		
		// Determine the prime above the base number
		long prime = getPrime(in);
		long time = stop - start;
		
		// Finish the result
		result += prime + "\n\nElapsed Time = " + time + " millisecond";
		if (time != 1)
		{
			result += "s";
		}
		
		// Prints the result to the JApplet window
		JTextArea text = new JTextArea();
		text.setText(result);
		Container cont = getContentPane();
		cont.add(text);
	}
	
	private long getPrime(long input)
	{
		// Starts the timer
		start = System.currentTimeMillis();
		
		// Checks if the next prime is two or three
		if (input < 2)
		{
			stop = System.currentTimeMillis();
			return 2;
		}
		else if (input == 2)
		{
			stop = System.currentTimeMillis();
			return 3;
		}
		// Increments the number once if even, twice if odd
		if ((input & 1) == 1) // More efficient method of testing if input is odd. Checks the last bit of input.
		{
			input += 2;
		}
		else
		{
			input++;
		}
		// Increments the number by two until it is prime
		while (true)
		{
			/*
				The bases used below (2, 325, 9375, etc.) are not hard-coded. These bases will never need to change.
				Together, they are the most efficient test bases currently discovered for the Miller-Rabin test with
				64-bit integers (longs). Typically, these bases are randomized k times so that the algorithm has an
				error rate of just 4^(-k). However, when working with numbers less than 2^63 (longs), these bases are
				enough to be accurate 100% of the time. Thus, for the purposes of this project (all projects can only
				handle longs because we cannot use BigInteger), these test bases are always sufficient, and therefore
				not hard-coded (they will never need to change; they will work for all valid inputs).
				
				Sources:
				https://en.wikipedia.org/wiki/Miller%E2%80%93Rabin_primality_test
				https://miller-rabin.appspot.com/
			*/
			if (checkPrime(input, 2))
			{
				if (checkPrime(input, 325))
				{
					if (checkPrime(input, 9375))
					{
						if (checkPrime(input, 28178))
						{
							if (checkPrime(input, 450775))
							{
								if (checkPrime(input, 9780504))
								{
									if (checkPrime(input, 1795265022))
									{
										stop = System.currentTimeMillis();
										return input;
									}
								}
							}
						}
					}
				}
			}
			input += 2;
		}
	}
	
	// Check if n is prime with base a in Miller-Rabin test (call 7 times with above bases for deterministic base 64)
	private boolean checkPrime(long n, long a)
	{
		if (a <= (n - 2))
		{
			// Factor n-1 as d*2^s
			long d = n - 1;
			int s = 0;
			while (d % 2 == 0)
			{
				d /= 2;
				s++;
			}
			
			// Find (a^d) % n
			long x = modPow(a, d, n);
			if (x == 1 || x == (n - 1))
			{
				return true;
			}
			int r;
			for (r = 0; r < s; r++)
			{
				x = modPow(x, 2, n);
				if (x == 1)
				{
					return false;
				}
				if (x == (n - 1))
				{
					break;
				}
			}
			if (r == s)
			{
				return false;
			}
		}
		return true;
	}
	
	// Return (base^exp) % mod without exponentiation overflow errors
	private long modPow(long base, long exp, long mod)
	{
		if (mod == 1)
		{
			return 0;
		}
		long result = 1;
		base %= mod;
		while (exp > 0)
		{
			if ((exp & 1) == 1) // More efficient method of testing if exp is odd. Checks the last bit of exp.
			{
				result = modMultiply(result, base, mod);
			}
			exp = exp >> 1; // The >> operator shifts the binary digits of exp over to the right (once in this case).
			// The "empty" leading digits are replaced with zeros.
			base = modMultiply(base, base, mod);
			if (base == 1)
			{
				break;
			}
		}
		return result;
	}
	
	// Returns (a * b) % mod without multiplication overflow errors
	private long modMultiply(long a, long b, long mod)
	{
		long result = 0;
		a %= mod;
		while (b > 0)
		{
			if ((b & 1) == 1) // More efficient method of testing if b is odd. Checks the last bit of b.
			{
				result = (result + a) % mod;
			}
			a = (a * 2) % mod;
			b /= 2;
		}
		return result % mod;
	}
}