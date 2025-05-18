package Baekjoon;

import java.util.Scanner;

public class bj_19532 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int e = scanner.nextInt();
		int f = scanner.nextInt();

		for (int x = -999; x <= 999; x++) {
			for (int y = -999; y <= 999; y++) {
				if (a * x + b * y == c && d * x + e * y == f) {
					System.out.println(x + " " + y);
					return;
				}
			}
		}

//		int denominator = a * e - b * d;
//
//		if (denominator == 0) {
//			System.out.println("해를 구할 수 없습니다."); // 또는 throw new IllegalArgumentException();
//			return;
//		}
//
//		int y = (a * f - c * d) / denominator;
//		int x = (c - b * y) / a;
//
//		System.out.println(x + " " + y);

	}

}
