// Dominic Rutkowski
//
/*
*/

public class PieceWorker extends Worker
{
	private int hours;

	public PieceWorker(String name, double wage, int hours)
	{
		super(name, wage);
		this.hours = hours;
	}

	public double wage(int pieces)
	{
		return super.computePay(hours) + computePay(pieces);
	}

	public double computePay(int pieces)
	{
		return pieces * 0.12;
	}
}