package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.org.iii.classes.MyClock;
import tw.org.iii.classes.MyDrawer;


public class SignApp extends JFrame {
	private JButton clear, undo, redo, save, saveObj, loadObj;
	private MyDrawer myDrawer;
	private MyClock myClock;
	
	public SignApp() {
		super("SignApp");
		
		setLayout(new BorderLayout());
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		save = new JButton("Save");
		saveObj = new JButton("Save Lines");
		loadObj = new JButton("Load Lines");
		myClock = new MyClock();
		
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(clear); top.add(undo); top.add(redo); top.add(save);
		top.add(saveObj); top.add(loadObj);
		top.add(myClock);
		
		add(top, BorderLayout.NORTH);
		
		myDrawer = new MyDrawer();
		add(myDrawer, BorderLayout.CENTER);
		
		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		addEventListener();
	}
	
	private void addEventListener() {
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myDrawer.clear();
			}
		});
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.undo();
			}
		});
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.redo();
			}
		});
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.saveJPEG();
			}
		});
		saveObj.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.saveLines();
			}
		});
		loadObj.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.loadLines();
			}
		});
	}

	public static void main(String[] args) {
		new SignApp();
	}

}