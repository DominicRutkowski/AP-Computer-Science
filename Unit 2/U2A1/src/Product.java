// Dominic Rutkowski
//
/* The Product class below allows
   the user to select products and
   their prices, and then apply
   discounts and taxes to the products.
*/

public class Product
{
	// Instance fields
	private String name;
	private double cost;
	
	// Default constructor
	public Product()
	{
		name = "";
		cost = 0;
	}
	
	// Parametric constructor
	public Product(String prodName, double prodCost)
	{
		name = prodName;
		cost = prodCost;
	}
	
	// Public member method for discounts
	public void discount(int percent)
	{
		cost = cost * (1 - ((double) percent / 100));
	}
	
	// Public member method for dollars off
	public void dollarsOff(int dollars)
	{
		cost = cost - dollars;
	}
	
	// Public member method for tax
	public void tax()
	{
		final double TAX_RATE = 0.065;
		cost = cost * (1 + TAX_RATE);
	}
	
	// Accessor method for name
	public String getName()
	{
		return name;
	}
	
	// Accessor method for cost
	public double getCost()
	{
		return cost;
	}
}