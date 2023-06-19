package tw.org.iii.tutor;

public class Brad31 {

	public static void main(String[] args) {
		Brad312 obj1=new Brad312();
		//如果子類別有定義方法先執行子類別 如果沒定義 則執行父類別
		obj1.m1();

	}

}
class Brad311{
	void m1() {
		System.out.println("Brad311:m1()");
	}
}
class Brad312 extends Brad311{

	void m1() {
		System.out.println("Brad312:m1()");
	}
	
}
