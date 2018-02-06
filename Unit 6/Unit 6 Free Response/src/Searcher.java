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

	}
}