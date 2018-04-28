// Dominic Rutkowski
//
/* This class represents a
   term within a Polynomial.
*/

public class Term implements Comparable
{
	private int coefficient;
	private int exponent;

	public Term(int coefficient, int exponent)
	{
		this.coefficient = coefficient;
		this.exponent = exponent;
	}

	public Term multiply(Term term)
	{
		int coefficient = this.coefficient * term.getCoefficient();
		int exponent = this.exponent + term.getExponent();
		return new Term(coefficient, exponent);
	}

	public boolean isNonnegative()
	{
		return coefficient >= 0;
	}

	public String toString()
	{
		if (exponent == 0)
		{
			return Integer.toString(coefficient);
		}
		else if (coefficient == 1 && exponent == 1)
		{
			return "x";
		}
		else if (coefficient == 1 && exponent > 1)
		{
			return "x^" + exponent;
		}
		else if (exponent == 1)
		{
			return coefficient + "x";
		}
		else // if (exponent > 1)
		{
			return coefficient + "x^" + exponent;
		}
	}

	public int compareTo(Object object)
	{
		Term term = (Term) object;
		return exponent - term.getExponent();
	}

	public int getCoefficient()
	{
		return coefficient;
	}

	public int getExponent()
	{
		return exponent;
	}
}