package tw.org.iii.tutor;

public class Brad16 {

	public static void main(String[] args) {
		int point;
		int[] p = new int[7];
		for (int i = 0; i < 10; i++) {
			point = (int) (Math.random() * 6) + 1; // 1 ~ 6
			p[point] += 1;
			/*
			 * if (point >=1 && point <=9) { p[point>=7 ? point-3 : point]++; }else {
			 * p[0]++; }
			 */
		}
		for (int i = 1; i <= 6; i++) {
			System.out.printf("%d點出現%d次\n", i, p[i]);
		}

	}

}
