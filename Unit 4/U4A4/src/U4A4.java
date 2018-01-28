// Dominic Rutkowski
//
/* This program recursively determines the number of months
   it would take someone to pay off their credit card debt.
   It also calculates the credit card company's profit.
*/

import java.util.Scanner;

public class U4A4
{
	private double balance;
	private double minimumPayment;
	private double apr;
	
	private int months = 0;
	private double profit = 0;
	
	public static void main(String[] args)
	{
		U4A4 app = new U4A4();
	}
	
	private U4A4()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter credit card balance: ");
		balance = input.nextDouble();
		
		System.out.print("\nEnter minimum monthly payment <as a % of the balance>: ");
		minimumPayment = input.nextDouble();
		
		System.out.print("\nEnter the annual percentage rate: ");
		apr = input.nextDouble();
		
		profit -= balance;
		getMonths();
		
		System.out.println("\n\nNumber of months to pay off debt: " + months);
		System.out.printf("%nProfit for the credit card company = $%.2f%n%n", profit);
	}
	
	private void getMonths()
	{
		months++;
		
		double payment = balance * (minimumPayment / 100);
		
		if (payment < 20)
		{
			payment = 20;
		}
		
		if (balance < 20)
		{
			profit += balance;
			balance = 0;
		}
		else
		{
			profit += payment;
			
			balance = (balance * (1 + ((apr / 100) / 12))) - payment;
			
			if (balance > 0)
			{
				getMonths();
			}
		}
	}
}