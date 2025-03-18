import java.io.File;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Lab00test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        SelectDialog options=new SelectDialog();
        String selected=options.showSelectionDialog("請選擇一個選項", "請選擇一個選項", "mountain1", "mountain2", "mountain3", "hill1");
	
        if (selected != null) {
            Display.openWorld("maps/" + selected + ".map");
        } else {
            System.out.println("用戶取消了選擇");
        }
    
        
        
        
        
        //String[] options = {"mountain1", "mountain2", "mountain3", "hill1"};
        
        // 建立 JComboBox
        //JComboBox<String> comboBox = new JComboBox<>(options);

        // 顯示對話框
        //int result = JOptionPane.showConfirmDialog(
               // null, comboBox, "請選擇一個選項", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        // 判斷使用者是否按下 OK 按鈕
       // if (result == JOptionPane.OK_OPTION) {
            //String selectedOption = (String) comboBox.getSelectedItem();
           // Display.openWorld("maps/" + selectedOption + ".map");
      //  }

	}

}
