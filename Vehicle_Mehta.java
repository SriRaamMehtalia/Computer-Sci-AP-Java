/**
  Represents the important aspects of a vehicle, such as license #, make and how dirty the Vehicle
  is.
*/

public class Vehicle_Tester
{
  public static void main(String[] args)
  {
      Vehicle v1 = new Vehicle();
      Vehicle v2 = new Vehicle();
      v1.dirtify();
      System.out.println("Vehicle dirtiness level is: " + v1.getDirtLevel() );
      v1.dirtify();
      v2.dirtify();
      v2.wash();
      System.out.println("Vehicle dirtiness level is: " + v2.getDirtLevel() );
  }  
}



class Vehicle_Mehta
{
  // instance variables
  private String license;
  private String make;
  private int dirtLevel;
  
  // Constructors (initialize an object of this class)
  /**
     Initializes the Vehicle with default values.
  */
  public int Vehicle( )
  {
      license = "N/A";
      make = "N/A";
      dirtLevel = 0;
  }
  
  // Accessors

  public String getLicense()  { return license; }
  public String getMake() {  return make;  }
  public int getDirtLevel() { return dirtLevel; }
  
  /**
     Mutator method that dirties the car by incrementing the dirtLevel
  */
  public void dirtify( ) 
  {
      dirtLevel++;
  }
  
  public void wash( )
  {
      dirtLevel = dirtLevel - 2;
      if( dirtLevel < 0 )
      {
         dirtLevel = 0;
      }
  }
  
} // end class Vehicle

