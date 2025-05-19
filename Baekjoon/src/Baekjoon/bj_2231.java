package Baekjoon;

import java.util.Scanner;

public class bj_2231 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			String a = Integer.toString(i);
			int sum = 0;
			String[] arr = a.split("");
			if(i==n) { 
				System.out.println(0);
				break;
			}
			for (int j = 0; j < arr.length; j++) {
				sum += Integer.parseInt(arr[j]);
			}
			if (sum + i == n) {
				System.out.println(i);
				break;
			} else {
				continue;
			}
		}

	}

}
/*
for (int i = 1; i <= n; i++) {
    int sum = i;
    int temp = i;
    while (temp > 0) {
        sum += temp % 10;
        temp /= 10;
    }
    if (sum == n) {
        System.out.println(i);
        return;
    }
}
System.out.println(0); 
*/
