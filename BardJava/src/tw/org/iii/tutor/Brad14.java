package tw.org.iii.tutor;

public class Brad14 {
	public static void main(String[] args) {
		int[] a = new int[10];
		System.out.println(a[9]);
		int[] b = new int[5];
		// a[1]=123;
		// a[0]=763;
		for (int i = 0; i < a.length; i++) {
			a[i] = 10;
		}
		// for each 迴圈
		for (int c : a) {
			System.out.println(c);
		}
		// int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;

		int[] number = new int[7];
		for (int c : number) {
			number[c] = 0;
		}
		/////////////////////////////////// 骰子問題
		for (int i = 0; i <= 100; i++) {
			int c = (int) (Math.random() * 6) + 1;
			// System.out.println(c);
			number[c] += 1;
		}
		/*
		 * for (int c : number) { System.out.printf("%d 點出現 %d 次", d, c); d += 1; }
		 */
		for (int i = 1; i <= 6; i++) {
			//System.out.println();
			System.out.printf("%d點出現%d次\t\n", i, number[i]);
		}
		/////////////////////////////////////

	}
}
