package Baekjoon;

import java.util.Scanner;

public class bj_11781 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextLine()) {
			String str = scanner.nextLine();

			System.out.println(str);
		}
		scanner.close(); //무한루프방지

	}

}
