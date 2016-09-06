package typecast;

public class Student {

	String number;		//학번-> 맨앞에0이 들어갈때 0이 의미가 있으므로 String을 쓴다.
	String name;		//이름
	boolean isEnrolled;	//등록여부
	float grade;		//평점
	String address;		//주소
	String major;		//전공
	int unit;			//이수학점
	boolean haveMinor;	//부전공 여부
	String juminNo;		//주민번호(-없이 13자리 숫자) -> 여자/남자 구별하는 0/1을 가져오기 쉽다
	String cellphone;	//핸드폰번호(-포함한 숫자)
	int age;			//나이
	String email;		//이메일 주소
	
}
