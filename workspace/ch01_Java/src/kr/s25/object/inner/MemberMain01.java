package kr.s25.object.inner;

class Outer{
	//Outer 클래스의 멤버 변수
	int x = 100;
	
	//내부 클래스(멤버 내부클래스)Member 변수나 멤버 메서드들과 같이 클래스가 정의된 경우
	class Inner{
		//Inner의 멤버 변수
		int y = 200;
		
	}
}
	public class MemberMain01 {
		public static void main(String[] args) {
			Outer ot = new Outer();
			//Outer 내부클래스인 Inner 클래스를 객체 생성
			Outer.Inner oi  = ot.new Inner(); //Outer.Inner 이라는 자료형으로 Outer 밑에 Inner가 있다. 내부 클래스는 이런 방식으로 객체 생성.
			
			//Outer의 멤버변수 호출
			System.out.println(ot.x);
			//Inner의 멤버변수 호출
			System.out.println(oi.y);
		}
}
