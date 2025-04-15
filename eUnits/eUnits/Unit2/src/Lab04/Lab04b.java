package Lab04;

import javax.swing.*;

import Lab03.Panel03;
import edu.fcps.Bucket;
public class Lab04b
{
	public static void main (String arg[]) {
		JFrame frame = new JFrame("Buckets");
		frame.setSize(600,400);
		frame.setLocation(100,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new BucketPanel());
		frame.setVisible(true);
		
		Bucket.setSpeed(10);
		Bucket.useTotal(true);
		
		Bucket five= new Bucket(5);
        Bucket four =new Bucket(4);
		Bucket three =new Bucket(3);
        
		
		five.fill();
		five.pourInto(four);
		four.spill();//1
		five.pourInto(three);
		four.fill();
		five.fill();//10
        three.spill();
        four.spill();
        five.pourInto(three);
        three.spill();//2
        five.pourInto(three);
        four.fill();
        five.fill();
        three.fill();
        three.spill();
        four.pourInto(three);
        four.spill();
        five.spill();
        four.fill();
        three.spill();
        five.spill();








		
	} 
}