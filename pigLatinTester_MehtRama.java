//SriRaam A. Mehtalia and Drew Ramacher
//Types-ASg 4: String Program Pig Latin

import java.util.Scanner;

//This is the pig latin tester class

public class pigLatinTester_MehtRama
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int x = in.nextInt();
      int sum = 5;
      if (in.hasNextInt()) {
         sum = sum + x;
      }
      
      else {
         return "Bad input for x";
      }
      
   }
      
}

/**
   Translates phrase into pig latin by bring the first letter to the end of the word, and 
   adding an "ay"
*/

class translator
{
   //instance variables
   
   private String input;
   
   //constructor
   
   public translator(String a)
   {
      input = a;
   }
   
   //This method, the mutator and accessor, does the translation into pig latin
   //And returns the output
   public String translate()
   {
      String firstLetter = input.substring(0 , 1);
      String restOfWord = input.substring(1,input.length());
      String output = restOfWord + firstLetter + "ay";
      return output;
   }
}
   