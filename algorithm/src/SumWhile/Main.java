package SumWhile;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int i = 1;

		int n = sc.nextInt();

		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
