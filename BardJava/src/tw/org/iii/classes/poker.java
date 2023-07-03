package tw.org.iii.classes;



import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class poker {
	public static void main(String[] args) {
		int[] poker = new int[52];
		for (int i = 0; i < poker.length; i++) {
			int number = (int) (Math.random() * 52) + 1;
			boolean duplicate = false;
			for (int j = 0; j < i; j++) {
				if (poker[j] == number) {
					duplicate = true;
					break;
				}
			}
			if (duplicate) {
				i--;
			} else {
				poker[i] = number;
			}
		}
		System.out.println(Arrays.toString(poker));

		System.out.println("--------------------------------------");
		ArrayList<Integer> poker1 = new ArrayList<>();
		for (int i = 1; i <= 52; i++) {
			poker1.add(i);
		}

		Collections.shuffle(poker1);

		System.out.println(poker1);
		
		ArrayList<Integer>[] players=new ArrayList[4];
		for(int i=0;i<4;i++) {
			players[i]=new ArrayList<>();
		}
		int currentPlayer=0;
		for(int card:poker1) {
			players[currentPlayer].add(card);
			currentPlayer=(currentPlayer+1)%4;
		}
		for (int i = 0; i < 4; i++) {
            System.out.println("Player " + (i + 1) + ": " + players[i]);
        }

	}

}