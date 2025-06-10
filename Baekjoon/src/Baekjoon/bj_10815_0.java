package Baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class bj_10815_0 { // 통과

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		StringBuilder sb = new StringBuilder();
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(scanner.nextInt());
		}
		int m = scanner.nextInt();
		for (int i = 0; i < m; i++) {
			int num = scanner.nextInt();
			if (set.contains(num)) {
				sb.append("1 ");
			} else {
				sb.append("0 ");
			}
		}
		System.out.println(sb);
	}

}
