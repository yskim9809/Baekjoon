package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class bj_1966 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); //

		int T = Integer.parseInt(br.readLine().trim());
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 문서 수
			int M = Integer.parseInt(st.nextToken()); // 타깃 인덱스

			int[] pri = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				pri[i] = Integer.parseInt(st.nextToken()); // 우선순위
			}

			// ↓ 여기서부터 로직 작성
			// N, M, pri[] 사용

			Deque<int[]> que = new ArrayDeque<>();

			int[] cnt = new int[10];// 우선순위 배열, que에 남아있는 각각의 우선순위들 개수를 저장

			for (int i = 0; i < N; i++) {
				que.add(new int[] { pri[i], i }); // 우선순위, 인덱스
				cnt[pri[i]]++;
			}

			int current = 9;
			while (current > 0 && cnt[current] == 0)
				current--; // 가장 높은 우선순위 찾아놓기

			int printed = 0;
			while (!que.isEmpty()) {
				int[] head = que.poll();
				int p = head[0];
				int idx = head[1];

				if (p < current) {
					que.add(head); // 우선순위에 밀려서 다시 뒤로
					continue;
				} else {
					printed++;
					cnt[p]--;
					if (idx == M) {
						sb.append(printed).append('\n');
						break;
					}
				}
				while (current > 0 && cnt[current] == 0)
					current--; // current 갱신

			}

		}
		System.out.println(sb);

	}

}
