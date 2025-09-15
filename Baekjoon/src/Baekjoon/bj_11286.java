package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class bj_11286 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 연산 개수
		StringBuilder sb = new StringBuilder();

		PriorityQueue<Integer> que = new PriorityQueue<>((a, b) -> {
			if (Math.abs(a) == Math.abs(b))
				return a - b; // 절댓값 같으면 실제 값 작은 게 우선
			return Math.abs(a) - Math.abs(b); // 절댓값 기준 정렬
		});
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0) {
				if (que.isEmpty()) {
					sb.append(0).append('\n');
				} else {
					sb.append(que.poll()).append('\n');
				}

			} else {
				que.add(x);
			}
 
		}
		System.out.println(sb);

	}

}
