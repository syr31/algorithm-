package Multi99Table;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		for (int i = 0; i < no; i++) {
			for (int j = 0; j < no; j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
