package kr.s01.basic;

public class VariableMain02 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 정수를 담을 수 있는 변수 3개를 지정한다.
		 * 변수명은 각각 a,b,c 라고 지정하고 원하는 정수로 초기화한다.
		 * a + b 연산 후 출력할 떄 
		 * 
		 * [출력예시]
		 * 결과 = 50 형식으로 출력한다.
		 * 
		 * c 에 저장 된 데이터를 80으로 변경한다.
		 * c = 80 형식으로 출력한다.
		 * 
		 */
		
		int a = 20, b = 30, c = 40;
		System.out.printf("결과 = %d%n",a + b);
		c = 80;
		System.out.printf("c = %d", c);
		

	}
}
