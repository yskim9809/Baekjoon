package Baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class bj_1764 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.nextLine();
		HashSet<String> set = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(scanner.nextLine());
		}
		for (int i = 0; i < m; i++) {
			String name = scanner.nextLine();
			if (set.contains(name)) {
				set2.add(name);
			}
		}
		ArrayList<String> arr = new ArrayList<>(set2);
		Collections.sort(arr);
		System.out.println(arr.size());
		for (String name : arr) {
			System.out.println(name);
		}

	}

}
