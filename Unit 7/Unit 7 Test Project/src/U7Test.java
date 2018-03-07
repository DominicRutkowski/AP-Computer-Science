// Dominic Rutkowski
//
/*
*/

import java.awt.Container;
import java.awt.Font;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class U7Test extends JFrame
{
	private ArrayList<BBPlayer> players = new ArrayList<BBPlayer>();
	private JTextArea text = new JTextArea();

	private U7Test()
	{
		text.setFont(new Font("Monospaced", Font.PLAIN, 12));
		Container cont = getContentPane();
		cont.add(text);
	}

	private void printList()
	{
		text.append("Number\tYear\tPosition\tPoint Per Game\n");
		text.append("------\t----\t--------\t--------------\n");
		for (BBPlayer player : players)
		{
			text.append("  " + player.getNum() + "\t " + player.getYear());
		}
	}

	private void sort()
	{

	}

	public static void main(String[] args)
	{
		U7Test app = new U7Test();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}