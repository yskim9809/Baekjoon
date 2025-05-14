package Baekjoon;

import java.util.Scanner;

public class bj_24266 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong();
		// O(n^3) -> 최고차항 3
		System.out.println(a * a * a);
		System.out.println(3);

	}

}
