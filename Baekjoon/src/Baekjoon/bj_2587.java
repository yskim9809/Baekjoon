package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_2587 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[5];
		int sum = 0;
		int mid = 0;
		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		Arrays.sort(arr);
		System.out.println(sum / 5);
		System.out.println(arr[2]);

	}

}
