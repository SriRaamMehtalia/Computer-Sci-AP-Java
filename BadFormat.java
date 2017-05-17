/*
Evan Rittenhouse and Stefan Fiandeiro
Per. 5
Class A9-BigInt Class (PP)
*/

public class BadFormat
{
   public static void main (String [] args)
   {
      BigInt numbero1 = new BigInt();
      numbero1.add(12);
      numbero1.multiply(12);
      BigInt numbero2 = new BigInt();
      numbero2.add(7);
      numbero2.multiply(7);
      numbero1.toString();
      numbero2.toString();
   }
}

class BigInt
{
   private int integer;
   
   //Constructor
   public void BigInt()
   {
      integer = 7;
   }
   
   //Mutators
   public String toString()
   {
      String integerString = "" + integer;
      System.out.println(integerString);
      return integerString;
   }
   public void add(int number1)
   {
      integer = integer + number1;
   }
   
   //Accessors
   public void multiply(int number2)
   {
      integer = integer * number2;
   }
}