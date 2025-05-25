package Baekjoon;

import java.util.Scanner;

public class bj_13305 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] road = new int[n - 1];
		int[] price = new int[n];

		int sum = 0;
		for (int i = 0; i < n - 1; i++) {
			road[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			price[i] = scanner.nextInt();
		}
		int min = price[0];
		for (int i = 0; i < n - 1; i++) {
			if (price[i] < min) {
				min = price[i];
			}
			sum += (long) min * road[i];
		}
		System.out.println(sum);

	}

}
