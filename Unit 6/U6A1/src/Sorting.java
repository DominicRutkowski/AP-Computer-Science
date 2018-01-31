// Dominic Rutkowski
//
/* This class lets the user create an array to
   be sorted with selection or insertion sort.
*/

public class Sorting
{
	private int[] arr;

	public Sorting(int[] arr)
	{
		this.arr = arr;
	}

	public int selectionSort()
	{
		long start = System.currentTimeMillis();
		int minPosition;
		int temp;
		for (int j = 0; j < arr.length - 1; j++)
		{
			minPosition = j;

			for (int k = j + 1; k < arr.length; k++)
			{
				if (arr[k] < arr[minPosition])
				{
					minPosition = k;
				}
			}
			temp = arr[j];
			arr[j] = arr[minPosition];
			arr[minPosition] = temp;
		}
		long stop = System.currentTimeMillis();
		return (int) (stop - start);
	}

	public int insertionSort()
	{
		long start = System.currentTimeMillis();
		int j;
		int temp;
		for (int n = 1; n < arr.length; n++)
		{
			temp = arr[n];
			j = n;

			while (j > 0 && temp < arr[j - 1])
			{
				arr[j] = arr[j - 1];
				j--;
			}

			arr[j] = temp;
		}
		long stop = System.currentTimeMillis();
		return (int) (stop - start);
	}

	public int[] getArr()
	{
		return arr;
	}
}