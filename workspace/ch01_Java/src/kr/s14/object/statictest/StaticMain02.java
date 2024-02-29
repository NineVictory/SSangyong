package kr.s14.object.statictest;


class StaticMethod {
	//인스턴스변수
	String s1 ="행복";
	//static(클래스)변수
	static String s2 = "행운";
	
	//static(클래스) 메서드
	public static String getString() {
		return s2; //s1을 호출하면 에러. s1은 메모리가 올라가지않기 때문에
	}
}

public class StaticMain02 {
	public static void main(String[] args) {
		//static메서드는 객체 생성 없이 호출할 수 있고 클래스명.메서드명의 형태로 호출
		System.out.println(StaticMethod.getString());
		//static 변수는 클래스명.변수명의 형태로 호출
		System.out.println(StaticMethod.s2);
		
		//인스턴스 변수를 호출하기 위해서는 먼저 객체 생성 후 
		//참조변수.변수명 형태로 호출
		StaticMethod sm = new StaticMethod();
		System.out.println(sm.s1);
		//System.out.println(StaticMethod.s1); 은 오류가 발생
	}
}
