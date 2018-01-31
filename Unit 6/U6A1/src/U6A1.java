// Dominic Rutkowski
//
/* This class creates two identical arrays and sorts
   them with insertion sort and selection sort while
   timing the sorting algorithms. It displays the
   results in a JApplet.
*/

import javax.swing.JTextArea;
import javax.swing.JApplet;
import java.awt.Container;
import java.awt.Font;
import java.util.Random;

public class U6A1 extends JApplet
{
	public void init()
	{
		JTextArea text = new JTextArea();
		text.setFont(new Font("Monospaced", Font.PLAIN, 12));

		int[] array = buildArrays(10000, 999);
		int[] selectionArray = array.clone();
		int[] insertionArray = array.clone();

		Sorting selection = new Sorting(selectionArray);
		Sorting insertion = new Sorting(insertionArray);

		int selectionTime = selection.selectionSort();
		int insertionTime = insertion.insertionSort();

		int[] selectionArraySorted = selection.getArr();
		int[] insertionArraySorted = insertion.getArr();

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

		text.append("\n\n\nAfter Selection Sort\n\n");
		for (int i = 0; i < 15; i++)
		{
			text.append(selectionArraySorted[i] + "\t");
		}
		text.append("\n   .\n   .\n   .\n\n");
		for (int i = selectionArraySorted.length - 15; i < selectionArraySorted.length; i++)
		{
			text.append(selectionArraySorted[i] + "\t");
		}
		text.append("\n\nTime = " + selectionTime + " milliseconds");

		text.append("\n\n\nAfter Insertion Sort\n\n");
		for (int i = 0; i < 15; i++)
		{
			text.append(insertionArraySorted[i] + "\t");
		}
		text.append("\n   .\n   .\n   .\n\n");
		for (int i = insertionArraySorted.length - 15; i < insertionArraySorted.length; i++)
		{
			text.append(insertionArraySorted[i] + "\t");
		}
		text.append("\n\nTime = " + insertionTime + " milliseconds");

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