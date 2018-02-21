// Dominic Rutkowski
//
/*
*/

import java.util.Random;

public class BankAccount
{
	private double balance;
	private int accountNumber;
	private static int lastAssignedAccountNumber = 100;

	public BankAccount()
	{
		lastAssignedAccountNumber++;
		accountNumber = lastAssignedAccountNumber;
		setBalance(1000);
	}

	private void setBalance(int max)
	{
		Random random = new Random();
		double balance;
		do
		{
			balance = random.nextDouble() * max;
		}
		while (balance == 0);
		this.balance = balance;
	}
}