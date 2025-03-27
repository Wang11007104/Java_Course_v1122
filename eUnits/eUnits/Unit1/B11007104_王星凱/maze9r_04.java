import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class maze9r_04 {
	public static void main(String[] args) {
		
        String filename = SelectDialog.showSelectionDialog("world", "world", "maze9r");
		Display.openWorld("Unit1/B11007104_王星凱/"+filename+".map");
		Display.setSize(10, 10);
		Display.setSpeed(10);
		Athlete pete = new Athlete(1, 1, 0, 0);
		followWallsRight(pete);
	}

	public static void followWallsRight(Athlete s) {
		while (!s.nextToABeeper()) {
			if (!s.rightIsClear() && s.frontIsClear() && !s.nextToABeeper()) {
				s.move();
			} else if (s.rightIsClear()) {
				s.turnRight();
				s.move();
			} else if (!s.frontIsClear()) {
				s.turnLeft();
			} else {
				s.move();
			}
		}

	}
}
