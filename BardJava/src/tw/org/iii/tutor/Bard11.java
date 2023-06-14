package tw.org.iii.tutor;

import java.util.Scanner;

public class Bard11 {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("month");
		var d=scanner.nextInt();
		var month=switch(d) {
		case 1,3,5,7,8,10,12->31;
		case 4,6,9,11->30;
		default->28;
		};
		System.out.printf("%d月有%d天",d,month);
		
		
		
		
//		int a=1;
//		final int b=a;
//		
//		switch(a) {
//		case 1: System.out.println(123);break;
//		default : System.out.println(456);
//		}System.out.println("gg");
//		var another=switch(a) {
//		case 10,9->"a";
//		case 0,1->"c";
//		default->"b";
//		};
//		System.out.println(another);
//	
//		
	}

}
