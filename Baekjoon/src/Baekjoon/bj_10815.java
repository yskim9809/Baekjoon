package Baekjoon;

import java.util.Scanner;

public class bj_10815 { // 시간초과

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = scanner.nextInt();
		}
		int m = scanner.nextInt();
		int[] arr2 = new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = scanner.nextInt();
		}
		for (int i = 0; i < arr2.length; i++) {
			boolean check = false;
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j]) {
					check = true;
				}
			}
			if (check == true) {
				System.out.print(1 + " ");
			} else {
				System.out.print(0 + " ");
			}
		}

	}

}
