package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2468 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine().trim());
		int[][] map = new int[N][N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// 비 높이 구하기
		int h = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] > h)
					h = map[i][j];
			}
		}

		int[] dx = { 0, 0, -1, 1 };
		int[] dy = { 1, -1, 0, 0 };

		int maxcount = 0;
		for (int k = 0; k <= h; k++) {
			boolean[][] visited = new boolean[N][N];
			int count = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!visited[i][j] && map[i][j] > k) { // 비 높이보다 높은곳
						dfs(N, map, visited, dx, dy, i, j, k);
						count++;
					}
				}
			}
			if (count > maxcount) {
				maxcount = count;
			}
		}

		System.out.println(maxcount);

	}

	private static void dfs(int N, int[][] map, boolean[][] visited, int[] dx, int[] dy, int i, int j, int k) {
		visited[i][j] = true;
		for (int di = 0; di < 4; di++) {
			int nx = i + dx[di];
			int ny = j + dy[di];

			if (nx < 0 || ny < 0 || nx >= N || ny >= N)
				continue;
			if (visited[nx][ny])
				continue;
			if (map[nx][ny] <= k)
				continue;

			dfs(N, map, visited, dx, dy, nx, ny, k);

		}

	}

}
