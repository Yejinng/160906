package 연산자;

public class Arith {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		System.out.println( a + b);
		System.out.println( a - b);
		System.out.println( a * b);
		System.out.println( a / b);
		System.out.println( a % b);	//나머지 연산

		
		//같은 연산 다른 표현방법
		a = a + 1;
		System.out.println(a);
		
		a += 1;
		System.out.println(a);
		
		a++;
		System.out.println(a);

		++a;
		System.out.println(a);
		
		
		//순서차이
		System.out.println(a++);
		//System.out.println(a);
		//a++:
		//출력이 된다음에 12로 증가 (후위연산자)
		
		System.out.println(++a);
		//++a;
		//System.out.println(a);
		//13으로 증가한 다음에 출력 (전위연산자)
		
		//나누기연산
		System.out.println(10/3);
		System.out.println(10./3.);
		System.out.println(10./3);
		
		System.out.println((double)10/3);
		System.out.println((double)(10/3));	//정수정수로 나눈 결과를 double로 받아줌
		
		//나머지연산
		System.out.println(44%3);
		System.out.println(-7%3);
		System.out.println(7%-3);



	}

}
