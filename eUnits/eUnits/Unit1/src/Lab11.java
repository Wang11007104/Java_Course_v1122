import edu.fcps.Digit;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab11 {
	public static void main(String[] args) {
	
		Display.openWorld(null);
		Display.setSpeed(10);
		Display.setSize(60, 37);
		
		/*new One(2,9).display();
		new One(9,9).display();
		new Zero(16,9).display();
		new Zero(23,9).display();
		new Seven(30,9).display();
		new One(37,9).display();
		new Zero(44,9).display();
		new Four(51,9).display();*/


		new Thread( new One(2,9)).start();
		new Thread( new One(9,9)).start();
		new Thread( new Zero(16, 9)).start();
		new Thread( new One(37,9)).start();
		new Thread( new Zero(44, 9)).start();
		new Thread( new Zero(23, 9)).start();
		new Thread( new Seven(30,9)).start();
		new Thread( new Four(51,9)).start();
		
		/*8順時鐘:上1,右1=2,右2=3,下=4,左2=5,左1=6,中=7 */
		
		
		
		
	}

	
}