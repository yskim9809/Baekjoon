package Baekjoon;

import java.util.Scanner;

public class bj_2903 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = 1;
		for(int i=0; i<n; i++) {
			k*=2;
		}
		System.out.println((k+1)*(k+1));

	}

}
