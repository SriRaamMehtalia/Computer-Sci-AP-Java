/**SriRaam A. Mehtalia and Justin Andrada
Class A9: BigInt Class
*/

public class BigIntTester_AndradaMehtalia
{
   public static void main( String[] args )
   {
      BigInt too = new BigInt(7);
      BigInt tree = new BigInt(5);
      BigInt sixtynine = new BigInt(69);
      too.multiply(sixtynine);
      too.print();
      too.add(sixtynine);
      too.print();
      tree.multiply(sixtynine);
      tree.print();
      tree.add(sixtynine);
      tree.print();
   }
}


class BigInt
{
   private int won;
   
   public BigInt( int z )
   {
      this.won = z;
   }
   
   public String toString()
   {
      return "Your integer is now " + won;
   }
   public int getInt()
   {
      return won;
   }
   
   public int add( BigInt x )
   {
      won = won + x.getInt();
      return won;
   }
   
   public int multiply( BigInt y )
   {
      won = won*y.getInt();
      return won;
   }
   
   public void print()
   {
      System.out.println(toString());
   }
}
   
  
   
      
   