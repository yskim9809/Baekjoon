package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_27433 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		System.out.println(factorial(N));

	}

	static long factorial(int n) {
		if (n <= 0) {
			return 1;
		}

		return n * factorial(n - 1);
	}

}
