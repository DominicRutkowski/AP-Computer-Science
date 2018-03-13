// Dominic Rutkowski
//
/*
*/

import java.awt.Container;
import java.awt.Font;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.util.Scanner;

public class U8A1 extends JFrame
{
    private U8A1()
    {
        JTextArea text = new JTextArea();

        DataSet BBPlayerData = readBBPlayerData("src/BBPlayerData.txt");
        text.append("BBPlayer Stats\n--------------\n\n");
        text.append("Minimum Points Per Game = " + String.format("%.1f", BBPlayerData.getMin()) + "\n\n");
        text.append("Maximum Points Per Game = " + String.format("%.1f", BBPlayerData.getMax()) + "\n\n");
        text.append("Average Points Per Game = " + String.format("%.2f", BBPlayerData.getAve()) + "\n\n");

        DataSet BankAccountData = readBankAccountData("src/BankAccountData.txt");
        text.append("\nBankAccount Stats\n-----------------\n\n");
        text.append("Minimum Bank Account = " + String.format("%.2f", BankAccountData.getMin()) + "\n\n");
        text.append("Maximum Bank Account = " + String.format("%.2f", BankAccountData.getMax()) + "\n\n");
        text.append("Average Bank Account = " + String.format("%.2f", BankAccountData.getAve()) + "\n\n");

        text.setFont(new Font("Monospaced", Font.PLAIN, 12));
        Container cont = getContentPane();
        cont.add(text);
        setSize(300, 500);
        setVisible(true);
    }

    private DataSet readBBPlayerData(String path)
    {
        String input;
        DataSet data = new DataSet();
        try
        {
            Scanner reader = new Scanner(new File(path));
            while (reader.hasNext())
            {
                input = reader.nextLine();
                data = new DataSet(new BBPlayer(input));
            }
            reader.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e.toString());
        }
        return data;
    }

    private DataSet readBankAccountData(String path)
    {
        String input;
        DataSet data = new DataSet();
        try
        {
            Scanner reader = new Scanner(new File(path));
            while (reader.hasNext())
            {
                input = reader.nextLine();
                String accountInfo = input.substring(0, 4);
                double balance = Double.parseDouble(input.substring(5));
                data = new DataSet(new BankAccount(accountInfo, balance));
            }
            reader.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e.toString());
        }
        return data;
    }

    public static void main(String[] args)
    {
        U8A1 app = new U8A1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}