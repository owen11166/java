package tw.org.iii.tutor;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class Brad61 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new Mytask1(), 3 * 1000, 1000);
		timer.schedule(new StopTask(timer), 10 * 1000);
		System.out.println("main");

	}
}

class Mytask1 extends TimerTask {
	private int i;

	public void run() {
		System.out.println("ok" + i++);
	}
}

class StopTask extends TimerTask {
	private Timer timer;

	public StopTask(Timer timer) {
		this.timer = timer;
	}

	public void run() {
		timer.cancel();
		timer.purge();
		timer=null;
	}
}