package tw.org.iii.tutor;

import java.util.ArrayList;
import java.util.Arrays;

public class Pokerv3 {

	public static void main(String[] args) {
		int num = 52;
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

		for (int v : poker)
			System.out.println(v);
		System.out.println(Arrays.toString(poker));

		// ------------------------------
		String[] colors = { "黑條", "紅心", "方塊", "梅花" };
		String[] number = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		String[] change = new String[52];
		for (int i = 0; i < change.length; i++) {
			int a = (int) (i / 13);
			int b = (int) (i % 13);
			// System.out.printf("商%d餘%d%n",a,b);
			change[i] = colors[a] + number[b];

		}
		System.out.println(Arrays.toString(change));

		// ---------------------------------

		// ------------------------------
		String[][] players = new String[4][14];
		int currentPlayer = 0;
		int times = 0;
		for (String card : change) {
			players[currentPlayer][times] = card;
			currentPlayer = (currentPlayer + 1) % 4;
			if (currentPlayer == 0) {
				times += 1;
			}
		}

		for (int i = 0; i <= 3; i++) {
			System.out.println();
			System.out.printf("玩家(%s)卡片 ", i + 1);

			for (int j = 0; j <= 12; j++) {
				System.out.printf("%s\t", players[i][j]);
			}
		}

	}

}