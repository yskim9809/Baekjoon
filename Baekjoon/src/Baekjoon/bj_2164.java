package Baekjoon;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class bj_2164 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Deque<Integer> que = new ArrayDeque<>();
		for (int i = 1; i <= n; i++) {
			que.add(i);
		}
		for (int i = 0; i < n - 1; i++) {
			que.poll();
			que.add(que.poll());
		}
		System.out.println(que.peek());

	}

}
