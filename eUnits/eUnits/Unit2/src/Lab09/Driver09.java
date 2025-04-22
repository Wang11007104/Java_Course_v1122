package Lab09;

	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;

import Lab06.TurtlePanel;
   public class Driver09
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
          
          TwistyTurtle smidge= new TwistyTurtle();
          smidge.setColor(Color.yellow);
          smidge.setThickness(6);
          smidge.drawShape();
          
          
    	  
          TwistyTurtle2 b= new TwistyTurtle2(100,250,90,150,0);
          b.setColor(Color.black);
          b.setThickness(6);
          b.drawShape();
        
          
          TwistyTurtle3 c= new TwistyTurtle3(500,350,0,150,4);
          c.setColor(Color.red);
          c.setThickness(6);
          c.drawShape();
      }
   }