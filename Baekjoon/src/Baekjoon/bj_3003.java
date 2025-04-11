package Baekjoon;

import java.util.Scanner;

public class bj_3003 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int k[] = new int[6];
		int b[] = { 1, 1, 2, 2, 2, 8 };

		for (int i = 0; i < k.length; i++) {
			k[i] = scanner.nextInt();
		}
		for (int i = 0; i < k.length; i++) {
			System.out.print(b[i] - k[i] + " ");
		}

	}

}
