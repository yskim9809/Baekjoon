package Baekjoon;

import java.util.Scanner;

public class bj_1085 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int w = scanner.nextInt();
		int h = scanner.nextInt();
		int a = w - x;
		int b = h - y;
		int answer = (a > b) ? b : a;
		answer = (x > answer) ? answer : x;
		answer = (y > answer) ? answer : y;
		System.out.println(answer);
	}

}
