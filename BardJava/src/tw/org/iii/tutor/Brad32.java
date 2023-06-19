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
		//obj8 是 Brad324 介面型別的引用，但實際上引用的是Brad321 類別的實例。由於 Brad321 類別實作了 Brad324 介面，因此可以使用 Brad324 型別的引用來引用 Brad321 類別的實例。
		Brad324 obj8 = new Brad321();
		//obj9 是 Brad324 介面型別的引用，但實際上引用的是 Brad322 類別的實例。由於 Brad322 類別擴展了 Brad321 類別並實作了 Brad324 介面，因此可以使用 Brad324 型別的引用來引用 Brad322 類別的實例。
		Brad324 obj9 = new Brad322();
		//obj10 是 Brad324 介面型別的引用，但實際上引用的是 Brad323 類別的實例。由於 Brad323 類別擴展了 Brad321 類別並實作了 Brad324 介面，因此可以使用 Brad324 型別的引用來引用 Brad323 類別的實例。
		Brad324 obj10 = new Brad323();

		System.out.println("game over");
	}
}

interface Brad324 {
	void m4();
}

interface Brad325 {
}

class Brad321 implements Brad324 {
	void m1() {
		System.out.println("Brad321:m1()");
	}

	public void m4() {
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
