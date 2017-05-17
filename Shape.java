//SriRaam A. Mehtalia and Will Portman

import java.awt.Color;

class Shape {
    private int xLoc;
    private int yLoc;
    private Color c;


    public Shape( int xLocation, int yLocation ) {
    	xLoc = xLocation;
    	yLoc = yLocation;
    }
    public int getX() {return xLoc;}
    public int getY() {return yLoc;}
    
    /**
     2) Write an alternate constructor that takes the x, y location AND
     	a color object and initializes all instance variables.
    */
    
    
    public Shape( int xLocation, int yLocation, Color c){
      xLoc = xLocation;
    	yLoc = yLocation;
      c = new Color(50, 50, 50);
    }
    











} // end class Shape

/** 3) Write a class Circle that has an instance field for radius and
	   inherits the x,y and color from the Shape class. Write a
	   constructor for Circle that initializes all instance variables,
	   including location.
*/

class Circle extends Shape 
{
   private int radius;
   
   public Circle(int xLoc, int yLoc, int r, Color c) {
      super(xLoc, yLoc, c);
      radius = r;
      
   }
}

public class ShapeTester_PortMeht
{
   public static void main(String[] arg)
   {
   
   }
}


