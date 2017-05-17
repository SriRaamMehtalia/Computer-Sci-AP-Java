//SriRaam A. Mehtalia
//Class-Asg4: Die Class -print

public class DieTester_MehtalS
{
   public static void main(String[] args)
   {
     Die die1 = new Die();
     Die die2 = new Die();
     die1.print();
     die2.print();
   }
}

/**
   This class will model a die for a game
*/
class Die
{
   //instance variable
   private int numSides;
   private int faceValue;
   
   //constructors: look like methods, but key differences
   /**
      Default constructor to initialize the instance variable for Die
   */
   public Die()
   {
      numSides = 6;
      faceValue = roll();
   }
   //Accessor methods
   /**
      returns the face value of the die
   */
   public int getFaceValue()
   {
      return faceValue;
   }
   //Mutator Methods
   /** Randomly roll the die to get a number between 1 and 6 */
   public int roll()
   {
      faceValue = (int) (Math.random()*numSides + 1);
      return faceValue;
   }
   
   public String toString( ) {
      return "" + faceValue;
   }
   
   public void print( ) {
      System.out.println("Your die came up as a " + toString());
   }
      
}

