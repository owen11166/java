package tw.org.iii.tutor;

import tw.org.iii.classes.Bike;
import tw.org.iii.classes.Scooter;

import javax.swing.*; 

public class Brad21 {

	public static void main(String[] args) {
		Bike b1=new Bike(5,'w');
		Scooter c1=new Scooter(90,'B');
		b1.upSpeed();
		b1.downSpeed();
		System.out.println(b1.getSpeed());
		c1.upSpeed();
	}

}
