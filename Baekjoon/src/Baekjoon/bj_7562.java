package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_7562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

		for (int t = 0; t < T; t++) {
			int l = Integer.parseInt(br.readLine()); // 체스판 한 변 길이

			int[][] board = new int[l][l]; // 체스판

			st = new StringTokenizer(br.readLine());
			int startX = Integer.parseInt(st.nextToken());
			int startY = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			int endX = Integer.parseInt(st.nextToken());
			int endY = Integer.parseInt(st.nextToken());

			// ↓ 여기서부터 BFS 로직 작성
			boolean[][] visited = new boolean[l][l];
			Queue<int[]> que = new LinkedList<>();
			int[] dx = { 2, 2, -2, -2, 1, 1, -1, -1 };
			int[] dy = { -1, 1, 1, -1, -2, 2, 2, -2 };

			que.add(new int[] { startX, startY, 0 }); // 시작점,거리
			visited[startX][startY] = true;

			while (!que.isEmpty()) {
				int[] temp = que.poll();
				int x = temp[0];
				int y = temp[1];
				int d = temp[2];

				if (x == endX && y == endY) {
					sb.append(d).append('\n');
					break;
				}

				for (int di = 0; di < 8; di++) {
					int nx = x + dx[di];
					int ny = y + dy[di];

					if (nx < 0 || ny < 0 || nx >= l || ny >= l)
						continue;
					if (visited[nx][ny])
						continue;

					que.add(new int[] { nx, ny, d + 1 });
					visited[nx][ny] = true;
				}

			}

		}
		System.out.println(sb);

	}

}
