package tw.org.iii.classes;

public class Bike {
	protected int speed;
	protected int color;
	public Bike() {
		
	}
	public Bike(int speed,char color) {
		this.speed=speed;
		this.color=color;
	}
	public void upSpeed() {
		this.speed+=10;
	}
	public void downSpeed() {
		this.speed-=10;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public int getSpeed() {
		return speed;
	}
	
	
}
