package Baekjoon;

import java.util.Scanner;

public class bj_25206 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double unitsum = 0; // 학점의 총합
		double ratingsum = 0; // 학점*과목평점 총합
		for (int i = 0; i < 20; i++) {
			String line = scanner.nextLine(); // 한 줄 통째로 받기
			String[] parts = line.split(" "); // 공백으로 나누기

			String sub = parts[0]; // 과목명
			double unit = Double.parseDouble(parts[1]); // 학점
			String rating = parts[2]; // 등급

			if (rating.equals("A+")) {
				unitsum += unit;
				ratingsum += unit * 4.5;
			} else if (rating.equals("A0")) {
				unitsum += unit;
				ratingsum += unit * 4.0;
			} else if (rating.equals("B+")) {
				unitsum += unit;
				ratingsum += unit * 3.5;
			} else if (rating.equals("B0")) {
				unitsum += unit;
				ratingsum += unit * 3.0;
			} else if (rating.equals("C+")) {
				unitsum += unit;
				ratingsum += unit * 2.5;
			} else if (rating.equals("C0")) {
				unitsum += unit;
				ratingsum += unit * 2.0;
			} else if (rating.equals("D+")) {
				unitsum += unit;
				ratingsum += unit * 1.5;
			} else if (rating.equals("D0")) {
				unitsum += unit;
				ratingsum += unit * 1.0;
			} else if (rating.equals("P")) {
				continue;
			} else if (rating.equals("F")) {
				unitsum += unit;
				ratingsum += unit * 0.0;
			}

		}
		System.out.println(ratingsum / unitsum);

	}

}
