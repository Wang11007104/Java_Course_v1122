package Lab03;

import javax.swing.JFrame;

import Lab01.Panel01;

public class Lab03 extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Lab02");
		frame.setSize(400, 400);// 設定視窗多大
		frame.setLocation(700, 300);//視窗坐落於
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel03());
		frame.setVisible(true);
	}

}
