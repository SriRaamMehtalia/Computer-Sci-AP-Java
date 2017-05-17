/** Will Hackett, Period 5
Class-Asg4
*/

public class DieTester_Shortt
{
  public static void main(String[] args)
  {
    Die die1 = new Die();
    die1.roll();
    Die die2 = new Die();
    die2.roll();
    die1.print();
    die2.print();
    int i = 5, j = 2;
    
    System.out.println(i + j);

  }
}
/**
This class will model a die for a game
*/
class Die
{
 // instance variables
 private int numSides;
 private int faceValue;
 
 // constructors
 /**
 Default constructor to initialize instance variables for the class.
 */
 public Die()
 {
   numSides = 6;
   faceValue = roll();
 }
 
 // accessor methods
 /**
 Returns current faceValue of die (the side facing up).
 */
 public int getFaceValue()
 {
   return faceValue;
 }
 public String toString()
 {
   return "" + faceValue;
 }
 public void print()
 {
   System.out.println("You rolled a " + toString() + "!");
 }
 
 // mutator methods
 /**
 Randomly roll die to get value between 1 and numSides.
 */
 public int roll()
 {
   faceValue = (int) (Math.random() * numSides + 1);
   return faceValue;
 }
}