//SriRaam A. Mehtalia Period 5
//AList-A6: Deck Class

import java.util.ArrayList;
import java.util.List;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester_MehtaliaS {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *    @param args is not used.
     */
    public static void main(String[] args) {
    
    //Creating all the objects, to be later tested
    String[] r1 = {"2", "jack", "Queen"};
    String[] s1 = {"diamond", "spades", "hearts"};
    int[] v1 = {2,10,10};
    
    
    String[] r2 = {"4", "7"};
    String[] s2 = {"diamond", "spades", "clubs"};
    int[] v2 = {4,7};
    
     //Q3: Create a deck that can be used for 21/Blackjack
    
    String[] names = {"Ace", "king", "Queen", "jack", "ten", "9", "8", "7", "6", "5", "4", "3", "2"};
    String[] oNames = {"diamond", "spades", "hearts", "clubs"};
    int[] nums= {11,10,10,10,10,9,8,7,6,5,4,3,2};
    
    String[] r4 = {"king"};
    String[] s4 = {"diamond"};
    int[] v4 = {10};
    
    Deck deck1 = new Deck(r1, s1, v1);
    Deck deck2 = new Deck(r2, s2, v2);
    Deck d3 = new Deck(names, oNames, nums);
    Deck d4 = new Deck(r4, s4, v4);
    
    //Method testing
    
    System.out.println("The size of deck 1 is " +deck1.size());
    System.out.println("The size of deck 2 is " +deck2.size());
    System.out.println("The size of deck 3 is " +d3.size());
    System.out.println("The size of deck 4 is " + d4.size());
    
    System.out.println("The first dealt card is " + deck1.deal());
    System.out.println("The size of deck 1 is now " + deck1.size());
    
    System.out.println("The next dealt card is " + deck1.deal());
    System.out.println("The size of deck 1 is now " + deck1.size());
    
    System.out.println("Deck 1 is now empty: " + deck1.isEmpty());
    
    System.out.println("The first dealt card for deck 2 is " + deck2.deal());
    
    
    System.out.println("The first dealt card of deck 3 is " + d3.deal());
    System.out.println("The next dealt card is " + d3.deal());
    System.out.println("The next dealt card is " + d3.deal());
    
    System.out.println("After all this, the size of deck 2 is " + deck2.size());
    System.out.println("The size of deck 3 is now " + d3.size());

    
    System.out.println("The only card in deck 4 is " + d4.deal());
    System.out.println("The size of deck 4 is now " + d4.size());
    
    System.out.println("Deck 4 is now empty: " + d4.isEmpty());
    
    System.out.println("Dealing now that deck 4 is empty: " + d4.deal());
    
    //toString method tests

    
    System.out.println("Deck 1 toString method test");
    
    System.out.println(deck1.toString());
    
    System.out.println("Deck 2 toString method test");
    
    System.out.println(deck2.toString());


    System.out.println("Deck 3 toString method test");
    
    System.out.println(d3.toString());
 
    System.out.println("Deck 4 toString method test");
    
    System.out.println(d4.toString());

    
    
    /** Question 2
      This deck would contain 6 cards in total
    */
    
    //Q3: Create a deck that can be used for 21/Blackjack
    
       
        
        
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

class Deck {
 
 private ArrayList<Card> cards = new ArrayList<Card>();

 private int size;


 public Deck(String[] ranks, String[] suits, int[] values) {
  for(int i = 0; i < suits.length; i++) {
     for(int j = 0; j < ranks.length; j++) {
       cards.add(new Card(ranks[j], suits[i], values[j]));
       size++;
     }
   }
   
   shuffle();
   
 }


/**
  * Determines if this deck is empty (no undealt cards).
  * @return true if this deck is empty, false otherwise.
  */
 public boolean isEmpty() {
 
  return size==0;
 }

 /**
  * Accesses the number of undealt cards in this deck.
  * @return the number of undealt cards in this deck.
  */
 public int size() {
  return size;
 }
 
 public void shuffle() {
    for(int k = (cards.size()-1); k > 0; k--) {
       int r = (int)(Math.floor(Math.random()*(cards.size()-1)));
       Card temp = cards.get(k);
       cards.set(k, cards.get(r));
       cards.set(r, temp);
    }
 }

 
 
 /**
 * Deals a card from this deck.
  * @return the card just dealt, or null if all the cards have been
  *         previously dealt.
  */
 public Card deal() {
  if (size == 0) {
   return null;
  }
  else {
   size--;
   return cards.get(size);
  }
 }
 
 

 /**
  * Generates and returns a string representation of this deck.
  * @return a string representation of this deck.
  */
 @Override
 public String toString() {
  String rtn = "size = " + size + "\nUndealt cards: \n";

  for (int k = size - 1; k >= 0; k--) {
   rtn = rtn + cards.get(k);
   if (k != 0) {
    rtn = rtn + ", ";
   }
   if ((size - k) % 2 == 0) {
    // Insert carriage returns so entire deck is visible on console.
    rtn = rtn + "\n";
   }
  }

  rtn = rtn + "\nDealt cards: \n";
  for (int k = cards.size() - 1; k >= size; k--) {
   rtn = rtn + cards.get(k);
   if (k != size) {
    rtn = rtn + ", ";
  }
   if ((k - cards.size()) % 2 == 0) {
    // Insert carriage returns so entire deck is visible on console.
    rtn = rtn + "\n";
   }
  }

  rtn = rtn + "\n";
  return rtn;
 }
}

