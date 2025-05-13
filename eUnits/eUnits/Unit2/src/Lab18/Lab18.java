package Lab18;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;;

public class Lab18 extends JPanel {
    public static void main(String[] args){
        Turtle t= new Turtle();
        t.turnLeft(5);
        for(int i=0;i<4;i++){
            t.forward(100);
            t.turnLeft(90);
        }
       // t.drawLine(100,100,200,200);
        

        JFrame f= new JFrame();
        f.setSize(800, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(new Lab18());
        f.setVisible(true);
    }

    public void paintComponent(Graphics g)
      {
         g.drawImage(Turtle.getImage(), 0, 0, getWidth(), getHeight(), null);
      }
}
