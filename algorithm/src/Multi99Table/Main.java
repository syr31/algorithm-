package Multi99Table;

public class Main {
	public static void main(String[] args) {
		System.out.println("----구구단----");

		for (int i = 1; i <= 9; i++) { // 1
			for (int j = 1; j <= 9; j++) { // 2

				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
		System.out.println("-----------------------");

	}
}

// 변수 i(1) 값이 1~9까지 증가하면서 행은 9번 반복합니다.
//각각의 반복에서 변수 j(2) 값이 1~9까지 증가하면서 열은 9번 반복합니다.
//열의 반복을 종료한 후 줄 바꿈 문자인 System.out.println();을 출력하고
//그 다음 행으로 이동합니다.
