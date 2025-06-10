package Baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class bj_14425 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<String> set = new HashSet<>();
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.nextLine(); // 엔터 날리기!
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			set.add(scanner.nextLine());
		}
		for (int i = 0; i < m; i++) {
			String s = scanner.nextLine();
			if (set.contains(s)) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
