package ifpt;

public class Swap {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 30;
		// Q1: n1값이 항상 큰 값이 되도록, 필요할 경우 n1과 n2를 교체하라.

		if (n1 < n2) {
			// swap
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);

		// Q2: 최대값을 판별하는 조건을 완성해 보세요.
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;
//내가한거
		if (a1 >= a2 && a1 >= a3) {
			System.out.println(a1);
		} else if (a2 >= a3) {
			System.out.println(a2);
		} else {
			System.out.println(a3);
		}
//답
		if (a1 >= a2) {
			// a1이 a2보다 크거나 같은 경우
			if (a1 > a3) {
				System.out.println(a1);
			} else {
				System.out.println(a3);
			}
		} else {
			if (a2 > a3) {
				System.out.println(a2);
			} else {
				System.out.println(a3);
			}
		}

	}

}
