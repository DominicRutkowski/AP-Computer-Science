public class StockItem
{
	private String name;
	private int idnum;
	private double price;
	private int numOnShelf;

	public StockItem(String name, int idnum, double price, int numOnShelf)
	{
		this.name = name;
		this.idnum = idnum;
		this.price = price;
		this.numOnShelf = numOnShelf;
	}

	public String getName()
	{
		return name;
	}

	public int getID()
	{
		return idnum;
	}

	public double getPrice()
	{
		return price;
	}

	public int getNum()
	{
		return numOnShelf;
	}

	public void setPrice(double p)
	{
		price = p;
	}

	public void remove(int n)
	{
		numOnShelf -= n;
		if (numOnShelf < 0)
		{
			numOnShelf = 0;
		}
	}

	public void add (int n)
	{
		numOnShelf += n;
	}

	public String toString()
	{
		if (name.length() >= 8)
		{
			return idnum + "\t" + name + "\t$" + price + "\t" + numOnShelf;
		}
		else
		{
			return idnum + "\t" + name + "\t\t$" + price + "\t" + numOnShelf;
		}
	}
}