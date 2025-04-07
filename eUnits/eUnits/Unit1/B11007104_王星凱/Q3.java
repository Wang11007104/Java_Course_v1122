import edu.fcps.Digit;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Q3 {
	public static void main(String[] args) {
        Display.openWorld("maps/mop.map");
        Display.setSpeed(12);

     Athlete a1=new Athlete(8,1,Display.WEST,Display.INFINITY);
     a1.supRobot("p2p2p2p2p2p2p2p01p0p0p0p0p0p21p2p2p12p0p0p0p0p");
     a1.supRobot("10p2p2p2p2p122p0p0p0p0p0p0p0p0p21p");
     a1.supRobot("2p2p2p2p2p01p0p0p221p2p122p0p0p0p0p0p0p0p0p");
     a1.supRobot("t2t2t2t2t2t2t2t2t0003t2t03t0t0t300t2t2t2t2t2t");
     a1.supRobot("322t0t0t0t0t0t0t0t0t223t2t2t2t2t32t0t0t0t0t23t2t2t322t0t0t0t0t0t");
     a1.supRobot("30t2t2t2t2t2t2t2t0000000");
    
    
    }



    }
	
