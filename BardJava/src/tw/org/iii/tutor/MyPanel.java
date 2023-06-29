package tw.org.iii.tutor;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

	private BufferedImage ball0;
	private int ballX, ballY, ballw, ballh;

	public MyPanel() {
		setBackground(Color.GREEN);
		try {
			ball0 = ImageIO.read(new File("dir1/one.png"));
			ballw = ball0.getWidth();
			ballh = ball0.getHeight();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				changeBall(e.getX(), e.getY());
			}
		});
	}

	void changeBall(int x, int y) {
		ballX = x - (ballw / 2);
		ballY = y - (ballh / 2);
		repaint();
	};

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawImage(ball0, ballX, ballY, null);
	}
}
