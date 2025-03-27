package Lab09;

	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
    public class TwistyTurtle extends Turtle
   {
      private double mySize;
      private int mySides;
       public TwistyTurtle()
      {
         super();
         mySize = 400.0;
      }
       public void setSize(double n)
      {
         mySize = n;
      }
       public void setSides(int s)
      {
         mySides = s;
      }
       public void drawShape()
      {
         for(int i=5;i<mySize;i+=10) {
        	 forward(i);
        	 turnLeft(123); 
         }
      }
   }