package Baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class bj_1269 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		HashSet<Integer> seta = new HashSet<>();
		HashSet<Integer> setb = new HashSet<>();
		for (int i = 0; i < n; i++) {
			seta.add(scanner.nextInt());
		}
		for (int i = 0; i < m; i++) {
			setb.add(scanner.nextInt());
		}
		int counta = 0;
		int countb = 0;
		for (int num : seta) {
			if (!setb.contains(num)) {
				counta++;
			}
		}
		for (int num : setb) {
			if (!seta.contains(num)) {
				countb++;
			}
		}
		System.out.println(counta + countb);

	}

}
