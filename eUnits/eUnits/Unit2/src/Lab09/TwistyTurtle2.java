package Lab09;

	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
    public class TwistyTurtle2 extends Turtle
   {
      private double mySize;
      private int mySides;
       public TwistyTurtle2()
      {
         super();
         mySize = 0;
         mySides = 6;
      }
       public TwistyTurtle2(double n, int s)
      {
         mySize = n;
         mySides = s;
      }
       public TwistyTurtle2(double x, double y, double h, double n, int s)
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
    	   for(int i=0;i<mySize;i+=2) {
          	 forward(i);
          	 turnLeft(30); 
           }
      }
   }