// Dominic Rutkowski
/*
*/

import java.util.ArrayList;

public class Trick
{
    private ArrayList<Card> cards = new ArrayList<Card>();
    private int points = 0;

    public Trick(ArrayList<Card> cards)
    {
        this.cards = cards;
        setTotalPoints();
    }

    private void setTotalPoints()
    {
        for (Card card : cards)
        {
            points += card.getPoints();
        }
    }

    public int getPoints()
    {
        return points;
    }

    public String toString()
    {
        String cardsString = "";
        for (Card card : cards)
        {
            cardsString += card.toString() + "\n";
        }
        return cardsString;
    }

    public Card getWinner()
    {
        String winningSuit = cards.get(0).getSuit();
        Card highestCard = cards.get(0);
        for (int i = 1; i < cards.size(); i++)
        {
            if (cards.get(i).getSuit().equals(winningSuit) && cards.get(i).compareTo(highestCard) > 0)
            {
                highestCard = cards.get(i);
            }
        }
        return highestCard;
    }
}