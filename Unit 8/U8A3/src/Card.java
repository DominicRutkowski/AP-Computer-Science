// Dominic Rutkowski
//
/* The Card class represents cards from a standard
   set of 52 cards. It is used to implement a game
   of hearts and can be compared to other cards.
*/

public class Card implements Comparable
{
    private String suit;
    private int value;
    private int points;

    public Card(String suit, int value)
    {
        this.suit = suit;
        this.value = value;
        setPoints();
    }

    private void setPoints()
    {
        if (suit.equals("Hearts"))
        {
            points = 1;
        }
        if (suit.equals("Spades") && value == 12)
        {
            points = 13;
        }
    }

    public int compareTo(Object object) throws IllegalArgumentException
    {
        if (object instanceof Card)
        {
            Card card = (Card) object;
            return this.getValue() - card.getValue();
        }
        else
        {
            throw new IllegalArgumentException("Must pass a Card object.");
        }
    }

    public String getSuit()
    {
        return suit;
    }

    public int getValue()
    {
        return value;
    }

    public int getPoints()
    {
        return points;
    }

    public String toString()
    {
        String card;
        switch (value)
        {
            case 14:
                card = "Ace";
                break;
            case 13:
                card = "King";
                break;
            case 12:
                card = "Queen";
                break;
            case 11:
                card = "Jack";
                break;
            default:
                card = Integer.toString(value);
                break;
        }
        card += " of " + suit;
        return card;
    }
}