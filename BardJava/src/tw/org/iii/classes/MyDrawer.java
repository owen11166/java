package tw.org.iii.classes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	public MyDrawer() {
		setBackground(Color.yellow);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	//	if(g instanceof Graphics) {
	//		System.out.println("ok");
	//	}
		Graphics2D g2d=(Graphics2D)g;
	}
	

}
