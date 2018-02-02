// Dominic Rutkowski
//
/* This class implements MergeSort to efficiently
   sort integer arrays via recursion.
*/

public class MergeSorter
{
	private int[] arr;

	public MergeSorter(int[] arr)
	{
		this.arr = arr;
	}

	public void sort()
	{
		if (arr.length <= 1)
		{
			return;
		}
		int[] first = new int[arr.length / 2];
		int[] second = new int[arr.length - first.length];
		System.arraycopy(arr, 0, first, 0, first.length);
		System.arraycopy(arr, first.length, second, 0, second.length);
		MergeSorter firstSorter = new MergeSorter(first);
		MergeSorter secondSorter = new MergeSorter(second);

		firstSorter.sort();
		secondSorter.sort();
		merge(first, second);
	}

	private void merge(int[] first, int[] second)
	{

	}
}