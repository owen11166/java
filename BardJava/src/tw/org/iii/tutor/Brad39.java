package tw.org.iii.tutor;

public class Brad39 {

	public static void main(String[] args) {
		int a = 10, b = 0;
		int[] c = new int[4];
		System.out.println(c[0]);
		try {
			System.out.println(a / b);
		} catch (RuntimeException e) {
			System.out.println(e);
		} finally {
			System.out.println("----");
		}
		try {
			System.out.println(c[123]);
		} catch (RuntimeException e) {
			System.out.println(e);
		}
	}

}
