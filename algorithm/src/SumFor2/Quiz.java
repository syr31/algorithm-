package SumFor2;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int num = 0;

		if (a >= b) {
			System.out.print("a보다 큰 값을 입력하세요");

		} else {
			num = b - a;
			System.out.print("a-b는" + num + "입니다.");
		}

	}

}
