package Baekjoon;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj_28279 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		Deque<Integer> que = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String str = scanner.nextLine();
			if (str.startsWith("1")) {
				StringTokenizer st = new StringTokenizer(str);
				st.nextToken();
				int num = Integer.parseInt(st.nextToken());
				que.addFirst(num);
			} else if (str.startsWith("2")) {
				StringTokenizer st = new StringTokenizer(str);
				st.nextToken();
				int num = Integer.parseInt(st.nextToken());
				que.add(num);
			} else if (str.equals("3")) {
				sb.append(que.isEmpty() ? -1 : que.poll()).append("\n");
			} else if (str.equals("4")) {
				sb.append(que.isEmpty() ? -1 : que.pollLast()).append("\n");
			} else if (str.equals("5")) {
				sb.append(que.size()).append("\n");
			} else if (str.equals("6")) {
				sb.append(que.isEmpty() ? 1 : 0).append("\n");
			} else if (str.equals("7")) {
				sb.append(que.isEmpty() ? -1 : que.peek()).append("\n");
			} else if (str.equals("8")) {
				sb.append(que.isEmpty() ? -1 : que.peekLast()).append("\n");
			}
		}
		System.out.print(sb.toString());

	}

}
