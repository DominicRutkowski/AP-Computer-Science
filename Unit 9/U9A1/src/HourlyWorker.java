// Dominic Rutkowski
//
/*
*/

public class HourlyWorker extends Worker
{
	private int hours;

	public HourlyWorker(String name, double wage, int hours)
	{
		super(name, wage);
		this.hours = hours;
	}

	public double wage()
	{
		if (hours <= 40)
		{
			return computePay(hours);
		}
		else
		{
			int overtime = hours - 40;
			return computePay(hours - overtime) +(1.5 * computePay(overtime));
		}
	}
}