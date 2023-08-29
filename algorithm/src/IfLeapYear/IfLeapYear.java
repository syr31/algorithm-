package IfLeapYear;

public class IfLeapYear {

	public static void main(String[] args) {

		for (int year = 1998; year < 2006; year++) { // int year에 1998 대입, 2006 미만까지 year가 증가, year++

			boolean yearTF = false;

			if ((0 == (year % 4) && 0 != (year % 100)) || 0 == year % 400) {
				// 윤년을 구하는 식 ex)4로 나누어 떨어지면 윤년, 4로 나누어 떨어지더라도 100으로 나누어 떨어지면 평년
				// 400으로 나누어 떨어지면 윤년

				yearTF = true; // true이면 윤년
			} else {
				yearTF = false;
			}
			if (yearTF) {
				System.out.println(year + "는 윤년입니다.");
			} else {
				System.out.println(year + "는 윤년이 아닙니다.");
			}
		}
	}
}
