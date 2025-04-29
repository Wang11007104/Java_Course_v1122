package Lab13;

import javax.swing.*;

import Lab10.Polkadot;
import Lab11.Ball;

import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;

public class ProjectPanel extends JPanel 
{
	private static final ImageIcon THOMAS = new ImageIcon("C:\\Users\\User\\OneDrive\\Documents\\GitHub\\Java_Course_v1122\\eUnits\\eUnits\\Unit2\\src\\Lab13\\tj.jpg");
	private BufferedImage myImage;
	private Graphics2D myBuffer;
	private Timer t1, t2;
	private int xPos;

	public ProjectPanel() {
		xPos = 50;
		myImage =  new BufferedImage(700, 500,BufferedImage.TYPE_INT_RGB);
		myBuffer = (Graphics2D)myImage.getGraphics();
	    t1 = new Timer(100, new Listener1());
		t1.start();
		t2 = new Timer (8000, new Listener2());
		}

	public void paintComponent(Graphics g) {
		g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
	}

	private class Listener1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
				int xPoints[] = { xPos, xPos, xPos + 50, xPos, xPos - 50, xPos,
				xPos, xPos - 50, xPos, xPos + 50 };
				int YPoints[] = { 150, 200, 175 , 200, 175, 200,
						300, 400 , 300, 400  };
				myBuffer.setColor (Color.gray);
				myBuffer. fillRect(0, 0, 700, 360);
				myBuffer. drawImage( THOMAS.getImage(), xPos - 40, 50,75, 125, null);
				
				myBuffer.fillRect(xPos - 65, 150, 130, 70) ;
				myBuffer.setColor (Color.gray. darker ());
				myBuffer.fillRect (0, 360, 700, 500);
				myBuffer.setStroke (new BasicStroke(10.0f));
				myBuffer.setColor (Color.gray.darker());
				myBuffer.drawPolyline(xPoints, YPoints, 10);
				 if(xPos == 200) {
				myBuffer.setColor (Color .black);
				myBuffer.setFont (new Font ("Monospaced", Font.BOLD, 24));
				myBuffer.drawString("颱風天要帶多少錢出門？",325, 100);
				myBuffer.setStroke (new BasicStroke(5.0f));
				myBuffer.drawOval (290, 65, 400, 60);
				t1.stop();
				t2.start();
				} else {
				xPos = xPos + 5;
				}
				repaint(); // g.drawImage (my Image, 0, 0, getwidth(), getHeight()，
		}
	}
	
	private class Listener2 implements ActionListener {
		public void actionPerformed (ActionEvent e) {
		t2.stop();
		myBuffer.setColor (Color .black);
				myBuffer.drawOval (250, 220, 400, 100);
				myBuffer.setFont (new Font ("Monospaced", Font.BOLD, 24));
				myBuffer.drawString("4千萬 因為...",320, 250);
				myBuffer.drawString("颱風天沒\"事千萬\"不要出門",330, 280);
				myBuffer.setStroke (new BasicStroke(5.0f));
				myBuffer.drawOval (290, 65, 400, 60);
		repaint();
		}
	}
}