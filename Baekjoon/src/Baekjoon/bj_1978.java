package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1978 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		br.readLine();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		while (st.hasMoreTokens()) { // Tokenizer에 토큰이 있을때까지
			boolean isPrime = true; // 소수일경우 true;
			int num = Integer.parseInt(st.nextToken()); // 공백과 함꼐 숫자 입력
			if (num == 1) {
				continue;
			}
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
			}

		}
		System.out.println(count);

	}

}
