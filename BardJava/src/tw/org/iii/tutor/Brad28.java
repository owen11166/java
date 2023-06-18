package tw.org.iii.tutor;

public class Brad28 {

	public static void main(String[] args) {
		// var obj1=new Brad281();
		var obj2=new Brad282();
		var obj3=new Brad283();
		mtest(obj2);
		mtest(obj3);
		//obj2.m2();
		// obj1.m1();
		// obj1.m2();
		
		
	}
	static void mtest(Brad281 obj) {
			obj.m1();
			obj.m2();
		}
}

abstract class Brad281 {
	void m1() {
		System.out.println("brad281 m1");
	}

	abstract void m2();

}
//有大括號等於有實作
class Brad282 extends Brad281{
	void m2() {
		System.out.println("brad282 m2");
	};
}
class Brad283 extends Brad281{
	void m2(){
		System.out.println("Brad283 m2");
	}
}