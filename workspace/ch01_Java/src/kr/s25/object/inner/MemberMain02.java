package kr.s25.object.inner;

class Outer2{
	//Outer2의 멤버 변수
	private int x = 100;
	//내부클래스(멤버 내부클래스)
	class Inner2{// <멤버로인식
		private int y = 200;
		
		public void make() {
			System.out.println("x = " + x); //outer2의 내부 클래스임으로 Member로 인식하기 때문에 호출이 가능하다.
			System.out.println("y = " + y);
		}
	}//멤버로인식>
}
public class MemberMain02 {
	public static void main(String[] args) {
		Outer2 ot = new Outer2();
		//내부 클래스 객체 생성
		Outer2.Inner2 oi = ot.new Inner2();
		oi.make();
		
	}
}
