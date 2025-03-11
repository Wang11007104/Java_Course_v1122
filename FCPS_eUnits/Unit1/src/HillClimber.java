
public class HillClimber extends Climber {

	@Override
	public void climberUpRight() {
		turnLeft();
		move();
		turnRight();
		move();
		move();
	}

	@Override
	public void climberDownRight() {
		move();
		move();
		turnRight();
		move();
		turnLeft();
		
	}

	@Override
	public void climberUpLeft() {
		turnRight();
		move();
		turnLeft();
		move();
		move();	
	}

	@Override
	public void climberDownLeft() {
		move();
		move();	
		turnLeft();
		move();
		turnRight();
	}

	public HillClimber() {
		// TODO Auto-generated constructor stub
	}

	public HillClimber(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

}
