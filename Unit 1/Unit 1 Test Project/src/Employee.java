// Dominic Rutkowski
//
/* This program provides the
   methods to simulate an
   employee in the driver program.
*/

public class Employee
{
	// Instance fields
	private String name;
	private double salary;
	
	// Default constructor
	public Employee()
	{
		name = "Hacker, Harry";
		salary = 55000;
	}
	
	// Raises salary
	public void raiseSalary(double byPercent)
	{
		salary = salary * (1 + (byPercent / 100));
	}
	
	// Gives employee bonus
	public void bonus(int amount)
	{
		salary = salary + amount;
	}
	
	// Accessor method returns employee name
	public String getName()
	{
		return name;
	}
	
	// Accessor method returns employee salary
	public double getSalary()
	{
		return salary;
	}
}