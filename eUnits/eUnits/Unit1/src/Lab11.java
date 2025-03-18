import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab11 {
	public static void main(String[] args) {
	
		Display.openWorld(null);
		Display.setSpeed(10);
		Display.setSize(60, 37);
		
		new One(2,9).display();
		new One(9,9).display();
		new Zero(16,9).display();
		new Zero(23,9).display();
		new Seven(30,9).display();
		new One(37,9).display();
		new Zero(44,9).display();
		new Four(51,9).display();
		
		
		
		
		
	}

	
}