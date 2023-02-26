package PrimeNumber1;

public class Main {
	public static void main(String[] args) {
		int counter = 0;

		for (int n = 2; n <= 1000; n++) {
			int i;

			for (i = 2; i < n; i++) {
				counter++;

				if (n % i == 0)
					break;

			}
			if (n == i)
				System.out.println(n);
		}

		System.out.println("나눗셈을 수행한 횟수 : " + counter);

	}

}

//안쪽 for 문에서 i값은 2,3 ....8로 증가합니다
//9는 i가 3일 때 나누어떨어지므로 break 문이 동작하여 for문의 반복이 중단됩니다.
//따라서 나눗셈은 '2,3' 2회만 진행됩니다. for문을 벗어날 떄 i값은 3입니다.
