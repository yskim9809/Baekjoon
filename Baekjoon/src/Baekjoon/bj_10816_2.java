package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class bj_10816_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine()); // 상근이가 가진 숫자 카드 개수
		int[] cards = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
			map.put(cards[i], map.getOrDefault(cards[i], 0) + 1);
		}

		int M = Integer.parseInt(br.readLine()); // 확인할 숫자 개수
		int[] targets = new int[M];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			targets[i] = Integer.parseInt(st.nextToken());
			sb.append(map.getOrDefault(targets[i], 0)).append(" ");
		}
		
		System.out.println(sb);

	}

}
