package frustration;


public class Card
{
    public static final int DIAMOND = 1;
    public static final int CLUB = 2;
    public static final int HEART = 3;
    public static final int SPADE = 4;
    
    private static final String[] Suit = { "*", "Diamond", "Club", "Heart", "Spade"};
    private static final String[] Rank = { "*", "*", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    private int cardSuit;
    private int cardRank;

    public Card( int suit, int rank )
    {
        if ( rank == 1 )
           cardRank = 14;
        else
           cardRank = (int) rank;

        cardSuit = (int) suit;
    }

    public String getSuit()
    {
       return Suit[cardSuit];
    }

    public String getRank()
    {
       return Rank[cardRank];
    }

    public String toString()
    {
       return (Rank[cardRank] + Suit[cardSuit]);
    }
}
