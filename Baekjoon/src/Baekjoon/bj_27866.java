package Baekjoon;

import java.util.Scanner;

public class bj_27866 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		int i = scanner.nextInt();
		System.out.println(word.substring(i - 1, i));

	}

}
