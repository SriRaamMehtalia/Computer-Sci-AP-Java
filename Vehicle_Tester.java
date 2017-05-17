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
      v1.setMake("Nissan Altima");
      v1.setLicense("1ER6IG0");
      v2.setMake("Labourghini");
      v2.setLicense("X678JCR");
      v1.print();
      System.out.println(" ");
      v2.print();
  }
}

class Vehicle
{
  // instance variables
  private String license;
  private String make;
  private int dirtLevel;
  
  // Constructors (initialize an object of this class)
  /**
     Initializes the Vehicle with default values.
  */
  public Vehicle( )
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
  
  public void setMake( String newMake )
  {
   // Update instance variable with passed in data
   make = newMake;
  }
  
  public void setLicense (String newLicense)
  {
   //update license values
   license = newLicense;
  }
  
  public void print ( ) {
   System.out.println("Vehicle is " + make);
   System.out.println("License plate is " + license);
   System.out.println("Vehicle has dirt level " + dirtLevel);
  }
  
} // end class Vehicle

