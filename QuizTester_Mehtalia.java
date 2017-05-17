//SriRaam A. Mehtalia Period 5 
//Inherits-A14: QuizMeasurable Bk

public class QuizTester_Mehtalia
{
   public static void main(String[] args)
   {
      Measurable q1[] = new Measurable[10];
      
      q1[0] = new Quiz(58, "F");
      q1[1] = new Quiz(66, "D");
      q1[2] = new Quiz(77, "C");
      q1[3] = new Quiz(88, "B+");
      q1[4] = new Quiz(99, "A+");
      q1[5] = new Quiz(95, "A");
      q1[6] = new Quiz(92, "A-");
      q1[7] = new Quiz(79, "C+");
      q1[8] = new Quiz(75, "C");
      q1[9] = new Quiz(83, "B");
      
      //Printing out all quiz scores
      
      for(int i = 0; i < q1.length; i++) {
         Quiz here = (Quiz)q1[i];
         
         System.out.println("This student's score is: " + here.getScore());
         System.out.println("This means his grade is: " + here.getGrade());
         System.out.println("");
           
      }
      
      //Getting the average and the max
      
      double avrg = Data.average(q1);
      
      Quiz max = (Quiz)Data.max(q1);

      System.out.println("Average score: " + avrg); //Should be 81.2 with these values
      
 
      System.out.println("Highest score: " + max.getScore());

      System.out.println("Highest grade: " + max.getGrade());
   }
}

//Creating measureable

interface Measurable
{
   double getMeasure();
}

//Data class with average and max

class Data
{
   public static double average(Measurable[] objects)
   {
      double sum = 0;
      for (Measurable obj : objects)
      {
         sum = sum + obj.getMeasure();
      }
      if (objects.length > 0) { return sum / objects.length;}
      else { return 0; }
   }

   public static Measurable max(Measurable[] objects)
   {
      if (objects.length == 0) { 
         return null; 
      }
      
      Measurable max = objects[0];
      
      for (Measurable obj : objects)
      {
         if (obj.getMeasure() > max.getMeasure())
         {
            max = obj;
         }
      }

      return max;
   }
}

//Quiz class which implements Measureable 

class Quiz implements Measurable
{
   private double score;
   private String grade;

   public Quiz(double s, String g)
   {
      score = s;
      grade = g;
   }
   

   public double getScore()
   {
      return score;
   }
   

   public String getGrade()
   {
      return grade;
   }
   

   public double getMeasure()
   {
      return score;  
   }
}