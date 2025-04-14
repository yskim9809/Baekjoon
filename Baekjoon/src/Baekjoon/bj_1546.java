package Baekjoon;

import java.util.Scanner;

public class bj_1546 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		double sum = 0;
		double max = 0;
		double[] arr = new double[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextDouble();
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i] / max * 100;
		}
		System.out.println(sum / num);

	}

}
