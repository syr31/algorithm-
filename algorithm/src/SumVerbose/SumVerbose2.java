package SumVerbose;

import java.util.Scanner;

public class SumVerbose2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sum = 0;

		for (int i = 0; i <= n - 1; i++) {
			System.out.print(i + "+");
			sum += i;
		}

		System.out.print(n + "=");
		sum += n;
		System.out.print(sum);

	}

}
