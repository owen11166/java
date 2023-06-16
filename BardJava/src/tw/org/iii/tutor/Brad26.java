package tw.org.iii.tutor;

public class Brad26 {

	public static void main(String[] args) {
		// ASCII 碼表
		String s1 = new String();
		byte[] b1 = { 97, 98, 99, 100 };
		String s2 = new String(b1);
		System.out.println(s1);
		System.out.println(s2);
		String s3 = "brad";
		String s4 = "brad";
		String s5 = new String("brad");
		String s6 = new String("brad");
		System.out.println(s5 == s6);
		System.out.println(s3 == s4);
		System.out.println(s4 == s5);

		Brad261 obj1 = new Brad261();
		Brad261 obj2 = new Brad261();
		Brad261 obj3 = obj1;
		System.out.println(obj1 == obj2);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(s5.equals(s6));
	}

}

class Brad261 {
	public String toString() {
		return "Brad";
	}
}