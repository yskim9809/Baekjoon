package Baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class bj_11478 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length() + 1; j++) {
				set.add(str.substring(i, j));
			}
		}
		System.out.println(set.size());

	}

}
