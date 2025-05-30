package Baekjoon;

import java.util.Scanner;

public class bj_9063 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] arr = new int[n][2];
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = scanner.nextInt();
			arr[i][1] = scanner.nextInt();
		}
		int bx = arr[0][0];
		int sx = arr[0][0];
		int by = arr[0][1];
		int sy = arr[0][1];
		for (int i = 1; i < arr.length; i++) {
			if (bx < arr[i][0]) {
				bx = arr[i][0];
			} else if (sx > arr[i][0]) {
				sx = arr[i][0];
			}
			if (by < arr[i][1]) {
				by = arr[i][1];
			} else if (sy > arr[i][1]) {
				sy = arr[i][1];
			}
		}
		int w = bx - sx;
		int h = by - sy;
		System.out.println(w * h);

	}

}
