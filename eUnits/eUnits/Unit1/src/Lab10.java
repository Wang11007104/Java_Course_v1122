import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab10 {
	public static void main(String[] args) {
		
        String filename = SelectDialog.showDropdownDialog("What robot world?", "What robot world?", "maze1", "maze2", "maze3","maze9r");
		Display.openWorld("maps/"+filename+".map");
		Display.setSize(10, 10);
		Display.setSpeed(10);
		//Athlete pete = new Athlete(1, 1, 0, 0);
		//followWallsRight(pete);
		//pete.followWallsRight(pete);


		var pete=new Athlete();
		pete.followWallsLeft();
	}

	/*public static void followWallsRight(Athlete s) {
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

	}*/
}
