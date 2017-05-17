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
      
      for(int i = 0; i < guess.length()-1; i++) {
          String x = guess.substring(i,i+1);
          if(x.equals(word.substring(i,i+1))) {
              give = give + x;
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
       po.getHint("PEXLA");
   }
}

   