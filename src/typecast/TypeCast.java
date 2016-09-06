package typecast;

public class TypeCast {

	public static void main(String[] args) {
		//implicity(암시적) type casting
		int i = 10;
		long l = i;
		
		System.out.println( i + ":" + l );
		
	/*
	 * long을 int보다 먼저 오게하면
	 * long l2 = 123456789;
	 * int i2 = l2;  -->오류난다
	 * long 이 더 기니까 int에 안들어가서 
	 */
		
		//explicity(명시적) type casting
		long l2 = 123456789;
		int i2 = (int)l2;
	
		System.out.println( i2 + ":" + l2 );

	}

}
