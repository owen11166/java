package tw.org.iii.classes;

public class TWId {

	private String id;
	boolean isMale = false;
	private static String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
	int area = 10;

	// 隨機給
	public TWId() {
		createNumber(isMale, area);
		
	};

	// 性別
	public TWId(boolean isMale) {

		createNumber(isMale, area);
	};

	// 地區
	public TWId(int area) {

		createNumber(isMale, area);
	};

	// 性別地區
	public TWId(boolean isMale, int area) {

		createNumber(isMale, area);
	};

	private TWId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void createNumber(boolean isMale, int area) {
		int male = (isMale == true ? 1 : 2);
		do {
			id = "";
			id += letters.charAt(area - 10);
			id += male;
			for (int i = 7; i >= 1; i--) {
				int random = (int) (Math.random() * 10);
				String num = Integer.toString(random);
				id += num;
			}
			int last = (int) (Math.random() * 10);
			id += last;

		} while (!isRightId(id));

	}

	public static boolean isRightId(String id) {

		boolean isRight = false;
		// String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
		// String num = "0123456789";
		int ans = 0;
		int j = 8;
		if (id.matches("[A-Z][1,2][0-9]{8}")) {
			char c1 = id.charAt(0);
			int n12 = letters.indexOf(c1) + 10;
			int f1 = n12 / 10;
			int f2 = n12 % 10;
			// int last = num.indexOf(id.charAt(9));
			int last = Integer.parseInt(id.substring(9, 10));
			ans += f1 + f2 * 9 + last;
			/*
			 * for (int i = 1; i < 9; i++) { int first = num.indexOf(id.charAt(i)); ans +=
			 * first * j; j--; }
			 */
			for (int i = 1; i < 9; i++) {
				int first = Integer.parseInt(id.substring(i, i + 1));
				ans += first * j;
				j--;
			}

			if (ans % 10 == 0) {
				isRight = true;
			}

		}
		return isRight;
	}

}
