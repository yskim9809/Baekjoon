package Baekjoon;

import java.util.Scanner;

public class bj_11050 {
	/*
	 * 이항계수 : n개중에 k 개를 선택하는 경우의 수 n!/k!(n-k)!
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		System.out.println(factorial(n) / (factorial(k) * factorial(n - k)));

	}

	public static int factorial(int r) {
		int result = 1;
		for (int i = r; i > 1; i--) {
			result *= i;
		}
		return result;

	}

}
