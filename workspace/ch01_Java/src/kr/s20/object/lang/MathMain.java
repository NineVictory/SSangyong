package kr.s20.object.lang;

public class MathMain {
	public static void main(String[] args) {
		//절대값 처리
		int a = Math.abs(-10);
		System.out.println("절대값:"+ a);
		
		//소수첨 올림처리
		double b = Math.ceil(3.3);
		System.out.println("올림처리"+b);
	
		//소수점 버림처리
		double c = Math.floor(3.7);
		System.out.println("버림"+c);
		
		//반올림 처리    round() 괄호안에는 무조건 floor 만 가능 double 안됨
		int d = Math.round(3.7f);
		System.out.println("반올림:"+d);
		
		//2개값 크기 비교
		int e = Math.max(3,5);
		System.out.println("최대값:"+e);
		
		int f = Math.min(4, 7);
		System.out.println("최소값:"+f);
	}
}
