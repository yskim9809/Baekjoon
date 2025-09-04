package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class bj_18870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		Set<Integer> set = new HashSet<>(); // 이미 정렬된 TreeSet<>(); 사용해도 되지만 list변환은 필요
		st = new StringTokenizer(br.readLine());

		for (int t = 0; t < n; t++) {
			arr[t] = Integer.parseInt(st.nextToken());
			set.add(arr[t]);
		}
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i), i); // list.indexOf 시간초과
		}

		for (int x : arr) {
			sb.append(map.get(x)).append(" ");
		}

		System.out.println(sb);
	}

}
