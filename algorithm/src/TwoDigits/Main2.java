package TwoDigits;

import java.util.Scanner;

//2자리 양수를 입력받아 출력하는 프로그램
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;

		do {
			System.out.print("n값 : ");
			no = sc.nextInt();

		} while (no < 10 || no > 99);// no이 10보다 작거나 no 99보다 크면 걸러낸다.
										// no이 10보다 작은 수 혹은 no이 99보다 큰 수가 입력되면 다시 do가 실행된다.

		System.out.print(no);
	}

}
