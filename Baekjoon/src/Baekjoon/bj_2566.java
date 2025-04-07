package Baekjoon;

import java.util.Scanner;

public class bj_2566 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] arr = new int[9][9];
		int max = 0;
		int r = 0;
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] >= max) {
					max = arr[i][j];
					r = i + 1;
					c = j + 1;
				}
			}
		}
		System.out.println(max);
		System.out.println(r + " " + c);

	}

}
