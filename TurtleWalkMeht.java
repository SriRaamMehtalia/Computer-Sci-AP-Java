//SriRaam A. Mehtalia Period 5
//If-Asg 8: Turtle initials

import acm.graphics.GTurtle;
import acm.program.GraphicsProgram;

//begins the public class
public class TurtleWalkMeht extends GraphicsProgram
{
   public void run( ) {
      //declare turtle, sets him at a certain place
      GTurtle jim = new GTurtle(10, 300);
      //createst the turtle
      add(jim);
      //sets the turtle's speed
      jim.setSpeed(.1);
      //begins the drawing of r
      jim.penDown();
      jim.left(90);
      jim.forward(200);
      jim.left(270);
      jim.forward(100);
      jim.right(90);
      jim.forward(90);
      jim.right(90);
      jim.forward(100);
      jim.right(225);
      jim.forward(150);
      
      //transports the turtle so it can draw m
      
      jim.setLocation(300,300);
      jim.left(135);
      jim.forward(150);
      jim.right(90);
      jim.forward(150);
      jim.right(90);
      jim.forward(150);
      //Hide the turtle to take it to the top of the m
      jim.hideTurtle();
      jim.right(180);
      jim.forward(150);
      jim.showTurtle();
      jim.right(90);
      jim.forward(150);
      jim.right(90);
      jim.forward(150);
     
      
   }
   
   public static void main(String[] args)
   {
      new TurtleWalkMeht().start(args);
   }
}

