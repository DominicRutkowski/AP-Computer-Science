// Dominic Rutkowski
//
/* This class represents a polynomial, which
   is in this case, a collection of Terms.
*/

import java.util.ArrayList;
import java.util.HashMap;

public class Polynomial
{
	private ArrayList<Term> terms;

	// Monomial constructor
	public Polynomial(Term term)
	{
		terms = new ArrayList<Term>();
		terms.add(term);
	}

	public Polynomial(ArrayList<Term> terms)
	{
		this.terms = terms;
	}

	public Polynomial add(Polynomial polynomial)
	{
		ArrayList<Term> terms = new ArrayList<Term>();
		for (Term term : this.terms)
		{
			terms.add(term);
		}
		for (Term term : polynomial.getTerms())
		{
			terms.add(term);
		}
		Polynomial resultPolynomial = new Polynomial(terms);
		resultPolynomial.simplify();
		return resultPolynomial;
	}

	public Polynomial multiply(Polynomial polynomial)
	{
		ArrayList<Term> terms = new ArrayList<Term>();
		for (Term i : this.terms)
		{
			for (Term j : polynomial.getTerms())
			{
				terms.add(i.multiply(j));
			}
		}
		Polynomial resultPolynomial = new Polynomial(terms);
		resultPolynomial.simplify();
		return resultPolynomial;
	}

	public Polynomial additiveInverse()
	{
		final Term NEGATIVE_ONE = new Term(-1, 0);
		ArrayList<Term> terms = new ArrayList<Term>();
		for (Term term : this.terms)
		{
			terms.add(term.multiply(NEGATIVE_ONE));
		}
		Polynomial resultPolynomial = new Polynomial(terms);
		resultPolynomial.simplify();
		return resultPolynomial;
	}

	private void simplify()
	{
		// Combine like terms
		HashMap<Integer, Integer> polynomial = new HashMap<Integer, Integer>();
		for (Term term : terms)
		{
			if (polynomial.containsKey(term.getExponent()))
			{
				polynomial.put(term.getExponent(), term.getCoefficient() + polynomial.get(term.getExponent()));
			}
			else
			{
				polynomial.put(term.getExponent(), term.getCoefficient());
			}
		}
		while (terms.size() > 0)
		{
			terms.remove(0);
		}
		polynomial.forEach((k, v) ->
		{
			if (v != 0)
			{
				terms.add(new Term(v, k));
			}
		});

		// Insertion sort by degree of each term
		int j;
		Term temp;
		for (int n = 1; n < terms.size(); n++)
		{
			temp = terms.get(n);
			j = n;
			while (j > 0 && temp.compareTo(terms.get(j - 1)) > 0)
			{
				terms.set(j, terms.get(j - 1));
				j--;
			}
			terms.set(j, temp);
		}
	}

	public String toString()
	{
		simplify();
		String result = "";
		for (int i = 0; i < terms.size(); i++)
		{
			result += terms.get(i).toString() + " ";
		}
		return result;
	}

	public ArrayList<Term> getTerms()
	{
		return terms;
	}
}