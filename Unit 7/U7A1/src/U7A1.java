// Dominic Rutkowski
//
/* This driver class simulates the change
   in balance of two BankAccounts.
*/

import javax.swing.JTextArea;
import javax.swing.JApplet;
import java.awt.Container;
import java.awt.Font;

public class U7A1 extends JApplet
{
	public void init()
	{
		JTextArea text = new JTextArea();
		text.setFont(new Font("Monospaced", Font.PLAIN, 12));
		text.setText("Account Information\n-------------------\n");

		BankAccount accountOne = new BankAccount();
		BankAccount accountTwo = new BankAccount(1500);

		text.append("\nInitial Balance for Account " + accountOne.getAccountNumber() + " = " + accountOne.getBalance());
		text.append("\nInitial Balance for Account " + accountTwo.getAccountNumber() + " = " + accountTwo.getBalance() + "\n");
		text.append("\n" + accountOne.deposit(300));
		text.append("\n" + accountTwo.deposit(200));
		text.append("\n" + accountOne.withdraw(250));
		text.append("\n" + accountTwo.withdraw(125));
		accountOne.calculateInterest();
		accountTwo.calculateInterest();
		if (accountOne.transaction(accountTwo, 550).equals("Transaction Accepted"))
		{
			text.append("\nWithdrawal Accepted\nDeposit Accepted");
		}
		else
		{
			text.append("\nWithdrawal Denied - Insufficient Funds\nDeposit Rejected");
		}
		accountOne.calculateInterest();
		accountTwo.calculateInterest();
		text.append("\n\nFinal Balance for Account " + accountOne.getAccountNumber() + " = " + accountOne.getBalance());
		text.append("\n\nFinal Balance for Account " + accountTwo.getAccountNumber() + " = " + accountTwo.getBalance());
		text.append("\n\nInterest Rate = " + BankAccount.getInterestRate() + " %");

		Container cont = getContentPane();
		cont.add(text);
	}
}