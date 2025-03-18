import edu.fcps.karel2.Display;

//Torbert, e-mail: smtorbert@fcps.edu
//version 4.16.2003

public class Lab15 {
	public static void main(String[] args)
      {
    	 Display.setSpeed(9);
         
    	 Dancer a1 = new BackAndForthDancer(2);
    	 Dancer a2 = new KnightDancer(4);
        Dancer a3 = new ButterflyDancer(6);
        
        new Thread(a1).start();
        new Thread(a2).start();
        new Thread(a3).start();
      }
}