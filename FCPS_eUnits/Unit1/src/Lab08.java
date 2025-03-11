  	//Torbert, e-mail: smtorbert@fcps.edu
	//version 4.16.2003

   import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
   import javax.swing.JOptionPane;
    public class Lab08
   {
       public static void race(Racer arg)
      {
         while(!arg.nextToABeeper())
         {
            if(arg.frontIsClear())
            {
               arg.move();
            }
            else
            {
               arg.jumpRight();
            }
         }
      }
       public static void main(String[] args) 
      {
         String filename = SelectDialog.showDropdownDialog("What robot world?", "What robot world?", "hurdle1","hurdle2","hurdle3","steeple1","steeple2","steeple3","boxtop1","boxtop2","boxtop3");
         //JOptionPane.showInputDialog("What robot world?");//hurdle1-3||steeple1-3||boxtop1-3
         String type = SelectDialog.showDropdownDialog("What type of racer?", "What type of racer?", "Racer","SteepleChaseRacer","BoxTopRacer");
         //JOptionPane.showInputDialog("What type of racer?");//Racer||SteepleChaseRacer||BoxTopRacer
      
       Display.openWorld("maps/"+filename+".map");
         Display.setSize(18, 16);
         Display.setSpeed(10);
      
         if(type.equals("Racer"))
         {
            race( new Racer(1) );
         }
         else if(type.equals("SteepleChaseRacer"))
         {
            race( new SteepleChaseRacer(1) );
         }
         else if(type.equals("BoxTopRacer"))
         {
            race( new BoxTopRacer(1) );
         }
         else
         {
            System.out.println("Invalid robot type.");
         }
      }
   }