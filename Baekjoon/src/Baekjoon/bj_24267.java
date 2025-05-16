package Baekjoon;

import java.util.Scanner;

public class bj_24267 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong();
		// O(n^3/6) -> 최고차항 3
		//a*(a - 1) * (a - 2)/3!
		System.out.println(a*(a - 1) * (a - 2)/6);
		System.out.println(3);

	}

}
