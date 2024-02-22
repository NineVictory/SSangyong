package kr.s02.operator;

public class OperatorMain13 {
	public static void main(String[] args) {
		/*
		 * 실습
		 *키보드에서 입력한 정수값에 마지막 자리수를 제외한 값과 마지막 자리수를 표시하시오.
		 *
		 *[입력예시]
		 *정수값:123
		 *[출력예시]
		 *마지막 자릿수를 제외한 값:12
		 *마지막 자릿수:3
		 */		
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		System.out.print("정수값:");
		int num = input.nextInt();
		int b = num/10;
		int c = num%10;
		
		System.out.println("마지막 자릿수를 제외한 값:"+b);
		System.out.println("마지막 자릿수:" +c);
		input.close();
		
		
	}
}
