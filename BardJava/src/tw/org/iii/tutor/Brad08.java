package tw.org.iii.tutor;

public class Brad08 {
	public static void main(String args[]) {
		var a = (int) (Math.random() * 101);
		// int score=30;
		System.out.println(a);
		if (a >= 90) {
			System.out.println("a");
		} else {
			if (a >= 80) {
				System.out.println("b");
			} else {
				if (a >= 70) {
					System.out.println("c");
				} else {
					if (a >= 60) {
						System.out.println("d");
					} else {
						System.out.println("fail");
					}
				}
			}
		}
	}
}