package Baekjoon;

import java.util.Scanner;

public class bj_10798 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[][] arr = new char[5][15];
		int max = 0;
		String answer = "";

		for (int i = 0; i < arr.length; i++) {
			String str = scanner.nextLine();
			if (max < str.length())
				max = str.length();
			for (int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[j][i] == '\0')
					continue;
				answer += arr[j][i];
			}
		}
		System.out.println(answer);

	}

}
