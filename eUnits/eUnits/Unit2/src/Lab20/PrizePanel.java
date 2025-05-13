package Lab20;

   //Name:    Date:
   import javax.swing.*;

import Lab10.Polkadot;
import Lab11.Ball;

import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class PrizePanel extends JPanel
   {
      private static final int FRAME = 800;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private final int num=500;
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Polkadot[] pdarray;
      private PinBall pb;
      private Prize[] array;
      
      private Timer t; 
      int hits = 0;
      //int x=0,y=0;
		//constructor   
       public PrizePanel()
      {
    	   myImage = new BufferedImage (FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage. getGraphics ();
      myBuffer. setColor (BACKGROUND) ;
      myBuffer. fillRect(0, 0, FRAME, FRAME) ;

      pb=new PinBall( (int) (Math.random() * (FRAME - 100) + 50),(int) (Math.random()* (FRAME - 100) + 50),10,Color.black);
      
      pb.setBound(FRAME,FRAME);

      array = new Prize[num];
     

      for(int i=0;i<array.length;i++){
      array[i] = new Prize ( (int) (Math.random() * FRAME), (int) (Math.random() * FRAME), Math.random()*15, Color.red) ;
      }


      t = new Timer(5, new Listener ());
      t.start();
         
      }
       public void paintComponent(Graphics g)
      {
    	   g.drawImage(myImage,0,0,getWidth(),getHeight(),null);
      }


       private class Listener implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
        	  myBuffer.setColor(Color.white);
           myBuffer.fillRect(0, 0, FRAME, FRAME);
      

           for(int i=0;i<num;i++){
            if(pb.intersect(array[i])&&array[i].getMyColor() == Color.red){
               array[i].lightUp();
            }
        	  array[i].drawme(myBuffer); 
         }
         pb.tick();
         pb.drawme(myBuffer);
        	 
        	  repaint();
         }
      }   
       private void collide(Ball b, Polkadot pd)
      {
        double d = distance(  b.getX(),b.getY(),pd.getX(),pd.getY() );  
			if (d<=(b.getRadius()+pd.getRadius())) {
				hits++;
				pd.jump(FRAME, FRAME);
			}
		  
      }
       private double distance(double x1, double y1, double x2, double y2)
      {
         return  Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));	 // enter the calculation here.
      }
   }