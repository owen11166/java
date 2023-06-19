package tw.org.iii.tutor;

import java.awt.*;

import javax.swing.*;

public class SignApp extends JFrame {
	private JButton clear, redo, undo;

	public SignApp() {
		super("簽名App");
		setLayout(new BorderLayout());
		clear = new JButton("clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");

		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SignApp();
	}

}
