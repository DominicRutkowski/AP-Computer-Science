public class Driver
{
	public static void main(String[] args)
	{
		Store inventory = new Store();
		
		StockItem a = new StockItem("Special K", 1001, 2.35, 12);
		inventory.add(a);
		
		StockItem b = new StockItem("Kleenex", 1002, 1.76, 8);
		inventory.add(b);
		
		StockItem c = new StockItem("Coke", 1003, 1.49, 15);
		inventory.add(c);
		
		StockItem d = new StockItem("Peanuts", 1004, 2.29, 6);
		inventory.add(d);
		
		StockItem e = new StockItem("Soap", 1005, 0.89, 25);
		inventory.add(e);
		
		// Prints the contents of the inventory
		inventory.list();
		
		// Increases the price of Soap to 0.92
		e.setPrice(0.92);
		
		// Removes 6 boxes of Kleenex from the shelf
		b.remove(6);
		
		// Adds 24 6-packs of Coke to the shelf
		c.add(24);
		
		// Removes all Peanuts from the shelf
		double value = inventory.removeAll(1004);
		
		// Prints the value of the peanuts that were removed from the shelf
		System.out.println(value);
		
		// Replaces "Special K" with new StockItem("Total, 1006, 2.24, 48)
		inventory.replace(a, new StockItem("Total", 1006, 2.24, 48));
		
		// Prints the contents of the inventory
		inventory.list();
	}
}