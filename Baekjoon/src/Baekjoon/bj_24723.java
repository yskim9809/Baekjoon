package Baekjoon;

import java.util.Scanner;

public class bj_24723 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int answer = 1;
		for (int i = 0; i < n; i++) {
			answer *= 2;
		}
		System.out.println(answer);

	}

}
