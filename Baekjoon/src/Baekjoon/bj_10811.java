package Baekjoon;

import java.util.Scanner;

public class bj_10811 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.nextLine();
		int arr[] = new int[n];
		for (int k = 0; k < n; k++) {
			arr[k] = k + 1;
		}
		for (int i = 0; i < m; i++) { // m개의 줄
			int left = scanner.nextInt() - 1; // 배열 0부터 시작
			int right = scanner.nextInt() - 1;

			while (left < right) {
				int temp = arr[left];
				arr[left++] = arr[right];
				arr[right--] = temp;
			}
		}
		scanner.close();
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

	}

}
