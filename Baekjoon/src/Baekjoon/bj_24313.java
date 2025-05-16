package Baekjoon;

import java.util.Scanner;

public class bj_24313 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a1 = scanner.nextInt();
		int a0 = scanner.nextInt();
		int c = scanner.nextInt();
		int n0 = scanner.nextInt();

		boolean isValid = true;
		// 모든 n>n0에 대해 f(n)=a1n + a0 가 g(n)= c*n보다 작거나 같으면 된다
		for (int n = n0; n <= n0 + 100; n++) {
			if (a1 * n + a0 > c * n) {
				isValid = false;
				break;
			}
		}

		System.out.println(isValid ? 1 : 0);

	}

}
