package kr.s25.object.inner;

public class LocalMain01 {
	public void innerTest() {
		//로컬 내부 클래스:메서드 내부에 클래스를 정의
		class Inner{
			public void getData() {
				System.out.println("Local 내부클래스");
			}
		}
		//내부클래스 객체 생성
		Inner i = new Inner();
		i.getData();
	}
	
	public static void main(String[] args) {
		LocalMain01 m = new LocalMain01();
		m.innerTest();
	}
}
