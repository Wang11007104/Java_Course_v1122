
public class Seeker extends Athlete {

	public Seeker() {
		// TODO Auto-generated constructor stub
	}

	public Seeker(int x, int y, int dir, int beepers) {
		super(1, 1, 0, 0);
		// TODO Auto-generated constructor stub
	}

	public void fetchBeeper() {
		int i = 0;
		while (!rightIsClear()) {
			supRobot("1");
		}
		supRobot("0");
		while (!nextToABeeper()) {
			supRobot("3");
			i++;
		}
		pickBeeper();
		for(int j =0;j<i;j++) {
			supRobot("1");
		}
		supRobot("27");
		while(frontIsClear()) {
			supRobot("3");
		}
		supRobot("4");
	}
}
