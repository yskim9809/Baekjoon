package Baekjoon;

import java.util.Scanner;

public class bj_9086 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine(); // 개행 문자 소비
		String arr[] = new String[t];
		for (int i = 0; i < t; i++) {
			arr[i] = scanner.nextLine();
		}
		for (int i = 0; i < arr.length; i++) {
			int leng = arr[i].length();
			System.out.println(arr[i].substring(0, 1) + arr[i].substring(leng - 1));
		}

	}

}
