package tw.org.iii.tutor;

public class Brad30 {

	public static void main(String[] args) {
		Brad301 obj1 = new Brad301();
		obj1.m1();
		obj1.m1(5,(byte)3);

	}

}

class Brad301 {
	void m1() {
		System.out.println("Brad301:m1()");
	}

	void m1(int a) {
		System.out.println("Brad301;m1(int)");
	}

	void m1(int a, byte b) {
		System.out.println("Brad301:m1(int,byte)");
	}

	void m1(byte b, int a) {
		System.out.println("Brad301:m1(byte,int)");
	}
}