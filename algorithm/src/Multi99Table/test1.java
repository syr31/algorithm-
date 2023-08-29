package Multi99Table;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;

		do {
			no = sc.nextInt();
		} while (no < 0);

		for (int i = 1; i <= no; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
