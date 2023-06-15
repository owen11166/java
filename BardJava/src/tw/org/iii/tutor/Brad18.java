package tw.org.iii.tutor;

import java.util.Scanner;

public class Brad18 {
 public static void main(String[] args) {
	 int a=10;
	while(true) {
		System.out.println(a);
		a+=1;
		if(a>20)break;
	}
	while(a<=30) {
		//System.out.println(a);
		a+=1;
	}
	//
	Scanner scanner=new Scanner(System.in);
	int sum=scanner.nextInt();
	int i=0;
	int ans=0;
	while (sum>=i) {
		ans+=i;
		i+=1;
	}System.out.println(ans);
	
		
	 }
}
