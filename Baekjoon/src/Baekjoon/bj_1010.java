package Baekjoon;

import java.util.Scanner;

public class bj_1010 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			System.out.println(combination(m, n));
		}

	}

	public static long combination(int m, int n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * (m - i + 1) / i;
		}
		/*
		 * n!/k!(n-k)!
		 * n*(n-1)*(n-2)*...*(n-k+1)/k!
		 */
		return result;
	}

}
