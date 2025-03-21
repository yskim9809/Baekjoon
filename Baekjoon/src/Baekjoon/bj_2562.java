package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class bj_2562 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[9];
		int max = 0;
		int imax = 0;

		for (int i = 0; i < 9; i++) {
			arr[i] = scanner.nextInt();
			if (arr[i] > max) {
				max = arr[i];
				imax = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(imax);

	}

}
