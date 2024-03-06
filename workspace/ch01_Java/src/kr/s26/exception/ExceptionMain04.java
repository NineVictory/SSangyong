package kr.s26.exception;

public class ExceptionMain04 {
	public static void main(String[] args) {
		/*
		 * <멀티 catch>
		 * 하나의 catch블럭에서 여러개의 예외를 처리할 수 있도록
		 * 예상되는 예외 클래스를 여러 개 명시하는 방식
		 */
		try {
			int value1 = Integer.parseInt(args[0]);
			int value2 = Integer.parseInt(args[1]);
			int result = value1 + value2;
			System.out.println(value1 + "+" + value2 + "=" + result);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) { // ||가 아닌 | 1개로 or의 개념을 사용한다.
			//System.out.println("실행 매개값의 수가 부족하거나 숫자를 변환할 수 없습니다.");
			
			//예외정보제공
			//System.out.println(e.toString());
			
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("알 수 없는 예외 발생");
		}
	}
}
