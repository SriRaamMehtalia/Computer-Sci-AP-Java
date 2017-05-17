//SriRaam A. Mehtalia Period 5
//AList-A6: Deck Class

import java.util.ArrayList;
import java.util.List;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester_Mehtalia {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *    @param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {"Ace", "king", "Queen", "jack", "ten", "9", "8", "7", "6", "5", "4", "3", "2"};
        String[] suits = {"diamond", "spades", "hearts", "clubs"};
        int[] values = {10,10,10,10,9,8,7,6,5,4,3,2,1};
        
        Deck deck1 = new Deck(ranks, suits, values);
        
        
        
    }
}

class Deck {
 
 private ArrayList<Card> cards;

 private int size;


 public Deck(String[] ranks, String[] suits, int[] values) {
  for(int i = 0; i < ranks.length; i++) {
   for(String s : suits) {
    Card newCard = new Card(ranks[i], s, values[i]);
    cards.add(newCard);
   }
  }
  size = cards.size();
 }


 /**
  * Determines if this deck is empty (no undealt cards).
  * @return true if this deck is empty, false otherwise.
  */
 public boolean isEmpty() {
  if(cards.size() == 0) {
   return true;
  } else {
   return false;
  }
 }

 /**
  * Accesses the number of undealt cards in this deck.
  * @return the number of undealt cards in this deck.
  */
 public int size() {
  return size;
 }

 /**
  * Randomly permute the given collection of cards
  * and reset the size to represent the entire deck.
  */
 public void shuffle() {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
 }

 /**
  * Deals a card from this deck.
  * @return the card just dealt, or null if all the cards have been
  *         previously dealt.
  */
 public Card deal() {
  if (cards.size() == 0) return null;
  size--;
  return cards.get(size);
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

