//Drew Ramacher, SriRaam Mehtalia
//Period 5
//If-Asg2: Quizzer

import java.util.Scanner;

//Tester class where we actually take the quiz
public class TestQuizzer_RamachMehtal
{
   public static void main(String[] args)
   { 
      Scanner inpout = new Scanner(System.in); 
      String again = "pp";   
      System.out.println("Do you want to take the quiz?");
      String pps = inpout.nextLine(); 
      
      //This loop allows the quiz to be taken over and over
      
      while(!again.equals("no")) {
         SmartQuizzer q1 = new SmartQuizzer();
         q1.askQuestions();
         System.out.println("Your score is: " + q1.getScore() + "/7");
         q1.displayResults();   
         System.out.println("Would you like to try the quiz once more?");
         again = inpout.nextLine();
      }
   }
}

//Beginning of class

class SmartQuizzer
{ 
   //Instance variables
   private int score;
   private String a1;
   private String a2;
   private int a3;
   private String a4;
   private String a5;
   private String a6;
   private String a7;
   
   //Sets starting score to 0
   public SmartQuizzer()
   {
      score = 0;
      a1 = "l";
      a2 = "p";
      a3 = 666;
      a4 = "r";
      a5 = "t";
      a6 = "p";
      a7 = "j";
   }
   
   //The quiz begins
   
   public void askQuestions()
   {
      Scanner input = new Scanner(System.in);
      while (!a1.equals("c"))
      {
         System.out.println("Question 1, what is 3 + 3?");
         System.out.println(" a. 2 b. 4 c. 6 d. 8");
         a1 = input.nextLine();
         if(a1.equals("c"))
         {
            score++;
         }
         else 
         {
            score = score - 1;
         }
      }
        
      while (!a2.equals("b")){    
         System.out.println("Question 2: What is the capital of England?");
        System.out.println(" a. France b. London c. Mexico d. DC");
         a2 = input.nextLine();
         if(a2.equals("b"))
         {
            score++;
         }
         else 
         {
            score = score - 1;
         }
      }
      
      while (a3 != 20){
         Scanner inpoot = new Scanner(System.in);
         System.out.println("Question 3, what is 5 x 4?");
         a3 = inpoot.nextInt();
         if(a3 == 20)
         {
            score++;
         }
         else 
         {
            score = score - 1;
         }
      }
      
      while (!a4.equals("a")){
         System.out.println("Question 4, What does a dog say?");
         System.out.println(" a. woof b. moo c. meow d. hello");
         a4 = input.nextLine();
         if(a4.equals("a"))
         {
            score++;
         }
         else 
         {
           score = score - 1;
         }
      }
      
      while (!a5.equals("d")){
         System.out.println("Question 5, which state do we live in?");
         System.out.println(" a. New York b. Mexico c. Utah d. California");
         a5 = input.nextLine();
         if(a5.equals("d"))
         {
            score++;
         }
         else 
         {
            score = score - 1;
         }
      }
      
      while (!a6.equals("b")){
         System.out.println("Question 6, which of the following can naturally fly?");
         System.out.println(" a. Rock b. Bird c. Stick d. Frog");
         a6 = input.nextLine();
         if(a6.equals("b"))
         {
            score++;
         }
         else 
         {
            score = score - 1;
         }
      }
      
      while (!a7.equals("Washington")){
         System.out.println("Question 7, What's the last name of the first president of the US?");
         a7 = input.nextLine();
         if(a7.equals("Washington"))
         {
            score++;
         }
         else 
         {
            score = score - 1;
         }
      }

   }
   
   //Returns the final score of the quiz
   
   public int getScore()
   {
      return score;
   }
   
   //Displays the results of the quiz to the user
   
   public void displayResults( ) {
      if (score <= 4) {
         System.out.println("You're not very smart");
      }
      
      else {
         System.out.println("Great job you nerd! Gimme your lunch money ;) ");
      }
    
   }

   
   
}