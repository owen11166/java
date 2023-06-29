package mid;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Terris extends JFrame {
	public Terris() {
		super("俄羅斯方塊");
		setSize(500, 880);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Back panel = new Back(this);

		initMenu();
		add(panel);
	}

	public static void main(String[] args) {
		Terris terris = new Terris();
		terris.setVisible(true);
	}

	static class Back extends JPanel {
		private JFrame mainFrame;

		public Back(JFrame frame) {
			this.setLayout(null);
			this.setOpaque(false);
			this.mainFrame = frame;
		}
	}

	private void initMenu() {
		JMenuBar jmb;
		jmb = new JMenuBar();
		JMenu jm1 = new JMenu("GAME");
		jm1.setFont(new Font("Font.SERIF", Font.BOLD, 15));
		JMenu jm2 = new JMenu("HELP");
		jm2.setFont(new Font("Font.SERIF", Font.BOLD, 15));
		JMenuItem jmi1 = new JMenuItem("開新局");
		JMenuItem jmi2 = new JMenuItem("離開");
		jmi1.setFont(new Font("Font.SERIF", Font.BOLD, 15));
		jmi2.setFont(new Font("Font.SERIF", Font.BOLD, 15));
		JMenuItem jmi3 = new JMenuItem("遊戲方法");
		jmi3.setFont(new Font("Font.SERIF", Font.BOLD, 15));
		JMenuItem jmi4 = new JMenuItem("規則");
		jmi4.setFont(new Font("Font.SERIF", Font.BOLD, 15));
		jm1.add(jmi1);

		jm1.add(jmi2);
		jm2.add(jmi3);
		jm2.add(jmi4);
		jmb.add(jm1);
		jmb.add(jm2);
		setJMenuBar(jmb);

		jmi1.setActionCommand("Restart");
		jmi2.setActionCommand("EXIT");
		jmi3.setActionCommand("HELP");
		jmi4.setActionCommand("LOST");
		jmi1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Terris.this, "開啟新的一局", "提示", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		jmi2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(Terris.this, "確定要離開嗎", "提示", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		jmi3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Terris.this, "A[左]-S[下]-D[右] 移動 W改變方塊形狀 ", "提示",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		jmi4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Terris.this, "消除方塊獲得分數,方塊碰到頂端則失敗", "提示", JOptionPane.INFORMATION_MESSAGE);

			}
		});
	}

}