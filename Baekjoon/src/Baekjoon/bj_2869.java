package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken()); // 올라가는길이
		int b = Integer.parseInt(st.nextToken()); // 미끄러지는 길이
		int v = Integer.parseInt(st.nextToken()); // 나무 길이

		int day = (v - b) / (a - b); // 마지막에 미끄러짐 없이 다 올라갈 수 있을때 날짜

		if ((v - b) % (a - b) != 0) // 조금 남았을때 날짜
			day++;

		System.out.println(day);

	}

}
