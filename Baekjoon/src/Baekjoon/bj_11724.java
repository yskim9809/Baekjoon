package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class bj_11724 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 정점 수
		int m = Integer.parseInt(st.nextToken()); // 간선 수

		List<Integer>[] graph = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++)
			graph[i] = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a].add(b);
			graph[b].add(a);
		}

		boolean[] visited = new boolean[n + 1];
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				dfs(graph, visited, i);
				count++;
			}

		}
		System.out.println(count);

	}

	private static void dfs(List<Integer>[] graph, boolean[] visited, int start) {
		visited[start] = true;
		for (int next : graph[start]) {
			if (!visited[next]) {
				dfs(graph, visited, next);
			}
		}
	}

}
