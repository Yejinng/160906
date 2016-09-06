package 연산자;

public class Arith2 {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 3;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a >= b);

		System.out.println(a == b && a > b);
		System.out.println(a != b && a > b);
		System.out.println(a == b || a > b);
		System.out.println(a == b || a < b);

		System.out.println(a + 1 * b++ > 10 && b++ * 10 - 3 > 10);
		System.out.println((((a + 1) * b++) > 10) && ((b++ * (10 - 3)) > 10));
		//헷갈리면 괄호!!
	}

}
