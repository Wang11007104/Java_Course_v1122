
public class Democrat extends MazeEscaper {

	public Democrat() {
		// TODO Auto-generated constructor stub
	}
	public Democrat(int y) {
		
	}
	@Override
	public void walkDownCurrentSegment() {
		// TODO Auto-generated method stub
		if(!leftIsClear()&&frontIsClear()&&!nextToABeeper()) {
			move();
		}
		
	}

	@Override
	public void turnToTheNextSegment() {
		// TODO Auto-generated method stub
		while(leftIsClear()) {
			turnLeft();
			move();
		}
		while(!frontIsClear()) {
			turnRight();
		}
	}

}
