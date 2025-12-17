package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class bj_25192 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashMap<String, Integer> chat = new HashMap<>();
		int count = 0;
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			if (s.equals("ENTER")) {
				chat.clear();
			} else {
				if (!chat.containsKey(s)) {
					chat.put(s, 1);
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
