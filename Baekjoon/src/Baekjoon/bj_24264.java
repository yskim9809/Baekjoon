package Baekjoon;

import java.util.Scanner;

public class bj_24264 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		// 입력받은 값의 제곱만큼 반복된다 O(n^2) -> 최고차항 2
		System.out.println((long)a*a);
		System.out.println(2);

	}

}
