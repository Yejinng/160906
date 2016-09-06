package whiletest;

import java.util.Scanner;

public class PrimeDetectKey {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자: ");
		int num = scanner.nextInt();

		int i = 2;
		boolean isPrime = true;
	while(i<num) {
		int result = num % i;
		if (result == 0) {
			// 소수가 아님
			isPrime = false;
		}
		//System.out.println(num + ":" + i); 이건 확인용
		i++;
	}
	
	if(isPrime){
		System.out.println(num + "소수입니다");
	}else{
		System.out.println(num + "소수가 아닙니다");
	}

}
}
