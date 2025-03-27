package Lab00;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class Panel00 extends JPanel {

//	public Panel00() {
//		super();
//		// TODO Auto-generated constructor stub
//		setPreferredSize(new Dimension(500,500));
//	}
@Override
	protected void paintComponent(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(100, 50, 400, 100);
		g.setFont(new Font("Serif", Font.BOLD, 40));
		g.setColor(new Color(150, 150, 150));
		g.drawString("welcome to Java GUI! ", 100, 110);//顯示內容,基準點X,基準點Y
	}

}
