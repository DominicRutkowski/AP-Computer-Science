// Dominic Rutkowski
//
/* The PieceWorker is a type of
   Worker which is paid based on
   the hours worked and the pieces
   finished.
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
		return super.computePay(hours) + this.computePay(pieces);
	}

	public double computePay(int pieces)
	{
		return pieces * 0.12;
	}
}