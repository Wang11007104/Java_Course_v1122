import edu.fcps.Digit;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Q3 {
	public static void main(String[] args) {
        Display.openWorld("maps/mop.map");
        Display.setSpeed(12);

        Athlete a1=new Athlete(8,1,Display.WEST,Display.INFINITY);

        while(  !(a1.getX()==10 && a1.getY()==10)  ){
            putandgotoend(a1);  //  already turned around 
            if(  (a1.getX()==10 && a1.getY()==10)  )
              break;
            
            gotilupisclear(a1);
            goupandbackup(a1);
        }
    
        while(  !(a1.getX()==8 && a1.getY()==1)  ){
                
                takeandgotoend(a1);  //  already turned around 
                if(  (a1.getX()==8 && a1.getY()==1)  )
                  break;
                
                gotilDownisclear(a1);
                goDownandbackup(a1);

            }


        if(  (a1.getX()==10 && a1.getY()==10)  )
          print("hooray!!!!!");
        
    
    }  //  end of main

    public static void print(Object s){
        System.out.println(s);
    }

    public static void putandgotoend(Athlete r){  //  finally: will turn around 
        r.putBeeper();
        while(r.frontIsClear())
        {
                r.move();
                r.putBeeper();
        }
        r.turnAround();

        
    }

    public static void gotilupisclear(Athlete r){
        if(r.facingEast()){
                while(!r.leftIsClear())
                  r.move();
        }
        else if(r.facingWest()){
                while(!r.rightIsClear())
                  r.move();
        }
    }

    public static void goupandbackup(Athlete r){
        if(r.facingEast()){
                r.turnLeft();
                r.move();
                r.turnLeft();
                while(r.frontIsClear()) r.move();
                r.turnAround();
        }
        else if(r.facingWest()){
                r.turnRight();
                r.move();
                r.turnRight();
                while(r.frontIsClear()) r.move();
                r.turnAround();
        }
    }








    public static void takeandgotoend(Athlete r){  //  finally: will turn around 
        r.pickBeeper();
        while(r.frontIsClear())
        {
                r.move();
                r.pickBeeper();
        }
        r.turnAround();
    }

    public static void gotilDownisclear(Athlete r){
        if(r.facingEast()){
                while(!r.rightIsClear())
                  r.move();
        }
        else if(r.facingWest()){
                while(!r.leftIsClear())
                  r.move();
        }
    }

    public static void goDownandbackup(Athlete r){
        if(r.facingEast()){
                r.turnRight();
                r.move();
                r.turnRight();
                while(r.frontIsClear()) r.move();
                r.turnAround();
        }
        else if(r.facingWest()){
                r.turnLeft();
                r.move();
                r.turnLeft();
                while(r.frontIsClear()) r.move();
                r.turnAround();
        }
    }

    }
	
