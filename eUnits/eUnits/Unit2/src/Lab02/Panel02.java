package Lab02;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel02 extends JPanel {
	protected void paintComponent(Graphics g) {
		//set background
		g.setColor(Color.blue.darker());
		g.fillRect(0, 0, 400, 400);
		
		//set 
		g.setColor(Color.yellow);
		
		int xPoint=130;
		int yPoint=75;
		
		int x=xPoint;
		int y=yPoint;
		
		for(int i=0;i<10;i++) {
			g.fillOval(x, y, 20, 20);
			y +=20;
		}
		
		x=xPoint +20*7;
		y=yPoint;
		for(int i=0;i<10;i++) {
			g.fillOval(x, y, 20, 20);
			y +=20;
		}
		
		x=xPoint+20;
		y=yPoint;
		for(int i=0;i<6;i++) {
			g.fillOval(x, y, 20, 20);
			x +=20;
		}
		
		x=xPoint+20;
		y=yPoint+20*9;
		for(int i=0;i<6;i++) {
			g.fillOval(x, y, 20, 20);
			x+=20;
		}
		
		x=xPoint+10;
		y=yPoint+10;
		
		g.fillRect(x, y, 140, 180);
		
		
		ImageIcon thomas=new ImageIcon("./src/Lab02/tj.jpg");//保險起見可以輸入絕對路徑
		g.drawImage(thomas.getImage(), 150, 95, 120, 160, null);
		
		g.setColor(Color.white);
		g.setFont(new Font("ScanSerif",Font.ITALIC,30));
		g.drawString("Our Fearless Leader", 70, 320);
		
	}
	
}
