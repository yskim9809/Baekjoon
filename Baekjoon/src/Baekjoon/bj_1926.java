package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1926 {
	static int count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 세로
		int m = Integer.parseInt(st.nextToken()); // 가로

		int[][] board = new int[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		boolean[][] visited = new boolean[n][m];
		int[] dx = { 0, 0, -1, 1 };
		int[] dy = { -1, 1, 0, 0 };
		int mcount = 0;
		int tcount = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!visited[i][j] && board[i][j] == 1) {
					dfs(board, visited, i, j, n, m, dx, dy);
					if (count > mcount)
						mcount = count;
					count = 0;
					tcount++;
				}
			}
		}
		System.out.println(tcount);
		System.out.println(mcount);

	}

	private static void dfs(int[][] board, boolean[][] visited, int i, int j, int n, int m, int[] dx, int[] dy) {
		visited[i][j] = true;
		count++;
		for (int di = 0; di < 4; di++) {
			int nx = i + dx[di];
			int ny = j + dy[di];

			if (nx < 0 || ny < 0 || nx >= n || ny >= m)
				continue;
			if (visited[nx][ny])
				continue;
			if (board[nx][ny] != 1)
				continue;

			dfs(board, visited, nx, ny, n, m, dx, dy);

		}

	}

}
