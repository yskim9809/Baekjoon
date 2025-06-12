package Baekjoon;

import java.util.HashMap;
import java.util.Scanner;

public class bj_1620 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.nextLine();
		String[] arr = new String[n + 1]; // 인덱스번호로 이름 찾기
		HashMap<String, Integer> map = new HashMap<>();// 이름으로 번호 찾기
		for (int i = 1; i < n + 1; i++) {
			String mon = scanner.nextLine();
			arr[i] = mon;
			map.put(mon, i);
		}
		for (int i = 0; i < m; i++) {
			String mon = scanner.nextLine();
			if (isNumber(mon)) { // 번호로 물어불 때
				int num = Integer.parseInt(mon);
				System.out.println(arr[num]);
			} else { // 이름으로 물어볼 때
				System.out.println(map.get(mon));
			}
		}

	}

	private static boolean isNumber(String mon) {
		try {
			Integer.parseInt(mon);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
