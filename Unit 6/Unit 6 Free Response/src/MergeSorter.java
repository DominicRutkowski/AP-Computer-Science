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
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < first.length && j < second.length)
		{
			if (first[i] < second[j])
			{
				arr[k] = first[i];
				i++;
			}
			else
			{
				arr[k] = second[j];
				j++;
			}
			k++;
		}
		System.arraycopy(first, i, arr, k, first.length - i);
		System.arraycopy(second, j, arr, k, second.length - j);
	}
}