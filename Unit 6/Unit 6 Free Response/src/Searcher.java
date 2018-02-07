public class Searcher
{
	private int[] list;

	public Searcher(int[] list)
	{
		this.list = list;
	}

	public boolean seqSearch(int t)
	{
		for (int element : list)
		{
			if (element == t)
			{
				return true;
			}
		}
		return false;
	}

	public boolean binSearch(int t)
	{
		int low = 0;
		int high = list.length - 1;
		int difference;
		int middle;
		while (low <= high)
		{
			middle = (low + high) / 2;
			difference = list[middle] - t;
			if (difference == 0)
			{
				return true;
			}
			else if (difference < 0)
			{
				low = middle + 1;
			}
			else
			{
				high = middle - 1;
			}
		}
		return false;
	}
}