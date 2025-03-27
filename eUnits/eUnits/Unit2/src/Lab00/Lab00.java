package Lab00;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Lab00 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Lab00");
		frame.setSize(600, 300);// 設定視窗多大
		frame.setLocation(200, 200);//設定開啟視窗左上角頂點為(0,0)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setDefaultCloseOperation()方法是JFrame類別的一個方法，它用於設置當用戶關閉窗口時應用程序的行為。
//		JFrame.EXIT_ON_CLOSE是一個靜態常數，表示在用戶關閉窗口時應用程序應該終止。因此，frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)的意思是：當用戶關閉窗口時，應用程序應該終止運行。這通常用於確保當用戶關閉應用程序時，所有相關的線程和資源都被正確地釋放和關閉，以避免出現任何問題。
		frame.setContentPane(new Panel00());//它用於設置窗口的內容面板，也就是用於放置所有GUI元素的容器。
		frame.setVisible(true);//會將窗口設置為可見狀態，使其顯示在螢幕上
//		frame.setVisible(false);//會將窗口設置為不可見狀態，使其隱藏在螢幕上。
		// frame.pack();//視窗大小等於panel物件大小

	}

}
