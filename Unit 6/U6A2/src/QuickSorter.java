// Dominic Rutkowski
//
/* This class implements QuickSort to efficiently
   sort integer arrays via recursion.
*/

public class QuickSorter
{
	private int[] arr;
	
	public QuickSorter(int[] arr)
	{
		this.arr = arr;
	}
	
	public void sort(int from, int to)
	{
		if (from >= to)
		{
			return;
		}
		int p = partition(from, to);
		sort(from, p);
		sort(p + 1, to);
	}
	
	private int partition(int from, int to)
	{
		int temp;
		int pivot = arr[from];
		int i = from - 1;
		int j = to + 1;
		
		while (i < j)
		{
			i++;
			while (arr[i] < pivot)
			{
				i++;
			}
			
			j--;
			while (arr[j] > pivot)
			{
				j--;
			}
			
			if (i < j)
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		return j;
	}
	
	public int[] getArr()
	{
		return arr;
	}
}