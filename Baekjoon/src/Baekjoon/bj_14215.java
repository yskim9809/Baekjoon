package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class bj_14215 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);
		if (arr[2] >= arr[0] + arr[1]) {
			arr[2] = arr[0] + arr[1] - 1;

		}
		System.out.println(arr[0] + arr[1] + arr[2]);

	}

}
