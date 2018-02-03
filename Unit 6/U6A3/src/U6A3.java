// Dominic Rutkowski
//
/* This JApplet creates an arrays of 300 integers
   and searches for 5 targets with both sequential
   and binary search while counting the number of
   array indices accessed by each algorithm.
*/

import javax.swing.JApplet;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Container;

public class U6A3 extends JApplet
{
	private int[] arr;
	private final int[] targets = {2,2629,11176,27032,43661};
	
	public void init()
	{
		JTextArea text = new JTextArea();
		text.setFont(new Font("Monospaced", Font.PLAIN, 12));
		text.setText("The Array\n");
		
		buildArray(300);
		for (int i = 0; i < arr.length; i++)
		{
			if (i % 15 == 0)
			{
				text.append("\n");
			}
			text.append(arr[i] + "\t");
		}
		
		text.append("\n\n\n\nSearch Comparisons using # of visits to the Array");
		text.append("\n\nNumber\tSequential\tBinary\n------\t----------\t------\n");
		for (int target : targets)
		{
			String seqResult = "Not Found";
			if (sequential(target) != -1)
			{
				seqResult = Integer.toString(sequential(target));
			}
			String binResult = "Not Found";
			if (binary(target) != -1)
			{
				binResult = Integer.toString(binary(target));
			}
			
			if (seqResult.length() > 8)
			{
				text.append(target + "\t" + seqResult + "\t" + binResult + "\n");
			}
			else
			{
				text.append(target + "\t" + seqResult + "\t\t" + binResult + "\n");
			}
		}
		
		Container cont = getContentPane();
		cont.add(text);
	}
	
	private void buildArray(int length)
	{
		arr = new int[length];
		arr[0] = 1;
		for (int i = 1; i < length; i++)
		{
			arr[i] = arr[i - 1] + i;
		}
	}
	
	private int sequential(int target)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == target)
			{
				return i + 1;
			}
		}
		return -1;
	}
	
	private int binary(int target)
	{
		int low = 0;
		int high = arr.length - 1;
		int mid;
		int dif;
		int count = 0;
		while (low <= high)
		{
			count++;
			mid = (low + high) / 2;
			dif = arr[mid] - target;
			
			if (dif == 0)
			{
				return count;
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