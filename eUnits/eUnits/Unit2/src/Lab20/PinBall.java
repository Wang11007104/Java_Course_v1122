package Lab20;

   import java.awt.*;

    public class PinBall extends Spot
   {
      private double dx,dy;
      private int rightEdge,bottomEdge;
      public PinBall(int x,int y,int r,Color c){
         super(x, y, r, c);
         dx = Math.random()*12-6;
         dy = Math.random()*12-6;
      }

      public void setBound(int right ,int bottom){
         rightEdge=right;
         bottomEdge=bottom;
      }
      private int littlerandom(){
         return (int)(Math.random()*6+1);
      }
      public void tick(){
         if(getX()>=rightEdge-getR()){
            dx=(dx/Math.abs(dx)*littlerandom())*-1; 
            setX(rightEdge-getR());  
         }
         if(getX()<=getR()){
            setX(getR());
            dx=(dx/Math.abs(dx)*littlerandom())*-1; 
         }
         if(getY()<=getR()){
            setY(getR());
            dy=(dy/Math.abs(dy)*littlerandom())*-1;
         }
         if(getY()>=bottomEdge-getR()){
            setY(bottomEdge-getR());
            dy=(dy/Math.abs(dy)*littlerandom())*-1;
         }

         setX(getX()+dx);
         setY(getY()+dy);

      }
   }