// Dominic Rutkowski
//
/* This class sorts a list of Strings as
   Strings and then as Strings and Integers.
*/

import java.util.Arrays;

public class Sorter
{
	private Sorter()
	{
		String[] list = {"C7", "A123", "D221", "A52", "B83", "A2", "A44", "C19", "C37", "D32", "B567", "D6"};
		Arrays.sort(list);
		System.out.println("Sorted as Strings");
		for (String item : list)
		{
			System.out.print(item + " ");
		}

		int j;
		String temp;
		for (int n = 1; n < list.length; n++)
		{
			temp = list[n];
			j = n;
			while (j > 0 && compare(temp, list[j - 1]) < 0)
			{
				list[j] = list[j - 1];
				j--;
			}
			list[j] = temp;
		}
		System.out.println("\n\nSorted as Strings and Integers");
		for (String item : list)
		{
			System.out.print(item + " ");
		}
		System.out.print("\n");
	}

	private int compare(String one, String two)
	{
		final String KEY = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int firstLetter = KEY.indexOf(one.substring(0, 1)) - KEY.indexOf(two.substring(0, 1));
		if (firstLetter == 0)
		{
			return Integer.parseInt(one.substring(1)) - Integer.parseInt(two.substring(1));
		}
		return firstLetter;
	}

	public static void main(String[] args)
	{
		Sorter app = new Sorter();
	}
}