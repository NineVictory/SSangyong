package kr.s23.object.inter;
//인터페이스
interface I{
	//추상메서드
	public abstract void play();
	
}
//쿨래스
class Pianist implements I{ //implements가 아닌 extends를 쓰면 상속이 되는 것이기 때문에 아래처럼 구현을 못함.
	@Override
	public void play() {
		System.err.println("피아노를 연주하다");
	}
} 
class Cellist implements I {
	@Override
	public void play() {
		System.out.println("첼로를 연주하다");
	}
}

class Stage {
	public void autoPlay(I i) { //Object는 최상위기 때문에 두 개의 클래스를 모두 사용가능. 공통분모 Object O대신 I(interface) i를 사용
		i.play();
	}
}
	
	
	

public class InterfaceMain04 {
	public static void main(String[] args) {
		Stage a = new Stage();
		a.autoPlay(new Pianist()); //Pianist -> I
									//클래스타입 -> 인터페이스 타입으로 형변환이 됐다는 뜻
									//자동적으로 형변환이 된 것
		a.autoPlay(new Cellist()); //Cellist -> I
									//클래스타입 -> 인터페이스 타입으로 형변환이 됐다는 뜻
									//자동적으로 형변환이 된 것
	}
}
