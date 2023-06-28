package tw.org.iii.tutor;

public class Brad60 {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread(1);
		MyThread mt2 = new MyThread(2);
		mt1.start();
		mt2.start();
		System.out.println("ok");
		// mt1.start();
	}
}

class MyThread extends Thread {
	private int num;

	MyThread(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(num+":"+i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
			}
		}

	}
}