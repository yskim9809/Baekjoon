package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2579 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int dp[] = new int[n + 1];
		int score[] = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}

		if (n == 1) {
			System.out.println(score[1]);
			return;
		} else if (n == 2) {
			System.out.println(score[1] + score[2]);
			return;
		}

		dp[1] = score[1];
		dp[2] = score[1] + score[2];
		dp[3] = Math.max(score[1] + score[3], score[2] + score[3]);
		// Math.max(두 칸 전에서 올라온거, 한 칸 전에서 올라왔지만 연속 세 칸은 피한거)
		// dp[i]=Math.max(dp[i-2]+score[i],dp[i-3]+score[i+1]+score[i]);
		for (int i = 4; i <= n; i++) {
			dp[i] = Math.max(dp[i - 2] + score[i], dp[i - 3] + score[i - 1] + score[i]);
		}
		System.out.println(dp[n]);

	}

}
