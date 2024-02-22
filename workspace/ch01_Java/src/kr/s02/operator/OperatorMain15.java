package kr.s02.operator;

public class OperatorMain15 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 3개의 정수를 입력받아서 최대값, 최소값을 출력하는 프로그램을 작성하시오.
		 * 
		 * [입력예시]
		 * 첫번째 정수:10
		 * 두번째 정수:5
		 * 세번째 정수:7
		 * 
		 * [출력예시]
		 * 최대값:10
		 * 최소값:5
		 */
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		
		System.out.print("첫번째 정수:");
		int num1 = input.nextInt();
		System.out.print("두번째 정수:");
		int num2 = input.nextInt();
		System.out.print("세번째 정수:");
		int num3 = input.nextInt();
		
		int max; //최대값을 저장할 변수 선언
		int min; //최소값을 저장할 변수 선언
		
		max = num1 > num2 ? num1:num2; 
		min = num1 < num2 ? num1:num2;
		max = max > num3 ? max:num3;
		min = min < num3 ? min:num2;
		System.out.println("최대값:"+ max);
		
		System.out.println("최소값:"+min);
		input.close();
	}
}
