package Lab08;

	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;

import Lab06.TurtlePanel;
   public class Driver08
   {
      public static void main(String[] args)
      {
    	  JFrame frame = new JFrame("Flower Turtles");
          frame.setSize(400, 400);
          frame.setLocation(200, 100);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setContentPane(new TurtlePanel());
          frame.setVisible(true);  
      	
    	  Turtle.clear(Color.white);
    	  
    	  Turtle.setCrawl(true);
    	  
    	  FlowerTurtle a =new FlowerTurtle(100.0,25.0,Color.blue);
    	  a.drawShape();
    	  
    	  FlowerTurtle b =new FlowerTurtle(200.0,25.0,Color.red);
    	  b.drawShape();
    	  
    	  FlowerTurtle c =new FlowerTurtle(300.0,25.0,Color.orange);
    	  c.drawShape();
    	  
    	  FlowerTurtle d =new FlowerTurtle(400.0,25.0,Color.pink);
    	  d.drawShape();
    	  
      }
   }