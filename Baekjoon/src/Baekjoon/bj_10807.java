package Baekjoon;

import java.util.*;

public class bj_10807 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int[] list = new int[x];
		int count = 0;

		for (int i = 0; i < list.length; i++) {
			list[i] = scanner.nextInt();
		}
		int y = scanner.nextInt();
		for (int j = 0; j < list.length; j++) {
			if (list[j] == y) {
				count++;
			}
		}
		System.out.println(count);

	}

}
