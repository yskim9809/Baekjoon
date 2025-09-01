package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class bj_1927 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> pque = new PriorityQueue<>();
		// new PriorityQueue<>(Collections.reverseOrder()); 큰값정렬

		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0) {
				if (pque.isEmpty()) {
					sb.append(0).append('\n');
				} else {
					sb.append(pque.poll()).append('\n');
				}
			} else {
				pque.add(x);
			}
		}
		System.out.println(sb);

	}

}
