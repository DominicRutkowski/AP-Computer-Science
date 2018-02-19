import java.util.Random;

public class FreeResponse
{
	private int[] ary = new int[10000];

	private FreeResponse()
	{
		fillArray();
		final int target = 1234;
		int[] secondAry = ary.clone();

		long aryStart = System.currentTimeMillis();
		Searcher arySearch = new Searcher(ary);
		boolean foundAry = arySearch.seqSearch(target);
		long aryStop = System.currentTimeMillis();
		int aryTime = (int) (aryStop - aryStart);

		long secondAryStart = System.currentTimeMillis();
		Sorter secondArySort = new Sorter(secondAry);
		secondArySort.mergeSort();
		Searcher secondArySearch = new Searcher(secondAry);
		boolean foundSecondAry = secondArySearch.binSearch(target);
		long secondAryStop = System.currentTimeMillis();
		int secondAryTime = (int) (secondAryStop - secondAryStart);

		System.out.println("Idea #1:  Found = " + foundAry + "\t\t" + "Time = " + aryTime + "\n");
		System.out.println("Idea #2:  Found = " + foundSecondAry + "\t\t" + "Time = " + secondAryTime);
	}

	public static void main(String[] args)
	{
		FreeResponse app = new FreeResponse();
	}

	private void fillArray()
	{
		Random generator = new Random();
		for (int j = 0; j < ary.length; j++)
		{
			ary[j]= generator.nextInt(9000) + 1000;
		}
	}
}