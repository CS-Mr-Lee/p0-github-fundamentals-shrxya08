/*=============================================================================
   DottedSquare.java                                                            
   ----------------------------------------------------------------------------
   Programmer:  Shreya Sukumar                                                     
   Date:        Sep, 17, 2021                                               
   Course:      ICS4U1                                                        
 ==============================================================================
   This program makes a turtle go in a sqaure motion with broken lines */

public class DottedSquare 
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
         
         for (int j = 0; j<3; j++)
         {
            bob.forward(30);
            bob.hide();
            bob.up();
            bob.forward(30);
            bob.down();
            bob.forward(30);
         }
      }
      
      
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