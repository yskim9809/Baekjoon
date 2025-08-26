package Baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj_2178 { // nm까지 가는 최소칸수 구하기 -> BFS, 1로만 이동가능

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.nextLine();

		int[][] maps = new int[n][m];
		for (int i = 0; i < n; i++) {
			String line = scanner.nextLine();
			for (int j = 0; j < m; j++) {
				maps[i][j] = line.charAt(j) - '0'; // 문자 '1' → 숫자 1
			}
		}

		Queue<int[]> que = new LinkedList<>();
		boolean[][] visited = new boolean[n][m];

		int[] dx = { 0, 0, 1, -1 };
		int[] dy = { 1, -1, 0, 0 };

//		if (maps[0][0] == 0 || maps[n - 1][m - 1] == 0) { // 도달 불가
//			System.out.println(-1);
//			return;
//		}
		if (n == 1 && m == 1) {
			System.out.println(1);
			return;
		}

		que.add(new int[] { 0, 0, 1 }); // x,y,거리
		visited[0][0] = true;

		while (!que.isEmpty()) {
			int[] temp = que.poll();
			int x = temp[0];
			int y = temp[1];
			int d = temp[2];

			if (x == n - 1 && y == m - 1) { // 도착시 종료
				System.out.println(d);
				return;
			}

			for (int di = 0; di < 4; di++) {
				int nx = x + dx[di];
				int ny = y + dy[di];

				if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
					continue;
				}
				if (maps[nx][ny] == 0) {
					continue;
				}
				if (visited[nx][ny]) {
					continue;
				}

				visited[nx][ny] = true;
				que.add(new int[] { nx, ny, d + 1 });
			}

		}

	}

}
