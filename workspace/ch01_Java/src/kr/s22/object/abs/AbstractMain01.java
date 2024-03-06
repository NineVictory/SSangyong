package kr.s22.object.abs;

//추상 클래스
//미완성된 개념으로 단독으로 객체 생성이 불가능하고 일반적으로 자식 클래스에 
//상속 되어져서 사용함.

//추상 클래스는 일반적으로 공통된 동작을 가지는 객체들을 그룹화하는 데 사용됨. 즉, 추상 클래스는 구체적인 객체의 공통된 특징을 추상화함.
//추상 클래스는 추상 메서드를 가질 수 있습니다. 추상 메서드는 선언만 되어 있고, 실제 구현은 하위 클래스에서 이루어져야 합니다.
//일반 메서드를 가질 수 있으며, 이는 하위 클래스에서 오버라이딩할 필요가 없습니다.

abstract class A{
	private int x;
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
}
//자식 클래스
class B extends A {
	int b = 200;
}
public class AbstractMain01 {
	public static void main(String[] args) {
		
		//A ap = new A(); //추상클래스는 부모클래스의 역할은 수행 가능하지만 직접 객체 생성은 불가능하다. 
							//<7번 라인의 abstract을 사용함으로써 안됨.>
		
		B bp = new B();
		bp.setX(100);
		System.out.println(bp.getX());
		System.out.println(bp.b);
	}
}
