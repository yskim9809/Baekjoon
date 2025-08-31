package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_7576 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken()); // 가로(열)
		int N = Integer.parseInt(st.nextToken()); // 세로(행)

		int[] dx = { 0, 0, -1, 1 };
		int[] dy = { 1, -1, 0, 0 };
		Queue<int[]> que = new LinkedList<>();
		int answer = 0;

		int[][] box = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				box[i][j] = Integer.parseInt(st.nextToken()); // -1, 0, 1
				if (box[i][j] == 1) {
					que.add(new int[] { i, j, 0 }); // 시작점: (행, 열, 일수=0)
				}
			}
		}

		while (!que.isEmpty()) {
			int[] temp = que.poll();
			int x = temp[0];
			int y = temp[1];
			int day = temp[2];

			answer = day;

			for (int di = 0; di < 4; di++) {
				int nx = x + dx[di];
				int ny = y + dy[di];

				if (nx < 0 || ny < 0 || nx >= N || ny >= M)
					continue;
				if (box[nx][ny] == 1 || box[nx][ny] == -1) // 익은 토마토이거나 비어있으면
					continue;

				box[nx][ny] = 1;
				que.add(new int[] { nx, ny, day + 1 });

			}

		}
		// 익을 수 없는 상자인경우
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (box[i][j] == 0) { // 아직 안 익은 게 있다면
					System.out.println(-1);
					return;
				}
			}
		}

		System.out.println(answer);

	}

}
