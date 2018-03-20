import java.util.ArrayList;

public class Store
{
	private ArrayList<StockItem> myStockList;

	public Store()
	{
		myStockList = new ArrayList<StockItem>();
	}

	public void add(StockItem s)
	{
		myStockList.add(s);
	}

	public double removeAll(int idnum)
	{
		int num = 0;
		double price = 0;
		for (StockItem item : myStockList)
		{
			if (item.getID() == idnum)
			{
				num = item.getNum();
				price = item.getPrice();
				item.remove(num);
			}
		}
		return num * price;
	}

	public void replace(StockItem x, StockItem y)
	{
		for (int i = 0; i < myStockList.size(); i++)
		{
			if (myStockList.get(i).getID() == x.getID())
			{
				myStockList.set(i, y);
			}
		}
	}

	public void list()
	{
		System.out.println("ID\tName\t\tPrice\tQuantity");
		System.out.println("--\t----\t\t-----\t--------");
		for (StockItem item : myStockList)
		{
			System.out.println(item.toString());
		}
	}
}