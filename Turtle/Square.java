/*=============================================================================
   Sqaure.java                                                            
   ----------------------------------------------------------------------------
   Programmer:  Shreya Sukumar                                                     
   Date:        Sep, 17, 2021                                               
   Course:      ICS4U1                                                        
 ==============================================================================
   This program makes a turtle go in a sqaure motion */

public class Square 
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
      }
   }
}     
      
