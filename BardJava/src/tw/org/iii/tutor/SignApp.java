package tw.org.iii.tutor;

import java.awt.*;

import javax.swing.*;
import tw.org.iii.classes.MyDrawer;

public class SignApp extends JFrame {
	private JButton clear, redo, undo;
	private MyDrawer myDrawer;

	public SignApp() {
		super("簽名App");
		setLayout(new BorderLayout());
		clear = new JButton("clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(clear);
		top.add(undo);
		top.add(redo);
		add(top, BorderLayout.NORTH);
		
		myDrawer=new MyDrawer();
		add(myDrawer,BorderLayout.CENTER);
		
		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SignApp();
	}

}
