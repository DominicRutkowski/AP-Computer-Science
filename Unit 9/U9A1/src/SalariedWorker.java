// Dominic Rutkowski
//
/*
*/

public class SalariedWorker extends Worker
{
	private int hours;

	public SalariedWorker(String name, double wage, int hours)
	{
		super(name, wage);
		this.hours = hours;
	}

	public double wage()
	{
		return computePay(40);
	}
}