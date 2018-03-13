// Dominic Rutkowski
/*
*/

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class U8A3
{
    public static void main(String[] args)
    {
        ArrayList<Card> cards = new ArrayList<Card>();
        for (int i = 0; i < 5; i++)
        {
            String input = JOptionPane.showInputDialog("Please enter a card:");
            int space = input.indexOf(' ');
            String suit = input.substring(0, space);
            int value = Integer.parseInt(input.substring(space + 1));
            cards.add(new Card(suit, value));
        }
        Trick trick = new Trick(cards);

        System.out.println("The Trick:\n");
        System.out.println(trick.toString());
        System.out.println("Winning Card = " + trick.getWinner().toString() + "\n");
        System.out.println("Points in Trick = " + trick.getPoints());
    }
}