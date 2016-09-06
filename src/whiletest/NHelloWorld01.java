package whiletest;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in);
		System.out.print("횟수입력>");
		int count = scanner.nextInt();
		
		int i = 0;
		while (i < count )	{
			System.out.println("Hello World");
			i++;
		}
		scanner.close();
		

	}

}
