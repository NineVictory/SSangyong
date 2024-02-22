package kr.s02.operator;

public class OperatorMain06 {
	public static void main(String[] args) {
		System.out.println("==비교(관계)연산자===");
		boolean result;
		int a = 10;
		double b = 10.5;
		
		result = a < b; // <는 비교연산자(4순위), = 은 대입연산자(8순위)
		System.out.println("a<b:"+result);
		
		result = a > b;
		System.out.println("a>b:"+result);
		
		result = a >= b;
		System.out.println("a>=b:"+result);
		
		result = a <=b;
		System.out.println("a<=b:"+result);
		
		result = a==b;
		System.out.println("a==b:"+result);
		
		result = a!=b;
		System.out.println("a!=b:"+result);
	}
}
