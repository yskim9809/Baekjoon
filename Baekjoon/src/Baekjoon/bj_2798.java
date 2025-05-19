package Baekjoon;

import java.util.Scanner;

public class bj_2798 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[scanner.nextInt()];
		int m = scanner.nextInt();
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] <= m && arr[i] + arr[j] + arr[k] >= max) {
						max = arr[i] + arr[j] + arr[k];
					}
				}
			}
		}
		System.out.println(max);
	}

}
