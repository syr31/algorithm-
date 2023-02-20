package MaxOfArray;

import java.util.Scanner;

public class Main {

	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];
		return max;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");

		int num = stdIn.nextInt();

		int[] height = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("height[" + i + "]:");

			height[i] = stdIn.nextInt();
		}

		System.out.println("최댓값은" + maxOf(height) + "입니다.");

	}
}

//이 프로그램에서 배열 "height"의 요소가 나타내는 것은 사람의 '키' 입니다.
//main 메서드에서는 먼저 사람 수를 변수 "num"에 읽어 들이고, "num"인 배열 "height"를 생성합니다.
//지금까지의 프로그램과는 달리 각 요소에 넣을 값을 읽어 들인 후 배열 "height"를 메서드 maxOf에 전달하고 
//메서드가 반환한 최댓값을 출력합니다.
