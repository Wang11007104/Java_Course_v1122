//Torbert, e-mail: smtorbert@fcps.edu
//version 6.13.2003

import edu.fcps.karel2.*;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class LabYY {
	public static void main(String[] args) {
		// set the world
		int N = (int) (Math.random() * 50 + 25);
		Display.setSize(N, N);
		Display.setSpeed(10);
		WorldBackend.getCurrent().putBeepers((int) (Math.random() * N + 1), (int) (Math.random() * N + 1), 1);

		forRun[] robots = new forRun[N];
		Thread[] tn = new Thread[N];
		for (int i = 0; i < N; i++) {
			robots[i] = new forRun(i,1,N);
	//		robots[i].n=N;
			tn[i] = new Thread(robots[i]);
		}
		for (int i = 0; i < N; i++)
		     tn[i].start();
	}
}
class forRun extends Athlete implements Runnable{

	public forRun(int x , int y,int N) {
		super(x, y, y, 0);
		n=N;
	}
	public int n;
	public void goBack() {// n for map's length
		for (int i = 0; i < n; i++) {
			move();
			if (nextToABeeper()) {
				System.out.println("(" + getX() + "," + getY()+")");
				supRobot("a");
				while (frontIsClear()) {
					move();
				}
				turnAround();
				return;
			}
		}
		turnAround();
		for (int j = 0; j < n; j++) {
			move();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		goBack();
	}
	
}