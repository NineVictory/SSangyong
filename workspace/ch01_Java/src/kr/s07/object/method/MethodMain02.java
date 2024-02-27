package kr.s07.object.method;

public class MethodMain02 {
	
	/*
	 * [실습]
	 * 입력한 int형 정수값이 음수이면 -1을,0이면 0을, 양수이면 1을 반환
	 * 하는 signOf 메서드를 작성하자.
	 */
	
	public int signOf(int n) {
		if(n>0) {
			return 1;
			
		}else if (n == 0) {
			return 0;
		}else
			return -1;
	}
	/*강사님 코드
	 * public int signOf(int n) {
	 * int sigh = 0;
		if(n>0) {
			sigh = 1;
			
		}else if (n < 0) {
			sigh = -1;
		}
			return sigh;
	}
	 */
 	public static void main(String[] args) {
 		java.util.Scanner input =
 		new java.util.Scanner (System.in);
 		
 		System.out.print("정수 x:");
 		int x = input.nextInt();
		MethodMain02 so = new MethodMain02();
		int result = so.signOf(x);
		System.out.println("sighOf(x)는 "+result+"입니다");
		
		input.close();
	}
}
