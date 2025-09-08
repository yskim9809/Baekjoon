package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class bj_1935 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()); // 피연산자 개수
		String expr = br.readLine(); // 후위 표기식 문자열

		double[] values = new double[N]; // A, B, C... 에 대응하는 값 저장

		for (int i = 0; i < N; i++) {
			values[i] = Double.parseDouble(br.readLine());
		}

		Stack<Double> stack = new Stack<>();

		for (char c : expr.toCharArray()) {
			if ('A' <= c && c <= 'Z') {
				// 알파벳이면 대응하는 값 push
				stack.push(values[c - 'A']); // 알파벳순서 ->인덱스번호
			} else {
				// 연산자면 스택에서 두 개 꺼내서 계산
				double b = stack.pop(); // 뒤에 꺼낸 값
				double a = stack.pop(); // 앞에 꺼낸 값
				double res = 0;

				switch (c) {
				case '+':
					res = a + b;
					break;
				case '-':
					res = a - b;
					break;
				case '*':
					res = a * b;
					break;
				case '/':
					res = a / b;
					break;
				}
				stack.push(res);
			}
		}
		double answer = stack.pop();
		System.out.printf("%.2f\n", answer); // 소수 둘째자리까지 출력

	}

}
