package tw.org.iii.tutor;

public class Brad40 {

	public static void main(String[] args) {
		var obj1 = new Bird();
		try {
			obj1.setLeg(1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class Bird {
	int leg;

	void setLeg(int n) throws Exception {
		if (n > 0 && n <= 2) {
			leg = n;
		} else {
			throw new Exception();
		}
	}
}
