package PrintStar1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, w;

		do {
			System.out.println("n값 : ");
			n = sc.nextInt();
		} while (n <= 0);

		do {
			System.out.println("w값 : ");
			w = sc.nextInt();

		} while (w <= 0 || w > n); // w값이 0보다 크거나 같고 n값이 w값보다 클 때 (w값이 n값보다 크게 되면 줄 바꿈을 할 수가 없다.)

		for (int i = 0; i < n; i++) {
			System.out.print("*");

			if (i % w == w - 1) // for문에서 변수 값 i값을 w값으로 나눈 나머지가 w-1 일 때 줄바꿈을 합니다.
								// ex) w값이 5라면 i값이 4,9,14일 때 줄 바꿈을 합니다.
				System.out.println();
		}
		if (n % w != 0) // n값이 w값의 배수가 아니라면 마지막 줄 바꿈은 여기서 합니다. 즉 여기서는 n값이 w값의 배수가 아닐 때만 줄 바꿈을 합니다.
			System.out.println();
	}
}