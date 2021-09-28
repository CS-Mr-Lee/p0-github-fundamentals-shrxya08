/*=============================================================================
   Art.java                                                            
   ----------------------------------------------------------------------------
   Programmer:  Shreya Sukumar                                                     
   Date:        Sep, 17, 2021                                               
   Course:      ICS4U1                                                        
 ==============================================================================
   This program makes a turtle move to create art */

public class Art 
{
   public static void main(String[] a)
   {
      Turtle bob = new Turtle();
      //Look at https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html for different colours
      Turtle.bgcolor("lightblue");
      bob.penColor("red");
      bob.width(10);
      
      for (int i = 0; i<4; i++)
      {
         bob.left(90);
         bob.forward(90);
         bob.up();
         bob.forward (2);
         bob.down();
      }
      
      Turtle.bgcolor("lightpurple");
      bob.penColor("green");
      bob.forward(70);
      
       for (int i = 0; i<4; i++)
      {
         bob.left(90);
         bob.forward(90);
         bob.up();
         bob.forward (2);
         bob.down();
      }
      
      Turtle.bgcolor("lightgreen");
      bob.penColor("orange");
      bob.right(35);
      bob.up();
      bob.forward(40);
      bob.down();

      for (int i = 0; i<4; i++)
      {
         bob.left(90);
         bob.forward(90);
         bob.up();
         bob.forward (2);
         bob.down();
      }
      
      Turtle.bgcolor("red");
      bob.penColor("black");
      bob.right(23);
      bob.forward(30);
      
      for (int i = 0; i<4; i++)
      {
         bob.left(90);
         bob.forward(90);
         bob.up();
         bob.forward (2);
         bob.down();
      }
      
      Turtle.bgcolor("black");
      bob.penColor("red");
      bob.left(60);
      bob.forward(40);
      bob.right (52);
      
     for (int i = 0; i<4; i++)
     {
        bob.left(90);
        bob.forward(90);
        bob.up();
        bob.forward (2);
        bob.down();
     }
     
      Turtle.bgcolor("lightgreen");
      bob.penColor("orange");
      bob.left(60);
      bob.forward(40);
      bob.right (52);
      
      for (int i = 0; i<4; i++)
     {
        bob.left(90);
        bob.forward(90);
        bob.up();
        bob.forward (2);
        bob.down();
     }
     
      Turtle.bgcolor("blue");
      bob.penColor("red");
      bob.left(60);
      bob.forward(40);
      bob.right (52);
     
     for (int i = 0; i<4; i++)
     {
        bob.left(90);
        bob.forward(90);
        bob.up();
        bob.forward (2);
        bob.down();
     }
     
      Turtle.bgcolor("pink");
      bob.penColor("yellow");
      bob.left(60);
      bob.forward(40);
      bob.right (52);
      
     for (int k = 0; k<50; k++)
     {
         
        for (int i = 0; i<4; i++)
        {
           bob.left(90);
           bob.forward(90);
           bob.up();
           bob.forward (2);
           bob.down();
        }
        
         Turtle.bgcolor("white");
         bob.penColor("black");
         bob.left(60);
         bob.forward(40);
         bob.right (52);
     }
      
     for (int i = 0; i<4; i++)
     {
        bob.left(90);
        bob.forward(90);
        bob.up();
        bob.forward (2);
        bob.down();
     }
     
      Turtle.bgcolor("yellow");
      bob.penColor("brown");
      bob.left(60);
      bob.forward(40);
      bob.right (52);
      
     for (int i = 0; i<4; i++)
     {
        bob.left(90);
        bob.forward(90);
        bob.up();
        bob.forward (2);
        bob.down();
     }
     
      Turtle.bgcolor("turqoise");
      bob.penColor("gray");
      bob.left(60);
      bob.forward(40);
      bob.right (52);
      
      for (int i = 0; i<4; i++)
     {
        bob.left(90);
        bob.forward(90);
        bob.up();
        bob.forward (2);
        bob.down();
     }
     
      Turtle.bgcolor("gray");
      bob.penColor("lightgreen");
      bob.left(60);
      bob.forward(40);
      bob.right (52);
      
       Turtle.bgcolor("black");
      bob.penColor("black");

      
      /*possible codes:
      bob.forward(distance)
      bob.backward(distance)
      
      
      bob.setDirection(angle)
      bob.home()
      bob.hide()
      bob.show()
      bob.face(x, y)
      bob.setPosition(x, y)
      
      bob.tilt(angle)
      bob.width(width)
      bob.penColor("colour")
      bob.bgcolor("colour")
      bob.stamp()
      bob.dot()
      bob.dot("colour")
      bob.dot("colour", dotsize)
      */
   }
}