package Baekjoon;

import java.util.Scanner;

public class bj_2563 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean[][] paper = new boolean[100][100];
		int n = scanner.nextInt();
		int count = 0;

		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();

			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					paper[j][k] = true;
				}
			}
		}

		for (int j = 0; j < 100; j++) {
			for (int k = 0; k < 100; k++) {
				if (paper[j][k] == true) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
