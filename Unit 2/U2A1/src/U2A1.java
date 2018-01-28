// Dominic Rutkowski
//
/* This driver class simulates the
   purchase of clothes at a store
   through cost, discounts, dollars
   off, and tax. It prints the costs.
*/

public class U2A1
{
	public static void main(String[] args)
	{
		// Constructs Product objects
		Product a = new Product("Jeans", 34.95);
		Product b = new Product("Sweater", 49.99);
		Product c = new Product("Shoes", 99.95);
		
		// Calls public member methods to discount the products
		a.discount(30);
		b.discount(40);
		b.discount(30);
		c.dollarsOff(5);
		c.discount(30);
		
		// Calls public member methods to tax the products
		a.tax();
		b.tax();
		c.tax();
		
		// Formats and prints item and cost for Product a
		System.out.println("Item: " + a.getName());
		System.out.printf("Cost: $ %.2f%n%n", a.getCost());
		
		// Formats and prints item and cost for Product b
		System.out.println("Item: " + b.getName());
		System.out.printf("Cost: $ %.2f%n%n", b.getCost());
		
		// Formats and prints item and cost for Product c
		System.out.println("Item: " + c.getName());
		System.out.printf("Cost: $ %.2f%n%n", c.getCost());
	}
}
