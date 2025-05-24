package Baekjoon;

import java.util.Scanner;

public class bj_2501 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int cnt = 0;
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				cnt++;
				if (cnt == k) {
					answer = i;
				}
			}
		}
		System.out.println(answer);

	}

}
