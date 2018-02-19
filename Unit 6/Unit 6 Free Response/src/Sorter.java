public class Sorter
{
	private int[] list;

	public Sorter(int[] list)
	{
		this.list = list;
	}

	public void selectionSort()
	{
		int minimumPosition;
		int temp;
		for (int j = 0; j < list.length - 1; j++)
		{
			minimumPosition = j;
			for (int k = j + 1; k < list.length; k++)
			{
				if (list[k] < list[minimumPosition])
				{
					minimumPosition = k;
				}
			}
			temp = list[j];
			list[j] = list[minimumPosition];
			list[minimumPosition] = temp;
		}
	}

	public void insertionSort()
	{
		int j;
		int temp;
		for (int n = 1; n < list.length; n++)
		{
			temp = list[n];
			j = n;
			while (j > 0 && temp < list[j - 1])
			{
				list[j] = list[j - 1];
				j--;
			}
			list[j] = temp;
		}
	}

	public void mergeSort()
	{
		MergeSorter merge = new MergeSorter(list);
		merge.sort();
	}

	public void quickSort()
	{
		QuickSorter quick = new QuickSorter(list);
		quick.sort(0, list.length - 1);
	}
}