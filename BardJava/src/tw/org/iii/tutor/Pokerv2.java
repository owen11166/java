package tw.org.iii.tutor;

import java.util.Arrays;

public class Pokerv2 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(start);
		// 1. 洗牌
		int[] poker = new int[52];
		boolean isRepeat = false;
		
		for (int i=0; i<poker.length; i++) {
			//----------
			//int temp = (int)(Math.random()*52);
			
			// 檢查機制
			
			
			/*
			for (int j=0; j<i; j++) {

				}
			}
			*/
				int j=0;
				int temp;
				do {
					 temp = (int)(Math.random()*52);
				}while(isRepeat);{
					if (poker[j] == temp) {
						// 重複了
						isRepeat = true;
						break;
					}
				}
			
			
			
			
			//----------------
			if (!isRepeat) {
				poker[i] = temp;
				//System.out.println(poker[i]);
			}else {
				i--;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println(Arrays.toString(poker));
		
		// 2. 發牌
		
		// 3. 攤牌 + 里牌
	}
}