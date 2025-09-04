package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

		for (int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken()); // 가로 길이
			int N = Integer.parseInt(st.nextToken()); // 세로 길이
			int K = Integer.parseInt(st.nextToken()); // 배추 심어진 개수

			int[][] field = new int[N][M]; // 밭

			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken()); // 가로 좌표
				int y = Integer.parseInt(st.nextToken()); // 세로 좌표
				field[y][x] = 1; // 배추 심기
			}

			// ↓ 여기부터는 BFS/DFS 로직 작성
			boolean[][] visited = new boolean[N][M];
			int count = 0;
			int[] dx = { 0, 0, 1, -1 };
			int[] dy = { 1, -1, 0, 0 };

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (!visited[i][j] && field[i][j] == 1) {
						dfs(field, N, M, i, j, visited, dx, dy);
						count++;
					}
				}
			}
			sb.append(count).append('\n');

		}
		System.out.println(sb);

	}

	private static void dfs(int[][] field, int n, int m, int i, int j, boolean[][] visited, int[] dx, int[] dy) {
		visited[i][j] = true;

		for (int di = 0; di < 4; di++) {
			int nx = i + dx[di];
			int ny = j + dy[di];

			if (nx < 0 || ny < 0 || nx >= n || ny >= m)
				continue;
			if (visited[nx][ny])
				continue;
			if (field[nx][ny] != 1)
				continue;

			dfs(field, n, m, nx, ny, visited, dx, dy);

		}

	}

}
