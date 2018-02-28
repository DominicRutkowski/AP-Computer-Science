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
	private ArrayList<BankAccount> accounts;
	private JTextArea text = new JTextArea();

	private U7A2()
	{
		buildList("myCreditUnion.txt");
		printList();

		Container cont = getContentPane();
		cont.add(text);
		setSize(700, 700);
		setVisible(true);
	}

	private void buildList(String path)
	{
		try
		{
			Scanner reader = new Scanner(new File(path));
			String inputLine;
			while (reader.hasNext())
			{
				inputLine = reader.nextLine();
				BankAccount account = new BankAccount(inputLine.substring(0, 4), Double.parseDouble(inputLine.substring(5)));
				accounts.add(account);
			}
			reader.close();
		}
		catch (IOException e)
		{
			throw new RuntimeException(e.toString());
		}
	}

	private void printList()
	{
		text.setFont(new Font("Monospaced", Font.PLAIN, 12));

		text.setText("Account#\tBalance");
		for (BankAccount account : accounts)
		{
			text.append(account.getAccountNumber() +account.getAccountType() + "\t\t" + account.getBalance() + "\n");
		}
	}

	private void deposit(String accountInformation, double amount)
	{
		int accountNumber = Integer.parseInt(accountInformation.substring(0, 3));
		char accountType = accountInformation.charAt(3);

		for (BankAccount account : accounts)
		{
			if (account.getAccountNumber() == accountNumber && account.getAccountType() == accountType)
			{
				text.append("\n" + account.deposit(amount));
				break;
			}
		}
	}

	private void withdraw(String accountInformation, double amount)
	{
		int accountNumber = Integer.parseInt(accountInformation.substring(0, 3));
		char accountType = accountInformation.charAt(3);

		for (BankAccount account : accounts)
		{
			if (account.getAccountNumber() == accountNumber && account.getAccountType() == accountType)
			{
				text.append("\n" + account.withdraw(amount));
				break;
			}
		}
	}

	private void insertNewAccount(String accountInformation, double amount)
	{
		int accountNumber = Integer.parseInt(accountInformation.substring(0, 3));
		char accountType = accountInformation.charAt(3);
	}

	public static void main(String[] args)
	{
		U7A2 app = new U7A2();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}