/*=============================================================================
   BrokenRectangle.java                                                            
   ----------------------------------------------------------------------------
   Programmer:  Shreya Sukumar                                                     
   Date:        Sep, 17, 2021                                               
   Course:      ICS4U1                                                        
 ==============================================================================
   This program makes a turtle go in a misshapen rectangle motion */

public class BrokenRectangle 
{
   public static void main(String[] a)
   {
      Turtle bob = new Turtle();
      //Look at https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html for different colours
      Turtle.bgcolor("lightblue");
      bob.penColor("red");
      bob.width(10);
      
      for (int i = 0; i<2; i++)
      {
        bob.right(90);
        bob.forward(180);
      }
      
      for (int j = 0; j<2; j++)
      {
        bob.right(90);
        bob.forward(120);
      }

      bob.left(90);
      bob.forward(90);
      
      for (int k = 0; k<2; k++)
      {
        bob.right(90);
        bob.forward(60);
      }
   }
}