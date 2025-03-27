package Lab01;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Lab00.Panel00;

public class Lab01 extends JPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Lab01");
		frame.setSize(400, 400);// 設定視窗多大
		frame.setLocation(700, 300);//視窗坐落於
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel01());
		frame.setVisible(true);

	}

}
