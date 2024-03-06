package kr.s25.object.inner;

public class StaticMain {
	//static 내부 클래스
	//static 내부클래스를 포함한 클래스를 먼저 객체 생성하는 것이 아니라 static 내부 클래스를 단독으로 객체 생성해서 사용
	public static class Inner{//static을 빼면 그냥 멤버 내부 클래스임.
		//인스턴스 변수
		int iv = 100;
		//static 변수
		static int cv = 200;
		//static 메소드
		public static void make() {
			System.out.println("핳핳");
		}
	}
	
	public static void main(String[] args) {
		//static 내부클래스 객체 생성
		Inner i = new Inner(); //static을 사용했기 때문에 외부클래스 생성 후 내부클래스 생성을 하지 않아도 된다. 내부만생성하면됨.
		//인스턴스 변수 호출
		System.out.println(i.iv);
		//static 변수 호출(클래스 명을 붙여서 호출) -> static이라 위에 객체 생성이 없어도 호출가능
		System.out.println(Inner.cv);
		//static 메소드 호출
		Inner.make();
	
	}
}
