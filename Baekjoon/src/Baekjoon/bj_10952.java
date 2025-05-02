package Baekjoon;

import java.util.Scanner;

public class bj_10952 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int A = 0;
		int B = 0;

		while (true) {
			A = scanner.nextInt();
			B = scanner.nextInt();
			if (A == 0 && B == 0)
				break;
			sb.append(A + B + "\n");

		}
		System.out.println(sb);

	}

}
