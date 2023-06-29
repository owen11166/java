package tw.org.iii.tutor;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import tw.org.iii.classes.*;

public class MyBallGame extends JFrame {
	public MyBallGame() {
		setLayout(new BorderLayout());

		// myPanel=new MyPanel();
		MyPanel myPanel = new MyPanel();
		add(myPanel, BorderLayout.CENTER);
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyBallGame();
	}

}
