package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Tree {
	public static void main(String[] args) {
		ArrayList<Integer> xd = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			for (int j = 1; i > j; i++) {

				if (i % j == 0) {
					break;
				} else {
					xd.add(i);
				}
			}
			System.out.println(xd);
		}
	}
}
