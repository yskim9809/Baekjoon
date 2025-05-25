package Baekjoon;

import java.util.Scanner;

public class bj_9506 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int i = scanner.nextInt();
			if (i == -1) {
				break;
			}
			int sum = 0;
			String s = " = ";
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
					if (j != 1) {
						s += " + " + j;
					} else {
						s += j;
					}
				}
			}
			if (i == sum) {
				System.out.println(i + s);
			} else {
				System.out.println(i + " is NOT perfect.");
			}
		}
	}

}
