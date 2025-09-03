package Baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj_1697 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int k = scanner.nextInt();

		boolean[] visited = new boolean[100001];
		Queue<int[]> que = new LinkedList<>();

		que.add(new int[] { n, 0 }); // 시작점, 이동시간
		visited[n] = true;

		while (!que.isEmpty()) {
			int[] temp = que.poll();
			int start = temp[0];
			int time = temp[1];

			if (start == k) {
				System.out.println(time);
				break;
			}

			int[] next = { start + 1, start - 1, start * 2 };
			for (int nx : next) {
				if (nx < 0 || nx > 100000)
					continue;
				if (visited[nx])
					continue;
				
				visited[nx] = true;
				que.add(new int[] { nx, time + 1 });
			}
		}

	}

}
