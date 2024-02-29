package kr.s18.object.poly;

//부모클래스
class A {
	public void make() {
		System.out.println("make 메서드");
	}
}

class B extends A {
	public void play(){
		System.out.println("play 메서드");
	}
}
public class PolyMain02 {
	public static void main(String[] args) {
		B Bp = new B();
		Bp.make();
		Bp.play();
	
		A ap = Bp; //자식 클래스 타입에서 부모 클래스 타입으로 형변환(업 캐스팅)
		ap.make();
		//호출 범위를 벗어나서 호출 불가능
		//ap.play()
		
		B bp2 = (B)ap;//부모클래스 타입 -> 자식 클래스 타입
						//다운캐스팅, 명시적으로 형변환
		Bp.make();
		Bp.play();
	}
	
	
}
