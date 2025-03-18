import edu.fcps.karel2.Display;


public class Lab03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display.openWorld("maps/mountain.map");
		Display.setSize(16, 16);
		Climber climber=new Climber(8);
		climber.turnRight();
		climber.move();
		climber.climberUpRight();
		climber.climberUpRight();
		climber.climberUpRight();
		climber.climberDownRight();
		climber.climberDownRight();
		climber.pickBeeper();
		climber.turnAround();
		climber.climberUpLeft();
		climber.climberUpLeft();
		climber.climberDownLeft();
		climber.climberDownLeft();
		climber.climberDownLeft();
		climber.move();
	}

}
