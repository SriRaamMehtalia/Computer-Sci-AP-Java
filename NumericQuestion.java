import java.util.ArrayList;

public class NumericQuestion extends Question
{
   private ArrayList<Integer> answers;
   private String text;
   
   public NumericQuestion(String inp) {
      text = inp;
      answers = new ArrayList<Integers>();
   }
   
   public void addOption(int thing) {
       answers.add(thing);
   }
   
  
}