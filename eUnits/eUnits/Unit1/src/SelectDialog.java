import javax.swing.JOptionPane;

public class SelectDialog {


    
    public static String showSelectionDialog(String message, String title, String... options) {
        int choice = JOptionPane.showOptionDialog(
            null, 
            message, 
            title, 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0] // 預設選中的選項
        );

        return (choice != -1) ? options[choice] : null; // 如果選擇了選項，返回對應的值，否則返回 null
    }

        public static String showDropdownDialog(String message, String title, String... options) {
            Object selectedValue = JOptionPane.showInputDialog(
                null, 
                message, 
                title, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                options,  // 傳入選項作為下拉選單
                options[0] // 預設選擇第一個
            );
    
            return (selectedValue != null) ? selectedValue.toString() : null; // 如果取消則返回 null
        }
    
}
