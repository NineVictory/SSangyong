package kr.s05.object.field;

public class Player01 {//클래스명:Player01
	//멤버 필드(속성)
	String name;
	int age;
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		Player01 p = new Player01(); //클래스명 하고 일치함. 왼쪽은 참조 자료형이라고함. 오른쪽은 생성사
		
		//객체의 멤버 변수에 값을 할당
		p.name = "홍길동";
		p.age = 30;
		
		System.out.println("연주자의 이름 :" + p.name);
		System.out.println("연주자의 나이 :" + p.age);
	}
}
