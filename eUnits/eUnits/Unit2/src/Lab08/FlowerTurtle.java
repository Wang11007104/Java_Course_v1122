package Lab08;

	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   public class FlowerTurtle extends Turtle
   {
      private double mySize;
      private Color myColor;
      public FlowerTurtle()
      {
         mySize = 50.0;
         myColor = Color.RED;
      }
      public FlowerTurtle(double x, double n, Color c)
      {
         super(x, 300.0, 90.0);
         mySize = n;
         myColor = c;
      }
      public void setSize(double n)
      {
         mySize = n;
      }
      public void setColor(Color c)
      {
         myColor = c;
      }
      private void drawPetals() //starts and ends at center facing north
      {
    	  super.setColor(myColor);
    	  
    	  double interiorAngle;
    	  interiorAngle=360/30;
    	  
    	  for(int i=0;i<=30;i++) {
    		  forward(mySize);
    		  turnLeft(180);
    		  forward(mySize);
    		  turnLeft(180);
    		  turnLeft(interiorAngle);
    	  }
    	  
    	  
    	  
         
      
      }
      private void drawStem() //starts at top of stem facing south, ends at bottom
      {
    	  super.setColor(Color.green);
         turnLeft(165);
         forward(mySize*2.5);
         turnLeft(180);
         forward(mySize*0.5);
         turnLeft(45);
         forward(mySize*0.5);
         turnLeft(180);
         forward(mySize*0.5);
         turnLeft(90);
         forward(mySize*1);
         turnLeft(180);
         forward(mySize*1);
      
      }
      public void drawShape()
      {
         drawPetals();
         drawStem();
      }
   }