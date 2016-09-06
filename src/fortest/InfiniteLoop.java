package fortest;

public class InfiniteLoop {

	public static void main(String[] args) {
		// for(;;) {
		//
		// }

		int i = 0;
		int sum = 0;

		while (true) {

			if (i > 1000) {
				break;
			}
			sum += i;
			i++;
		}
		System.out.println(sum);

	}

}
