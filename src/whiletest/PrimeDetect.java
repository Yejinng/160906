package whiletest;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자: ");
		int num = scanner.nextInt();
		
		int i = 0;
		int divisor = 2;
		boolean isPrime = true;

		while ( num > divisor ){
			i = num % divisor ;
			divisor ++;
			
		}
			
		
		if (i != 0) {
			System.out.println(num + "은 소수입니다.");
		} else {
			System.out.println(num + "은 소수가 아닙니다.");

			scanner.close();
		}


	}

}
