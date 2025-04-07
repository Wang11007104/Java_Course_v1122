import edu.fcps.Digit;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Q1 {
	public static void main(String[] args) {
	
		Display.openWorld(null);
		Display.setSpeed(10);
		Display.setSize(37, 37);
		


		new Thread( new E(3,18)).start();
		new Thread( new E(11,18)).start();
		new Thread( new C(19, 18)).start();
		new Thread( new S(25,18)).start();
		new Thread( new De(9, 9)).start();
		new Thread( new Zero(16, 9)).start();
		new Thread( new Four(25,9)).start();
		
		/*8順時鐘:上1,右1=2,右2=3,下=4,左2=5,左1=6,中=7 */
		
		
		
		
	}

	
}