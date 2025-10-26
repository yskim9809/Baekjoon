package Baekjoon;

import java.util.Scanner;

public class bj_11726 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int dp[] = new int[n + 1];
		// dp[n] = 2*n 타일을 덮는 경우의 수
		// 맨 끝에 세로타일 dp[n-1], 가로타일두개 dp[n-2]를 놓는경우, 서로 겹치지 않는다
		dp[1] = 1;
		dp[2] = 2;
		// dp[n]=dp[n-1]+dp[n-2];
		int mod = 10007;
		for (int i = 3; i <= n; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
		}
		System.out.println(dp[n]);

	}

}
