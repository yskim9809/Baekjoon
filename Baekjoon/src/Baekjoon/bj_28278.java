package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class bj_28278 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			String command = scanner.nextLine();
			String[] parts = command.split(" ");
			String cmd = parts[0];
			if (cmd.equals("1")) {
				stack.push(Integer.parseInt(parts[1]));
			} else if (cmd.equals("2")) {
				if (stack.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(stack.peek()).append("\n");
					stack.pop();
				}
			} else if (cmd.equals("3")) {
				sb.append(stack.size()).append("\n");
			} else if (cmd.equals("4")) {
				if (stack.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
			} else if (cmd.equals("5")) {
				if (stack.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(stack.peek()).append("\n");
				}
			}

		}
		System.out.println(sb);
	}

}
