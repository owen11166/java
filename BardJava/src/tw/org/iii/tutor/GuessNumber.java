package tw.org.iii.tutor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GuessNumber extends JFrame implements ActionListener {
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	private int counter;

	public GuessNumber() {
		super("猜數字遊戲");
		guess = new JButton("猜");
		input = new JTextField();
		log = new JTextArea();

		setLayout(new BorderLayout());
		add(log, BorderLayout.CENTER);

		JPanel top = new JPanel(new BorderLayout());
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);

		add(top, BorderLayout.NORTH);

		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		guess.addActionListener(this);

		newGame();

	}

	public static void main(String[] args) {
		new GuessNumber();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		counter++;
		String gus = input.getText();
		String result = checkAB(gus);
		log.append(counter + "." + gus + "=>" + result + "\n");
		if (result.equalsIgnoreCase("3A0B")) {
			JOptionPane.showMessageDialog(guess, "WIN");
		} else if (counter == 3) {
			JOptionPane.showMessageDialog(guess, "LOSER  ANSWER=" + answer);
		}
		input.setText("");
	}

	private String checkAB(String g) {
		int a, b;
		a = b = 0;
		for (int i = 0; i < answer.length(); i++) {
			if (answer.charAt(i) == g.charAt(i)) {
				a++;
			} else if (answer.indexOf(g.charAt(i)) >= 0) {
				b++;
			}
		}

		return String.format("%dA%dB", a, b);
	};

	private void createNumber(int dig) {
		int num = 10;
		int[] poker = new int[num];
		for (int i = 0; i < poker.length; i++)
			poker[i] = i;

		for (int i = num - 1; i > 0; i--) {
			int rand = (int) (Math.random() * (i + 1));
			// poker[rand] <=> poker[i]
			int temp = poker[rand]; // int 5=poker[5]
			poker[rand] = poker[i];// poker[5]=poke[]r
			poker[i] = temp;
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < dig; i++) {
			sb.append(poker[i]);
		}
		answer = sb.toString();
		System.out.println(answer);
	}

	private void newGame() {
		createNumber(4);
		counter = 0;
		System.out.println(answer);

	}

}
