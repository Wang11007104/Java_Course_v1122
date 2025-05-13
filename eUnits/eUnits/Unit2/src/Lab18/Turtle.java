package Lab18;

// Torbert, 7.20.06

   import java.awt.*;
   import java.awt.image.*;

    public class Turtle
   {
      private static BufferedImage img;
      private static int black = 0;
      private static int blue = 255;       // 2^8-1
      private static int green = 65280;    //(2^8-1)*2^8
      private static int red = 16711680;   //(2^8-1)*2^16
      private static int white = 16777215; // 2^24-1
      private double x,y,theta;
      private static Graphics graphics;  
      private boolean penDown;
      private int x1,y1;
      private Color turtleColor;          // what does a Turtle know?
      static									 	 // a static initializer list
      {
         img = new BufferedImage(800,600,BufferedImage.TYPE_INT_RGB);
         graphics = img.createGraphics();
      }
       public Turtle()
      {
         //img = new BufferedImage(800,600,BufferedImage.TYPE_INT_RGB);
         x=img.getWidth()/2;           //start at center
         y=img.getHeight()/2;          //start at center
         theta=90;                     //start facing north
      }
       public static Image getImage()
      {
         return img;
      }
       public void turnLeft(double a)
      {
         theta+=a;
      }
       public void forward(double r)
      {
         double newX=0;
         double newY=0;
         for(int i=0;i<(int)r;i++){
            newX = x + i * Math.cos(Math.toRadians(theta));
            newY = y - i * Math.sin(Math.toRadians(theta)); 
            
            img.setRGB((int) newX,(int ) newY, white);
         }
         x=newX;
         y=newY;
      }
      public static void clear(Color c){
         graphics.setColor(c);
         graphics.fillRect(0, 0, 800, 600);
         graphics.drawImage(img,0, 0, 800, 600,null);


      }
      public static void clear(){
         clear(Color.black);
      }

      public void drawLine(int x1,int y1,int x2,int y2){
         int sx = x1<x2? 1:-1;
         int sy = y1<y2?1:-1;

         while (true) {
            if(x1>=0&&y1>=0&&x1<img.getWidth()&&y1<img.getHeight())
               img.setRGB(x1, y1, white);
            if(x1==x2&&y1==y2) break;
               x1+=sx;
               y1+=sy;   
         }
      }
   }