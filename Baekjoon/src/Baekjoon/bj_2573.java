package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_2573 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 세로 (행)
		int M = Integer.parseInt(st.nextToken()); // 가로 (열)

		int[][] map = new int[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		boolean[][] visited = new boolean[N][M];
		Queue<int[]> que = new LinkedList<>();

		int[] dx = { 0, 0, -1, 1 };
		int[] dy = { -1, 1, 0, 0 };

		int year = 0;
		while (true) {
			year++;
			melt(N, M, dx, dy, map);
			int count = countIsland(visited, que, dx, dy, N, M, map);
			if (count >= 2) {
				System.out.println(year);
				break;
			}
			if (count == 0) {
				System.out.println(0);
				break;
			}
		}

	}

	private static int countIsland(boolean[][] visited, Queue<int[]> que, int[] dx, int[] dy, int N, int M,
			int[][] map) {
		visited = new boolean[N][M]; // 지난해 기록 초기화
		int count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (!visited[i][j] && map[i][j] != 0) {
					que.add(new int[] { i, j });
					visited[i][j] = true;
					while (!que.isEmpty()) {
						int[] temp = que.poll();
						int x = temp[0];
						int y = temp[1];

						for (int di = 0; di < 4; di++) {
							int nx = x + dx[di];
							int ny = y + dy[di];

							if (nx < 0 || ny < 0 || nx >= N || ny >= M)
								continue;
							if (visited[nx][ny])
								continue;
							if (map[nx][ny] == 0)
								continue;

							que.add(new int[] { nx, ny });
							visited[nx][ny] = true;
						}

					}
					count++; // bfs 한번 끝날때마다 덩어리 카운트
				}
			}
		}

		return count;
	}

	private static void melt(int N, int M, int[] dx, int[] dy, int[][] map) {
		int[][] next = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int sea = 0;
				if (map[i][j] > 0) {
					for (int di = 0; di < 4; di++) {
						int nx = i + dx[di];
						int ny = j + dy[di];
						if (nx < 0 || ny < 0 || nx >= N || ny >= M)
							continue;
						if (map[nx][ny] == 0)
							sea++;
					}
					// 바다 개수만큼 빙산 깎기
					next[i][j] = Math.max(0, map[i][j] - sea);
				}

			}
		}
		for (int i = 0; i < N; i++) { // 전체갱신
			System.arraycopy(next[i], 0, map[i], 0, M);
		}

	}

}
