package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class bj_5073 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int[] arr = new int[3];
			for (int i = 0; i < 3; i++) {
				arr[i] = scanner.nextInt();
			}
			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
				break;
			}
			Arrays.sort(arr);
			if (arr[0] == arr[1] && arr[1] == arr[2]) {
				System.out.println("Equilateral");
			} else if (arr[2] >= arr[0] + arr[1]) {
				System.out.println("Invalid");
			} else if (arr[0] != arr[1] && arr[0] != arr[2] && arr[1] != arr[2]) {
				System.out.println("Scalene");
			} else {
				System.out.println("Isosceles");
			}

		}
	}

}
