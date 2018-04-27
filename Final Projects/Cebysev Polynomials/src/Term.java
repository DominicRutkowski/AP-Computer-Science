// Dominic Rutkowski
//
/* This class represents a monomial
   term within a Polynomial.
*/

public class Term
{
	private int coefficient;
	private int exponent;

	public Term(int coefficient, int exponent)
	{
		this.coefficient = coefficient;
		this.exponent = exponent;
	}

	public boolean isNonnegative()
	{
		return coefficient >= 0;
	}

	public String toString()
	{
		String result = Integer.toString(Math.abs(coefficient));
		if (exponent == 0)
		{
			return result;
		}
		else if (exponent == 1)
		{
			return result + "x";
		}
		else
		{
			return result + "x^" + exponent;
		}
	}
}