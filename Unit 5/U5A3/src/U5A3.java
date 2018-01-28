// Dominic Rutkowski
//
/* This JApplet generates random numbers to put
   into an array in ascending order. It then
   generates more numbers and adds them to the
   array in ascending order, and resizes the
   array if needed.
*/

import javax.swing.JApplet;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Container;

public class U5A3 extends JApplet
{
	private int[] array;
	private int length;
	
	public void init()
	{
		JTextArea text = new JTextArea();
		
		// Handles initial filling of the array
		int size = (int) ((51 * Math.random()) + 50);
		array = new int[size];
		length = 50;
		fillArray();
		
		// Adds the original portion of the array to the JTextArea
		text.append("Original Array\n");
		for (int j = 0; j < length; j++)
		{
			if (j % 10 == 0)
			{
				text.append("\n");
			}
			text.append(array[j] + "\t");
		}
		text.append("\n\nArray Length = " + array.length + "\n\n\n");
		
		// Generates 30 new numbers from 0-255
		int[] newIntegers = new int[30];
		for (int i = 0; i < newIntegers.length; i++)
		{
			newIntegers[i] = (int) (256 * Math.random());
		}
		
		// Inserts each new number in ascending order
		for (int i : newIntegers)
		{
			// Locates the index the new number should go in (j)
			int j = 0;
			boolean found = false;
			while ((j < length) && !found)
			{
				if (i > array[j])
				{
					j++;
				}
				else
				{
					found = true;
				}
			}
			
			// Inserts the new number at the index j
			insert(i, j);
		}
		
		// Adds the new array to the JTextArea
		text.append("Updated Array\n");
		for (int j = 0; j < length; j++)
		{
			if (j % 10 == 0)
			{
				text.append("\n");
			}
			text.append(array[j] + "\t");
		}
		text.append("\n\nArray Length = " + array.length);
		
		// Adds the JTextArea to the JApplet
		text.setFont(new Font("Monospaced", Font.BOLD, 12));
		Container cont = getContentPane();
		cont.add(text);
	}
	
	private void fillArray()
	{
		for (int i = 0; i < 50; i++)
		{
			array[i] = (int) ((5 * Math.random()) + (5 * i));
		}
	}
	
	private void insert(int value, int index)
	{
		try
		{
			System.arraycopy(array, index, array, index + 1, length - index);
			array[index] = value;
			length++;
		}
		catch (IndexOutOfBoundsException e)
		{
			resize();
			insert(value, index);
		}
	}
	
	private void resize()
	{
		JOptionPane.showMessageDialog(null, "Index out of Bounds - Resizing Array", "U5A3", JOptionPane.ERROR_MESSAGE);
		int[] newArray = new int[2 * array.length];
		System.arraycopy(array, 0, newArray, 0, array.length);
		array = newArray;
	}
}