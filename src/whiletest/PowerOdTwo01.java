package whiletest;

import java.util.Scanner;

public class PowerOdTwo01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );

		
		System.out.print("승수: ");

		int pow = scanner.nextInt();
		int i =0;
		int result = 1;
		// Q: 아래 while 반복문을 작성하시오.
		while( pow > i )	{
			result = result * 2;
					i++;
		}
		
		
		System.out.println("2의 " + pow + "승은 " + result + "입니다.");
		
		scanner.close();

	}

}
