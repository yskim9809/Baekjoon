package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_9019 {

	static class Node {
		int num; // 현재 숫자
		String path; // 지금까지의 명령어

		Node(int num, String path) {
			this.num = num;
			this.path = path;
		}
	}

	// D 연산
	static int D(int n) {
		return (n * 2) % 10000;
	}

	// S 연산
	static int S(int n) {
		return (n == 0) ? 9999 : n - 1;
	}

	// L 연산
	static int L(int n) {
		return (n % 1000) * 10 + (n / 1000);
	}

	// R 연산
	static int R(int n) {
		return (n / 10) + (n % 10) * 1000;
	}

	static boolean[] visited;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

		for (int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			// ↓ 여기서부터 BFS 로직 작성
			visited = new boolean[10000];
			Queue<Node> que = new LinkedList<>();
			que.add(new Node(A, "")); // 시작 숫자 A, 아직 명령어 없음
			visited[A] = true; // 같은 숫자는 다시 방문하지 않음

			while (!que.isEmpty()) {
				Node temp = que.poll();
				int start = temp.num;
				String path = temp.path;

				if (start == B) {
					sb.append(path).append('\n');
					break; // 찾으면 종료
				}

				int d = D(start);
				if (!visited[d]) {
					visited[d] = true;
					que.add(new Node(d, path + "D"));
				}
				int s = S(start);
				if (!visited[s]) {
					visited[s] = true;
					que.add(new Node(s, path + "S"));
				}
				int l = L(start);
				if (!visited[l]) {
					visited[l] = true;
					que.add(new Node(l, path + "L"));
				}
				int r = R(start);
				if (!visited[r]) {
					visited[r] = true;
					que.add(new Node(r, path + "R"));
				}
			}

		}
		System.out.println(sb);

	}

}
