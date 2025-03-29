package Baekjoon;

import java.util.Scanner;

public class bj_10813 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.nextLine();
		int arr[] = new int[n];
		for (int k = 0; k < n; k++) {
			arr[k] = k + 1;
		}
		for (int k = 0; k < m; k++) {
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			int temp = arr[i - 1];
			arr[i - 1] = arr[j - 1];
			arr[j - 1] = temp;
			scanner.nextLine();
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

	}

}
