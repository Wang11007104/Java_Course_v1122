package Lab15;

   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 6.17.2003

   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class KarelPanel extends JPanel
   {
      private static final int WIDTH = 395, HEIGHT = 391; //constants
      private static final Color BACKGROUND = new Color(204, 204, 204);
   
      private int xPos, yPos, dir; //fields
      private ImageIcon[] myArray;
      private BufferedImage myImage;
      private Graphics myBuffer;
       public KarelPanel()
      {
         myImage =  new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
         myBuffer = myImage.getGraphics();
         myArray = new ImageIcon[4];
         myArray[0] = new ImageIcon("C:\\Users\\User\\OneDrive\\Documents\\GitHub\\Java_Course_v1122\\eUnits\\eUnits\\Unit2\\src\\Lab15\\karele.gif");   //east
         myArray[1] = new ImageIcon("C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\GitHub\\\\Java_Course_v1122\\\\eUnits\\\\eUnits\\\\Unit2\\\\src\\\\Lab15\\\\kareln.gif");   //north
         myArray[2] = new ImageIcon("C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\GitHub\\\\Java_Course_v1122\\\\eUnits\\\\eUnits\\\\Unit2\\\\src\\\\Lab15\\\\karelw.gif");   //west
         myArray[3] = new ImageIcon("C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\GitHub\\\\Java_Course_v1122\\\\eUnits\\\\eUnits\\\\Unit2\\\\src\\\\Lab15\\\\karels.gif");   //south
         dir = 0;     //start facing east
         xPos = 5;    //starting xPos
         yPos = HEIGHT - 3 - myArray[dir].getImage().getHeight(null); //starting yPos
         Timer t = new Timer(250, new Listener());
         t.start();
      }
       public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
       private class Listener implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
            myBuffer.setColor(BACKGROUND);
            myBuffer.fillRect(0, 0, WIDTH, HEIGHT);
            myBuffer.setColor(Color.red);
            for(int x = 17; x < WIDTH; x += 30) //vertical lines
            {
               myBuffer.drawLine(x,0,x,HEIGHT);
            }
            for(int y = 9; y < HEIGHT; y += 28) //horizontal lines
            {
               myBuffer.drawLine(0,y,WIDTH,y);
            }
            myBuffer.fillRect(107, 121, 180, 56);
            myBuffer.setColor(Color.black);
            myBuffer.setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 20));
            myBuffer.drawString("Karel the Robot", 125, 155);
         
         	/*************************************
         	Calculate karel's xPos and yPos.
         	At the end of each row, the dir changes.
         	The dir controls which image to use.
         	*************************************/
            myBuffer.drawImage(myArray[dir].getImage(), xPos, yPos, null);
            switch (dir) {
               case 0:
                  if(xPos<361){
                     xPos=xPos+15;
                  }else{
                     dir=1;
                     xPos=362;
                     yPos=360;
                  }
                  
                  break;
               case 1:
                  if (yPos>9) {
                     yPos=yPos-14;
                  } else{
                     dir=2;
                     xPos=360;
                     yPos=-4;
                  
               }   
                  break;
                case 2: // west
                  if (xPos > 17) {
                     xPos =xPos- 15;
                  } else {
                     dir =3;
                     xPos=4;
                     yPos=0;
                  }
                  break;   
               case 3:
                  if (yPos<361) {
                     yPos=yPos+14;
                     
                  }else{
                     dir=0;
                     xPos=5;
                     yPos=HEIGHT-3-myArray[dir].getImage().getHeight(null);
                  }
                  break;
            }





            repaint();
         }
      }
   }