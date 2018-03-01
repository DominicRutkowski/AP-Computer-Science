// Dominic Rutkowski
//
/* This driver class simulates the change
   in balance of many BankAccounts.
*/

import java.awt.Container;
import java.awt.Font;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.util.ArrayList;
import java.util.Scanner;

public class U7A2 extends JFrame
{
	private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
	private JTextArea text = new JTextArea();

	private U7A2()
	{
		buildList("myCreditUnion.txt");
		printList();

		deposit("103s", 500);
		withdraw("110s", 304.52);
		insertNewAccount("105c", 300);
		deleteDormantAccounts();
		correctError("107s", 1113.88);
		applyInterest();
		insertNewAccount("111s", 100);
		fileUpdated("Temp.txt");

		text.setFont(new Font("Monospaced", Font.PLAIN, 12));
		Container cont = getContentPane();
		cont.add(text);
		setSize(500, 500);
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
		text.append("Account#\tBalance\n");
		for (BankAccount account : accounts)
		{
			text.append(account.getAccountNumber() + String.valueOf(account.getAccountType()) + "\t\t" + account.getBalance() + "\n");
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

	private void insertNewAccount(String accountInformation, double balance)
	{
		int accountNumber = Integer.parseInt(accountInformation.substring(0, 3));
		char accountType = accountInformation.charAt(3);
		if (accountType == 's')
		{
			accounts.add(new BankAccount(accountInformation, balance));
		}
		else
		{
			boolean flag = false;
			for (int i = 0; i < accounts.size(); i++)
			{
				if (accounts.get(i).getAccountNumber() == accountNumber)
				{
					accounts.add(i + 1, new BankAccount(accountInformation, balance));
					flag = true;
					break;
				}
			}
			if (!flag)
			{
				accounts.add(new BankAccount(accountInformation, balance));
			}
		}
		text.append("\nNew Account Added");
	}

	private void deleteDormantAccounts()
	{
		int accountsRemoved = 0;
		for (int i = 0; i < accounts.size(); i++)
		{
			if (accounts.get(i).getBalance().equals("$ 0.00"))
			{
				accounts.remove(i);
				accountsRemoved++;
				i--;
			}
		}
		text.append("\n" + accountsRemoved + " Account(s) Removed");
	}

	private void correctError(String accountInformation, double balance)
	{
		int accountNumber = Integer.parseInt(accountInformation.substring(0, 3));
		char accountType = accountInformation.charAt(3);
		for (BankAccount account : accounts)
		{
			if (account.getAccountNumber() == accountNumber && account.getAccountType() == accountType)
			{
				account.setBalance(balance);
				text.append("\nCorrection Completed");
				break;
			}
		}
	}

	private void applyInterest()
	{
		for (BankAccount account : accounts)
		{
			account.calculateInterest();
		}
		text.append("\nInterest Applied to all Savings Accounts");
	}

	private void fileUpdated(String path)
	{
		try
		{
			FileWriter writer = new FileWriter(path);
			PrintWriter out = new PrintWriter(writer);

			String output = "";
			int count = 1;
			for (BankAccount account : accounts)
			{
				output += account.getAccountNumber() + String.valueOf(account.getAccountType()) + " " + account.getBalance().substring(2);
				if (count <= accounts.size())
				{
					output += "\n";
				}
				count++;
			}

			out.println(output);
			out.close();
		}
		catch (IOException e)
		{
			throw new RuntimeException(e.toString());
		}
		text.append("\nFile Updated");
	}

	public static void main(String[] args)
	{
		U7A2 app = new U7A2();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}