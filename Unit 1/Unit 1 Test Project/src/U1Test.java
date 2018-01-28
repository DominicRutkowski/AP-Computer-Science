
// Dominic Rutkowski
//
/* This driver program simulates
   raising an employee's salary
   and giving him/her bonuses.
*/

public class U1Test
{
	public static void main(String[] args)
	{
		// Constructs employee emp
		Employee emp = new Employee();
		
		// Prints employee name, 3 spaces, employee salary
		System.out.println(emp.getName() + "   " + emp.getSalary());
		
		// Raises salary by 4% and prints salary
		emp.raiseSalary(4);
		System.out.println(emp.getSalary());
		
		// Gives employee $200 bonus and prints salary
		emp.bonus(200);
		System.out.println(emp.getSalary());
		
		// Raises salary by 5.5% and prints salary
		emp.raiseSalary(5.5);
		System.out.println(emp.getSalary());
	}
}