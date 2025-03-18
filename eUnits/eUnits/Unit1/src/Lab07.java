  	//Torbert, e-mail: smtorbert@fcps.edu
	//version 4.22.2003

   import edu.fcps.karel2.Display;
   import javax.swing.JOptionPane;
    public class Lab07
   {
       public static void main(String[] args) 
      {
         String selected=SelectDialog.showSelectionDialog("\"What robot world?\"", "\"What robot world?\"", "mountain1","mountain2","mountain3","hill1","hill2","hill3","step1","step2","step3");
        
        // String filename = JOptionPane.showInputDialog("What robot world?");//mountain1-3||hill1-3||step1-3
         String type = SelectDialog.showSelectionDialog("What type of climber?", "What type of climber?", "Climber","HillClimber","StepClimber");
         //JOptionPane.showInputDialog("What type of climber?");//Climber||HillClimber||StepClimber
         String avenue = SelectDialog.showSelectionDialog("What x-coordinate?", "What x-coordinate?", "8","10","12");
         //JOptionPane.showInputDialog("What x-coordinate?");//8||10||12
         int x = Integer.parseInt(avenue);

         if (selected != null) {
            Display.openWorld("maps/" + selected + ".map");
        }
      
         //Display.openWorld("maps/"+filename+".map");
         Display.setSize(17, 15);
         Display.setSpeed(10);
      
         if(type.equals("Climber"))
         {
            Mountain.explore( new Climber(x) );
         }
         else if(type.equals("HillClimber"))
         {
            Mountain.explore( new HillClimber(x) );
         }
         else if(type.equals("StepClimber"))
         {
            Mountain.explore( new StepClimber(x) );
         }
         else
         {
            System.out.println("Invalid robot type.");
         }
      }
   }