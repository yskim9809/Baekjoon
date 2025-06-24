package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class bj_10773 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int k = scanner.nextInt();
		int answer = 0;
		for (int i = 0; i < k; i++) {
			int n = scanner.nextInt();
			if (n == 0) {
				answer -= stack.peek();
				stack.pop();
			} else {
				answer += n;
				stack.push(n);
			}
		}
		System.out.println(answer);

	}

}
