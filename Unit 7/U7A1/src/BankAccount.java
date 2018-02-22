// Dominic Rutkowski
//
/* This class represents bank accounts. It allows for
   deposits, withdrawals, interest accumulation, etc.
*/

import java.util.Random;

public class BankAccount
{
	private double balance;
	private int accountNumber;
	private static int lastAssignedAccountNumber = 100;
	private static final double interestRate = 4;

	public BankAccount()
	{
		lastAssignedAccountNumber++;
		accountNumber = lastAssignedAccountNumber;
		setBalance(1000);
	}

	public BankAccount(double balance)
	{
		lastAssignedAccountNumber++;
		accountNumber = lastAssignedAccountNumber;
		this.balance = balance;
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

	public String deposit(double amount)
	{
		if (amount > 0)
		{
			balance += amount;
			return "Deposit Accepted";
		}
		return "Deposit Rejected";
	}

	public String withdraw(double amount)
	{
		if (amount <= balance)
		{
			balance -= amount;
			return "Withdrawal Accepted";
		}
		return "Withdrawal Denied - Insufficient Funds";
	}

	public void calculateInterest()
	{
		balance *= 1 + (interestRate / 100);
	}

	public String transaction(BankAccount account, double amount)
	{
		if (withdraw(amount).equals("Withdrawal Accepted"))
		{
			account.deposit(amount);
			return "Transaction Accepted";
		}
		return "Transaction Denied - Insufficient Funds";
	}

	public int getAccountNumber()
	{
		return accountNumber;
	}

	public String getBalance()
	{
		return String.format("$ %.2f", balance);
	}

	public static String getInterestRate()
	{
		return String.format("%.1f", interestRate);
	}
}