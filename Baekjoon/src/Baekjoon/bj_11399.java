package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class bj_11399 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);
		int sum = 0;
		int answer = 0;
		for (int i = 0; i < arr.length; i++) {
			answer += sum + arr[i];
			sum += arr[i];
		}
		System.out.println(answer);

	}

}
