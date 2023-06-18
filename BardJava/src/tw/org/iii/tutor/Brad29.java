package tw.org.iii.tutor;

public class Brad29 {
	public static void main(String[] args) {
		var re=new Rec(5,5);

	}
}

//public
interface shape {
	double length();

	double area();
}

class Rec implements shape {
	double w, h;

	Rec(int w, int h) {
		this.w = w;
		this.h = h;
	};

	public double length() {
		return (w + h) * 2;
	};

	public double area() {
		return w * h;
	};
};

class Tri implements shape {
	double w1, w2, w3, h;

	public double length() {
		return w1 + w2 + w3;
	};

	public double area() {
		return w1 * h / 2;
	};
};

class Cir implements shape {
	double r;

	public double length() {
		return 2 * Math.PI * r;
	};

	public double area() {
		return Math.PI * r * r;
	};
};