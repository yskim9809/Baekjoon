package Baekjoon;

import java.util.Scanner;

public class bj_13909 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 약수의 개수가 홀수인 경우 창문이 열림 ->완전제곱수 1 4 9 16 ...
		long n = scanner.nextLong();
		long ans = (long) Math.sqrt(n); // n개 이하의 제곱수 = 제곱근 정수부분

		System.out.println(ans);

	}

}
