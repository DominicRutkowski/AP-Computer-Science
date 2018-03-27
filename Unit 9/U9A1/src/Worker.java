// Dominic Rutkowski
//
/*
*/

public class Worker
{
	private String name;
	private double wage;

	public Worker(String name, double wage)
	{
		this.name = name;
		this.wage = wage;
	}

	public double computePay(int hours)
	{
		return hours * wage;
	}

	public String getName()
	{
		String firstName = name.split(" ")[0];
		String lastName = name.split(" ")[1];
		return lastName + ", " + firstName.charAt(0) + ".";
	}
}