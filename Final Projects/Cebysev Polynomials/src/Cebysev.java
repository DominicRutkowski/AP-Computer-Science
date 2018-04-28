// Dominic Rutkowski
//
/* The Cebysev class generates the
   first ten Cebysev polynomials.
*/

import java.util.ArrayList;

public class Cebysev
{
	private static final Polynomial ONE = new Polynomial(new Term(1, 0));
	private static final Polynomial X = new Polynomial(new Term(1, 1));
	private static final Polynomial TWO_X = new Polynomial(new Term(2, 1));

	public static void main(String[] args)
	{
		ArrayList<Polynomial> cebysevPolynomials = new ArrayList<Polynomial>();
		cebysevPolynomials.add(ONE);
		cebysevPolynomials.add(X);
		while (cebysevPolynomials.size() < 10)
		{
			Polynomial prevTerm = cebysevPolynomials.get(cebysevPolynomials.size() - 1);
			Polynomial twicePrevTerm = cebysevPolynomials.get(cebysevPolynomials.size() - 2);
			cebysevPolynomials.add(prevTerm.multiply(TWO_X).add(twicePrevTerm.additiveInverse()));
		}
		for (Polynomial polynomial : cebysevPolynomials)
		{
			System.out.println(polynomial);
		}
	}
}