//SriRaam A. Mehtalia and Samraj Kalkat
//Types-Asg5: Colors

import java.awt.Color;

public class BrighterDemo
{
   public static void main(String[] args) 
   {
      Color color1 = new Color(50, 100, 150);
      Color color2 = color1.brighter();
      System.out.println("Red: " + color2.getRed() + " Green " + color2.getGreen() + " Blue " + color2.getBlue() );
   }
}
   

