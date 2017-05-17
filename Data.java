interface Measureable {
    double getMeasure();
}


class Data
{
      
   public static double average(Measureable[] objects) {
      double sum = 0;
      for (Measureable obj: objects) {
          sum = sum + obj.getMeasure();
      }
      if(objects.length>0) { return sum/ objects.length;}
      else { return 0; }
      
   }
   
   //public static Measureable max(Measureable[] objects) 
}

public class QuizTester_Mehtalia
{
   public static void main(String[] args) 
   {
   
   
   }
}