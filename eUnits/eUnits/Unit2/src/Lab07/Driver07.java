package Lab07;

	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;

import Lab06.TurtlePanel;
   public class Driver07
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Polygon Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
      
         PolygonTurtle smidge = new PolygonTurtle(100.0, 3);
         smidge.setColor(Color.BLUE);
         smidge.setThickness(6);
         smidge.drawShape();
         
         smidge = new PolygonTurtle(100.0,4);
         smidge.setColor(Color.BLUE);
         smidge.setThickness(6);
         smidge.drawShape();
        
         smidge = new PolygonTurtle(100.0,5);
         smidge.setColor(Color.BLUE);
         smidge.setThickness(6);
         smidge.drawShape();
      
         smidge = new PolygonTurtle(100.0,6);
         smidge.setColor(Color.BLUE);
         smidge.setThickness(6);
         smidge.drawShape();
         
         
      }
   }