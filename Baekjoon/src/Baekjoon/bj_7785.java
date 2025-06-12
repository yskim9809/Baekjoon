package Baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class bj_7785 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<String> set = new HashSet<>();
		int n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			String line = scanner.nextLine();
			String[] part = line.split(" ");
			String name = part[0];
			String log = part[1];
			if (log.equals("enter")) {
				set.add(name);
			} else if (log.equals("leave")) {
				set.remove(name);
			}
		}
		ArrayList<String> arr = new ArrayList<>(set);
		Collections.sort(arr, Collections.reverseOrder());
		for (String name : arr) {
			System.out.println(name);
		}

	}

}
