	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Swimmer extends Robot implements Runnable
   {
	  public String steps="hello";
	  
      public Swimmer(int x)
      {
         super(x, 1, Display.NORTH, 0);
      }
      public void run() //not swim
      {
    	  System.out.println(steps);
    	  for(int i =0; i<=20; i++) {
    	  move();
    	  move();
    	  turnLeft();
    	  turnLeft();
    	  }
    	  
      }
      
      
   }