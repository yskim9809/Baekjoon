package Baekjoon;

import java.util.Scanner;

public class bj_2720 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int j = 0; j < num; j++) {
			int m = arr[j];
			int q = m / 25;
			m = m % 25;
			int d = m / 10;
			m = m % 10;
			int n = m / 5;
			m = m % 5;
			int p = m;

			System.out.println(q + " " + d + " " + n + " " + p);
		}

	}

}
