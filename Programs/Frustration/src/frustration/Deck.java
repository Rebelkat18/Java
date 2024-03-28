package frustration;

   public class Deck
   {
      public static final int NCARDS = 52;
    
      private Card[] deck;
      private int currentCard;         
    
      public Deck()
      {
   	 deck = new Card[NCARDS];
    
   	 int i = 0;
    
   	 for(int suit = Card.SPADE; suit <= Card.DIAMOND; suit++)
         {
   	    for(int rank = 1; rank <= 13; rank++)
            {
   		deck[i++] = new Card(suit, rank);
            }
         }
   	 currentCard = 0;
      }
     
      public void shuffle(int n)
      {
   	 for(int k = 0; k < n; k++ )
   	 {
   	     int i = (int)(NCARDS * Math.random());  // Pick 2 random cards
   	     int j = (int)(NCARDS * Math.random());  
   	     Card temp = deck[i]; //Swap
   	     deck[i] = deck[j];
   	     deck[j] = temp;
   	 }
    
   	 currentCard = 0;   // Reset current card to deal
      }
      
      public Card deal()
      {
   	 if(currentCard < NCARDS)
   	 {
   	    return deck[currentCard++];
   	 }
   	 else
   	 {
   	    System.out.println("Out of cards error");
   	    return null;
   	 }
      }
    
      public String toString()
      {
   	 String s = "";
   	 int k = 0;
   	 for(int i = 0; i < 4; i++)
   	 {
   	    for(int j = 1; j <= 13; j++)
   		s += (deck[k++] + " ");
    
   	    s += "\n";
   	 }
   	 return (s);
      }
   }