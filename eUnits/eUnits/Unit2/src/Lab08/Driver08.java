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



         new Thread( new FlowerTurtle(100,45,Color.red)).start();
         new Thread( new FlowerTurtle(250,45,Color.yellow)).start();
         new Thread( new FlowerTurtle(400,45,Color.blue)).start();
         new Thread( new FlowerTurtle(550,45,Color.black)).start();
    
    	  
      }
   }