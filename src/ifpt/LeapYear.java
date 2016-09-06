package ifpt;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2003;

		if (year % 4 == 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("윤년이 아닙니다.");
		}

		int year2 = 2003;

		if (year2 % 4 != 0) {
			System.out.println(year2 + " 은 윤년이 아닙니다:(");
		} else if (year2 % 100 != 0) {
			// 4로 나누어 떨어지고 100으로 나누어 떨어지지 않으면
			System.out.println(year2 + " 은 윤년입니다:)");
		} else if (year2 % 400 != 0) {
			// 4로 나누어 떨어지고 100으로도 나누어 떨어지면
			System.out.println(year2 + " 은 윤년이 아닙니다:(");
		} else {
			System.out.println(year2 + " 은 윤년입니다:)");
		}

		int value = 10;
		if (value % 2 == 0) {
			System.out.println("짝수입니다.");
		} else	{
			System.out.println("짝수가 아닙니다.");
		}
	}

}
