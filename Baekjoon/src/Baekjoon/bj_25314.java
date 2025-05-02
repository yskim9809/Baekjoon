package Baekjoon;

import java.util.Scanner;

public class bj_25314 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		String answer = "";

		for (int i = 0; i < x / 4; i++) {
			answer += "long ";
		}
		answer += "int";

		System.out.println(answer);

	}

}
