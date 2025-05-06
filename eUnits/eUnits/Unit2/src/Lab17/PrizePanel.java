package Lab17;

   //Name:    Date:
   import javax.swing.*;

import Lab10.Polkadot;
import Lab11.Ball;

import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class PrizePanel extends JPanel
   {
      private static final int FRAME = 400;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Ball ball;
      private Polkadot pd;
      private Timer t; 
      int hits = 0;
		//constructor   
       public PrizePanel()
      {
        myImage = new BufferedImage (FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
        myBuffer = myImage. getGraphics ();
        myBuffer. setColor (BACKGROUND) ;
        myBuffer. fillRect(0, 0, FRAME, FRAME) ;
        int xPos = (int) (Math.random() * (FRAME - 100) + 50);
        int yPos = (int) (Math.random()* (FRAME - 100) + 50);
        ball = new Ball (xPos, yPos, 50, Color.black);
        xPos = (int) (Math.random() * (FRAME - 100) + 50);
        yPos = (int) (Math.random() * (FRAME - 100) + 50);
        pd = new Polkadot (xPos, yPos, 25, Color.red) ;
        t = new Timer(5, new Listener ());
        t.start();

        addKeyListener(new Key());
        setFocusable(true);
         
      }
       public void paintComponent(Graphics g)
      {
    	   g.drawImage(myImage,0,0,getWidth(),getHeight(),null);

           g.setFont(new Font("Serif", Font.BOLD, 20));
		   g.setColor(Color.BLACK);
           
		   g.drawString("Use ↑,↓,←and→ to control", 170, 50);
           g.setColor(Color.RED);
           g.drawString("Use 1,2,3and4 to control", 170, 70);
      }

      private class Key extends KeyAdapter {
         @Override
         public void keyPressed(KeyEvent e) {
             if (e.getKeyCode() == KeyEvent.VK_UP)
                 ball.setY(ball.getY() - 10);
             if (e.getKeyCode() == KeyEvent.VK_DOWN)
                 ball.setY(ball.getY() + 10);
             if (e.getKeyCode() == KeyEvent.VK_LEFT)
                 ball.setX(ball.getX() - 10);  // <-- 原來寫錯 getY()
             if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                 ball.setX(ball.getX() + 10);
     
             if (e.getKeyCode() == KeyEvent.VK_1) {
                 pd.setY(pd.getY() - 10);
                 if (pd.getY() < 0)
                     pd.setY(pd.getRadius());
             }
             if (e.getKeyCode() == KeyEvent.VK_2) {
                 pd.setY(pd.getY() + 10);
                 if (pd.getY() > FRAME)
                     pd.setY(FRAME - pd.getRadius());
             }
             if (e.getKeyCode() == KeyEvent.VK_3) {
                 pd.setX(pd.getX() - 10);
                 if (pd.getX() < 0)
                     pd.setX(pd.getRadius());
             }
             if (e.getKeyCode() == KeyEvent.VK_4) {
                 pd.setX(pd.getX() + 10);
                 if (pd.getX() > FRAME)
                     pd.setX(FRAME - pd.getRadius());
             }
         }
     }



      private class Listener implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
        	  myBuffer.setColor(BACKGROUND);
           myBuffer.fillRect(0, 0, FRAME, FRAME);
              
        	
        	  ball. move (FRAME, FRAME);
        	  collide (ball, pd);

        	  ball.draw(myBuffer); 
           pd.draw(myBuffer);

        	  myBuffer. setColor (Color.black);
        	  myBuffer. setFont (new Font("Monospaced", Font. BOLD, 24)) ;
			  myBuffer .drawString("Count : " + hits , FRAME - 150, 25);
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