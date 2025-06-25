package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class bj_12789 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 1;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			if (num == count) {
				count++;
			} else {
				stack.push(num);
			}
			while (!stack.isEmpty() && stack.peek() == count) {
				count++;
				stack.pop();
			}
		}
		System.out.println(stack.isEmpty() ? "Nice" : "Sad");

	}

}
