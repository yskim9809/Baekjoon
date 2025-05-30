package Baekjoon;

import java.util.Scanner;

public class bj_1541 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int[][] rec = new int[3][2];
		for (int i = 0; i < rec.length; i++) {
			rec[i][0] = scanner.nextInt();
			rec[i][1] = scanner.nextInt();
		}
		if (rec[0][0] == rec[2][0]) {
			x = rec[1][0];
		} else if (rec[0][0] == rec[1][0]) {
			x = rec[2][0];
		} else {
			x = rec[0][0];
		}

		if (rec[0][1] == rec[2][1]) {
			y = rec[1][1];
		} else if (rec[0][1] == rec[1][1]) {
			y = rec[2][1];
		} else {
			y = rec[0][1];
		}
		System.out.println(x + " " + y);

	}

}
