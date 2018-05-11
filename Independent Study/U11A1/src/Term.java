// Dominic Rutkowski
//
/*
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

	

	public Term multiply(Term term)
	{
		int coefficient = this.coefficient * term.getCoefficient();
		int exponent = this.exponent * term.getExponent();
		return new Term(coefficient, exponent);
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