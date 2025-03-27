package Lab01;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class Panel01 extends JPanel {

//	public Panel00() {
//		super();
//		// TODO Auto-generated constructor stub
//		setPreferredSize(new Dimension(500,500));
//	}
@Override
	protected void paintComponent(Graphics g) {
		g.setFont(new Font("Serif",Font.ITALIC, 30));//Font.ITALIC斜體
		g.setColor(new Color(255, 255, 255));
		g.drawString("welcome Home", 40, 40);//顯示內容,基準點X,基準點Y
		g.setColor(Color.yellow);
		g.fillOval(300, 75, 50, 50);//畫一個圓狀(X起點,y起點,圓寬,圓高)
		g.setColor(Color.white);
		g.fillOval(0, 70, 70, 30);
		g.fillOval(70, 70, 70, 30);
		g.fillOval(140, 70, 70, 30);
		g.fillOval(210, 70, 70, 30);
		g.fillOval(280, 70, 70, 30);
		g.fillOval(350, 70, 70, 30);
		g.setColor(Color.red);//改變畫筆顏色
		g.drawRect(100, 200, 150, 150);//畫一個矩形的邊框(X起點,y起點,寬度,高度)
		g.setColor(Color.black);
		g.fillRect(150, 275, 50, 75);//填滿一個矩形的顏色(X起點,y起點,向右填滿的寬度,向下填滿的高度)
		int xPoints[] = {75, 175, 275};
		int yPoints[] = {200, 150, 200};
		g.drawPolygon(xPoints, yPoints, 3);//多邊形((傳入須是陣列等組數型態)每個頂點的橫座標,(傳入須是陣列等組數型態)每個頂點的縱座標,多邊形的頂點數量)//這邊是三角形範本
		g.setColor(Color.green);
		g.drawLine(0, 350, 400, 350);//(x1起點的橫座,y1是起點的縱座標,x2是終點的橫座標,y2是終點的縱座標)

	}

}
