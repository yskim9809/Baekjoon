package Baekjoon;

import java.util.Scanner;

public class bj_1934 {

	public static void main(String[] args) { // 최소공배수 = 유클리드호제법
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long g = gcd(a, b);
			System.out.println(a / g * b);
		}
	}

	static long gcd(long a, long b) {
		while (b != 0) {
			long t = a % b;
			a = b;
			b = t;
		}
		return a;
	}
}
