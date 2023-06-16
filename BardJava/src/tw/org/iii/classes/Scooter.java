package tw.org.iii.classes;

public class Scooter extends Bike {
	public Scooter() {};
	public Scooter(int speed, char color) {
		this.color = color;
		this.speed = speed;
	}

	@Override

	public void upSpeed() {
		// TODO Auto-generated method stub
		super.upSpeed();
		System.out.println("test");
		System.out.println(speed);
	}
}
