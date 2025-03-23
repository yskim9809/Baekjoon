package Baekjoon;

import java.util.*;

public class bj_5597 {

	public static void main(String[] args) {
		int[] list = new int[30];
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i < 29; i++) {
			int num = scanner.nextInt();
			list[num - 1] = num;
		}
		// Arrays.sort(list);
		for (int i = 0; i < list.length; i++) {
			if (list[i] == 0) {
				System.out.println(i + 1);
			}

		}
	}

}
