package Baekjoon;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class bj_10845 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		Deque<Integer> que = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String str = scanner.nextLine();
			if (str.startsWith("push")) {
				int num = Integer.parseInt(str.split(" ")[1]);
				que.add(num);
			} else if (str.equals("pop")) {
				if (que.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(que.peek()).append("\n");
					que.poll();
					//sb.append(que.poll()).append("\n");
				}
			} else if (str.equals("size")) {
				sb.append(que.size()).append("\n");
			} else if (str.equals("empty")) {
				if (que.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
			} else if (str.equals("front")) {
				if (que.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(que.peek()).append("\n");
				}
			} else if (str.equals("back")) {
				if (que.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(que.peekLast()).append("\n");
				}
			}
		}
		System.out.print(sb.toString());
	}

}
