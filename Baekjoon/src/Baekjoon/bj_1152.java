package Baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class bj_1152 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// 1152 StringTokenizer: 분리 기준으로 공백을 지정하면 나눠서 토큰에 저장

		String s = in.nextLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		System.out.println(st.countTokens());

	}

}
