package tw.org.iii.tutor;

public class Brad31 {

	public static void main(String[] args) {
		Brad312 obj1 = new Brad312();
		// 如果子類別有定義方法先執行子類別 如果沒定義 則執行父類別
		obj1.m1();
		obj1.m2();
		obj1.m3();
	}

}

class Brad311 {
	void m1() {
		System.out.println("Brad311:m1()");
	}

	protected byte m2() {
		System.out.println("Brad311:m2()");
		return 1;
	}

	Brad313 m3() {
		return null;
	}
}

class Brad312 extends Brad311 {
	void m1() {
		// super.m1();
		System.out.println("Brad312:m1()");
		// super才會去父類別拿
		super.m1();
	}

	public byte m2() {
		// super.m2();
		return 1;
	}

	Brad315 m3() {
		return null;
	}
}
class Brad313{}
class Brad314 extends Brad313{}
class Brad315 extends Brad314{}
class Brad316 extends Brad313{}




