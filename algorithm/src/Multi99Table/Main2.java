package Multi99Table;

//이중 루프를 사용하여 구구단 곱셈표를 출력하는 프로그램
public class Main2 {
	public static void main(String[] args) {
		System.out.println("구구단 곱셈표");

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i * j);
			System.out.println();

		}

	}

}
