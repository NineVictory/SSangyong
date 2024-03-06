package kr.s24.object.enumtest;

//열거형 객체
enum Lesson {
	//열거형 상수
	//문자열 상수
	JAVA,XML,JSP //상수들을 그룹으로 묶어서 객체로 생성.
}

public class EnumMain02 {
	public static void main(String[] args) {
		//toString,name등을 쓰지않아도 됨
		System.out.println(Lesson.JAVA);
		System.out.println(Lesson.XML);
		System.out.println(Lesson.JSP);
		System.out.println("-------------------");
		//객체로 생성되기 때문에 부모클래스인 Object의 tostring메서드 호출 가능.
		System.out.println(Lesson.JAVA.toString());
		System.out.println(Lesson.XML.toString());
		System.out.println(Lesson.JSP.toString());
		System.out.println("-------------------");
		//열거 객체의 문자열을 반환 name() 역시 내장되어있는 메서드
		System.out.println(Lesson.JAVA.name());
		System.out.println(Lesson.XML.name());
		System.out.println(Lesson.JSP.name());
		System.out.println("-------------------");
		
		//열거 객체의 순번(0부터 시작)을 반환
		System.out.println(Lesson.JAVA.ordinal()); //.ordinal() ->    순번을 가져옴
		System.out.println(Lesson.XML.ordinal());
		System.out.println(Lesson.JSP.ordinal());
	}
}
