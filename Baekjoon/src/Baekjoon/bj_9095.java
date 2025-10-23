package Baekjoon;

import java.util.Scanner;

public class bj_9095 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		StringBuilder sb = new StringBuilder();
		int dp[] = new int[11];
		// 점화식이 미치는 최소 범위까지 초기화
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;

		for (int i = 4; i <= 10; i++) {
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
			// 마지막이 1일때 + 마지막이 2일때 + 마지막이 3일때
			// ex) dp[5] = 4를 만드는 경우의 수+ 3을 만드는 경우의 수 + 2를 만드는 경우의 수
		}
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(scanner.nextLine());
			sb.append(dp[n]).append('\n');
		}

		System.out.println(sb);

	}

}
