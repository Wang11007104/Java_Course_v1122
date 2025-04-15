package Lab06;

	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
    public class Driver06
   {
       public static void main(String[] args)
      {
         JFrame frame = new JFrame("Square Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         
         Turtle.setCrawl(true);     //a class method
      
         SquareTurtle smidge = new SquareTurtle(500,300,45,20);    
         smidge.setColor(Color.yellow);
         smidge = new SquareTurtle(500,300,45,30);
         smidge.setColor(Color.yellow);
         smidge.setThickness(6);
         smidge.drawShape();
         smidge = new SquareTurtle(500,300,45,60);
         smidge.setColor(Color.yellow);
         smidge.setThickness(6);
         smidge.drawShape();
         smidge = new SquareTurtle(500,300,45,90);
         smidge.setColor(Color.yellow);
         smidge.setThickness(6);
         smidge.drawShape();
         smidge = new SquareTurtle(500,300,45,120);
         smidge.setColor(Color.yellow);
         smidge.setThickness(6);
         smidge.drawShape();
         smidge = new SquareTurtle(500,300,45,150);
         smidge.setColor(Color.yellow);
         smidge.setThickness(6);
         smidge.drawShape();
         
         smidge = new SquareTurtle(100,250,45,30);
         smidge.setColor(Color.red);
         smidge.setThickness(8);
         smidge.drawShape();
         
         smidge = new SquareTurtle(300,300,90,50);
         smidge.setColor(Color.BLUE);
         smidge.setThickness(6);
         smidge.drawShape();
         smidge = new SquareTurtle(300,300,90,100);
         smidge.setColor(Color.BLUE);
         smidge.setThickness(6);
         smidge.drawShape();
   
      }
   }