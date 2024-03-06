package kr.s25.object.inner;
//어나니머스는 클래스의 이름이 없는것
class Inner7 {
	public void disp() {
		System.out.println("부모클래스의 disp");
	}
}

public class AnonymousMain {
	public void make() {
		//익명 내부 쿨래스 : 클래스를 정의하는 부분과 객체를 생성하는 부분이 합쳐진 형태이다.
		//Inner7 클래스가 상속된 이름없는 클래스를 객체 생성 //중괄호가 있으면 Inner7이 상속된 이름없는 클래스가 생성된 것.
		Inner7 i = new Inner7() { //클래스를 정의하는 부분,(익명 내부클래스는 생성자뒤에 ;이 아니라 {}중괄호가 있으면 100%임)
			@Override
			public void disp() {
				System.out.println("익명 내부클래스의 disp");
			}
		}; 
		i.disp();//메서드호출
	}


		public static void main(String[] args) {
			AnonymousMain am = new AnonymousMain();
			am.make();
		}
	}
