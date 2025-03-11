import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display.openWorld("maps/school.map");
		Display.setSize(10, 10);
		Robot lisa=new Robot(1,1,Display.EAST,2); 
		Robot pete=new Robot(4,5,Display.SOUTH,0); 
		lisa.move();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.pickBeeper();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.move();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.move();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.move();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.move();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.move();
		lisa.putBeeper();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.move();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.move();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.turnLeft();
		lisa.move();
		lisa.move();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.move();
		lisa.move();		
		lisa.turnLeft();
		lisa.move();
		lisa.move();
		lisa.putBeeper();
		lisa.turnLeft();
		lisa.turnLeft();
		lisa.move();
		



	}

}
