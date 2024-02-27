package kr.s07.object.method;

public class MethodMain01 {
	//반환하는 데이터가 있는 경우
		 //int = 반환형
	public int add(int a, int b) { //add는 메서드명. a와b는 인자. 
		return a+b;//반환하는 데이터
	}
	//반환하는 데이터가 없는 경우 void를 사용
	public void print(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		MethodMain01 method = new MethodMain01();
		//객체의 멤버 메서드 호출
		int result = method.add(5, 8);
		System.out.println("result =" + result);
		
		method.print("오늘은 월요일");
	}
}
 