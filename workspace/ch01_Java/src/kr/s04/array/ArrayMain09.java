package kr.s04.array;

public class ArrayMain09 {
	public static void main(String[] args) {
		// main 의 데이터는 두 개의 정수
		// main 의 인자로 데이터를 전달하면 전달한 데이터의 자료형은
		// 모두 String 으로 인식하기 떄문에 +연산이 되지않고
		// 문자열 연결이 된다.
		System.out.println(args[0] + args[1]);
		System.out.println("-----------------------");
		
		//자료형을 String > int 로 바꾸어 연산이 가능하게 하는 방법
		int num = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println("합계 : "+ (num + num2));
		
		
		
		
		
		
		
		
		
		
	}
}