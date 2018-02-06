// Dominic Rutkowski
//
/* This class creates two identical arrays and sorts
   them with merge sort and quick sort while
   timing the sorting algorithms. It displays the
   results in a JApplet.
*/

import javax.swing.JTextArea;
import javax.swing.JApplet;
import java.awt.Container;
import java.awt.Font;
import java.util.Random;

public class U6A2 extends JApplet
{
	public void init()
	{
		JTextArea text = new JTextArea();
		text.setFont(new Font("Monospaced", Font.PLAIN, 12));

		int[] array = buildArrays(10000, 999);
		int[] mergeArray = array.clone();
		int[] quickArray = array.clone();

		long mergeStart = System.currentTimeMillis();
		MergeSorter merge = new MergeSorter(mergeArray);
		merge.sort();
		long mergeStop = System.currentTimeMillis();
		int mergeTime = (int) (mergeStop - mergeStart);

		long quickStart = System.currentTimeMillis();
		QuickSorter quick = new QuickSorter(quickArray);
		quick.sort(0, quickArray.length - 1);
		long quickStop = System.currentTimeMillis();
		int quickTime = (int) (quickStop - quickStart);

		int[] mergeArraySorted = merge.getArr();
		int[] quickArraySorted = quick.getArr();

		text.setText("Unsorted Array\n\n");
		for (int i = 0; i < 15; i++)
		{
			text.append(array[i] + "\t");
		}
		text.append("\n   .\n   .\n   .\n\n");
		for (int i = array.length - 15; i < array.length; i++)
		{
			text.append(array[i] + "\t");
		}

		text.append("\n\n\nMergeSort\n\n");
		for (int i = 0; i < 15; i++)
		{
			text.append(mergeArraySorted[i] + "\t");
		}
		text.append("\n   .\n   .\n   .\n\n");
		for (int i = mergeArraySorted.length - 15; i < mergeArraySorted.length; i++)
		{
			text.append(mergeArraySorted[i] + "\t");
		}
		text.append("\n\n" + mergeTime + " milliseconds");

		text.append("\n\n\nQuickSort\n\n");
		for (int i = 0; i < 15; i++)
		{
			text.append(quickArraySorted[i] + "\t");
		}
		text.append("\n   .\n   .\n   .\n\n");
		for (int i = quickArraySorted.length - 15; i < quickArraySorted.length; i++)
		{
			text.append(quickArraySorted[i] + "\t");
		}
		text.append("\n\n" + quickTime + " milliseconds");

		Container cont = getContentPane();
		cont.add(text);
	}

	private int[] buildArrays(int length, int max)
	{
		int[] result = new int[length];
		Random rand = new Random();
		for (int i = 0; i < length; i++)
		{
			result[i] = rand.nextInt(max + 1);
		}
		return result;
	}
}