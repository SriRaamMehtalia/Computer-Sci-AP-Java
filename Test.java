class HiddenWord
{
   private String word;
   private int length;
   
   public HiddenWord(String in) {
       word = in;
       length = in.length();
  }
  
  public String getHint(String guess) {
      String give = "";
      String star = "*";
      String plus = "+";
      
      for(int i = 0; i < guess.length(); i++) {
          String x = guess.substring(i,i+1);
          if(x.equals(word.substring(i,i+1))) {
              give = give + x;
          }
          
          else if(guess.indexOf(word.substring(i,i+1)) != word.indexOf(word.substring(i,i+1))) {
              give = give + plus;
          }
          
          else {
              give = give + star;
          }
     }
     
     return give;
  }
}

public class Test 
{
   public static void main(String[] args) {
       HiddenWord po = new HiddenWord("HELLO");
       System.out.println(po.getHint("OELLA"));
   }
}

   