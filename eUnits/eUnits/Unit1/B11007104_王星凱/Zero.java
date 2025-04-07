import edu.fcps.Digit;

public class Zero extends Digit implements Runnable {

	public Zero(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		segment1_On();
		segment2_On();
		segment3_On();
		segment4_On();
		segment5_On();
		segment6_On();
		segment7_Off();
		/*8順時鐘:上1,右1=2,右2=3,下=4,左2=5,左1=6,中=7 */
	}
	public void run(){
		display();
		
	}

}
