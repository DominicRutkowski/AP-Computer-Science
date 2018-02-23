// Dominic Rutkowski
//
/*
*/

import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JTextArea;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class U7A2 extends JFrame
{
	private U7A2()
	{
		JTextArea text = new JTextArea();
		text.setFont(new Font("Monospaced", Font.PLAIN, 12));



		Container cont = getContentPane();
		cont.add(text);
		setSize(700, 700);
		setVisible(true);
	}

	private ArrayList<BankAccount> buildList(String path)
	{
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		try
		{
			Scanner reader = new Scanner(new File(path));
			String inputLine;
			while (reader.hasNext())
			{
				inputLine = reader.nextLine();
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
		U7A2 app = new U7A2();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}