//SriRaam A. Mehtalia Per 5
//Types A2: Bell Market Coin Changer 


/**
   This class will test the CoinChanger class
*/

import java.util.Scanner; 

public class CoinChangerTester_Mehtal
{
   public static void main(String[] args)
   {
      Scanner myScanner = new Scanner(System.in);

      System.out.println("SriRaam A. Mehtalia's Bell Market Coin Changer");
      System.out.println("Press <Enter> to start.");
      String Alpha = myScanner.nextLine();
      
      System.out.println("Welcome to the Bell Market! What u trying to buy?");
      CoinChanger bellMarketCoinChanger = new CoinChanger( 10000,60,70,80 );
      
      System.out.println("How much is the item you want to buy today?");
      double firstCost = myScanner.nextDouble();
      System.out.println("And how much cash do you have to pay for it today?");
      double firstGiven = myScanner.nextDouble();
      bellMarketCoinChanger.purchase( firstCost, firstGiven );
      System.out.println(bellMarketCoinChanger.toString());
      myScanner.nextLine(); 
      
      System.out.println("Press Enter to continue.");
      String Bravo = myScanner.nextLine();
      
      bellMarketCoinChanger.purchase(15.60, 17 );
      System.out.println(bellMarketCoinChanger.toString());
      
      System.out.println("Press Enter to Continue.");
      String Charlie = myScanner.nextLine();
      
      bellMarketCoinChanger.purchase( 69.99, 80 );
      System.out.println(bellMarketCoinChanger.toString());
      
      System.out.println("Press Enter to Continue.");
      String Delta = myScanner.nextLine();
      
      bellMarketCoinChanger.purchase(30.99, 40);
      System.out.println(bellMarketCoinChanger.toString());
 
      
   }

}


/*
   Coinchanger is a class where we will allow the tester to calculate the amount of things left 
*/

class CoinChanger
{
   final double QUARTERS = .25;
   final double DIMES = .10;
   final double NICKELS = .05;
   final double PENNIES = .01;
   private int quarNum;
   private int dimeNum;
   private int nickNum;
   private int penNum;
   private double change;
   int qTaken;
   int dTaken;
   int pTaken;
   int nTaken;
   
   //Constructor 
   
   public CoinChanger( int q, int d, int n, int p )
   {
      quarNum = q;
      dimeNum = d;
      nickNum = n;
      penNum = p;
   }
   
   //Mutators, aka Setters
   
   public void purchase( double cost, double paid )
   {
      change = paid - cost;
   
      System.out.printf("This item costs $%.2f", cost);
      System.out.printf("\nYou paid $%.2f", paid);
      System.out.printf("\nYour change for this purchase today is $%.2f", change);


      qTaken = quarNum - (quarNum - (int)(change / QUARTERS));
      dTaken = dimeNum - (dimeNum - (int)((change - (qTaken * QUARTERS)) / DIMES));
      nTaken = nickNum - (nickNum - (int)((change - (qTaken * QUARTERS) - (dTaken * DIMES)) / NICKELS));
      pTaken = penNum - (penNum - (int)((change - (qTaken * QUARTERS) - (dTaken * DIMES) - (nTaken * NICKELS)) / PENNIES + 0.0001));
 
      System.out.println("Sorry, but all we have for change are coins");
      System.out.println("Instead we can give you " + qTaken + " quarters, " + dTaken + " dimes " + nTaken + " nickels and " + pTaken + " pennies. I hope that works!");
      System.out.println("Thank you, please come again!");

      quarNum = quarNum - qTaken;
      dimeNum = dimeNum - dTaken;
      nickNum = nickNum - nTaken;
      penNum = penNum - pTaken;
   }
   
   
   //Accesors, aka Getters
   public String toString( )
   {
      String output = "After the days purchases, the cash register now has " + quarNum + " quarters, " + dimeNum + " dimes, " + nickNum + " nickels and " + penNum + " pennies left! What a good day.";
      return output;
   }
   
}