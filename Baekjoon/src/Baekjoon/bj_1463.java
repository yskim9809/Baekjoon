package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1463 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int dp[] = new int[n + 1];
		// dp[i] = i를 1로 만드는 최소 연산 수
		dp[1] = 0;
		for (int i = 2; i <= n; i++) {
			int best = dp[i - 1] + 1; // -1연산만 했을 때
			if (i % 2 == 0) {
				best = Math.min(best, dp[i / 2] + 1); // 지금 나누는것 + dp[i/2]에서 1로 가는 연산 수
			}
			if (i % 3 == 0) {
				best = Math.min(best, dp[i / 3] + 1);
			}
			dp[i] = best;

		}
		System.out.println(dp[n]);

	}

}
