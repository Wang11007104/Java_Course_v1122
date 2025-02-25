import edu.fcps.karel2.Display;

public class Lab05 {
	public static void runTheRace(Racer arg) {
		arg.move();
		arg.jumpRight();
		arg.shuttle(2, 7);
		arg.shuttle(2, 5);
		arg.shuttle(2, 3);
		arg.turnAeound();
		arg.sprint(6);
		arg.jumpLeft();
		arg.move();
		arg.put(15);
		arg.turnAeound();
		arg.move();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display.openWorld("maps/shuttle.map");
		Display.setSize(10,10);
		Display.setSpeed(9);
		Racer r1=new Racer(1);
		Racer r2=new Racer(4);
		Racer r3=new Racer(7);
		runTheRace(r1);
		runTheRace(r2);
		runTheRace(r3);
	}

}
