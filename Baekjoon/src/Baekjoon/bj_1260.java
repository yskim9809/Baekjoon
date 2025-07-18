package Baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj_1260 {
	static Scanner scanner = new Scanner(System.in);
	static String[] st = scanner.nextLine().split(" ");
	static int n = Integer.parseInt(st[0]);
	static int m = Integer.parseInt(st[1]);
	static int v = Integer.parseInt(st[2]);
	static ArrayList<Integer>[] graph = new ArrayList[n + 1];

	public static void main(String[] args) {
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; i++) {
			String[] st = scanner.nextLine().split(" ");
			int a = Integer.parseInt(st[0]);
			int b = Integer.parseInt(st[1]);
			graph[a].add(b);
			graph[b].add(a);
		}
		// 간선 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i]);
        }
		dfs(v);
		System.out.println();
		bfs(v);

	}

	static boolean[] visited = new boolean[n + 1];
	static boolean[] visited2 = new boolean[n + 1];

	private static void dfs(int node) {
		visited[node] = true;
		System.out.print(node + " ");
		for (int next : graph[node]) {
			if (!visited[next]) {
				dfs(next);
			}
		}

	}

	private static void bfs(int start) {
		Queue<Integer> que = new LinkedList<>();
		visited2[start] = true;
		que.add(start);

		while (!que.isEmpty()) {
			int node = que.poll();
			System.out.print(node + " ");

			for (int next : graph[node]) {
				if (!visited2[next]) {
					visited2[next] = true;
					que.add(next);
				}
			}
		}

	}

}
