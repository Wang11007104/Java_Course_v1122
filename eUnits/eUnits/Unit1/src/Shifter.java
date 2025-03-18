	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Shifter extends Athlete implements Runnable, Workable
   {
      private int myBeepers;
      public Shifter(int y)
      {
         super(1, y, Display.EAST, 0);
      
      }
   	/*********************************
   	 *                               *
   	 * What methods must you define? *
   	 *                               *
   	 *********************************/
	@Override
	public void workCorner() {
		// TODO Auto-generated method stub
		int pre =myBeepers;
		while(nextToABeeper()) {
			pickBeeper();
			myBeepers++;
		}
		if(pre>0) {
			for(int i=1;i<=pre;i++) {
				putBeeper();
				myBeepers--;
			}
		}
	}
	@Override
	public void moveOneBlock() {
		// TODO Auto-generated method stub
		move();
	}
	@Override
	public void turnToTheRight() {
		// TODO Auto-generated method stub
		turnLeft();
		turnLeft();
		turnLeft();
	}
	@Override
	public void turnToTheNorth() {
		// TODO Auto-generated method stub
		while(!facingNorth()) {
			turnLeft();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=7;i++) {
			workCorner();
			moveOneBlock();
		}
		supRobot("6");
	}
   }