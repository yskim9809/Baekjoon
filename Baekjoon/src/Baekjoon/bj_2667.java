package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class bj_2667 { // 단지별 집의 수 오름차순
	static int count = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine().trim()); // 지도 크기 N
		int[][] map = new int[N][N];
		boolean[][] visited = new boolean[N][N];
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			String line = br.readLine().trim(); // 공백 없이 0/1 문자열
			for (int j = 0; j < N; j++) {
				map[i][j] = line.charAt(j) - '0';
			}
		}

		int[] dx = { 0, 0, -1, 1 };
		int[] dy = { 1, -1, 0, 0 };

		int total = 0;
		// 여기서부터 풀이 로직 작성 (BFS/DFS 등)
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] != 0 && !visited[i][j]) {
					count = 0;
					dfs(map, visited, dx, dy, i, j, N);
					total++;
					arr.add(count);
				}
			}
		}

		Collections.sort(arr);
		System.out.println(total);
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

	}

	private static void dfs(int[][] map, boolean[][] visited, int[] dx, int[] dy, int i, int j, int n) {
		visited[i][j] = true;
		count++;

		for (int di = 0; di < 4; di++) {
			int nx = i + dx[di];
			int ny = j + dy[di];

			if (nx < 0 || ny < 0 || nx >= n || ny >= n)
				continue;
			if (map[nx][ny] == 0)
				continue;
			if (visited[nx][ny])
				continue;

			dfs(map, visited, dx, dy, nx, ny, n);

		}

	}

}
