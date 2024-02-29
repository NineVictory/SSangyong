package kr.s19.object.finaltest;

class A{
	//멤버 필드
	final int NUM = 10; //상수
	//상수는 일반적으로 대문자로 많이 사용한다.~~!~!~!~!~!~~!~!~!!~
	public static final int NUMBER = 20; //static이기 때문에 객체 생성 없이 호출가능
	// 스태틱을 사용한 상수를 주로 가장 많이 사용한다.
}
public class FinalMain01 {
	public static void main(String[] args) {
		A ap = new A();
		//ap.NUM = 20; //상수는 변경이 불가능하기에 에러가 발생한다.
		System.out.println(ap.NUM);
		
		//static 상수 호출
		System.out.println(A.NUMBER);//static이기 때문에 객체 생성 없이 호출가능
		
		final int NO =30;
		System.out.println(NO);
	}
}
