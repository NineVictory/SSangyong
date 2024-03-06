package kr.s25.object.inner;

public class LocalMain02 {
	//멤버변수 (언제든 호출 및 변경 가능)
	int a = 100;
	
	//멤버 메소드
	public void innerTest() {
		int b =500; //지역변수
		//로컬 내부클래스
		class Inner {
			public void getData() {
				System.out.println("변경 전 : " +a);
				System.out.println("---------------");
				a = 200;
				System.out.println("변경 후 : "+ a);
				System.out.println("---------------");
				//지역 변수 호출
				System.out.println("저역 변수 변경 전 : "+ b);
				
				//****로컬 내부클래스가 포함된 메서드의 지역 변수를 호출할 때 자동으로 상수화가 진행되어 데이터를 변경할 수 없음****
				//b = 800; 
			}
		}
	//내부 클래스 객체 생성
		Inner i = new Inner();
		i.getData();
	}
	public static void main(String[] args) {
		LocalMain02 m = new LocalMain02();
		m.innerTest();
	}
}
