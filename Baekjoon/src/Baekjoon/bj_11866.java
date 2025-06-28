package Baekjoon;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class bj_11866 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		Deque<Integer> que = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for (int i = 1; i <= n; i++) {
			que.add(i);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < k; j++) {
				que.add(que.poll());
			}
			sb.append(que.poll());
			if (!que.isEmpty()) {
				sb.append(", ");
			}
		}
		sb.append(">");
		System.out.println(sb);
	}
}
