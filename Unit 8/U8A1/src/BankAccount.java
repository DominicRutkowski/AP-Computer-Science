// Dominic Rutkowski
//
/* This class represents bank accounts. It allows for
   deposits, withdrawals, interest accumulation, etc.
*/

public class BankAccount implements Measurable
{
	private double balance;
	private int accountNumber;
	private char accountType;
	private static final double interestRate = 4;

	public BankAccount(String accountInformation, double balance)
	{
		accountNumber = Integer.parseInt(accountInformation.substring(0, accountInformation.length() - 1));
		setAccountType(accountInformation);
		this.balance = balance;
	}

	private void setAccountType(String accountInformation)
	{
		accountType = accountInformation.charAt(accountInformation.length() - 1);
	}

	public void setBalance(double balance)
	{
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
		if (accountType == 's')
		{
			balance *= 1 + (interestRate / 100);
		}
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

	public char getAccountType()
	{
		return accountType;
	}

	public double getMeasure()
	{
		return balance;
	}

	public static String getInterestRate()
	{
		return String.format("%.1f", interestRate);
	}
}