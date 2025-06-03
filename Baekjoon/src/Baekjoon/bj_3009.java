package Baekjoon;

import java.util.Scanner;

public class bj_3009 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] arr = new int[3][2];
		int x = 0;
		int y = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = scanner.nextInt();
			arr[i][1] = scanner.nextInt();
		}
		if (arr[0][0] == arr[1][0]) {
			x = arr[2][0];
		} else if (arr[0][0] == arr[2][0]) {
			x = arr[1][0];
		} else {
			x = arr[0][0];
		}
		if (arr[0][1] == arr[1][1]) {
			y = arr[2][1];
		} else if (arr[0][1] == arr[2][1]) {
			y = arr[1][1];
		} else {
			y = arr[0][1];
		}
		System.out.println(x + " " + y);

	}

}
