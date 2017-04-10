//SriRaam A. Mehtalia Period 5
//Loops-Asg5: Turtle Run

//imports all the programs needed
import acm.graphics.GTurtle;
import acm.program.GraphicsProgram;
import acm.graphics.GLine;

public class TurtleRunMehtaliaS extends GraphicsProgram
{
  //main method, allows this program to work
   public static void main(String[] args) {
      new TurtleRunMehtaliaS().start(args);
   }



   public void run( ) {

      //Creates 2 lines, start and finish

      GLine startLine = new GLine(80,50, 80 , 350);
      add(startLine);
      GLine finishLine = new GLine(880, 50, 880, 350);
      add(finishLine);

      //Creates 3 turtles, sets them at the starting line

      GTurtle topTurtle = new GTurtle(50, 100);
      add(topTurtle);
      GTurtle midTurtle = new GTurtle(50, 200);
      add(midTurtle);
      GTurtle bottomTurtle = new GTurtle(50, 300);
      add(bottomTurtle);

      //Give the turtles their set speeds

      double firstSpeed = Math.random();
      double secondSpeed = Math.random();
      double thirdSpeed = Math.random();

      topTurtle.setSpeed(firstSpeed);
      midTurtle.setSpeed(secondSpeed);
      bottomTurtle.setSpeed(thirdSpeed);

      //The turtle race begins
      //Get x will give us the x-coordinate
      //While it is less than what we need, race until they hit the finish line
      while( topTurtle.getX() < 860 && midTurtle.getX() < 860 && bottomTurtle.getX() < 860) {
         

         if (topTurtle.getX() < 860) {
            topTurtle.forward(Math.random() * 200);
            topTurtle.pause(250);
         }

         if (midTurtle.getX() < 860) {

            midTurtle.forward(Math.random() * 200);
            midTurtle.pause(250);
         }

         if (bottomTurtle.getX() < 860) {
            bottomTurtle.forward(Math.random() * 200);
            bottomTurtle.pause(250);
         }

           
       }
       
       //Creates variables for deciding winner
       boolean topWin = false;
       boolean midWin = false;
       boolean botWin = false;
       
       if (topTurtle.getX() > midTurtle.getX() && topTurtle.getX() > bottomTurtle.getX()) {
          topWin = true;
       }
       
       else if (midTurtle.getX() > topTurtle.getX() && midTurtle.getX() > bottomTurtle.getX()) {
          midWin = true;
       }
       
       else {
          botWin = true;
       }
       
       //After the winner is decided, the others have to finish the race
       
       while( topTurtle.getX() < 860 || midTurtle.getX() < 860 || bottomTurtle.getX() < 860) {
         

         if (topTurtle.getX() < 860) {
            topTurtle.forward(Math.random() * 200);
            topTurtle.pause(250);
         }

         if (midTurtle.getX() < 860) {

            midTurtle.forward(Math.random() * 200);
            midTurtle.pause(250);
         }

         if (bottomTurtle.getX() < 860) {
            bottomTurtle.forward(Math.random() * 200);
            bottomTurtle.pause(250);
         }

           
       }

       
       //Makes the winner do a little dance at the bottom of the screen
       if (topWin) {
          topTurtle.right(135);
          topTurtle.forward(500);
          for (int i = 0; i < 5; i++) {
             topTurtle.right(Math.random() * 360);
             topTurtle.pause(500);
             topTurtle.left(Math.random() * 360);
             topTurtle.pause(500);
          } 
       }
       
       else if (midWin) {
          midTurtle.right(135);
          midTurtle.forward(500);
          for (int j = 0; j < 5; j++) {
             midTurtle.right(Math.random() * 360);
             midTurtle.pause(500);
             midTurtle.left(Math.random() * 360);
             midTurtle.pause(500);
          }

       }
       
       else {
          bottomTurtle.right(135);
          bottomTurtle.forward(500);
          for (int p = 0; p < 5; p++) {
             bottomTurtle.right(Math.random() * 360);
             midTurtle.pause(500);
             bottomTurtle.left(Math.random() * 360);
             midTurtle.pause(500);       
          }
       }

      }







   

   
}



