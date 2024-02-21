package kr.s03.operation;

public class IfMain05 {	
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 정수 하나를 입력하여 짝수면 10을 더하고 홀수면 20을 더하여
		 * 결과값을 출력하시오.
		 * [입력예시]
		 * 정수 하나 입력:5
		 * 
		 * [출력예시]
		 * 결과:25
		 */
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		System.out.print("정수 하나 입력:");
		int num = input.nextInt();
		int result = 0;
		
		if(num%2==0) {
			result = num+10;
			
		}
		else {
			result = num+20;
		}
		System.out.printf("결과:%d%n", result);
		input.close();
	}
}
