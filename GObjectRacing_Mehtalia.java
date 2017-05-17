//SriRaam A. Mehtalia Period 5
//Loops-Asg5: Turtle Run

//imports all the programs needed
import acm.graphics.GTurtle;
import acm.program.GraphicsProgram;
import acm.graphics.GLine;
import javax.swing.JOptionPane;

/**This program will ask the user how many turtles to create, and the person will
enter a number. These many turtles will be created, and will race, and the winner will be 
shown after they all cross the finish line. This will be done using arrays

*/

public class GObjectRacing_Mehtalia extends GraphicsProgram
{
  //main method, allows this program to work
   public static void main(String[] args) {
      new GObjectRacing_Mehtalia().start(args);
   }
   
   



   public void run( ) {

      //Creates 2 lines, start and finish
      int finLine = 1000;

      GLine startLine = new GLine(80,50, 80 , 350);
      add(startLine);
      GLine finishLine = new GLine(finLine, 50, finLine, 500);
      add(finishLine);

      //Creates 3 turtles, sets them at the starting line
      
      String input = JOptionPane.showInputDialog("How many turtles to race? Between 2 and 6.");
      System.out.println("You want: " + input);
      
      //Turns string into int
      
      int numTurtles = Integer.parseInt(input);
      
      GTurtle[] turtle = new GTurtle[numTurtles];
      
      for(int i=0; i<numTurtles;i++)
      {
         //Creates the amount of turtles that the user wants
         turtle[i] = new GTurtle(50, 130 + i*70);
         add(turtle[i]);
         
      }
      
      boolean finish = false;
      
      //Lets the turtles race till one crosses
       
     while(!finish) {

      for(int i = 0; i < numTurtles; i++) {
         if(turtle[i].getX() < finLine-20) {
              turtle[i].forward((int)(Math.random() * 200));
              turtle[i].pause(0.5);
          }
          
          else{
             finish = true;
          }
        }
      }
      
      
      
      
      //Finds winner, assigns it
      
      double maxValue = 0;
      
      for(int i = 0; i < numTurtles-1; i++) {
          double bigDistance = Math.max(turtle[i].getX(), turtle[i+1].getX());
          if(bigDistance > maxValue) {
              maxValue = bigDistance;
          }
      }
      
      int winner = -1;
      
      for(int i = 0; i < numTurtles; i++) {
          if((turtle[i].getX() == maxValue)) {
             winner = i;
             
             System.out.println(i + " is winner");
          }
          
      }
      
      
      
      //Lets rest of turtles race
      
      int[] amount = new int[numTurtles];
      
      for(int j = 0; j < numTurtles; j++) {
         amount[j] = 0;
      }
      
      int numFinish = 0;
      while(numFinish < numTurtles) {
         for(int i = 0; i < numTurtles; i++) {
            if((amount[i] == 0) && (turtle[i].getX() < finLine)) {
              turtle[i].forward((int)(Math.random() * 40));
              turtle[i].pause(0.5);
            }
            
            if((amount[i] == 0) && (turtle[i].getX() > finLine)) {
               amount[i] = 5;
               numFinish++;
             }
                      
                    
         }
      }
      
      //Gets the winning turtle to dance
      
      for(int i = 0; i <= numTurtles; i++) {
          if(winner == i) {
           
           for (int j = 0; j < 5; j++) {
             turtle[i].right(Math.random() * 360);
             turtle[i].pause(500);
             turtle[i].left(Math.random() * 360);
             turtle[i].pause(500);
           }
          }

       }
       
       


      
      
          
     

            
      

      
      

      
             
        
   }
}
     
