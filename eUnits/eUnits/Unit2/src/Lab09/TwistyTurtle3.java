package Lab09;

	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
    public class TwistyTurtle3 extends Turtle
   {
      private double mySize;
      private int mySides;
       public TwistyTurtle3()
      {
         super();
         mySize = 50.0;
         mySides = 6;
      }
       public TwistyTurtle3(double n, int s)
      {
         mySize = n;
         mySides = s;
      }
       public TwistyTurtle3(double x, double y, double h, double n, int s)
      {
         super(x, y, h);
         mySize = n;
         mySides = s;
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
    	   for(int i =25; i<90;i+=5) {
    	   forward(i);
    	   turnLeft(90);
    	   forward(i);
    	   turnLeft(90);
    	   forward(i);
    	   turnLeft(90);
    	   forward(i);
    	   }
    	   turnLeft(45);
    	   for(int i =25; i<90;i+=5) {
        	   forward(i);
        	   turnLeft(90);
        	   forward(i);
        	   turnLeft(90);
        	   forward(i);
        	   turnLeft(90);
        	   forward(i);
        	   }
      }
   }