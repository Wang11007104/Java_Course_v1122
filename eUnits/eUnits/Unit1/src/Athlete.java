import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Athlete extends Robot {
	public Athlete() {
		super(1,1,Display.NORTH,Display.INFINITY);
	}
	public Athlete (int x,int y,int dir,int beeps) {
		super(x,y,dir,beeps);
	}
	public void turnAround() {
		turnLeft();
		turnLeft();
	}
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}



	public void dirRobot(int direction) {
		int v = getDirection();
		int t = direction;
		if (t < v)
			t += 4;
		for (int i = v; i < t; i++) {
			turnLeft();
		}
	}


	public void supRobot(String s) { // 0-3上下左右移動4-7面向
		String[] cmd = s.split("");
		for (int i = 0; i < cmd.length; i++) {

			if (cmd[i].indexOf("0") != -1 || cmd[i].indexOf("1") != -1 || cmd[i].indexOf("2") != -1
					|| cmd[i].indexOf("3") != -1) {
				dirRobot(Integer.parseInt(cmd[i]));
				move();
			} else if (cmd[i].indexOf("p") != -1) { // p for put down
				putBeeper();
			} else if (cmd[i].indexOf("t") != -1) { // t for take
				pickBeeper();
			} else if (cmd[i].indexOf("4") != -1 || cmd[i].indexOf("5") != -1 || cmd[i].indexOf("6") != -1
					|| cmd[i].indexOf("7") != -1) {
				dirRobot(Integer.parseInt(cmd[i]) % 4);
			} else if (cmd[i].equals("l")) {
				turnLeft();
			} else if (cmd[i].equals("r")) {
				turnRight();
			} else if (cmd[i].equals("m")) {
				move();
			} else if (cmd[i].equals("a")) {
				turnAround();
			}
		}
	}


	
}


