package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class bj_10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Deque<Integer> dq = new ArrayDeque<>();

		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			String s = br.readLine();

			char c0 = s.charAt(0);
			if (c0 == 'p') {
				// push_* or pop_*
				if (s.charAt(1) == 'u') { // push
					// "push_front X" or "push_back X"
					int x = Integer.parseInt(s.substring(s.lastIndexOf(' ') + 1));
					if (s.charAt(5) == 'f')
						dq.addFirst(x); // push_front
					else
						dq.addLast(x); // push_back
				} else {
					// pop_front / pop_back
					if (s.charAt(4) == 'f') { // pop_front
						sb.append(dq.isEmpty() ? -1 : dq.pollFirst()).append('\n');
					} else { // pop_back
						sb.append(dq.isEmpty() ? -1 : dq.pollLast()).append('\n');
					}
				}
			} else if (c0 == 's') {
				sb.append(dq.size()).append('\n'); // size
			} else if (c0 == 'e') {
				sb.append(dq.isEmpty() ? 1 : 0).append('\n'); // empty
			} else if (c0 == 'f') {
				sb.append(dq.isEmpty() ? -1 : dq.peekFirst()).append('\n'); // front
			} else { // 'b' : back
				sb.append(dq.isEmpty() ? -1 : dq.peekLast()).append('\n'); // back
			}
		}
		System.out.print(sb.toString());
	}

}
