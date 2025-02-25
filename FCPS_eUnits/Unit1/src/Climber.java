import edu.fcps.karel2.Display;


public class Climber extends Athlete {

	public Climber() {
		// TODO Auto-generated constructor stub
	}

	public Climber(int x) {
		super(x, 1, Display.NORTH, 1);
		// TODO Auto-generated constructor stub
	}
	public void climberUpRight() {
		turnLeft();
		move();
		move();
		turnRight();
		move();
		
	}
	public void climberDownRight() {
		move();
		turnRight();
		move();
		move();
		turnLeft();
		
	}
	public void climberUpLeft() {
		turnRight();
		move();
		move();
		turnLeft();
		move();
	}
	public void climberDownLeft() {
		move();
		turnLeft();
		move();
		move();
		turnRight();
		
	}
}
