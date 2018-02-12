// Dominic Rutkowski
//
/* This project sorts an array of Strings by length
   and by lexicographical order. It then searches
   each array for a String called "Jones".
*/

import javax.swing.JApplet;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.Font;

public class U6Test extends JApplet
{
	private final String[] array = {"Barr", "Chamberlain", "Fullam",
			"Gertler", "Jones", "Krantzler", "Ferguson", "Litchfield",
			"Johnson", "Sundeen", "Baker", "Celebucki", "Dunagan",
			"Eckert", "Framke", "Hoekstra", "Jackson", "Klupchak",
			"Kurtz", "Mahler", "Maxwell", "Rothermel", "Tarjan",
			"Tiller", "Turek"};
	
	public void init()
	{
		JTextArea text = new JTextArea();
		text.setFont(new Font("Monospaced", Font.PLAIN, 12));
		
		String[] alphabeticalArray = array.clone();
		String[] lengthArray = array.clone();
		lexicographicalSort(alphabeticalArray);
		lengthSort(lengthArray);
		
		text.setText("Sorted Alphabetically\tSorted by Length\n---------------------\t----------------\n");
		for (int i = 0; i < array.length; i++)
		{
			int tabs;
			if (alphabeticalArray[i].length() < 8)
			{
				tabs = 3;
			}
			else if (alphabeticalArray[i].length() < 16)
			{
				tabs = 2;
			}
			else
			{
				tabs = 1;
			}
			text.append(alphabeticalArray[i]);
			for (int j = 0; j < tabs; j++)
			{
				text.append("\t");
			}
			text.append(lengthArray[i] + "\n");
		}
		
		String target = "Jones";
		int alphabeticalIndex = binarySearch(alphabeticalArray, target);
		int lengthIndex = sequentialSearch(lengthArray, target);
		
		text.append("\n" + target + " at index " + alphabeticalIndex + "\t" + target + " at index " + lengthIndex);
		
		Container cont = getContentPane();
		cont.add(text);
	}
	
	private void lexicographicalSort(String[] arr)
	{
		String temp;
		int j;
		for (int n = 1; n < arr.length; n++)
		{
			temp = arr[n];
			j = n;
			while (j > 0 && temp.compareTo(arr[j - 1]) < 0)
			{
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
	}
	
	private void lengthSort(String[] arr)
	{
		lexicographicalSort(arr);
		String temp;
		int j;
		for (int n = 1; n < arr.length; n++)
		{
			temp = arr[n];
			j = n;
			while (j > 0 && temp.length() < arr[j - 1].length())
			{
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
	}
	
	private int sequentialSearch(String[] arr, String target)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i].equals(target))
			{
				return i;
			}
		}
		return -1;
	}
	
	private int binarySearch(String[] arr, String target)
	{
		int low = 0;
		int high = arr.length - 1;
		int mid;
		int dif;
		while (low <= high)
		{
			mid = (low + high) / 2;
			dif = arr[mid].compareTo(target);
			if (dif == 0)
			{
				return mid;
			}
			else if (dif < 0)
			{
				low = mid + 1;
			}
			else
			{
				high = mid - 1;
			}
		}
		return -1;
	}
}