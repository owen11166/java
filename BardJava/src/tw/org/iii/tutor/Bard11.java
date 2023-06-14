package tw.org.iii.tutor;

public class Bard11 {
	public static void main(String[] args) {
		int a=1;
		switch(a) {
		case 1: System.out.println(123);break;
		default : System.out.println(456);
		}System.out.println("gg");
		var another=switch(a) {
		case 10,9->"a";
		case 0,1->"c";
		default->"b";
		};
		System.out.println(another);
		
	}

}
