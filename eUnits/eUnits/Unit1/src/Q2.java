import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class Q2 {
    public static void main(String[] args){

        Display.openWorld("maps/"+"Q2"+".map");
         Display.setSize(18, 16);
         Display.setSpeed(10);

         new Thread( new Shift1(1,2)).start();
         new Thread( new WM(8,8)).start();
         
         
         
    }

}

class Shift1 extends Athlete implements Runnable{
    public Shift1(int x , int y) {
		super(1, 2, Display.EAST, 0);
		
	}



    public void goTo() {
        //Athlete robot1=new Athlete(1,2,Display.EAST,0);
         int counterArray[]=new int[10];

        
         for(int i=0;i<counterArray.length;i++){
            while(nextToABeeper()){

                pickBeeper();
                counterArray[i]++;
            }
           if(i>0){
                for(int j=0;j<counterArray[i-1];j++){
                 putBeeper();
              }
            }
            move();
         }
         supRobot("32222tttt0pppp222t0p22ttttttt0ppppppp2222");
         
    

         }



    public void run() {
		// TODO Auto-generated method stub
		goTo();
	}


}


class WM extends Athlete implements Runnable{
    public WM(int x , int y) {
		super(8, 8, Display.SOUTH, 0);
		
	}

    public void goTo() {

        supRobot("2222333300001111");
    }



    public void run() {
		// TODO Auto-generated method stub
		goTo();
	}
}
