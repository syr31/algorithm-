package Alternative1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			if (i % 2 == 0) {
				System.out.print("+");
			} else {
				System.out.print("-");
			}

		}

	}

}
