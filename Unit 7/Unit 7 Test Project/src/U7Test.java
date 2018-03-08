// Dominic Rutkowski
//
/* This application uses the BBPlayer class to show
   that objects are better than parallel arrays.
*/

import java.awt.Container;
import java.awt.Font;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class U7Test extends JFrame
{
	private ArrayList<BBPlayer> players = new ArrayList<BBPlayer>();
	private JTextArea text = new JTextArea();

	private U7Test()
	{
		readTextFile();
		text.append("Original List\n\n");
		printList();
		text.append("\n\n\nSorted List\n\n");
		sort();
		printList();

		text.setFont(new Font("Monospaced", Font.PLAIN, 12));
		Container cont = getContentPane();
		cont.add(text);
		setSize(500, 500);
		setVisible(true);
	}

	private void printList()
	{
		text.append("Number\tYear\tPosition\tPoint Per Game\n");
		text.append("------\t----\t--------\t--------------\n");
		for (BBPlayer player : players)
		{
			text.append("  " + player.getNum() + "\t " + player.getYear() + "\t   " + player.getPos() + "\t\t     " + player.getPpg() + "\n");
		}
	}

	private void sort()
	{
		int j;
		BBPlayer temp;
		for (int n = 1; n < players.size(); n++)
		{
			temp = players.get(n);
			j = n;
			while (j > 0 && temp.getPpg() > players.get(j - 1).getPpg())
			{
				players.set(j, players.get(j - 1));
				j--;
			}
			players.set(j, temp);
		}
	}

	private void readTextFile()
	{
		try
		{
			Scanner reader = new Scanner(new File("src/U7Test.txt"));
			while (reader.hasNext())
			{
				String inputLine = reader.nextLine();
				players.add(new BBPlayer(inputLine));
			}
			reader.close();
		}
		catch (IOException e)
		{
			throw new RuntimeException(e.toString());
		}
	}

	public static void main(String[] args)
	{
		U7Test app = new U7Test();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}