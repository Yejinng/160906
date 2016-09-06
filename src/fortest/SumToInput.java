package fortest;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력> ");
		int num = scanner.nextInt();
		int sum = 0;

		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		System.out.println("합은" + sum);
		scanner.close();
	}

}
