package Lab04;

import javax.swing.*;

import Lab03.Panel03;
import edu.fcps.Bucket;
public class Lab04
{
	public static void main (String arg[]) {
		JFrame frame = new JFrame("Buckets");
		frame.setSize(600,400);
		frame.setLocation(100,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new BucketPanel());
		frame.setVisible(true);
		
		Bucket.setSpeed(10);
		Bucket.useTotal(false);
		
		Bucket five= new Bucket(5);
		Bucket three =new Bucket(3);
		
		five.fill();
		five.pourInto(three);//2
		three.spill();//0
		five.pourInto(three);//0
		five.fill();//5
		five.pourInto(three);//3
		
	} 
}