package tw.org.iii.tutor;

import java.util.Scanner;

public class Brad03 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("two number");
		var b = scanner.nextInt();
		var c = scanner.nextInt();
		scanner.close();
		System.out.printf("%d+%d=%d%n", b, c, b + c);
		System.out.printf("%d-%d=%d%n", b, c, b - c);
		System.out.printf("%d*%d=%d%n", b, c, b * c);
		System.out.printf("%d/%d=%d", b, c, b / c);

	}

}
