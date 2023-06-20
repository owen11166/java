package tw.org.iii.classes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	public MyDrawer() {
		setBackground(Color.yellow);
		// addMouseListener(this);
		// MyMouseListener listener = new MyMouseListener(this);
		// addMouseListener(listener);

		// MyMouseListenerV2 listenerV2=new MyMouseListenerV2();
		// addMouseListener(listenerV2);
		MyMouseListener listener = new MyMouseListener();
		addMouseListener(listener);
		addMouseMotionListener(listener); 
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// if(g instanceof Graphics) {
		// System.out.println("ok");
		// }
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(4));
		g2d.setColor(Color.BLUE);
		g2d.drawLine(0, 0, 400, 200);
	}

	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("Press" + e.getX() + "," + e.getY());
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			System.out.println("Drag" + e.getX() + "," + e.getY());
			super.mouseDragged(e);
		}
	}
}
/*
 * private class MyMouseListenerV2 implements MouseListener {
 * 
 * @Override public void mouseClicked(MouseEvent e) { // TODO Auto-generated
 * method stub
 * 
 * }
 * 
 * @Override public void mousePressed(MouseEvent e) { // TODO Auto-generated
 * method stub System.out.println("pressv2");
 * 
 * }
 * 
 * @Override public void mouseReleased(MouseEvent e) { // TODO Auto-generated
 * method stub
 * 
 * }
 * 
 * @Override public void mouseEntered(MouseEvent e) { // TODO Auto-generated
 * method stub
 * 
 * }
 * 
 * @Override public void mouseExited(MouseEvent e) { // TODO Auto-generated
 * method stub
 * 
 * }
 * 
 * }
 * 
 * @Override public void mouseClicked(MouseEvent e) { // TODO Auto-generated
 * method stub
 * 
 * }
 * 
 * @Override public void mousePressed(MouseEvent e) { // TODO Auto-generated
 * method stub
 * 
 * }
 * 
 * @Override public void mouseReleased(MouseEvent e) { // TODO Auto-generated
 * method stub
 * 
 * }
 * 
 * @Override public void mouseEntered(MouseEvent e) { // TODO Auto-generated
 * method stub
 * 
 * }
 * 
 * @Override public void mouseExited(MouseEvent e) { // TODO Auto-generated
 * method stub
 * 
 * }
 * 
 * }
 * 
 * class MyMouseListener implements MouseListener { private MyDrawer myDrawer;
 * 
 * MyMouseListener(MyDrawer myDrawer) { this.myDrawer = myDrawer; }
 * 
 * @Override public void mouseClicked(MouseEvent e) { // TODO Auto-generated
 * method stub System.out.println("Click"); }
 * 
 * @Override public void mousePressed(MouseEvent e) { // TODO Auto-generated
 * method stub System.out.println("Press");
 * 
 * }
 * 
 * @Override public void mouseReleased(MouseEvent e) { // TODO Auto-generated
 * method stub System.out.println("Release"); }
 * 
 * @Override public void mouseEntered(MouseEvent e) { // TODO Auto-generated
 * method stub
 * 
 * }
 * 
 * @Override public void mouseExited(MouseEvent e) { // TODO Auto-generated
 * method stub System.out.println("exit"); } }
 */
