package kr.s22.object.abs;


//추상 클래스 -> 사용하는 이유: 강요하기 위해서 일반 메서드는 강요하는 것이 없다. 자식 메서드마다 구현할 것들이 다 다르기 때문에 꼭 해야될 것들만 추상 메서드 상태로 두는것
abstract class A2{
	private int x;
	public void sexX(int x) {
		this.x = x;
	}
	public int gexX() {
		return x;
	}
	//추상 메서드 -> 구현이 없는 메서드 {중괄호가 없음.}
	public abstract void make();
	
}
//자식 클래스
class B2 extends A2 { //B2에 빨간밑줄이 있다면 추상 메서드가 완벽히 구현이 되지않았다는 뜻. 추상메서드는 완벽히 구현되지 않으면 메모리에 올라가지 않기 때문이다.
	//부모 클래스의 추상 메서드를 구현 ->을 하면 B2의 빨간밑줄이 없어진다.
	@Override //재정의 한 것은 아니지만 재정의 방법을 사용한다.
	public void make() { //abstract빼고 그대로 쓰면됨.
		System.out.println("make");
	}
}
public class AbstractMain02 {
	public static void main(String[] args) {
		B2 bp =new B2();
		bp.make();
	}
}
