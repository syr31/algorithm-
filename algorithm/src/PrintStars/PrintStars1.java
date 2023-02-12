package PrintStars;

import java.util.Scanner;

public class PrintStars1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n, w = 0;

		System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");

		do {

			System.out.print("n값 : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		do {
			System.out.print("w값 : ");
			w = stdIn.nextInt();
		} while (w <= 0 || w > n);

		for (int i = 0; i < n; i++) {
			System.out.print("*");

			if (i % w == w - 1)		// 1
				System.out.println();
		}
			if (n % w != 0)			// 2
			System.out.println();
	}
}

//이 프로그램은 변수 i 값을 1씩 증가시키면서 *를 출력합니다.
//줄 바꿈은 다음과 같이 두 곳에서 실행합니다. 
//1 : for문에서 변수 i 값을 w 값으로 나눈 나머지가 w - 1 일 때 줄 바꿈을 합니다.
// w값이 5라면 i값이 4, 9, 14 일 때 줄 바꿈을 합니다.

//2 : n값이 w값의 배수이면 15번째 *를 출력한 뒤에 마지막 줄 바꿈을 하면 됩니다.
// 그러나 n값이 w값의 배수가 아니라면 마지막 줄 바꿈은 2에서 합니다. 
// 즉, 여기서는 n값이 w값의 배수가 아닐 때만 줄 바꿈을 합니다.
