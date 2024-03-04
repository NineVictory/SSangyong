package kr.s22.object.abs;

//추상 클래스
//미완성된 개념으로 단독으로 객체 생성이 불가능하고 일반적으로 자식 클래스에 
//상속 되어져서 사용함.

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
