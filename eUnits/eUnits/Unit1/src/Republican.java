
public class Republican extends MazeEscaper {//right派

	public Republican() {
		// TODO Auto-generated constructor stub
	}
	public Republican(int y) {
		
	}

	@Override
	public void walkDownCurrentSegment() {
		// TODO Auto-generated method stub
		if(!rightIsClear()&&frontIsClear()&&!nextToABeeper()) {
			move();
		}
	}

	@Override
	public void turnToTheNextSegment() {
		// TODO Auto-generated method stub
		while(rightIsClear()) {
			turnRight();
			move();
		}
		while(!frontIsClear()) {
			turnLeft();
		}
		
	}

}
