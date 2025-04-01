package Baekjoon;

import java.util.Scanner;

public class bj_10798 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] arr = new String[5][];
		
		for(int i=5; i>0; i--) {
			String str = scanner.nextLine();
			String[] spl = str.split("");
			for(int j=0; j<spl.length; j++) {
				arr[i][j] = spl[j];
			}
		}

	}

}
