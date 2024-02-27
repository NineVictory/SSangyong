package kr.s05.object.field;

public class Police01 {
	//맵버 필드(속성)
	String name;
	int age;
	
	public static void main(String[] args) {
		//객체선언 및 객체생성
		Police01 police = new Police01();
		
		
		//객체의 맴버 변수에 값 할당
		police.name = "김유신";
		police.age = 45;
		
		//객체의 맴버 변수에 저장된 값을 출력
		System.out.println("경찰의 이름 : "+ police.name);
		System.out.println("경찰의 나이 : "+ police.age);
	}
}