
public class StepClimber extends Climber {

	public StepClimber() {
		// TODO Auto-generated constructor stub
	}

	public StepClimber(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void climberUpRight() {
		turnLeft();
		move();
		turnRight();
		move();
	}

	@Override
	public void climberDownRight() {
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
	}

	@Override
	public void climberDownLeft() {
		move();
		turnLeft();
		move();
		turnRight();
	}

}
