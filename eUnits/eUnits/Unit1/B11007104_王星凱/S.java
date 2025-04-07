import edu.fcps.Digit;

public class S extends Digit implements Runnable {

	public S(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		segment1_On();
		segment2_Off();
		segment3_On();
		segment4_On();
		segment5_Off();
		segment6_On();
		segment7_On();
		/*8順時鐘:上1,右1=2,右2=3,下=4,左2=5,左1=6,中=7 */
	}
	public void run(){
		display();
		
	}

}
