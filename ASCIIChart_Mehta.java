//SriRaam A. Mehtalia
//CSAP Period 5
//Loops-asg: ASCII Chart

import java.util.Scanner;

public class ASCIIChart_Mehta
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Would you like to see the code?");
      String inp = input.nextLine();
      ASCII jim = new ASCII();
      jim.printChart();
   
   }
   
   
}

class ASCII
{
   public void printChart() 
   {
      for (int i = 32; i < 100; i++) {
         System.out.print("   " + i + " " + (char)i);
         if ((i-1) % 5 == 0) {
            System.out.println("\n");
         }
            
      }
      
      for (int j = 100; j < 126; j ++) {
          System.out.print("  " + j + " " + (char)j);
          if ((j-1) % 5 == 0) {
            System.out.println("\n");
         }
      }
  
  
   }
}
       