// Dominic Rutkowski
//
/* This driver program uses
   the Car class to simulate
   driving and adding gas to
   a car, in order to determine
   the amount of gas in the tank.
*/

public class U1A3
{
	public static void main(String[] args)
	{
		// Constructs Car x
		Car x = new Car();
		
		// Updates gas amount in car
		x.addGas(15);
		x.drive(120);
		x.addGas(5);
		x.drive(198);
		x.drive(60);
		x.addGas(7.25);
		x.drive(90);
		
		// Prints the amount of gas to the console
		System.out.println("Gas left in tank = " + x.getGasAmt());
	}
}