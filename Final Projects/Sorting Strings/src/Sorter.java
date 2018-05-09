import java.util.Arrays;

public class Sorter
{
	private static int compare(String one, String two)
	{
		return 0;
	}

	public static void main(String[] args)
	{
		String[] list = {"C7", "A123", "D221", "A52", "B83", "A2", "A44", "C19", "C37", "D32", "B567", "D6"};
		Arrays.sort(list);
		System.out.println("Sorted as Strings");
		for (String item : list)
		{
			System.out.print(item + " ");
		}

		// Sort again
		System.out.println("\n\nSorted as Strings and Integers");
		for (String item : list)
		{
			System.out.print(item + " ");
		}
	}
}