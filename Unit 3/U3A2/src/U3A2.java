// Dominic Rutkowski
//
/* This Java applet aids users in
   determining the income tax they
   owe, based on the deductions
   that they qualify for and their
   income over one year.
*/

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

public class U3A2 extends Applet
{
	// Instance fields
	private String name;
	private String taxString;
	
	// Init() method, required for applets
	public void init()
	{
		// Variable declaration (with local scope)
		String filingStatus;
		String blind;
		String over65;
		String numberExemptions;
		String income;
		String withheld;
		String spouseBlind;
		String spouseOver65;
		double tax;
		
		// Gathers data about the filer
		name = JOptionPane.showInputDialog("Enter your name:");
		filingStatus = JOptionPane.showInputDialog("Enter Filing Status - Single(S) or Married(M):");
		blind = JOptionPane.showInputDialog("Are you blind? Yes or No:");
		over65 = JOptionPane.showInputDialog("Are you over 65? Yes or No:");
		numberExemptions = JOptionPane.showInputDialog("Enter total number of exemptions:");
		income = JOptionPane.showInputDialog("Enter wages, salaries, & tips:");
		withheld = JOptionPane.showInputDialog("Enter Income Tax Withheld:");
		
		// Gathers data about the filer's spouse if the filer is married
		spouseBlind = "No";
		spouseOver65 = "No";
		if (filingStatus.equals("M"))
		{
			spouseBlind = JOptionPane.showInputDialog("Is your spouse blind? Yes or No:");
			spouseOver65 = JOptionPane.showInputDialog("Is your spouse over 65? Yes or No:");
		}
		
		// Calculates the number of deductions, each worth $1000
		int deductions = Integer.parseInt(numberExemptions);
		if (blind.equals("Yes"))
		{
			deductions++;
		}
		if (over65.equals("Yes"))
		{
			deductions++;
		}
		if (spouseBlind.equals("Yes"))
		{
			deductions++;
		}
		if (spouseOver65.equals("Yes"))
		{
			deductions++;
		}
		
		// Calculates the income
		int deductedIncome = Integer.parseInt(income) - (1000 * deductions);
		
		// Calculates the tax due based on the tax brackets, income, and amount withheld
		if (filingStatus.equals("M")) // Married filers
		{
			if (deductedIncome >= 0 && deductedIncome <= 35800) // First tax bracket
			{
				tax = 0.15 * deductedIncome;
			}
			else if (deductedIncome > 35800 && deductedIncome <= 86500) // Second tax bracket
			{
				tax = 5370 + (0.28 * (deductedIncome - 35800));
			}
			else // Third tax bracket
			{
				tax = 19566 + (0.31 * (deductedIncome - 86500));
			}
		}
		else // Single filers
		{
			if (deductedIncome >= 0 && deductedIncome <= 21450) // First tax bracket
			{
				tax = 0.15 * deductedIncome;
			}
			else if (deductedIncome > 21450 && deductedIncome <= 51900) // Second tax bracket
			{
				tax = 3217.5 + (0.28 * (deductedIncome - 21450));
			}
			else // Third tax bracket
			{
				tax = 11743.5 + (0.31 * (deductedIncome - 51900));
			}
		}
		tax = tax - Double.parseDouble(withheld);
		
		// Prints what the user owes or should be refunded
		if (tax >= 0)
		{
			taxString = String.format("       Owe =   $%.2f", tax);
		}
		else
		{
			taxString = String.format("    Refund =   $%.2f", (tax * -1));
		}
		
		// Sets the background color
		setBackground(Color.yellow);
	}
	
	// Paint method to display the applet to the user
	public void paint(Graphics g)
	{
		// Sets colors and fonts for the text output
		g.setColor(Color.blue);
		Font font = new Font("Monospaced", Font.BOLD, 16);
		g.setFont(font);
		
		// Prints what the user owes or should be refunded
		if (taxString.substring(7, 8).equals("O"))
		{
			g.drawString(name + ", below you will find", 50, 50);
			g.drawString("the results of your Tax Inquiry.", 50, 70);
			g.drawString(taxString, 50, 110);
		}
		else
		{
			g.drawString(name + ", below you will find", 50, 50);
			g.drawString("the results of your Tax Inquiry.", 50, 70);
			g.drawString(taxString, 50, 110);
		}
	}
}