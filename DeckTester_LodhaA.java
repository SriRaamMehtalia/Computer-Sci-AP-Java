import java.util.List;
import java.util.ArrayList;
/**
   * This is a class that tests the Deck class.
 */
public class DeckTester_LodhaA {
 
    /**
     * The main method in this class checks the Deck operations for consistency.
     *    @param args is not used.
     */
    public static void main(String[] args) { 
        System.out.println("Question 2: 6 cards"); 
        String[] normalRanks = {"ace","two","three","four","five","six","seven","eight","nine","ten","jack","queen","king"};
        String[] normalSuits = {"hearts","clubs","diamonds","spades"};
        int[] normalValues =  {1,2,3,4,5,6,7,8,9,10,11,12,13};
        Deck normalDeck = new Deck(normalRanks, normalSuits,normalValues);
        System.out.println("Initial size: " + normalDeck.size() + "\tIs empty: " + normalDeck.isEmpty() + "\nFirst card dealt: " + normalDeck.deal());
        System.out.println("Usual deck:" + normalDeck);
        String[] heroRanks = {"paliden","mage","warrior","rogue"};
        String[] heroSuits = {"yellow","blue","red"};
        int[] heroValues = {3,10,1,7};
 
        Deck heroDeck = new Deck(heroRanks, heroSuits, heroValues);
        System.out.println("Initial size: " + heroDeck.size() + "\tIs empty: " + heroDeck.isEmpty() + "\nFirst card dealt: " + heroDeck.deal());
        System.out.println("Hero deck:\n" + heroDeck);
        //#2 answer is 6
    }
}
 
 
 
 
 
/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
class Deck {
 
    /**
     * cards contains all the cards in the deck.
     */
    private List<Card> cards;
 
    /**
     * size is the number of not-yet-dealt cards.
     * Cards are dealt from the top (highest index) down.
     * The next card to be dealt is at size - 1.
     */
    private int size;
 
 
    /**
     * Creates a new <code>Deck</code> instance.<BR>
     * It pairs each element of ranks with each element of suits,
     * and produces one of the corresponding card.
     * @param ranks is an array containing all of the card ranks.
     * @param suits is an array containing all of the card suits.
     * @param values is an array containing all of the card point values.
     */
    public Deck(String[] ranks, String[] suits, int[] values) {
        int x = 0;
        cards = new ArrayList<Card>();
        for(x = 0; x < ranks.length; x++)
        {
          for(String suit : suits)
          {
            cards.add(new Card(ranks[x], suit, values[x]));
          }
        }
        size = cards.size();
    }
 
 
    /**
     * Determines if this deck is empty (no undealt cards).
     * @return true if this deck is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
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
        if(size>0)
        {
          size--;
          return cards.get(size);
        }
        return null;
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
                rtn = rtn + ", \n";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn;
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
 
class Card {
 
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
    public Card(String cardRank, String cardSuit, int cardPointValue) {
        rank = cardRank;
      suit = cardSuit;
      pointValue = cardPointValue;
    }
 
 
    /**
     * Accesses this <code>Card's</code> suit.
     * @return this <code>Card's</code> suit.
     */
    public String suit() {
        return suit;
   }
 
    /**
     * Accesses this <code>Card's</code> rank.
     * @return this <code>Card's</code> rank.
     */
    public String rank() {
        return rank;
    }
 
   /**
     * Accesses this <code>Card's</code> point value.
     * @return this <code>Card's</code> point value.
     */
    public int pointValue() {
        return pointValue;
    }
 
    /** Compare this card with the argument.
     * @param otherCard the other card to compare to this
     * @return true if the rank, suit, and point value of this card
     *              are equal to those of the argument;
     *         false otherwise.
     */
    public boolean matches(Card otherCard) {
        if(this.suit().equals(otherCard.suit()) && this.rank().equals(otherCard.rank()) && this.pointValue() == otherCard.pointValue())
      {
        return true;
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
    public String toString() {
        return "[" + rank + "] of [" + suit + "] (point value = [" + pointValue + "])";
    }
}