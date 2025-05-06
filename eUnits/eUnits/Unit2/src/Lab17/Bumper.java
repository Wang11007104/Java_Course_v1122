package Lab17;

// Name: 				Date:

import java.awt.*;

import Lab17.Polkadot;
import Lab17.Ball;


   
public class Bumper
{
//private fields, all ints, for a Bumper
//hint: the "location" of the bumper begins at its top left corner.      
private float myX;
private float myY;
private float myXW;
private float myYW;
private Color myC;


 //constructors
   public Bumper()         //default constructor
  {
  
  }
   public Bumper(int x, int y, int xWidth, int yWidth, Color c)
  {
      myX=x;
      myY=y;
      myXW=xWidth;
      myYW=yWidth;
      myC=c;
  }
  public float getX(){return myX;}
  public float getY(){return myY;}
  public float getXWidth(){return myXW;}
  public float getYWidth(){return myYW;}
  public Color getColor(){return myC;}
  public void setxWidth(int xWidth){this.myXW=xWidth;}
  public void setyWidth(int yWidth){this.myYW=yWidth;}
  
  public void setColor(Color myColor){this.myC=myColor;}
   

  
  
 // accessor methods  (one for each field)

 // modifier methods  (one for each field)

 // instance methods
 // chooses a random (x,y) location.  Bumper stays entirely in the window.
    public void jump(float rightEdge, float bottomEdge)
  {
     myX=(float)(Math.random()*(rightEdge-getXWidth()+myXW/2));
     myY=(float)(Math.random()*(bottomEdge-getYWidth()+myYW/2));
  
  }
  
   // draws a rectangular bumper on the buffer
   public void draw(Graphics myBuffer) 
  {
     myBuffer.setColor(getColor());
     myBuffer.fillRect((int)getX(), (int)getY(), (int)getXWidth(), (int)getYWidth());
  }   
  // returns true if any part of the polkadot is inside the bumper
   public boolean inBumper(Polkadot prize)
  {
     for(float x = getX(); x <= getX() + getXWidth(); x++)   //starts at upper left corner(x,y)
        for(float y = getY(); y <= getY() + getYWidth(); y++)
           if(distance(x, y, prize.getX(), prize.getY()) <= prize.getRadius() ) //checks every point on the bumper
              return true;            
     return false;
  }  
  // returns distance between (x1, y1) and (x2, y2)
   private double distance(double x1, double y1, double x2, double y2)
  {
     return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
  }
  public boolean inBumper(Ball ball) {
   for(float x = getX(); x <= getX() + getXWidth(); x++)   //starts at upper left corner(x,y)
   for(float y = getY(); y <= getY() + getYWidth(); y++)
      if(distance(x, y, ball.getX(), ball.getY()) <= ball.getRadius() ) //checks every point on the bumper
         return true;            
return false;
}
  public void sety(float y) {
    // TODO Auto-generated method stub
    this.myY=y;
  }
  public void setx(float x) {
   // TODO Auto-generated method stub
   this.myX=x;
  }
}
