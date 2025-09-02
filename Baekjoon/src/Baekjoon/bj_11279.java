package Baekjoon;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class bj_11279 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			if (x == 0) {
				if (pq.isEmpty()) {
					sb.append(0).append('\n');
				} else {
					sb.append(pq.poll()).append('\n');
				}
			} else {
				pq.add(x);
			}
		}

		System.out.println(sb);

	}

}
