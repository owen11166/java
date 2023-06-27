package tw.org.iii.tutor;

import java.util.HashSet;
import java.util.Set;

public class Brad57 {

	public static void main(String[] args) {
		Set<Integer> lottery = new HashSet<>();
		while(lottery.size()<6) {
			lottery.add((int)(Math.random()*49+1));
		}
		System.out.println(lottery);

	}

}
