package TriangleLB;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력합니다.");

		do {

			System.out.print("몇 단 삼각형입니까?");
			n = stdIn.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) { // 1
			for (int j = 1; j <= i; j++) { // 2
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//바깥쪽 (1) for문은 변수 i값을 1부터 n까지 증가시킵니다.
// 이것은 삼각형의 각 행에 대응하는 세로 방향을 반복합니다.
// 안쪽 for문은 변수 j값을 1부터 i까지 증가시키면서 출력합니다.
