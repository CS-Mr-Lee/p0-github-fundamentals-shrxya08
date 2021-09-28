/*=============================================================================
   SqaureFill.java                                                            
   ----------------------------------------------------------------------------
   Programmer:  Shreya Sukumar                                                     
   Date:        Sep, 17, 2021                                               
   Course:      ICS4U1                                                        
 ==============================================================================
   This program makes a turtle fill up a sqaure */

public class SquareFill
{
   public static void main(String[] a)
   {
      Turtle bob = new Turtle();
      //Look at https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html for different colours
      Turtle.bgcolor("lightblue");
      bob.penColor("red");
      bob.width(10);
      
      int length = 90;
      
      fillSquare(bob, 50);  
   }
     
   public static void fillSquare(Turtle t, int length)
   {
      for (int i = 90; i>0; i--)
      {
         for (int j = 0; j<4; j++)
         {
            t.forward(i);
            t.left(90);
         }
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