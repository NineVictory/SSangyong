package kr.s23.object.inter;
//인터페이스 : 형식만 있고 내용이 없음.
interface CookieMold{ //쿠키틀
	//추상메서드
	public abstract void makeStar();
	public abstract void makeCircle();
	public abstract void makeDiamond();
}
class Cookie implements CookieMold { //인터페이스의 추상메서드를 구현해주지 않으면 Cookie 의 빨간밑줄 즉, 에러가 생긴다.
	//인터페이스가 형식을 제공하면 클래스에서 제공된 형식을 이용해 내용을 채운다.
	//추상메서드를 구현
	@Override
	public void makeStar() {
		System.out.println("별 모양의 쿠키를 만들다.");
	}
	@Override
	public void makeCircle() {
		System.out.println("원 모양의 쿠키를 만들다.");
	}
	@Override
	public void makeDiamond() {
		System.out.println("다이아몬드 모양의 쿠키를 만들다.");
	}
}

public class InterfaceMain03 {
	public static void main(String[] args) {
		Cookie cookie = new Cookie();
		cookie.makeCircle();
		cookie.makeCircle();
		cookie.makeDiamond();
	}
}
   