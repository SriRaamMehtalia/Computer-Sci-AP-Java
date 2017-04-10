//SriRaam A. Mehtalia Period 5
//AList-A4: Card Class(11s)

/**
 * This is a class that tests the Card class.
 */
public class CardTester_Mehtalia {

 /**
  * The main method in this class checks the Card operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) 
   {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
      //Cards created
      Card card1 = new Card("King", "spades", 10);
      Card card2 = new Card("King", "spades", 10);
      Card card3 = new Card("five", "diamonds", 5);
      
      //Tests of methods: matching, accessor methods, etc
      System.out.println(card1.matches(card2));
      System.out.println(card2.matches(card3));
      System.out.println("card 1 is suit " + card1.suit());
      System.out.println("card 1 is rank " + card1.rank());
      System.out.println("card 1 is value " + card1.pointValue());
      System.out.println("card 2 is suit " + card2.suit());
      System.out.println("card 2 is rank " + card2.rank());
      System.out.println("card 2 is value " + card2.pointValue());
      System.out.println("card 3 has suit " + card3.suit());
      System.out.println("card 3 has rank " + card3.rank());
      System.out.println("card 3 is value " +  card3.pointValue());
      
      //ToString method tests
      System.out.println(card1.toString());
      System.out.println(card2.toString());
      System.out.println(card3.toString());
 }
}


class Card 
{

 /**
  * String value that holds the suit of the card
  */
 private String suit;

 /**
  * String value that holds the rank of the card
  */
 private String rank;

 /**
  * int value that holds the point value.
  */
 private int pointValue;


   /**
  * Creates a new <code>Card</code> instance.
  *
  * @param cardRank  a <code>String</code> value
  *                  containing the rank of the card
  * @param cardSuit  a <code>String</code> value
  *                  containing the suit of the card
  * @param cardPointValue an <code>int</code> value
  *                  containing the point value of the card
  */
 public Card(String cardRank, String cardSuit, int cardPoints) 
 {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
      rank = cardRank;
      suit = cardSuit;
      pointValue = cardPoints;
 }


 /**
  * Accesses this <code>Card's</code> suit.
  * @return this <code>Card's</code> suit.
  */
 public String suit() 
   {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
      return suit;
   }

 /**
  * Accesses this <code>Card's</code> rank.
  * @return this <code>Card's</code> rank.
  */
 public String rank() 
   {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
      return rank;
 }

   /**
  * Accesses this <code>Card's</code> point value.
  * @return this <code>Card's</code> point value.
  */
 public int pointValue() 
   {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
      return pointValue;
 }

 /** Compare this card with the argument.
  * @param otherCard the other card to compare to this
  * @return true if the rank, suit, and point value of this card
  *              are equal to those of the argument;
  *         false otherwise.
  */
 public boolean matches(Card otherone) 
 {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
      if(this.pointValue() == otherone.pointValue())
      {
         if(this.rank().equals(otherone.rank())) {
            if(this.suit.equals(otherone.suit())) {
              
               return true;
            }
            return false;
         }
         return false;
      }
      return false;   
 }

 /**
  * Converts the rank, suit, and point value into a string in the format
  *     "[Rank] of [Suit] (point value = [PointValue])".
  * This provides a useful way of printing the contents
  * of a <code>Deck</code> in an easily readable format or performing
  * other similar functions.
  *
  * @return a <code>String</code> containing the rank, suit,
  *         and point value of the card.
  */
 @Override
 public String toString() 
   {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
      return rank + " of " + suit + " (point value = " + pointValue;
 }
}

