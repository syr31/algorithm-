package CardConv;

import java.util.Scanner;

class Main {

	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r);		// 나누고 남은 나머지
			x /= r;		// 나눈 값

		} while (x != 0);

		for (int i = 0; i < digits / 2; i++) {		//역순 정렬
			char t = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = t;
		}

		return digits;

	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no; // 변환하는 정수  
		int cd; // 기수	"몇 진수로 변환"
		int dno; // 변환 후의 자릿수
		int retry; // 다시 한번?
		char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어두는 문자 배열

		System.out.println("10진수를 기수 변환합니다.");

		do {
			do {
				System.out.print("변환하는 음이 아닌 정수");
				no = stdIn.nextInt();
			} while (no < 0);

			do {
				System.out.print("어떤 진수로 변환할까요? (2 ~ 36)");
				cd = stdIn.nextInt();
			} while (cd < 2 || cd > 36);

			dno = cardConv(no, cd, cno);

			System.out.print(cd + "진수로");

			for (int i = 0; i < dno; i++)
				System.out.print(cno[i]);
			System.out.println("입니다.");

			System.out.print("한 번 더 할까요? (예1 / 아니오2)");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
