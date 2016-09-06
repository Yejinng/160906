package whiletest;

public class Gugudan02 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 9) {
			
			int j = 1;
			while (j <= 9) {
				System.out.print(j + "X" + i + "=" + (i * j) +"\t");
				j++;
			}
			System.out.println(i + "X" + j + "=" + (i * j));
			i++;
		}
	}

}
