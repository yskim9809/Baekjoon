package Baekjoon;

import java.util.Scanner;

public class bj_10810 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[scanner.nextInt()];
		int m = scanner.nextInt();
		for (int x = 0; x < m; x++) {
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			int k = scanner.nextInt();
			for (int y = i - 1; y < j; y++) {
				arr[y] = k;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
