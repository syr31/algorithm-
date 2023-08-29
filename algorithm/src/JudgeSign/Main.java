package JudgeSign;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세요.");

		int n = stdIn.nextInt();

		if (n > 0) {
			System.out.print("이 수는 양수입니다.");
		} else if (n < 0) {
			System.out.print("이 수는 음수입니다.");
		} else {
			System.out.print("이 수는 0입니다.");
		}

	}

}
