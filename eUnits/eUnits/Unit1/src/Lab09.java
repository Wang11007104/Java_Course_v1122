import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class Lab09 {
    public static void main(String[] args){

        String filename = SelectDialog.showDropdownDialog("What robot world?", "What robot world?", "pile1","pile2","pile3");
        //JOptionPane.showInputDialog("What robot world?");//pile1-3
         Display.openWorld("maps/"+filename+".map");
         Display.setSize(18, 16);
         Display.setSpeed(10);



         Athlete robot1=new Athlete(1,1,Display.EAST,0);
         int counterArray[]=new int[10];

         //robot1.move();
         for(int i=0;i<counterArray.length;i++){
            while(robot1.nextToABeeper()){

                robot1.pickBeeper();
                counterArray[i]++;
            }
           if(i>0){
                for(int j=0;j<counterArray[i-1];j++){
                 robot1.putBeeper();
              }
            }
            robot1.move();
         }
         
         
    }

}
