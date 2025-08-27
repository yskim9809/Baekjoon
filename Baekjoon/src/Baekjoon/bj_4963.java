package Baekjoon;

import java.util.Scanner;

public class bj_4963 { // 1로 이루어진 섬의 갯수 세기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (true) {
			int w = sc.nextInt();
			int h = sc.nextInt();

			if (w == 0 && h == 0)
				break; // 입력 종료

			int[][] map = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			boolean[][] visited = new boolean[h][w];
			int count = 0;
			int[] dx = {-1,-1,-1, 0, 0, 1, 1, 1}; //대각선까지 연결
			int[] dy = {-1, 0, 1,-1, 1,-1, 0, 1};

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (!visited[i][j] && map[i][j] == 1) {
						dfs(visited, dx, dy, map, i, j, h, w);
						count++;
					}
				}

			}
			sb.append(count).append('\n');

		}
		
		System.out.println(sb);

	}

	private static void dfs(boolean[][] visited, int[] dx, int[] dy, int[][] map, int i, int j, int h, int w) {
		visited[i][j] = true;
		for (int di = 0; di < 8; di++) {
			int nx = i + dx[di];
			int ny = j + dy[di];

			// 조건 안 맞으면 건너뛰기
	        if (nx < 0 || ny < 0 || nx >= h || ny >= w) continue;
	        if (visited[nx][ny]) continue;
	        if (map[nx][ny] == 0) continue;

	        dfs(visited, dx, dy, map, nx, ny, h, w);
				
		}

	}
}
