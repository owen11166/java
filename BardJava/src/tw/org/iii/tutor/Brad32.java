package tw.org.iii.tutor;

public class Brad32 {

	public static void main(String[] args) {
		Brad321 obj1 = new Brad321();
		Brad322 obj2 = new Brad322();
		Brad323 obj3 = new Brad323();
		Brad321 obj4 = new Brad322();
		Brad321 obj5 = new Brad323();
		// Brad322 obj6 = (Brad322) new Brad321();
		// Brad322 obj7 = (Brad322) new Brad323();
		Brad322 obj7 = (Brad322) obj4;
		System.out.println("game over");
	}
}

interface Brad324 {
}

interface Brad325 {
}

class Brad321 implements Brad324 {
	void m1() {
		System.out.println("Brad321:m1()");
	}
}

class Brad322 extends Brad321 implements Brad325 {
	void m1() {
		System.out.println("Brad322:m1()");
	}

	void m2() {
		System.out.println("Brad322:m1()");
	}

	void m3() {
		System.out.println("Brad322:m1()");
	}
}

class Brad323 extends Brad321 {
	void m1() {
		System.out.println("Brad323:m1()");
	}

	void m2() {
		System.out.println("Brad323:m1()");
	}

	void m3() {
		System.out.println("Brad323:m1()");
	}
}
