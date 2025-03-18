   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 4.16.2003

    public class Mountain
   {
       public static void explore(Climber arg)
      {
         arg.putBeeper();
         arg.turnLeft();
         explore_west(arg);
         if(!arg.hasBeepers())
         {
            explore_east(arg);
         }
         arg.pickBeeper();
      }
       private static void explore_west(Climber arg)
      {
         int n = 0;
         while(arg.frontIsClear())
         {
            arg.move();
         }
         while(!arg.frontIsClear())
         {
            arg.climberUpLeft();
            n = n + 1;
         }
         if(arg.nextToABeeper())
         {
            arg.pickBeeper();
         }
         arg.turnAround();
         for(int k = 1; k <= n; k++)
         {
            arg.climberDownRight();
         }
         while(!arg.nextToABeeper())
         {
            arg.move();
         }
      }
       private static void explore_east(Climber arg)
      {
         int n = 0;
         while(arg.frontIsClear())
         {
            arg.move();
         }
         while(!arg.frontIsClear())
         {
            arg.climberUpRight();
            n = n + 1;
         }
         if(arg.nextToABeeper())
         {
            arg.pickBeeper();
         }
         arg.turnAround();
         for(int k = 1; k <= n; k++)
         {
            arg.climberDownLeft();
         }
         while(!arg.nextToABeeper())
         {
            arg.move();
         }
      }
   }